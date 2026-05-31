package pt.isep.enorm.ref.reddit.security;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    private final String secret;
    private final long expirationMs;

    public JwtService(
        @Value("${app.security.jwt.secret}") String secret,
        @Value("${app.security.jwt.expiration-ms}") long expirationMs
    ) {
        this.secret = secret;
        this.expirationMs = expirationMs;
    }

    public String generateToken(UserDetails userDetails) {
        Instant now = Instant.now();
        List<Map<String, String>> roles = userDetails.getAuthorities().stream()
            .map(authority -> Map.of("authority", authority.getAuthority()))
            .toList();

        return Jwts.builder()
            .subject(userDetails.getUsername())
            .claim("roles", roles)
            .issuedAt(Date.from(now))
            .expiration(Date.from(now.plusMillis(expirationMs)))
            .signWith(getSigningKey(), SignatureAlgorithm.HS384)
            .compact();
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        String username = extractUsername(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        Claims claims = Jwts.parser()
            .verifyWith(getSigningKey())
            .build()
            .parseSignedClaims(token)
            .getPayload();

        return claimsResolver.apply(claims);
    }

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }
}


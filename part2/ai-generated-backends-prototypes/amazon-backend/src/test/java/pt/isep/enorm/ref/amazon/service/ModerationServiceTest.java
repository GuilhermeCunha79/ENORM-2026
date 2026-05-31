package pt.isep.enorm.ref.amazon.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.projection.ModerationSimulationResult;

@ExtendWith(MockitoExtension.class)
class ModerationServiceTest {

    @Mock
    private ProductReviewRepository productReviewRepository;

    private ModerationService moderationService;

    @BeforeEach
    void setUp() {
        moderationService = new ModerationService(productReviewRepository);
    }

    @Test
    void reviewWithGeneratedKeywordIsFlagged() {
        ProductReview review = review("This review is spam", ReviewStatus.PENDING);
        when(productReviewRepository.findById(10L)).thenReturn(Optional.of(review));

        ModerationSimulationResult result = moderationService.simulateReviewModeration(moderator(), 10L);

        assertThat(result.getDecision()).isEqualTo("FLAGGED");
        assertThat(result.getStatus()).isEqualTo("PENDING");
        assertThat(result.getTrigger()).isEqualTo("ON_FEEDBACK_CREATE");
        assertThat(result.getMatchedKeywords()).containsExactly("spam");
        assertThat(review.getStatus()).isEqualTo(ReviewStatus.PENDING);
        verify(productReviewRepository).save(review);
    }

    @Test
    void reviewWithoutGeneratedKeywordIsApproved() {
        ProductReview review = review("clean", ReviewStatus.PENDING);
        when(productReviewRepository.findById(10L)).thenReturn(Optional.of(review));

        ModerationSimulationResult result = moderationService.simulateReviewModeration(moderator(), 10L);

        assertThat(result.getDecision()).isEqualTo("APPROVED");
        assertThat(result.getStatus()).isEqualTo("APPROVED");
        assertThat(result.getMatchedKeywords()).isEmpty();
        assertThat(review.getStatus()).isEqualTo(ReviewStatus.APPROVED);
        verify(productReviewRepository).save(review);
    }

    private AmazonUser moderator() {
        AmazonUser user = new AmazonUser();
        user.setRole(Role.MODERATOR);
        return user;
    }

    private ProductReview review(String comment, ReviewStatus status) {
        ProductReview review = new ProductReview();
        review.setId(10L);
        review.setComment(comment);
        review.setStatus(status);
        return review;
    }
}

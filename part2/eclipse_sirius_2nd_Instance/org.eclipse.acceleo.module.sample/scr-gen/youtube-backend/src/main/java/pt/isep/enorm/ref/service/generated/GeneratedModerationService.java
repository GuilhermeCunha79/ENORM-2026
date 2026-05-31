package pt.isep.enorm.ref.service.generated;

import java.lang.reflect.Method;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class GeneratedModerationService {
    private final Object postRepository;
    private final Object commentRepository;
    private final Object videoRepository;
    private final Object postModerationCheckRepository;
    private final Object commentModerationCheckRepository;
    private final Object videoModerationCheckRepository;
    private final Map<String, List<Map<String, Object>>> checksByTarget = new ConcurrentHashMap<>();
    private final Map<String, String> contentStatuses = new ConcurrentHashMap<>();

    public GeneratedModerationService() {
        this(null, null, null, null, null, null);
    }

    public GeneratedModerationService(
            Object postRepository,
            Object commentRepository,
            Object videoRepository,
            Object postModerationCheckRepository,
            Object commentModerationCheckRepository,
            Object videoModerationCheckRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.videoRepository = videoRepository;
        this.postModerationCheckRepository = postModerationCheckRepository;
        this.commentModerationCheckRepository = commentModerationCheckRepository;
        this.videoModerationCheckRepository = videoModerationCheckRepository;
    }

    public Map<String, Object> moderatePost(String postId, Object content) {
        return moderateContent("post", postId, content);
    }

    public Map<String, Object> moderateComment(String commentId, Object content) {
        return moderateContent("comment", commentId, content);
    }

    public Map<String, Object> moderateVideo(String videoId, Object content) {
        return moderateContent("video", videoId, content);
    }

    public Map<String, Object> moderateContent(String contentType, String contentId, Object content) {
        String text = extractText(content);
        List<String> matchedRules = matchedRules(text);
        String decision = matchedRules.isEmpty() ? "APPROVED" : "FLAGGED";
        String status = matchedRules.isEmpty() ? "ACTIVE" : "FLAGGED";
        updateContentStatus(content, decision);
        Object persistedContent = persistContent(contentType, contentId, content);
        String targetId = normalizeId(contentId, persistedContent);
        Map<String, Object> check = saveModerationCheck(contentType, targetId, persistedContent, text, matchedRules, decision, status, Instant.now());
        contentStatuses.put(key(contentType, targetId), status);
        return check;
    }

    public List<Map<String, Object>> checksFor(String contentType, String contentId) {
        List<Map<String, Object>> checks = new ArrayList<>(checksByTarget.getOrDefault(key(contentType, contentId), List.of()));
        Object repository = checkRepositoryFor(contentType);
        if (repository == null) {
            return List.copyOf(checks);
        }

        for (Object check : findAll(repository)) {
            if (Objects.equals(contentId, associatedContentId(check, contentType))) {
                checks.add(checkToMap(contentType, check));
            }
        }
        return List.copyOf(checks);
    }

    public Map<String, Object> changeContentStatus(String contentType, String contentId, String status) {
        String normalizedStatus = normalizeStatus(status);
        contentStatuses.put(key(contentType, contentId), normalizedStatus);
        Object content = findById(contentRepositoryFor(contentType), contentId);
        if (content != null) {
            setContentStatus(content, normalizedStatus);
            save(contentRepositoryFor(contentType), content);
        }

        Map<String, Object> check = new LinkedHashMap<>();
        check.put("id", UUID.randomUUID().toString());
        check.put("targetType", contentType);
        check.put("targetId", contentId);
        check.put("type", "MANUAL_STATUS_CHANGE");
        check.put("result", normalizedStatus);
        check.put("status", normalizedStatus);
        check.put("timestamp", Instant.now().toString());
        checksByTarget.computeIfAbsent(key(contentType, contentId), ignored -> new ArrayList<>()).add(check);
        return check;
    }

    public String statusFor(String contentType, String contentId) {
        return contentStatuses.getOrDefault(key(contentType, contentId), "UNKNOWN");
    }

    protected String extractText(Object content) {
        if (content instanceof Map<?, ?> map) {
            return firstPresent(map, "text", "body", "title", "description", "content", "message");
        }

        StringBuilder text = new StringBuilder();
        appendGetterValue(content, text, "getText");
        appendGetterValue(content, text, "getBody");
        appendGetterValue(content, text, "getTitle");
        appendGetterValue(content, text, "getDescription");
        appendGetterValue(content, text, "getContent");
        return text.toString().trim();
    }

    protected List<String> matchedRules(String text) {
        String normalized = text == null ? "" : text.toLowerCase(Locale.ROOT);
        List<String> matches = new ArrayList<>();
        if (normalized.contains("spam")) {
            matches.add("spam");
        }
        if (normalized.contains("hate") || normalized.contains("toxicity") || normalized.contains("toxic")) {
            matches.add("toxicity");
        }
        if (normalized.contains("abuse") || normalized.contains("offensive")) {
            matches.add("abuse");
        }
        if (normalized.contains("blocked-word") || normalized.contains("banned-link")) {
            matches.add("blocked-term");
        }
        if (normalized.contains("copyright") || normalized.contains("reupload") || normalized.contains("unlicensed")) {
            matches.add("copyright-risk");
        }
        return matches;
    }

    protected Map<String, Object> saveModerationCheck(String contentType, String contentId, Object content, String text, List<String> matchedRules, String decision, String status, Instant timestamp) {
        Map<String, Object> check = new LinkedHashMap<>();
        check.put("id", UUID.randomUUID().toString());
        check.put("targetType", contentType);
        check.put("targetId", contentId);
        check.put("type", matchedRules.isEmpty() ? "POLICY" : String.join(",", matchedRules));
        check.put("result", decision);
        check.put("status", status);
        check.put("matchedRules", matchedRules);
        check.put("textExcerpt", text == null ? "" : text.substring(0, Math.min(text.length(), 160)));
        check.put("timestamp", timestamp.toString());

        Object persistedCheck = persistModerationCheck(contentType, content, matchedRules, decision, timestamp);
        Object persistedId = getterValue(persistedCheck, "getId");
        if (persistedId != null) {
            check.put("id", persistedId.toString());
        }

        if (persistedCheck == null) {
            checksByTarget.computeIfAbsent(key(contentType, contentId), ignored -> new ArrayList<>()).add(check);
        }
        return check;
    }

    protected void updateContentStatus(Object content, String decision) {
        String status = "FLAGGED".equals(decision) || "REJECTED".equals(decision) ? "FLAGGED" : "ACTIVE";
        setContentStatus(content, status);
    }

    private void setContentStatus(Object content, String status) {
        if (content instanceof Map<?, ?> rawMap) {
            @SuppressWarnings("unchecked")
            Map<Object, Object> map = (Map<Object, Object>) rawMap;
            try {
                map.put("status", status);
            } catch (UnsupportedOperationException ignored) {
            }
            return;
        }

        invokeSetter(content, "setStatus", enumValue("pt.isep.enorm.ref.domain.enums.ModerationDecision", status, "FLAGGED"));
        invokeSetter(content, "setStatus", status);
    }

    private String normalizeId(String providedId, Object content) {
        if (providedId != null && !providedId.isBlank()) {
            return providedId;
        }
        if (content instanceof Map<?, ?> map && map.get("id") != null) {
            return map.get("id").toString();
        }
        try {
            var method = content.getClass().getMethod("getId");
            Object value = method.invoke(content);
            if (value != null) {
                return value.toString();
            }
        } catch (Exception ignored) {
        }
        return UUID.randomUUID().toString();
    }

    private Object persistContent(String contentType, String contentId, Object content) {
        Object repository = contentRepositoryFor(contentType);
        if (repository == null || content == null || content instanceof Map<?, ?>) {
            return content;
        }

        if (contentId != null && !contentId.isBlank()) {
            Object existing = findById(repository, contentId);
            if (existing != null) {
                setContentStatus(existing, statusFrom(content));
                return save(repository, existing);
            }
        }
        return save(repository, content);
    }

    private Object persistModerationCheck(String contentType, Object content, List<String> matchedRules, String decision, Instant timestamp) {
        Object repository = checkRepositoryFor(contentType);
        if (repository == null || content == null || content instanceof Map<?, ?>) {
            return null;
        }

        String className = switch (contentType) {
            case "post" -> "pt.isep.enorm.ref.domain.PostModerationCheck";
            case "video" -> "pt.isep.enorm.ref.domain.VideoModerationCheck";
            case "comment" -> "pt.isep.enorm.ref.domain.CommentModerationCheck";
            default -> null;
        };
        if (className == null) {
            return null;
        }

        try {
            Object check = Class.forName(className).getDeclaredConstructor().newInstance();
            String type = matchedRules.isEmpty() ? "CONTENT" : moderationTypeFor(matchedRules.get(0));
            String result = "APPROVED".equals(decision) ? "APPROVED" : "FLAGGED";
            if ("comment".equals(contentType)) {
                invokeSetter(check, "setType", type == null ? "SPAM" : type);
                invokeSetter(check, "setResult", enumValue("pt.isep.enorm.ref.domain.enums.ModerationDecision", result, "FLAGGED"));
                invokeSetter(check, "setComment", content);
            } else if ("post".equals(contentType)) {
                invokeSetter(check, "setType", type == null ? "SPAM" : type);
                invokeSetter(check, "setResult", enumValue("pt.isep.enorm.ref.domain.enums.ModerationDecision", result, "FLAGGED"));
                invokeSetter(check, "setPost", content);
            } else if ("video".equals(contentType)) {
                invokeSetter(check, "setType", type == null ? "SPAM" : type);
                invokeSetter(check, "setResult", enumValue("pt.isep.enorm.ref.domain.enums.ModerationDecision", result, "FLAGGED"));
                invokeSetter(check, "setVideo", content);
            }
            invokeSetter(check, "setTimestamp", timestamp);
            return save(repository, check);
        } catch (Exception ignored) {
            return null;
        }
    }

    private String moderationTypeFor(String rule) {
        String normalized = rule == null ? "" : rule.toLowerCase(Locale.ROOT);
        if (normalized.contains("copyright")) {
            return "COPYRIGHT";
        }
        if (normalized.contains("toxicity") || normalized.contains("abuse") || normalized.contains("offensive")) {
            return "TOXICITY";
        }
        if (normalized.contains("blocked") || normalized.contains("banned")) {
            return "BLOCKED_WORD";
        }
        return "SPAM";
    }

    private String statusFrom(Object content) {
        Object status = getterValue(content, "getStatus");
        return status == null ? "UNDER_REVIEW" : status.toString();
    }

    private Object contentRepositoryFor(String contentType) {
        return switch (contentType) {
            case "post" -> postRepository;
            case "comment" -> commentRepository;
            case "video" -> videoRepository;
            default -> null;
        };
    }

    private Object checkRepositoryFor(String contentType) {
        return switch (contentType) {
            case "post" -> postModerationCheckRepository;
            case "comment" -> commentModerationCheckRepository;
            case "video" -> videoModerationCheckRepository;
            default -> null;
        };
    }

    private Object save(Object repository, Object entity) {
        if (repository == null || entity == null) {
            return entity;
        }
        for (Method method : repository.getClass().getMethods()) {
            if (!method.getName().equals("save") || method.getParameterCount() != 1) {
                continue;
            }
            try {
                return method.invoke(repository, entity);
            } catch (Exception ignored) {
            }
        }
        return entity;
    }

    private Object findById(Object repository, String id) {
        if (repository == null || id == null || id.isBlank()) {
            return null;
        }
        for (Method method : repository.getClass().getMethods()) {
            if (!method.getName().equals("findById") || method.getParameterCount() != 1) {
                continue;
            }
            try {
                Object result = method.invoke(repository, Long.valueOf(id));
                if (result instanceof java.util.Optional<?> optional) {
                    return optional.orElse(null);
                }
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    private Iterable<?> findAll(Object repository) {
        if (repository == null) {
            return List.of();
        }
        try {
            Object result = repository.getClass().getMethod("findAll").invoke(repository);
            return result instanceof Iterable<?> iterable ? iterable : List.of();
        } catch (Exception ignored) {
            return List.of();
        }
    }

    private Map<String, Object> checkToMap(String contentType, Object check) {
        Map<String, Object> map = new LinkedHashMap<>();
        Object id = getterValue(check, "getId");
        Object type = getterValue(check, "getType");
        Object result = getterValue(check, "getResult");
        Object timestamp = getterValue(check, "getTimestamp");
        map.put("id", id == null ? null : id.toString());
        map.put("targetType", contentType);
        map.put("targetId", associatedContentId(check, contentType));
        map.put("type", type == null ? null : type.toString());
        map.put("result", result == null ? null : result.toString());
        map.put("timestamp", timestamp == null ? null : timestamp.toString());
        return map;
    }

    private String associatedContentId(Object check, String contentType) {
        Object content = switch (contentType) {
            case "post" -> getterValue(check, "getPost");
            case "comment" -> getterValue(check, "getComment");
            case "video" -> getterValue(check, "getVideo");
            default -> null;
        };
        Object id = getterValue(content, "getId");
        return id == null ? null : id.toString();
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Object enumValue(String enumClassName, String preferred, String fallback) {
        try {
            Class<?> enumClass = Class.forName(enumClassName);
            try {
                return Enum.valueOf((Class<Enum>) enumClass.asSubclass(Enum.class), preferred);
            } catch (Exception ignored) {
                return Enum.valueOf((Class<Enum>) enumClass.asSubclass(Enum.class), fallback);
            }
        } catch (Exception ignored) {
            return preferred;
        }
    }

    private boolean invokeSetter(Object target, String methodName, Object value) {
        if (target == null || value == null) {
            return false;
        }
        for (Method method : target.getClass().getMethods()) {
            if (!method.getName().equals(methodName) || method.getParameterCount() != 1) {
                continue;
            }
            Class<?> parameter = null;
            for (Class<?> candidate : method.getParameterTypes()) {
                parameter = candidate;
                break;
            }
            if (parameter == null || !parameter.isAssignableFrom(value.getClass())) {
                continue;
            }
            try {
                method.invoke(target, value);
                return true;
            } catch (Exception ignored) {
            }
        }
        return false;
    }

    private Object getterValue(Object target, String methodName) {
        if (target == null) {
            return null;
        }
        try {
            return target.getClass().getMethod(methodName).invoke(target);
        } catch (Exception ignored) {
            return null;
        }
    }

    private String normalizeStatus(String status) {
        if (status == null || status.isBlank()) {
            return "UNDER_REVIEW";
        }
        return status.trim().toUpperCase(Locale.ROOT);
    }

    private String key(String contentType, String contentId) {
        return contentType + ":" + contentId;
    }

    private String firstPresent(Map<?, ?> map, String... keys) {
        StringBuilder text = new StringBuilder();
        for (String key : keys) {
            Object value = map.get(key);
            if (value != null) {
                if (text.length() > 0) {
                    text.append(' ');
                }
                text.append(value);
            }
        }
        return text.toString().trim();
    }

    private void appendGetterValue(Object content, StringBuilder text, String getterName) {
        try {
            var method = content.getClass().getMethod(getterName);
            Object value = method.invoke(content);
            if (value != null) {
                if (text.length() > 0) {
                    text.append(' ');
                }
                text.append(value);
            }
        } catch (Exception ignored) {
        }
    }
}

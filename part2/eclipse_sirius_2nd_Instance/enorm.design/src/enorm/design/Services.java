package enorm.design;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
     * Ensures default version "1.0.0" if version is null or empty
     */
    public String ensureDefaultVersion(Object self) {
        return "1.0.0";
    }

    /**
     * Normalizes rating bounds by swapping min and max if min >= max
     */
    public Double normalizeRatingBounds(Object self) {
        if (!isEClass(self, "RatingPolicy")) {
            return 1.0;
        }

        double minValue = toDouble(getFeatureValue(self, "minValue"), 1.0d);
        double maxValue = toDouble(getFeatureValue(self, "maxValue"), 5.0d);
        if (minValue < maxValue) {
            return minValue;
        }

        // Sirius quick-fix sets only minValue here, so force a safe value below maxValue.
        return maxValue - 1.0;
    }

    /**
     * Ensures a moderation executor is assigned (finds first MODERATOR)
     */
    public Object ensureModerationExecutor(Object self) {
        if (!isEClass(self, "ModerationPolicy")) {
            return null;
        }

        Object model = findRefModel(self);
        if (model == null) {
            return getFeatureValue(self, "executedBy");
        }

        for (Object user : getObjectList(model, "userTypes")) {
            if ("MODERATOR".equals(String.valueOf(getFeatureValue(user, "kind")))) {
                return user;
            }
        }

        List<Object> userTypes = getObjectList(model, "userTypes");
        if (!userTypes.isEmpty()) {
            return userTypes.get(0);
        }

        Object moderator = createElement(model, "UserType");
        if (moderator == null) {
            return null;
        }

        setFeatureValue(moderator, "name", "Moderator");
        setFeatureValue(moderator, "kind", enumLiteral(model, "UserKind", "MODERATOR"));
        userTypes.add(moderator);
        return moderator;
    }

    /**
     * Ensures a rating policy is created for FeedbackDefinition
     */
    public Object ensureRatingPolicy(Object self) {
        if (!isEClass(self, "FeedbackDefinition")) {
            return null;
        }

        Object rating = getFeatureValue(self, "rating");
        if (rating != null) {
            return rating;
        }

        rating = createElement(self, "RatingPolicy");
        if (rating == null) {
            return null;
        }

        setFeatureValue(rating, "minValue", 1.0);
        setFeatureValue(rating, "maxValue", 5.0);
        setFeatureValue(rating, "step", 1.0);
        return rating;
    }

    /**
     * Ensures a verification policy is created for FeedbackDefinition
     */
    public Boolean ensureVerificationPolicy(Object self) {
        if (!isEClass(self, "FeedbackDefinition")) {
            return Boolean.FALSE;
        }

        if (!toBoolean(getFeatureValue(self, "requiresVerifiedContext"))) {
            return Boolean.FALSE;
        }

        Object model = findRefModel(self);
        if (model == null) {
            return Boolean.TRUE;
        }

        for (Object policy : getObjectList(model, "verificationPolicies")) {
            if (getFeatureValue(policy, "verifies") == self) {
                return Boolean.TRUE;
            }
        }

        Object policy = createElement(model, "VerificationPolicy");
        if (policy == null) {
            return Boolean.TRUE;
        }

        String feedbackName = String.valueOf(getFeatureValue(self, "name"));
        if (feedbackName == null || "null".equals(feedbackName) || feedbackName.isEmpty()) {
            feedbackName = "Feedback";
        }
        setFeatureValue(policy, "name", feedbackName + "Verification");
        setFeatureValue(policy, "mode", enumLiteral(model, "ValidationKind", "MANUAL"));
        setFeatureValue(policy, "appliesWhen", "onCreate");
        setFeatureValue(policy, "verifies", self);
        getObjectList(model, "verificationPolicies").add(policy);
        return Boolean.TRUE;
    }

    /**
     * Ensures authorization context contains the resource target
     */
    public Object ensureAuthorizationContextContainsResourceTarget(Object self) {
        if (!isEClass(self, "AuthorizationRule")) {
            return null;
        }

        Object target = getFeatureValue(self, "resourceTarget");
        Object context = getFeatureValue(self, "context");
        if (context == null) {
            context = createContextForTarget(findRefModel(self), target, "AuthorizationContext");
        }

        if (context != null && target != null) {
            addToReferenceList(context, "contains", target);
        }
        return context;
    }

    /**
     * Ensures moderation context contains the monitored resource
     */
    public Object ensureModerationContextContainsMonitorsResource(Object self) {
        if (!isEClass(self, "ModerationPolicy")) {
            return null;
        }

        Object target = getFeatureValue(self, "monitorsResource");
        Object context = getFeatureValue(self, "inContext");
        if (context == null) {
            context = createContextForTarget(findRefModel(self), target, "ModerationContext");
        }

        if (context != null && target != null) {
            addToReferenceList(context, "contains", target);
        }
        return context;
    }

    /**
     * Ensures automation rule context contains the context resource
     */
    public Object ensureAutomationInContextContainsContextResource(Object self) {
        if (!isEClass(self, "AutomationRule")) {
            return null;
        }

        Object target = getFeatureValue(self, "context");
        Object context = getFeatureValue(self, "inContext");
        if (context == null) {
            context = createContextForTarget(findRefModel(self), target, "AutomationContext");
        }

        if (context != null && target != null) {
            addToReferenceList(context, "contains", target);
        }
        return context;
    }

    private Object findRefModel(Object element) {
        Object current = element;
        while (current != null && !isEClass(current, "RefModel")) {
            current = invokeMethod(current, "eContainer");
        }
        return current;
    }

    private Object createContextForTarget(Object model, Object target, String contextName) {
        if (model == null || target == null) {
            return null;
        }

        for (Object existing : getObjectList(model, "contextTypes")) {
            String existingName = String.valueOf(getFeatureValue(existing, "name"));
            if (contextName.equals(existingName)) {
                return existing;
            }
        }

        Object created = createElement(model, "ContextType");
        if (created == null) {
            return null;
        }

        setFeatureValue(created, "name", contextName);
        setFeatureValue(created, "kind", enumLiteral(model, "ContextKind", "GLOBAL"));
        addToReferenceList(created, "contains", target);
        getObjectList(model, "contextTypes").add(created);
        return created;
    }

    private Object createElement(Object context, String className) {
        Object eClass = invokeMethod(context, "eClass");
        Object ePackage = invokeMethod(eClass, "getEPackage");
        if (ePackage == null) {
            return null;
        }

        Object eClassifier = invokeMethod(ePackage, "getEClassifier", className);
        if (eClassifier == null) {
            return null;
        }

        Object factory = invokeMethod(ePackage, "getEFactoryInstance");
        return invokeMethod(factory, "create", eClassifier);
    }

    private Object enumLiteral(Object context, String enumName, String literalName) {
        Object eClass = invokeMethod(context, "eClass");
        Object ePackage = invokeMethod(eClass, "getEPackage");
        if (ePackage == null) {
            return null;
        }

        Object enumType = invokeMethod(ePackage, "getEClassifier", enumName);
        if (enumType == null) {
            return null;
        }

        Object factory = invokeMethod(ePackage, "getEFactoryInstance");
        return invokeMethod(factory, "createFromString", enumType, literalName);
    }

    private Object getFeatureValue(Object owner, String featureName) {
        Object eClass = invokeMethod(owner, "eClass");
        Object feature = invokeMethod(eClass, "getEStructuralFeature", featureName);
        if (feature == null) {
            return null;
        }
        return invokeMethod(owner, "eGet", feature);
    }

    private void setFeatureValue(Object owner, String featureName, Object value) {
        Object eClass = invokeMethod(owner, "eClass");
        Object feature = invokeMethod(eClass, "getEStructuralFeature", featureName);
        if (feature != null) {
            invokeMethod(owner, "eSet", feature, value);
        }
    }

    @SuppressWarnings("unchecked")
    private List<Object> getObjectList(Object owner, String featureName) {
        Object value = getFeatureValue(owner, featureName);
        if (value instanceof List<?>) {
            return (List<Object>) value;
        }
        throw new IllegalStateException("Feature '" + featureName + "' is not a list");
    }

    private void addToReferenceList(Object owner, String featureName, Object value) {
        List<Object> values = getObjectList(owner, featureName);
        if (!values.contains(value)) {
            values.add(value);
        }
    }

    private boolean toBoolean(Object value) {
        return value instanceof Boolean && (Boolean) value;
    }

    private double toDouble(Object value, double fallback) {
        return value instanceof Number ? ((Number) value).doubleValue() : fallback;
    }

    private boolean isEClass(Object obj, String className) {
        if (obj == null) {
            return false;
        }
        Object eClass = invokeMethod(obj, "eClass");
        Object name = invokeMethod(eClass, "getName");
        return className.equals(String.valueOf(name));
    }

    private Object invokeMethod(Object target, String methodName, Object... args) {
        if (target == null) {
            return null;
        }

        Method method = findCompatibleMethod(target.getClass(), methodName, args);
        if (method == null) {
            return null;
        }

        try {
            return method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to invoke method '" + methodName + "'", e);
        }
    }

    private Method findCompatibleMethod(Class<?> type, String methodName, Object[] args) {
        for (Method method : type.getMethods()) {
            if (!method.getName().equals(methodName) || method.getParameterCount() != args.length) {
                continue;
            }

            Class<?>[] parameterTypes = method.getParameterTypes();
            boolean compatible = true;
            for (int i = 0; i < parameterTypes.length; i++) {
                if (!isCompatible(parameterTypes[i], args[i])) {
                    compatible = false;
                    break;
                }
            }

            if (compatible) {
                return method;
            }
        }
        return null;
    }

    private boolean isCompatible(Class<?> parameterType, Object arg) {
        if (arg == null) {
            return !parameterType.isPrimitive();
        }

        Class<?> expectedType = parameterType.isPrimitive() ? toWrapper(parameterType) : parameterType;
        return expectedType.isAssignableFrom(arg.getClass());
    }

    private Class<?> toWrapper(Class<?> primitiveType) {
        if (primitiveType == boolean.class) {
            return Boolean.class;
        }
        if (primitiveType == byte.class) {
            return Byte.class;
        }
        if (primitiveType == short.class) {
            return Short.class;
        }
        if (primitiveType == int.class) {
            return Integer.class;
        }
        if (primitiveType == long.class) {
            return Long.class;
        }
        if (primitiveType == float.class) {
            return Float.class;
        }
        if (primitiveType == double.class) {
            return Double.class;
        }
        if (primitiveType == char.class) {
            return Character.class;
        }
        return primitiveType;
    }
}

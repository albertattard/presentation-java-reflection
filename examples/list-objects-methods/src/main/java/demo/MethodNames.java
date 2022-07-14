package demo;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MethodNames {

    public static void main(String[] args) {
        printPublicMethodNames(ContactPojo.class);
    }

    public static void printPublicMethodNames(final Class<?> type) {
        final Method[] methods = type.getMethods();
        for (final Method method : methods) {
            System.out.printf("%s.%s(%s)%n",
                    method.getDeclaringClass().getCanonicalName(),
                    method.getName(),
                    joinMethodParameters(method));
        }
    }

    private static String joinMethodParameters(final Method method) {
        return Arrays.stream(method.getParameters())
                .map(Parameter::getType)
                .map(Class::getCanonicalName)
                .collect(Collectors.joining(", "));
    }
}

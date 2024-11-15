package ua.hillel.lessons.lesson21.reflections;

import java.lang.reflect.*;

public class ReflectionUtil {

    public static void showFullClassName(Object object) {
        Class<?> clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public static void showSimpleClassName(Object object) {
        Class<?> clazz = object.getClass();
        System.out.println(clazz.getSimpleName());
    }

    public static void showClassFields(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
        }
    }

    public static void showAllClassFields(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("variable name: " + field.getName());
            System.out.println("variable type: " + field.getType());
            System.out.println("variable modifier: " + field.getModifiers());
            System.out.println();
        }
    }

    public static void showAllClassMethods(Object object) {
        Class<?> clazz = object.getClass();
        Method[] declaredMethods = clazz.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
            System.out.println(declaredMethod.getReturnType());
            System.out.println("Parameter Count: " + declaredMethod.getParameterCount());
            Parameter[] parameters = declaredMethod.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType());
            }
            System.out.println();
        }
    }

    public static void setValuePrivateField(Object object, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = object.getClass();

        Field declaredField = clazz.getDeclaredField(fieldName);
        declaredField.setAccessible(true);
        declaredField.set(object, newValue);
        declaredField.setAccessible(false);
    }

    public static void showAllConstructors(Object object) {
        Class<?> clazz = object.getClass();

        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("name: " + declaredConstructor.getName());
            System.out.println("modifier: " + declaredConstructor.getModifiers());
            System.out.println("parameters count: " + declaredConstructor.getParameterCount());

            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("parameterType: "+ parameterType.getName());
            }
            System.out.println();

            Parameter[] parameters = declaredConstructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("parameter name: " + parameter.getName());
                System.out.println("parameter type: " + parameter.getType());
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public static Object createNewObject(Object object) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = object.getClass();

        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance();
    }

    public static Object createNewObjectPublic(Object object) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = object.getClass();

        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        return constructor.newInstance("Alex" , 55);
    }

}

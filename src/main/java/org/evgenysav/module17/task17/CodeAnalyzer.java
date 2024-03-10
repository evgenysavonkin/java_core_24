package org.evgenysav.module17.task17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class CodeAnalyzer {
    private static final String DELIMITER = "------------------------------------------------------------------";

    private CodeAnalyzer() {

    }

    public static void analyzeClass(Object o) {
        Class<?> clazz = o.getClass();
        System.out.println("Name of class: " + clazz.getSimpleName());
        System.out.println(DELIMITER);
        System.out.println("Class loader: " + clazz.getClassLoader());
        System.out.println(DELIMITER);
        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length == 0) {
            System.out.println("Doesn't have interfaces");
        } else {
            System.out.println("List of interfaces: ");
            System.out.println(DELIMITER);
            for (Class<?> inter : interfaces) {
                System.out.println();
                System.out.println("Name of interface: " + inter.getName());
                if (inter.getMethods().length == 0) {
                    System.out.println("Doesn't contains methods");
                } else {
                    System.out.println("List of its methods: ");
                    System.out.println();
                }
                int counter = 0;
                for (Method method : inter.getMethods()) {
                    if (counter == 0) {
                        System.out.println();
                        System.out.println("Method name: " + method.getName());
                        counter++;
                    } else {
                        System.out.println();
                        System.out.println("Method name: " + method.getName());
                    }
                    System.out.print("Access modifiers: ");
                    printAccessModifiers(method.getModifiers());
                    System.out.println("Returning type: " + method.getReturnType().getSimpleName());
                    System.out.print("Types of parameters: ");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 0) {
                        System.out.println("Doesn't contains parameters");
                    } else {
                        for (Class<?> parameter : method.getParameterTypes()) {
                            System.out.print(parameter.getName() + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println(DELIMITER);
            }
        }
        Class<?> buffClazz = clazz;
        while (buffClazz.getSuperclass() != null) {
            System.out.println("Parent of " + buffClazz.getSimpleName() + " is " + buffClazz.getSuperclass().getSimpleName());
            buffClazz = buffClazz.getSuperclass();
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(DELIMITER);
        if (declaredFields.length == 0) {
            System.out.println("Doesn't have fields");
            System.out.println(DELIMITER);
        } else {
            System.out.println("Declared fields: ");
            System.out.println(DELIMITER);
            for (Field field : declaredFields) {
                System.out.println();
                System.out.println("Field name: " + field.getName());
                System.out.print("Access modifiers: ");
                printAccessModifiers(field.getModifiers());
                System.out.println("Field type: " + field.getType().getName());
                printAnnotations(field.getDeclaredAnnotations());
                System.out.println(DELIMITER);
            }
        }
        System.out.println("List of constructors: ");
        for (Constructor<?> constructor : clazz.getConstructors()) {
            System.out.println("Constructor name: " + constructor.getName());
            System.out.print("Access modifiers: ");
            printAccessModifiers(constructor.getModifiers());
            Class<?>[] parameters = constructor.getParameterTypes();
            if (parameters.length == 0) {
                System.out.println("Doesn't have parameters");
            } else {
                for (Class<?> parameter : parameters) {
                    System.out.println();
                    System.out.println("Parameter name: " + parameter.getName());
                    System.out.print("Access modifiers: ");
                    printAccessModifiers(parameter.getModifiers());
                    System.out.println("Type of parameter: " + parameter.getTypeName());
                    printAnnotations(parameter.getDeclaredAnnotations());
                    System.out.println();
                }
                System.out.println(DELIMITER);
            }
        }
        System.out.println("List of methods: ");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        if (declaredMethods.length == 0) {
            System.out.println("Doesn't have methods");
        } else {
            for (Method method : declaredMethods) {
                System.out.println();
                System.out.println("Method name: " + method.getName());
                System.out.print("Access modifiers: ");
                printAccessModifiers(method.getModifiers());
                System.out.println("Returning type: " + method.getReturnType().getName());
                for (Class<?> parameter : method.getParameterTypes()) {
                    System.out.println("Parameter name: " + parameter.getName());
                    System.out.print("Access modifiers: ");
                    printAccessModifiers(parameter.getModifiers());
                    System.out.println("Type of parameter: " + parameter.getTypeName());
                    printAnnotations(parameter.getDeclaredAnnotations());
                    System.out.println();
                }
            }
        }
        System.out.println(DELIMITER);
        System.out.println("Annotations of a class: ");
        printAnnotations(clazz.getAnnotations());
    }

    private static void printAnnotations(Annotation[] annotations) {
        System.out.print("List of annotations: ");
        if (annotations.length == 0) {
            System.out.println("Doesn't have annotations");
        } else {
            for (Annotation annotation : annotations) {
                System.out.print(annotations + " ");
            }
            System.out.println();
        }
    }

    private static void printAccessModifiers(int accessModifiers) {
        if (Modifier.isAbstract(accessModifiers)) {
            System.out.print("abstract ");
        }
        if (Modifier.isFinal(accessModifiers)) {
            System.out.print("final ");
        }
        if (Modifier.isInterface(accessModifiers)) {
            System.out.print("interface ");
        }
        if (Modifier.isNative(accessModifiers)) {
            System.out.print("native ");
        }
        if (Modifier.isPrivate(accessModifiers)) {
            System.out.print("private ");
        }
        if (Modifier.isProtected(accessModifiers)) {
            System.out.print("protected ");
        }
        if (Modifier.isPublic(accessModifiers)) {
            System.out.print("public ");
        }
        if (Modifier.isStatic(accessModifiers)) {
            System.out.print("static ");
        }
        if (Modifier.isStrict(accessModifiers)) {
            System.out.print("strict ");
        }
        if (Modifier.isSynchronized(accessModifiers)) {
            System.out.print("synchronized ");
        }
        if (Modifier.isTransient(accessModifiers)) {
            System.out.print("transient ");
        }
        if (Modifier.isVolatile(accessModifiers)) {
            System.out.print("volatile ");
        }
        System.out.println();
    }
}

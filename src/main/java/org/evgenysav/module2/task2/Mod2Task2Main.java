package org.evgenysav.module2.task2;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import org.evgenysav.module2.task1.Mod2Task1Main;

public class Mod2Task2Main {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        URL jarURL = new URL("file:/home/evgeny/work/java/sandbox/base_24/core/out/example.jar");
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{jarURL});
        Class<?> exampleClazz = urlClassLoader.loadClass("org.evgenysav.module2.task1.Mod2Task1Main");
        Object newInstance = exampleClazz.newInstance();
        Mod2Task1Main main = (Mod2Task1Main) newInstance;
        main.printHello();
    }
}

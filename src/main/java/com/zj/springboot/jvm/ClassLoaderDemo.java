package com.zj.springboot.jvm;

import com.zj.springboot.bean.Student;

import java.io.File;
import java.net.URL;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        String classPath = System.getProperty("java.class.path");
        for (String path : classPath.split(";")) {
            System.out.println("AppClassLoader加载器-classpath的加载路径："+path);
        }
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println("ExtClassLoader加载器-classpath的加载路径："+path);
        }
        URL[] urLs = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urLs) {
            System.out.println("BootstrapClassLoader加载器-classpath的加载路径："+url.toExternalForm());
        }
        //在rt.jar包下的核心类类由BootStrapClassLoder加载，返回null
        Object obj=Integer.class.getClassLoader();
        System.out.println("BootStrapClassLoder加载返回："+obj);
        Object fileObj=File.class.getClassLoader();
        System.out.println(fileObj);
        Object student=Student.class.getClassLoader();
        System.out.println("AppClassLoader加载返回："+student);
    }
}

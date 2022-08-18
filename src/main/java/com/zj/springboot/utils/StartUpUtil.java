package com.zj.springboot.utils;

import java.io.*;
import java.util.Objects;

public class StartUpUtil {
    public static void start (String parttern, String[] args,boolean sync) {
        String root = System.getProperty("user.dir");
        findAndStartJar(new File(root),parttern,args,sync);
    }
    private static void findAndStartJar (File file, String parttern, String[] args,boolean sync) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File x : listFiles) {
                if (x.getName().contains(parttern) && x.getName().endsWith(".jar")) {
                    doStart(x.getAbsolutePath(), args, sync);
                } else {
                    if (x.isDirectory()) {
                        findAndStartJar(x, parttern, args, sync);
                    }
                }
            }
        }
    }
    private static boolean doStart (String jarPath,String[] args,boolean sync) {
        if (sync) {
            start0(jarPath, args, sync);
        } else {
            new Thread(() -> {
                start0(jarPath, args, sync);
            }).start();
        }
        return true;
    }
    private static void start0 (String jarPath,String[] args,boolean sync) {
        Runtime runtime = Runtime.getRuntime();
        String cmd = "java -Dserver.port=8082 -jar " + jarPath;
        if (Objects.nonNull(args) && args.length > 0) {
            for (int i= 0; i <args.length; i++) {
                cmd = cmd.concat(args[i]);
            }
        }
        System.err.println("use command " + cmd + "start a new jar");
        try {
            Process process= runtime.exec(cmd);
            doPrint(process.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void registerHook() {
        new Thread(()-> {
            while (true) {
                Runtime runtime = Runtime.getRuntime();
                runtime.addShutdownHook(new Thread(() -> {
                    try {
                        System.err.println("sentinel-dashboard-1.8.1");
                        Process exec = runtime.exec("jps");
                        doPrint(exec.getInputStream());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    private static void doPrint(InputStream inputStream) throws IOException {
        byte bytes[] = new byte[1024];
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        inputStream.close();
    }
    /*public static void main(String[] args) throws IOException, InterruptedException {
        start("sentinel-dashboard-1.8.1",null,true);
//        registerHook();
//        Thread.sleep(10*1000);

    }*/
}

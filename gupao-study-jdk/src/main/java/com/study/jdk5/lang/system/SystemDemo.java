package com.study.jdk5.lang.system;

import java.util.Map;
import java.util.Set;

/**
 * @see java.lang.System
 * 
 */
public class SystemDemo {

    public static void main(String[] args) {
        //获取环境变量 jdk 1.5
        Map<String, String> getenv = System.getenv();
        Set<Map.Entry<String, String>> entries = getenv.entrySet();
        for(Map.Entry entry:entries){
            System.out.println(entry.getKey()+"--"+entry.getValue());//获取环境变量
        }
        System.out.println(System.getenv("JAVA_HOME"));
//        InputStream inputStream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String str = "";
//        try {
//            while((str = bufferedReader.readLine())!= null){
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.console();
//        String sdada = "212";
//        String dsadd = "212";
//        String nnsad = new String("212");
//        System.out.println(dsadd == sdada);//true
//        System.out.println(dsadd == nnsad);//false
//        System.out.println(dsadd == nnsad.intern());//true intern方法返回的是string对象在常量池中的引用
    }
}

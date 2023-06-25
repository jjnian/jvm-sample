package cn.jjnian;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadClassFileDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("class-structure/src/main/file/test.class");
        byte[] bytes = new byte[4];
        int read = fileInputStream.read(bytes);
        for (byte b : bytes){
            String hex = String.format("%02x", b);
            System.out.println(hex);
        }
    }
}

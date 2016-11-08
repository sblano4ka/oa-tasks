package com.some.practice.practice2;

import java.io.*;

/**
 * Created by User on 11/8/2016.
 */
public class Parser {
    public static String parseString(String path, String charset) {
        StringBuilder sb = new StringBuilder();
        String s = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), charset));) {

            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}

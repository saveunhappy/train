package com.jiawa.train.generator.test;

import java.util.StringJoiner;

public class Test1 {

    private String name;

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(":", "[", "]");
        sj.add("George").add("Sally").add("Fred");
        String desiredString = sj.toString();
        System.out.println(desiredString);
    }
}

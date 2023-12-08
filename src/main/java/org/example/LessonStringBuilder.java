package org.example;

public class LessonStringBuilder {
    public static void main(String[] args) {
        String name = "ivan";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        StringBuilder sb = new StringBuilder("ivan");
        sb.append(" ivanov");
        System.out.println(sb.toString());
    }
}

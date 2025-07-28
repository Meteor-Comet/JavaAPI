package org.example.object;

public class ObjectDemo {
    public static void main(String[] args) {
        Object demo = new Object();
        String str1 = demo.toString();
        System.out.println(str1);//java.lang.Object@723279cf

        Student s1 = new Student("张三", 18);
        String str2 = s1.toString();
        System.out.println(s1);//org.example.object.Student@b4c966a
    }
}

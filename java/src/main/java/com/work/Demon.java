package com.work;

public class Demon {

    public static void main(String[] args) {


        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("chen");
        Student student = new Student(teacher);

        Teacher teacher1 = (Teacher) student.getJavase();

        System.out.println(teacher1.getId() + " " + teacher1.getName());


    }

}

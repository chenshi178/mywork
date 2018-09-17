package com.work;

public class Student<T> {

    private T javase;

    public Student(){

    }


    public Student(T javase){
        this.javase=javase;
    }



    public T getJavase(){
        return javase;
    }

}

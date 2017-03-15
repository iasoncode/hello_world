package jcd;

import java.io;

public class Hello{
    public String name;
    public Hello(String name){
         this.name=name;
    }
    public static void main(){
        Hello hello = new Hello("test");
        System.out.println(hello.test+" Hello world!");
    }
}

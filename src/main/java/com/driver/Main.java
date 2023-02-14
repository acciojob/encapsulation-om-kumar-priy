package com.driver;

public class Main {
    public static void main(String[] args)
    {
        RWOnly obj=new RWOnly();
       // obj.name="om";
        // it give error /s name is private variable
        obj.setName("Om");
        System.out.println(obj.getName());
    }
  
}
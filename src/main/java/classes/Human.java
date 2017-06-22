package classes;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Human {
     String name;
        int age;
    int heightInInches;
    String eyeColor;

    public Human(){

    }

    public void speak()
    {
        System.out.println("Hello, my name is"+name);
        System.out.println("My age is"+age);
        System.out.println("I am "+name+"my eyeColor is"+eyeColor);

    }

}

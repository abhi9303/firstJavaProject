package classes;

class X {

public void methodA()
{
    System.out.println("I am method A of class X");
}
}
 class Y extends X{
    public void methodA()
    {
        System.out.println("I am method A of class Y");

    }
}
public   class Z
{
    public static void main(String[] args) {
        X obj1=new X();
        X obj2=new Y();
        obj1.methodA();
        obj2.methodA();
    }
}

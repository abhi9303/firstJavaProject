package classes;


public class Methodoverload {
   private void test() {
        System.out.println("no parameters");

    }

    void test(int a)
    {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a and b" + a + "" + b);
    }

    public static void main(String[] args) {
        Methodoverload obj = new Methodoverload();
        obj.test();
        obj.test(10);
        obj.test(10, 20);
    }
}


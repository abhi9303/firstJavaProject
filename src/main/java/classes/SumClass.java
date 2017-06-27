package classes;

public class SumClass implements Suminterface {
    public int mymethod(int num1, int num2) {
        int out = num1 + num2;
        return out;

    }

    public static void main(String[] args) {
        SumClass obj = new SumClass();
        System.out.println(obj.mymethod(2, 3));
    }
}

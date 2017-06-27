package classes;

public class Methodoverride {
    public void move() {
        System.out.println("animals can move");
    }
}

class dog extends Methodoverride {

    public void move() {
        System.out.println("dog can walk and run");
    }

    public static void main(String[] args) {
        dog b = new dog();
        b.move();
    }
}


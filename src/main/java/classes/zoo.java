package classes;

public class zoo {
    public static void main(String[] args) {

        Animals animal1=new Animals(21,"m" ,21);
        animal1.eat();

        bird bird1= new bird(2,"f",10);
        bird1.fly();
        bird1.eat();
        bird1.sleep();

        fish fish1= new fish(1,"f",2);
        fish1.swim();

    }
}

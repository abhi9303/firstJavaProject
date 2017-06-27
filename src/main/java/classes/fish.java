package classes;

/**
 * Created by abhinav on 22/6/17.
 */
public class fish extends Animals {
    public fish(int age, String gender, int weightInLbs){
        super(age,gender,weightInLbs);
    }
    public void swim(){
        System.out.println("swimming...");
    }
}

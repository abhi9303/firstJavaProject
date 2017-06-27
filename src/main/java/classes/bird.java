package classes;

public class bird extends Animals{
    public bird(int age,String gender, int weightInLbs ){
        super(age,gender,weightInLbs);
    }
    public void fly()
    {
        System.out.println("flying");
    }
}

package classes;

public class Encapsulationdemo {
    private int empSsn;
    private String empName;
    private int empAge;

    public int getEmpSsn() {
        return empSsn;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpAge(int newValue) {
        empAge = newValue;
    }

    public void setEmpName(String newValue) {
        empName = newValue;
    }

    public void setEmpSsn(int newValue) {
        empSsn = newValue;
    }

}

class EncapsTest {
    public static void main(String[] args) {
        Encapsulationdemo obj = new Encapsulationdemo();
        obj.setEmpAge(24);
        obj.setEmpName("abhinav");
        obj.setEmpSsn(124);
        System.out.println("Employee Name" + obj.getEmpName());
        System.out.println("Employee Age" + obj.getEmpAge());
        System.out.println("Employee Ssn" + obj.getEmpSsn());
    }

}

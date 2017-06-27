package classes;

public class Encapsulation {
    private int length;
    private int width;
    private int heigth;

    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeigth(int h) {
        heigth = h;
    }

    public int volume() {
        return (length * width * heigth);
    }


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setHeigth(1);
        obj.setLength(3);
        obj.setWidth(2);
    }
}

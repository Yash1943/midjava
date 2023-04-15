package program9;

public class rectangle {
    private int length;
    private int breadth;

    public rectangle() // deafult constructor
    {
        length = 0;
        breadth = 0;
    }

    public rectangle(int side) // construtor with one parameter
    {
        length = side;
        breadth = side;
    }

    public rectangle(int l, int b) // constructor with two parameter
    {
        length = l;
        breadth = b;
    }

    public int getlength() // get method
    {
        return length;
    }

    public void setlength(int length) // setter method
    {
        this.length = length;
    }

    public int getbreadth() {
        return breadth;
    }

    public int getarea() {
        return length * breadth;
    }
}

class demoArea {
    public static void main(String[] args) {
        rectangle r = new rectangle(9, 5);
        System.out.println("Area is " + r.getarea());
    }
}

package program11;

public class InterfaceInhertenceDemo {
    public static void main(String[] args) {
        B b=new B();
        b.methodA();
        System.out.println("CONSTANT_A="+A.CONSTANT_A);
        b.methodA1();
        System.out.println("CONSTANT_A1="+A1.CONSTANT_A1);
        b.methodA2();
        System.out.println("CONSTANT_A2="+A2.CONSTANT_A2);
        b.methodA12();
        System.out.println("CONSTANT_A12="+A12.CONSTANT_A12);
    }
}

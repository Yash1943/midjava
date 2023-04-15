package program11;

interface A
{
    int CONSTANT_A=10;
    void methodA();
}
interface A1 extends A
{
    int CONSTANT_A1=20;
    void methodA1();
}
interface A2 extends A
{
    int CONSTANT_A2=30;
    void methodA2();
}
interface A12 extends A1,A2
{
    int CONSTANT_A12=40;
    void methodA12();
}

class B implements A12
{
    public void methodA()
    {
        System.out.println("method A in B");
    }
    public void methodA1()
    {
        System.out.println("method A1 in B");
    }
    public void methodA2()
    {
        System.out.println("method A2 in B");
    }
    public void methodA12()
    {
        System.out.println("method A12 in B");
    }
}
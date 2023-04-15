package program12;

interface Transport
{
    void deliver();
}
abstract class Animal
{
    abstract void makeSound();
}
class Tiger extends Animal
{
    void makeSound()
    {
        System.out.println("Roar");
    }
}
class Camal extends Animal implements Transport
{
    void makeSound()
    {
        System.out.println("Grunt");
    }
    public void deliver()
    {
        System.out.println("Camal delivering goods");
    }
}

class Deer extends Animal
{
    void makeSound()
    {
        System.out.println("Bleat");
    }
}

class Donkey extends Animal implements Transport
{
    void makeSound()
    {
        System.out.println("Bray");
    }
    public void deliver()
    {
        System.out.println("Donkey delivering goods");
    }
}

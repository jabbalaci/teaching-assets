public class Main
{
    public static void main(String[] args)
    {
//        Animal dog = new Dog();
//        dog.run();

//        Animal[] animals = { new Dog(), new Cat(), new Cow() };

//        for (Animal e : animals)
//        {
//            e.eat();
//        }

        Dog dog = new Dog();
        Cat cirmi = new Cat();

        process(cirmi);
    }

    private static void process(Animal animal)
    {
        animal.eat();
    }
}

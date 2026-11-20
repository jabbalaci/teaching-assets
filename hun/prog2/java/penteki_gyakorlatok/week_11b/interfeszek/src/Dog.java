public class Dog implements Animal
{
    @Override
    public void speak() {
        System.out.println("vaú vaú");
    }

    @Override
    public void eat() {
        System.out.println("kutya eszik");
    }

    public void run() {
        System.out.println("kutya fut");
    }
}

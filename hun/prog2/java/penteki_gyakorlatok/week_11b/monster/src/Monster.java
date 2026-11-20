public class Monster implements CanAttack, CanFly, CanSwim
{
    private String type;

    public Monster(String type) {
        this.type = type;
    }

    @Override
    public void attack() {
        System.out.printf("%s támad\n", this.type);
    }

    @Override
    public void fly() {
        System.out.printf("%s repül\n", this.type);
    }

    @Override
    public void swim() {
        System.out.printf("%s úszik\n", this.type);
    }
}

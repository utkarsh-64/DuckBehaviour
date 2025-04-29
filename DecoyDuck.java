//DecoyDuck.java
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Floating();
        flyBehaviour = new NoFly();
    }
    @Override
    public void display() {
        System.out.println("It's a Decoy Duck");
    }
}

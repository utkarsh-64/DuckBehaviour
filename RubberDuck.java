//RubberDuck.java
public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
        flyBehaviour = new NoFly();
    }
    @Override
    public void display() {
        System.out.println("It's a Rubber Duck");
    }
}

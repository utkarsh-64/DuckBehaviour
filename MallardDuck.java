//MallardDuck.java
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new Fly();
    }
    @Override
    public void display() {
        System.out.println("It's a Mallard Duck");
    }

}

//RedHeadDuck.java
public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        quackBehaviour = new Quack();
        swimBehaviour =  new Swimming();
        flyBehaviour = new Fly();
    }
    @Override
    public void display() {
        System.out.println("It's a Redhead Duck");
    }
}


//Main.java
//Name: Utkarsh Lakhani
//PRN: 23070126064
//Batch: AIML-A3

public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        System.out.println("-------------------------------------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("-------------------------------------------------");

        RubberDuck rd = new RubberDuck();
        System.out.println("-------------------------------------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("-------------------------------------------------");

        RedHeadDuck rhd = new RedHeadDuck();
        System.out.println("-------------------------------------------------");
        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        rhd.performFly();
        System.out.println("-------------------------------------------------");

        DecoyDuck dd = new DecoyDuck();
        System.out.println("-------------------------------------------------");
        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("-------------------------------------------------");
    }
}

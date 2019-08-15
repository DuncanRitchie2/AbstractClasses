package AbstractClasses;

public class Octopus extends Mollusc implements InTheWater {
    static String[] diet = {"polychaete worms","shrimps","crabs","cockles","clams","little fish"};

    public void speak(){
    }
    public void move(){
        System.out.println("Watch me go!");
    }
    public void feed(){
        int rand = (int)Math.floor(Math.random()*diet.length);
        System.out.println("I'm eating "+diet[rand]+".");
    }
    public void swim(){
        System.out.println("I swim by squeezing my arms together to propel me through the water!");
    }
}

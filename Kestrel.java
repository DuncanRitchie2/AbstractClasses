package AbstractClasses;

public class Kestrel extends BirdOfPrey {
    public void speak() {
        System.out.println("Tweet tweet tweet");
    }
    public void feed() {
        System.out.println("I'm eating voles and other small rodents!");
    }
    public void move() {
        int rand = (int)Math.floor(Math.random()*10);
        int i = 0;
        while (i<rand) {
            System.out.println("Hovering!");
            i++;
        }
        dive();
    }
    public void dive() {
        System.out.println("I'm diving for some food!");
    }
}

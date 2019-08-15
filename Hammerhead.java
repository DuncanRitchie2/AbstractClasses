package AbstractClasses;

public class Hammerhead extends Shark {
    static String[] diet = {"fish","more fish","squid","sting-rays","sea-grass which is really unusual for a shark"};

    public void haveAWeirdHead() {
        System.out.println("My skull's a weird shape!");
    }
    public void speak() {
        System.out.println("I'm like the manager of West Ham United - I'm a Hammer head.");
    }
    public void move() {
        System.out.println("Swimming!");
    }
    public void feed() {
        int rand = (int)Math.floor(Math.random()*diet.length);
        System.out.println("I'm eating "+diet[rand]+".");
    }
}

package AbstractClasses;

public class Magpie extends Bird implements InTheSky {
    public void speak() {
        int rand = (int)Math.floor(Math.random()*50);
        String start = "Squawk";
        String motif = " squawk";
        String end = "...";
        System.out.println(start+motif.repeat(rand)+end);
    }
    public void move() {
        double rand = Math.random();
        System.out.println("I'm "+(rand>0.5 ? "fly" : "hopp")+"ing!");
        fly();
    }
    public void feed() {
        System.out.println("I'm an opportunistic omnivorous scavenger!");
    }
    public void stealShinyObjects() {
        System.out.println("Oooh, shiny!");
    }
    public void fly() {
        System.out.println("Flap! Glide! Soar! Land!");
    }
    public void walk() {
        System.out.println("Hop hop hop hop...");
    }
}

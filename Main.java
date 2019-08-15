package AbstractClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        select();
    }

    public static void select() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nPlease type an animal out of hammerhead, kestrel, magpie, octopus, porpoise.");
        String choice = myScanner.nextLine();
        System.out.println("You selected a " + choice + ".");
        createAnimal(choice);
    }

    public static void createAnimal(String choice) {
        switch (choice.toLowerCase()) {
            case "magpie":
                Magpie magpie = new Magpie();
                magpie.feed();
                magpie.speak();
                magpie.move();
                magpie.stealShinyObjects();
                break;
            case "hammerhead":
                Hammerhead hammerhead = new Hammerhead();
                hammerhead.speak();
                hammerhead.move();
                hammerhead.feed();
                hammerhead.haveAWeirdHead();
                break;
            case "kestrel":
                Kestrel kestrel = new Kestrel();
                kestrel.move();
                kestrel.feed();
                kestrel.speak();
                break;
            case "porpoise":
                Porpoise porpoise = new Porpoise();
                porpoise.move();
                porpoise.feed();
                porpoise.speak();
                break;
            case "octopus":
                Octopus octopus = new Octopus();
                octopus.move();
                octopus.feed();
                octopus.speak();
                octopus.swim();
                break;
            default:
                System.out.println("That's not one of the possible animals.");
        }
        select();
    }
}

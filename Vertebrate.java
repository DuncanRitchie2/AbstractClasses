package AbstractClasses;

public abstract class Vertebrate implements Animal {
    public void main() {
        System.out.println("I got a backbone!");
    }

    public void speak() {
        System.out.println("Vertebratey noises");
    }

    public void Vertebrate(){
        this.speak();
        this.move();
        this.feed();
    }
}

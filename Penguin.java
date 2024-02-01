import java.time.LocalDate;

public class Penguin extends Animal {
    
    public Penguin(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void toFly() {
        System.out.println(getName() + " is a " + getType() + ", it can't fly.");
    }

    @Override
    public void eatFood() {
        System.out.println("bite");
    }
}
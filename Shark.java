import java.time.LocalDate;

public class Shark extends Animal {
    
    public Shark(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void toGo() {
        System.out.println(getName() + " is a " + getType() + ", it can't walk.");
    }

    @Override
    public void toFly() {
        System.out.println(getName() + " is a " + getType() + ", it can't fly.");
    }

    @Override
    public void eatFood() {
        System.out.println("rend");
    }
}

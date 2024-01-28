import java.time.LocalDate;

public class Dog extends Animal {

    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void toFly() {
        System.out.println(getName() + " is a " + getType() + " it can't fly.");
    }
}

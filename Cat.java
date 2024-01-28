import java.time.LocalDate;

public class Cat extends Animal {

    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void toFly() {
        System.out.println(getName() + " is a " + getType() + ", it can't fly.");
    }
}

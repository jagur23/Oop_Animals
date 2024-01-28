import java.time.LocalDate;

public class Eagle extends Animal {
    
    public Eagle(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void toSwim() {
        System.out.println(getName() + " is a " + getType() + ", it can't swim.");
    }
}

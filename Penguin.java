import java.time.LocalDate;

public class Penguin extends Animal implements Goable, Swimable{
    
    public Penguin(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void eatFood() {
        System.out.println("bite");
    }

    @Override
    public double run() {
        return 2.0;
    }

    @Override
    public double swim() {
        return 10.0;
    }
}

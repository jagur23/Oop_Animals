import java.time.LocalDate;

public class Eagle extends Animal implements Goable, Flyable{
    
    public Eagle(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void eatFood() {
         System.out.println("nibble");
    }

    @Override
    public double run() {
        return 0.5;
    }

    @Override
    public double fly() {
        return 100.0;
    }
}

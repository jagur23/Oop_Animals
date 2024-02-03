import java.time.LocalDate;

public class Shark extends Animal implements Swimable{
    
    public Shark(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void eatFood() {
        System.out.println("rend");
    }

    @Override
    public double swim() {
        return 8.0;
    }
}

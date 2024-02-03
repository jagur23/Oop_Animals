import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable{

    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void eatFood() {
        System.out.println("swallow");
    }

    @Override
    public double run() {
        return 48.0;
    }

    @Override
    public double swim() {
        return 2.0;
    }
}

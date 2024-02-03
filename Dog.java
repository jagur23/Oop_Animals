import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable{

    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void eatFood() {
        System.out.println("cups");
    }

    @Override
    public double run() {
        return 15.0;
    }

    @Override
    public double swim() {
        return 4.0;
    } 
}

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Flyable, Swimable{

    private int wingQuantity;

    public Duck(String name, LocalDate birthday, Illness illness, int wingQuantity) {
        super(name, birthday, illness);
        this.wingQuantity = wingQuantity;
    }

    public int getWingQuantity(){
        return wingQuantity;
    }

    @Override
    public void eatFood() {
        System.out.println("pluck");
    }

    @Override
    public double run() {
        return 6.0;
    }

    @Override
    public double fly() {
        return 90.0;
    }

    @Override
    public double swim() {
        return 6.0;
    }
}

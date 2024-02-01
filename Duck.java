import java.time.LocalDate;

public class Duck extends Animal{

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
}

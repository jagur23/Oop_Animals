import java.time.LocalDate;

public class Cat extends Animal implements Huntable, Goable{

    public Cat(){
        
    }

    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void toFly() {
        System.out.println(getName() + " is a " + getType() + ", it can't fly.");
    }

    @Override
    public void eatFood() {
        System.out.println("swallow");
    }

    @Override
    public double go() {
        return 7;
    }
}

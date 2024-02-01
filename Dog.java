import java.time.LocalDate;

public class Dog extends Animal implements Goable{

    public Dog(){
        
    }

    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void toFly() {
        System.out.println(getName() + " is a " + getType() + " it can't fly.");
    }

    @Override
    public void eatFood() {
        System.out.println("cups");
    }

    @Override
    public double go() {
        return 5;
    }
}

import java.time.LocalDate;

public abstract class Animal {

    protected String name;
    protected LocalDate birthday;
    protected Illness illness;

    public Animal(){
        
    }

    /* public Animal(){
        this("Vasja", LocalDate.now(), new Illness("Lichen"));
    } */

    public Animal(String name, LocalDate birthday, Illness illness){
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
    }

    public void setIllness(Illness illness){
        this.illness = illness;
    }

    public String getName(){
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    /* private void wakeUp(){
        System.out.println(getType() + " waked up!");
    } */

    private void wakeUp(String time){
        System.out.println(getType() + " waked up at " + time);
    }

    private void hunt(){
        System.out.println(getType() + " is hunting.");
    }

    private void eat(){
        System.out.println(getType() + " is eating.");
    }

    private void sleep(){
        System.out.println(getType() + " is sleeping.");
    }

    public void toGo(){
        System.out.println(getName() + " is a " + getType() + ", it's walking.");
    }

    public void toFly(){
        System.out.println(getName() + " is a " + getType() + ", it's flying.");
    }

    public void toSwim(){
        System.out.println(getName() + " is a " + getType() + ", it's swimming.");
    }

    public abstract void eatFood();

    public void lifeCycle(){
        wakeUp("12");
        hunt();
        eat();
        sleep();
    }

    @Override
    public String toString() {
        return String.format("Name: %s, birthday: %s, Illness: %s.", name, birthday, illness);
    }
}
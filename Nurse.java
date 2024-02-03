import java.util.List;

public class Nurse implements ClinicPersonal {
    
    private String name;
    private String surname;
    private int id;


    public Nurse(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public void getPersonInfo(){
        System.out.println(String.format("%s %s %s / id: %d.", getClass().getSimpleName(), name, surname, id));
    }

    @Override
    public String toString() {
        return String.format("%s %s %s / id: %d", getClass().getSimpleName(), name, surname, id);
    }

    public void doPetRegistration(List<Animal> animalList, Animal animal) {
        animalList.add(animal);
    }
}

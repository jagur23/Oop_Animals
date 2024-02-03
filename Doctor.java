import java.util.List;

public class Doctor implements ClinicPersonal {
    
    private String name;
    private String surname;
    private int id;
    private Nurse nurse;


    public Doctor(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public Doctor(String name, String surname, int id, Nurse nurse) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.nurse = nurse;
    }

    public String getDoctorInfo(){
        return String.format("%s %s %s / id: %d.", getClass().getSimpleName(), name, surname, id);
    }

    public String getDoctorAndNurseInfo(){
        return String.format("%s %s %s / id: %d, work together with nurse %s.", getClass().getSimpleName(), name, surname, id, nurse);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s / id: %d", getClass().getSimpleName(), name, surname, id);
    }

    public void doDiagnose(List<Animal> sickAnimalList, List<Animal> animalsWithDiagnose, Illness illness){
        Animal animal = sickAnimalList.remove(0);
        animal.setIllness(illness);
        animalsWithDiagnose.add(animal);
    }

    public void doTreatment(List<Animal> animalsWithDiagnose, List<Animal> curedAnimalsList){
        Animal animal = animalsWithDiagnose.remove(0);
        curedAnimalsList.add(animal);
    }
}

import java.util.List;

public class VeterinaryClinic {

    private List<Object> allPersonalList;
    private String name;


    public VeterinaryClinic(String name, List<Object> allPersonalList){
        this.name = name;
        this.allPersonalList = allPersonalList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getAllPersonalList(){
        return allPersonalList;
    }

    @Override
    public String toString() {
        return String.format("Veterinary clinik \"%s\"", name);
    }

    static void printAllPersonal(List<ClinicPersonal> allPersonalList){
        for (Object person : allPersonalList) {
            System.out.println(person);
        }
    }

    static void getAllDoctors(List<ClinicPersonal> allPersonalList){
        for (Object doctor : allPersonalList) {
            if(doctor instanceof Doctor){
                System.out.println(doctor);
            }
        }
    }

    static void getAllNurses(List<ClinicPersonal> allPersonalList){
        for (Object nurse : allPersonalList) {
            if(nurse instanceof Nurse){
                System.out.println(nurse);
            }
        }
    }

    public void printAnimalList(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    
    public void getGoables(List<Animal> animalList){

        Animal animal;
        for (int i = 0; i < animalList.size(); i++) {
            animal = animalList.get(i);
            if(animal instanceof Goable){
                System.out.println(animal);;
            }
        }
    }


    public void getSwimables(List<Animal> animalList){
        Animal animal;
        for (int i = 0; i < animalList.size(); i++) {
            animal = animalList.get(i);
            if(animal instanceof Swimable){
                System.out.println(animal);;
            }
        }
    }


    public void getFlyables(List<Animal> animalList){
        Animal animal;
        for (int i = 0; i < animalList.size(); i++) {
            animal = animalList.get(i);
            if(animal instanceof Flyable){
                System.out.println(animal);;
            }
        }
    }
}

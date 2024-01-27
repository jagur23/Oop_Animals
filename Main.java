import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Animal cat = new Animal("Barsik", LocalDate.of(2020, 3, 20), new Illness("Lichen"));
        System.out.println(cat.getName());
        Animal animal = new Animal();
        System.out.println(animal.getName());
        //cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        Animal dog = new Dog("Peach", LocalDate.of(2021, 8, 23), new Illness("Lichen"));
        System.out.println(dog.getType());
        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        animalList.add(new Duck("Kesha", LocalDate.of(2022, 4, 15), new Illness("no wing"), 1));
        System.out.println(animalList);
        for (Animal animall : animalList) {
            System.out.println(animall);
        }
        dog.lifeCycle();
        

        
    }
}

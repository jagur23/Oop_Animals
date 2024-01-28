import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        // Seminar 1

        /* Animal cat = new Animal("Barsik", LocalDate.of(2020, 3, 20), new Illness("Lichen"));
        System.out.println(cat.getName());
        Animal animal = new Animal();
        System.out.println(animal.getName());
        //cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());/* */
        //Animal dog1 = new Dog("Peach", LocalDate.of(2021, 8, 23), new Illness("Lichen"));
        /*System.out.println(dog.getType());
        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        animalList.add(new Duck("Kesha", LocalDate.of(2022, 4, 15), new Illness("no wing"), 1));
        System.out.println(animalList);
        for (Animal animall : animalList) {
            System.out.println(animall);
        }
        dog.lifeCycle(); */


        // Seminar 1 dz

        Animal dog1 = new Dog("Peach", LocalDate.of(2021, 8, 23), new Illness("Lichen"));
        Animal duck1 = new Duck("Krja", LocalDate.of(2021, 8, 15), new Illness("Tuberculosis"), 2);
        Animal cat1 = new Cat("Masha", LocalDate.of(2022, 10, 15), new Illness("Overweight"));
        Animal shark1 = new Shark("Sharky", LocalDate.of(2020, 12, 15), new Illness("Parasites"));
        Animal eagle1 = new Eagle("Orel", LocalDate.of(2018, 10, 1), new Illness("Histomoniasis"));
        Animal penguin1 = new Penguin("Rikko", LocalDate.of(2020, 11, 25), new Illness("Infection"));

        dog1.toGo();
        dog1.toSwim();
        dog1.toFly();
        System.out.println();

        duck1.toFly();
        duck1.toGo();
        duck1.toSwim();
        System.out.println();

        cat1.toGo();
        cat1.toSwim();
        cat1.toFly();
        System.out.println();

        shark1.toGo();
        shark1.toSwim();
        shark1.toFly();
        System.out.println();

        eagle1.toGo();
        eagle1.toSwim();
        eagle1.toFly();
        System.out.println();

        penguin1.toGo();
        penguin1.toSwim();
        penguin1.toFly();
        System.out.println();
    }
}

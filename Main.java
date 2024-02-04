import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import drugstore.Component;
import drugstore.Pharmacy;
import drugstore.PharmacyIterable;
import drugstore.components.Pinicillin;
import drugstore.components.Salt;
import drugstore.components.Water;

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

        /* Animal dog1 = new Dog("Peach", LocalDate.of(2021, 8, 23), new Illness("Lichen"));
        Animal duck1 = new Duck("Krja", LocalDate.of(2021, 8, 15), new Illness("Tuberculosis"), 2);
        Animal cat1 = new Cat("Masha", LocalDate.of(2022, 10, 15), new Illness("Overweight"));
        Animal shark1 = new Shark("Sharky", LocalDate.of(2020, 12, 15), new Illness("Parasites"));
        Animal eagle1 = new Eagle("Orel", LocalDate.of(2018, 10, 1), new Illness("Histomoniasis"));
        Animal penguin1 = new Penguin("Rikko", LocalDate.of(2020, 11, 25), new Illness("Infection")); */

        /* dog1.toGo();
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
        System.out.println(); */



        // Seminar 2
        /* 
        List<Goable> goable = new ArrayList<>();
        goable.add(new Cat());
        goable.add(new Dog());

        System.out.println(goable);

        for (Goable g : goable) {
            System.out.println(g.go());
            g.defaultGo(20.0);
        }



        //Пример люмбда выражений
        Goable goablee = new Goable(){

            @Override
            public double go() {
                return 0;
            }
        };

        Goable goable1 = () -> 19;



        /* Mathable m = new Mathable() {

            @Override
            public double addition(double a, double b) {
                
                return a + b;
            }
        };

        Mathable m1 = (x, y) -> x + y; */
        


        // Seminar 2 homework


        /* Создать класс Doctor и подумать над его состоянием и поведением. 
        
        Создать класс Nurse(медсестра) и подумать над его состоянием и поведением. 
        
        Создайте интерфейсы Goable, Flyable, Swimable. У интерфейсов должны быть методы 
        получения скорости заданного действия: double run(), double fly(), double swim()

        Добавьте наследников этим интерфейсам, но таким образом, чтобы у каждого интерфейса 
        было минимум по два наследника (при необходимости, добавьте в приложение новые классы)

        Создать класс ВетеринарнаяКлиника (VeterinaryClinic) У ветеринарной клиники добавьте 
        методы получения всех бегающих, всех плавающих и всех летающих, а также методы для работы с персоналом клиники.
        */

        /* List<Animal> sickAnimalList = new LinkedList<>();


        List<Animal> animalWithDiagnose = new LinkedList<>();
        List<Animal> curedAnimalList = new ArrayList<>();
        List<ClinicPersonal> allPersonalList = new ArrayList<>();
        List<Object> vetPersonalList = new ArrayList<>();

        VeterinaryClinic happyPets = new VeterinaryClinic("Happy pets", vetPersonalList);
        Nurse nurse1 = new Nurse("Lana", "Danilova", 125558);
        Doctor doctor1 = new Doctor("Vasilij", "Pupkov", 255889, nurse1);
        Doctor doctor2 = new Doctor("Roman", "Krilov", 1255580);

        System.out.println(happyPets);

        vetPersonalList.add(doctor1);
        vetPersonalList.add(doctor2);
        vetPersonalList.add(nurse1);
        System.out.println(vetPersonalList);

        allPersonalList.add(doctor1);
        allPersonalList.add(doctor2);
        allPersonalList.add(nurse1);
        VeterinaryClinic.printAllPersonal(allPersonalList);

        nurse1.doPetRegistration(sickAnimalList, new Dog("Sharik", LocalDate.of(2022, 1, 6), null));
        nurse1.doPetRegistration(sickAnimalList, new Cat("Boris", LocalDate.of(2020, 8, 8), null));
        nurse1.doPetRegistration(sickAnimalList, new Dog("Peach", LocalDate.of(2021, 8, 23), null));
        nurse1.doPetRegistration(sickAnimalList, new Duck("Krja", LocalDate.of(2021, 8, 15), null, 2));
        nurse1.doPetRegistration(sickAnimalList, new Cat("Masha", LocalDate.of(2022, 10, 15), null));
        nurse1.doPetRegistration(sickAnimalList, new Shark("Sharky", LocalDate.of(2020, 12, 15), null));
        nurse1.doPetRegistration(sickAnimalList, new Eagle("Orel", LocalDate.of(2018, 10, 1), null));
        nurse1.doPetRegistration(sickAnimalList, new Penguin("Rikko", LocalDate.of(2020, 11, 25), null));
        
        System.out.println("============Goables========");
        happyPets.getGoables(sickAnimalList);
        System.out.println();

        System.out.println("============Swimables========");
        happyPets.getSwimables(sickAnimalList);
        System.out.println();

        System.out.println("============Flyable==========");
        happyPets.getFlyables(sickAnimalList);
        System.out.println();

        happyPets.printAnimalList(sickAnimalList);
        System.out.println();

        doctor1.doDiagnose(sickAnimalList, animalWithDiagnose, new Illness("Broken leg"));
        doctor1.doDiagnose(sickAnimalList, animalWithDiagnose, new Illness("Vaccination"));
        happyPets.printAnimalList(animalWithDiagnose);

        doctor1.doTreatment(animalWithDiagnose, curedAnimalList);
        happyPets.printAnimalList(curedAnimalList);
        
        VeterinaryClinic.printAllPersonal(allPersonalList);
        //double cat1Speed = ((Cat) cat1).swim();
        //System.out.println(cat1Speed);
        //VeterinaryClinic.getAllDoctors(allPersonalList);
        //VeterinaryClinic.getAllNurses(allPersonalList);
        //System.out.println(doctor1.getDoctorInfo());
        //System.out.println(allPersonalList); */



        //Seminar 3.

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1
                .addComponents(new Pinicillin("Component1", 2.0, 10))
                .addComponents(new Salt("Water", 5.0, 100));

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2
                .addComponents(new Salt("Salt", 10.0, 50));


        Iterator<Component> iter = pharmacy1;

        /* while(iter.hasNext()){
            System.out.println(iter.next()); 
        } */


        PharmacyIterable p1 = new PharmacyIterable();
        p1
            .addComponents(new Pinicillin("Component1", 2.0, 10))
            .addComponents(new Water("Spring Water", 44.0, 99))
            .addComponents(new Salt("Merisuola", 66.0, 59));

        PharmacyIterable p2 = new PharmacyIterable();
        p2
            .addComponents(new Pinicillin("Penicillin", 2.0, 10))
            .addComponents(new Water("Spring Water", 44.0, 99))
            .addComponents(new Salt("Merisuola", 20.0, 70));
        

        PharmacyIterable p3 = new PharmacyIterable();
        p3
            .addComponents(new Pinicillin("Penicillin", 2.0, 10))
            .addComponents(new Water("Spring Water", 44.0, 99))
            .addComponents(new Salt("Merisuola", 20.0, 70));


        List<PharmacyIterable> pharmacyIterables = new ArrayList<>();
        pharmacyIterables.add(p1);
        pharmacyIterables.add(p2);
        pharmacyIterables.add(p3);

        /* for (Component component : pharmacy3) {
            System.out.println(component);
        } */

        /* for (int i = 0; i < pharmacy3.getSize(); i++) {
            System.out.println(pharmacy3.getComponent(i));
        } */


        Component c1 = new Pinicillin("newOne",100, 45);
        Component c2 = new Water("newWater",101, 1000);
        Component c3 = new Salt("redsalt",30, 10);

        List<Component> cList = new ArrayList<>();
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        cList.add(c1);

        System.out.println(cList);
        Collections.sort(cList, Comparator.reverseOrder());
        System.out.println(cList);


            
    }
}

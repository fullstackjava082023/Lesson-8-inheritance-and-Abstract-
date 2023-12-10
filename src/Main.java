public class Main {
    public static void main(String[] args) {

//        Employee employee = new Employee(20000, "Arja", 1986, 4, 8);
//        Manager manager = new Manager(25000, "John", 1998, 5, 6);
//        Manager manager2 = new Manager(25000, "Ned", 1986, 5, 6);
//
//        manager.setBonus(10000);
////        System.out.println(employee.toString());
////
//        System.out.println(manager.toString());
////        System.out.println(manager2.toString());
//
//        Dog puppy = new Dog();
//        puppy.animalSound();
//
//        System.out.println(employee.getSalary());
//        System.out.println(manager.getSalary());
//        //expect to get 35000
//
//        Manager manager3 = new Manager(10000, "Caitlyn", 1990, 5, 6, 5000);
//        System.out.println(manager3.toString());
        Animal tommy;
        Animal puf;
        Animal sharik;
        sharik = new Dog();
        puf = new Animal();
        tommy = new Cat();

//        System.out.println(((Cat) tommy).numberOfLives);
//        System.out.println(((Cat) puf).numberOfLives);


//
//        Animal[] animals = {sharik, puf, tommy};
//        ((Cat)animals[2]).numberOfLives = 7;
//        System.out.println(((Cat)animals[2]).numberOfLives);
//        for (Animal animal : animals) {
//            animal.animalSound();
//        }
////        for (int i = 0; i < animals.length; i++) {
////            animals[i].animalSound();
////        }


        Person arja = new Employee(20000, "Arja", 1986, 4, 8);
        Person john = new Manager(25000, "John", 1998, 5, 6);
        Person ned = new Employee(25000, "Ned", 1986, 5, 6);
        Person maria = new Student();

        Person[] stuff = new Employee[4];
        stuff[0] = arja;
        stuff[1] = john;
        stuff[2] = ned;
        stuff[3] = maria;

        //I want to set bonus to all managers
        for(Person person : stuff) {
            if (person instanceof Manager) {
                ((Manager) person).setBonus(5000);
            }
            person.getDescription();
            System.out.println(person.toString());
        }

        Employee person = new Employee(5000, "Caitlyn", 1986, 5, 6);
        person.getDescription();





    }
}
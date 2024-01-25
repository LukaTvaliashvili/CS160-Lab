package ge.sdsu.session20240123.groupOne;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog(true);
        Dog dog1 = new Dog(true);


        Rabbit rabbit = new Rabbit(true);

        System.out.println(dog);
        System.out.println("\n");
        System.out.println(rabbit);

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);

        Animal animal = dog;
        Animal rabbit1 = rabbit;

        System.out.println(animal);
        System.out.println(rabbit1);

    }
}

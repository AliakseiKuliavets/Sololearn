import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();
        Dog dog = new Dog();
        dog.speak();
        cat.eat();
        dog.eat();
        cat.purr();

        LovelyCat lovelyCat = new LovelyCat();
        lovelyCat.beArrogant();

        System.out.println("___________________");

        System.out.println(dog.toString());
        System.out.println(cat.toString());

        System.out.println("___________________");

        int[] ints = new int[5];
        Object[] objects = new Object[5];

        objects[0] = dog;
        objects[1] = cat;

        for (int i: ints) {
            System.out.println(i);
        }
        for (Object o: objects) {
            System.out.println(o);
        }

        int y = 65;
        int[] number = {12,43,90,y,23};
        System.out.println(Arrays.toString(number));
        
    }
}

public class Dog extends Animal {
    private  final int pawCount = 4;
    private  final int height = 75;
    private  final int age = 6;
    public void speak() {
        System.out.println("Гав");
    }
    public void walk() {
        System.out.println("Я собака я хожу сам по себе");
    }

    @Override
    public String toString() {
        return  "Я собака я все что есть";
    }
}

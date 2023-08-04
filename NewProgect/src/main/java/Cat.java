public class Cat extends Animal {
    private  final int pawCount = 4;
    private  final int height = 35;
    private  final int age = 3;
    public void speak() {
        System.out.println("Мяу");
    }
    public void walk() {
        System.out.println("Я кот я хожу сам по себе");
    }
    public void purr() {
        System.out.println("Я могу мурлыкать");
    }

    @Override
    public String toString() {
        return  "Я кот я мяукаю";
    }
}

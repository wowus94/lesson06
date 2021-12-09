package lesson06;

public class Animal {
    String name;

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        cat.catInfo();
        cat.catRun();
        cat.catSwim();
        Dog dog = new Dog("Рекс");
        dog.dogInfo();
        dog.dogRun();
        dog.dogSwim();
    }
}
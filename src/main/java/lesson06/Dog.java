package lesson06;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    public void dogInfo() {
        System.out.println("Имя собаки: " + name);
    }

    public void dogRun() {
        int randNumb = (int) (Math.random() * 500);
        System.out.println(name + " пробежал: " + randNumb + " м.");
    }

    public void dogSwim() {
        int randNumb1 = (int) (Math.random() * 10);
        System.out.println("А проплыл " + name + ": " + randNumb1 + " м.");
    }
}

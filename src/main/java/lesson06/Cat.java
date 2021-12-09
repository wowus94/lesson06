package lesson06;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    public void catInfo() {
        System.out.println("Имя кота: " + name);
    }

    public void catRun() {
        int randNumb = (int) (Math.random() * 200);
        System.out.println(name + " пробежал: " + randNumb + " м.");
    }

    public void catSwim() {
        System.out.println("Плавать " + name + " не умеет...");
        System.out.println();
    }
}

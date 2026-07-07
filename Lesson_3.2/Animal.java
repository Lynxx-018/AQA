public class Animal {
    protected String name;
    private static int countAnimals = 0;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }
    public String getName() {
        return name;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swimming(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}



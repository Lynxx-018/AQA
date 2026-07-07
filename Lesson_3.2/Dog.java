public class Dog extends Animal {
    private static int countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
    }
    public static int getCountDogs() {
        return countDogs;
    }
    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " устал. Не может пробежать " + distance + " м. Максимум — 500 м.");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }
    @Override
    public void swimming(int distance) {
        if (distance > 10) {
            System.out.println(name + " не хочет плыть так далеко. Максимум для собаки — 10 м.");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }
}




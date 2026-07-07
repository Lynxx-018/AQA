public class Cat extends Animal {
    private static int countCats = 0;
    private boolean isFull; // сытость: true = сыт, false = голоден

    public Cat(String name) {
        super(name);
        countCats++;
        this.isFull = false;
    }
    public static int getCountCats() {
        return countCats;
    }
    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " слишком ленив, чтобы бежать " + distance + " м. Лимит - 200 м.");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void swimming(int distance) {
        System.out.println(name + " вообще не умеет плавать! Зачем мне " + distance + " м.?");
    }
    public void eat(Bowl bowl, int amount) {
        if (isFull) {
            System.out.println(name + " уже сыт и не хочет есть.");
            return;
        }
        boolean success = bowl.tryTakeFood(amount);

        if (success) {
            isFull = true;
            System.out.println(name + " съел " + amount + " ед. еды и теперь сыт!");
        } else {
            System.out.println(name + " хотел съесть " + amount + " ед., но в миске мало еды. Кот остался голодным.");
        }
    }
}




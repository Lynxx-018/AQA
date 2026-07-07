public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(100);
        Bowl myBowl = new Bowl(25);

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Мурка");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Пушок");
        cats[3] = new Cat("Снежок");

        System.out.println("--- Коты пытаются покушать ---");

        cats[0].eat(myBowl, 10);
        cats[1].eat(myBowl, 15);
        cats[2].eat(myBowl, 10);
        cats[3].eat(myBowl, 5);

        System.out.println("--- Текущее количество еды в миске: " + myBowl.getFoodAmount() + " ---");

        myBowl.addFood(20);

        System.out.println("--- Вторая попытка покушать ---");
        cats[2].eat(myBowl, 10);
        cats[3].eat(myBowl, 5);

        System.out.println("--- Итоговая статистика сытости ---");
        for (int i = 0; i < cats.length; i++) {
            String status = cats[i].isFull() ? "сыт" : "голоден";
        }
        System.out.println("--- Кого покормить? ---");
        for (Cat cat : cats) {
            String status = cat.isFull() ? "сыт" : "голоден";
        }
        for (Cat cat : cats) {
            String status = cat.isFull() ? "сыт" : "голоден";
            System.out.println("Кот " + cat.getName() + " — " + status);
        }
        System.out.println("Всего животных: " + Animal.getCountAnimals());
        System.out.println("Собак: " + Dog.getCountDogs());
        System.out.println("Котов: " + Cat.getCountCats());
    }
}

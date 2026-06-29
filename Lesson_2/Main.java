public class Main {
    public static void main(String[] args) {
        Goods[] productsArray = new Goods[5];

        productsArray[0] = new Goods("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Goods("iPhone 16 Pro", "15.03.2025",
                "Apple Inc.", "USA", 7999, false);
        productsArray[2] = new Goods("Xiaomi 14 Pro", "20.01.2025",
                "Xiaomi Corp.", "China", 4999, true);
        productsArray[3] = new Goods("Pixel 9 Pro", "10.04.2025",
                "Google", "USA", 6999, false);
        productsArray[4] = new Goods("OnePlus 12", "05.02.2025",
                "OnePlus", "China", 5999, true);

        System.out.println("СПИСОК ТОВАРОВ:");
        System.out.println("===========================");
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].info();
        }
    }
}

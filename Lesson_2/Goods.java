public class Goods {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private int price;
    private boolean booking;  // true - забронирован, false - свободен

    public Goods(String name, String productionDate, String manufacturer,
                 String country, int price, boolean booking) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }

    public void info() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Бронирование: " + (booking ? "Забронирован" : "Свободен"));
        System.out.println("---------------------------");
    }
}

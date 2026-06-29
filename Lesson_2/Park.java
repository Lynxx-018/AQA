public class Park {
    public static class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void info() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("---------------------------");
        }
    }
    public static void main(String[] args) {
        Attraction attraction1 = new Attraction("Американские горки", "10:00-22:00", 500);
        Attraction attraction2 = new Attraction("Колесо обозрения", "09:00-23:00", 300);
        Attraction attraction3 = new Attraction("Автодром", "10:00-21:00", 400);

        attraction1.info();
        attraction2.info();
        attraction3.info();
    }
}

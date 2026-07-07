public class Bowl {
    private int foodAmount;
    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавили " + amount + " ед. еды. Теперь в миске: " + foodAmount);
        }
    }
    public boolean tryTakeFood(int amountNeeded) {
        if (foodAmount >= amountNeeded) {
            foodAmount -= amountNeeded;
            return true; // еды хватило
        } else {
            return false; // еды не хватило
        }
    }
    public int getFoodAmount() {
        return foodAmount;
    }
}



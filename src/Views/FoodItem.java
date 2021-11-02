package Views;

/**
 * FoodItem class stores the information for each food item
 * Variables include name, calorie/protein/fat count, etc
 */
public class FoodItem {


    public static void main(String[] args) {

        FoodItem item1 = new FoodItem("egg", 100, 20, 5, 30, 2, 2);
        System.out.println(item1.getQuantity());
        item1.updateQuantity(3);
        System.out.println(item1.getQuantity());
    }
    // Properties
    private String name;
    private int calories, protein, carbs, fat, sugar, quantity;

    /**
     * Full constructor with all variables creates new FoodItem
     *
     * @param name     name of food
     * @param calories food's cals
     * @param protein  food's protein
     * @param carbs    food's carbs
     * @param fat      food's fat
     * @param sugar    food's sugar
     * @param quantity default = 1
     */
    public FoodItem(String name, int calories, int protein, int fat, int carbs, int sugar, int quantity) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        this.sugar = sugar;
        this.quantity = quantity;
    }

    /**
     * 1-parameter constructor allows for a single fooditem to be inserted
     *
     * @param quantity
     */
    public FoodItem(int quantity) {
        this.quantity = quantity;
    }

    public FoodItem(FoodItem item, int quantity) {
        this.name = item.getName();
        this.calories = item.getCalories();
        this.protein = item.getProtein();
        this.carbs = item.getCarbs();
        this.fat = item.getFat();
        this.sugar = item.getSugar();
        this.quantity = quantity;
    }

    /**
     * updateQuantity method updates quantity given a value to be added
     *
     * @param quantityAdded value to be added
     */
    public void updateQuantity(int quantityAdded) {
        this.quantity += quantityAdded;
    }

    // Accessors and mutators

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

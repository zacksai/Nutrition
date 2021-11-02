package Views;

import java.util.ArrayList;

/**
 * DailyTracker class manages a list/binary tree (tbd) of FoodItems
 * It automatically updates daily totals
 */
public class DailyTracker {

    public static void main(String[] args) {

        DailyTracker monday = new DailyTracker();

        monday.addItem( new FoodItem("chicken", 20, 40, 5, 0, 0, 2));
        System.out.println(monday.getTotalCalories());
        monday.addItem( new FoodItem("chicken", 20, 40, 5, 0, 0, 2));
        System.out.println(monday.getTotalCalories());
        monday.addItem( new FoodItem("chicken", 20, 40, 5, 0, 0, 2));
        System.out.println(monday.getTotalCalories());
    }

    // Properties
    private ArrayList<FoodItem> foodsList;
    private int totalCalories, totalProtein, totalCarbs, totalFat, totalSugar;

    /**
     * default constructor initializes totals to 0 and creates an empty arraylist
     */
    public DailyTracker() {
        this.foodsList = new ArrayList<>();
        this.totalCalories = 0;
        this.totalProtein = 0;
        this.totalCarbs = 0;
        this.totalFat = 0;
        this.totalSugar = 0;
    }

    /**
     * custom addItem method checks if item exists. Increment quantity if true
     * else add normally
     * also, update totals
     *
     * @param newItem item being added
     */
    protected void addItem(FoodItem newItem) {

        // Check if new item exists in list already
        int z = foodsList.indexOf(newItem);

        if (z > -1)
            // If it does, update quantity of existing item in the list
            foodsList.get(z).updateQuantity(newItem.getQuantity());
        else
            // If it doesn't, just add it to the list (it's the first of its kind)
            foodsList.add(newItem);

        // Update daily totals
        updateDailyTotals();
    }

    /**
     * 0-param update totals sums up totals manually
     */
    private void updateDailyTotals() {
        this.setTotalCarbs(0);
        this.setTotalCalories(0);
        this.setTotalFat(0);
        this.setTotalProtein(0);
        this.setTotalSugar(0);

        // Iterate through all items, add (item quantity * value) to macro
        for (FoodItem item : foodsList) {
            this.setTotalCalories(this.getTotalCalories() + (item.getQuantity() * item.getCalories()));
            this.setTotalSugar(this.getTotalSugar() + (item.getQuantity() * item.getSugar()));
            this.setTotalProtein(this.getTotalProtein() + (item.getQuantity() * item.getProtein()));
            this.setTotalCarbs(this.getTotalCarbs() + (item.getQuantity() * item.getCarbs()));
            this.setTotalFat(this.getTotalFat() + (item.getQuantity() * item.getFat()));
        }
    }



    // Accessors and modifiers
    public ArrayList<FoodItem> getFoodsList() {
        return foodsList;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public int getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(int totalProtein) {
        this.totalProtein = totalProtein;
    }

    public int getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(int totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public int getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(int totalFat) {
        this.totalFat = totalFat;
    }

    public int getTotalSugar() {
        return totalSugar;
    }

    public void setTotalSugar(int totalSugar) {
        this.totalSugar = totalSugar;
    }
}

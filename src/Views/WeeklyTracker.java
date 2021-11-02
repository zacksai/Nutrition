package Views;

import java.util.ArrayList;

/**
 * WeeklyTracker class manages a list/binary tree (tbd) of DailyTrackers
 * It automatically updates weekly averages
 */
public class WeeklyTracker {


    public static void main(String[] args) {

        DailyTracker monday = new DailyTracker();
        DailyTracker tuesday = new DailyTracker();

        monday.addItem( new FoodItem("chicken", 20, 40, 5, 0, 0, 5));
        monday.addItem( new FoodItem("chicken", 20, 40, 5, 0, 0, 3));
        monday.addItem( new FoodItem("chicken", 20, 40, 5, 0, 0, 7));

        tuesday.addItem(new FoodItem("egg", 100, 20, 5, 30, 2, 3));
        tuesday.addItem(new FoodItem("egg", 100, 20, 5, 30, 2, 2));
        tuesday.addItem(new FoodItem("egg", 100, 20, 5, 30, 2, 1));

        System.out.println(monday.getTotalCalories() + ", " + tuesday.getTotalCalories());

        WeeklyTracker thisWeek = new WeeklyTracker();
        thisWeek.addDailyTotals(monday);
        thisWeek.addDailyTotals(tuesday);
        System.out.println(thisWeek.avgCalories);
    }


    // Properties
    private ArrayList<DailyTracker> daysList;
    private int avgCalories, avgProtein, avgCarbs, avgFat, avgSugar;

    /**
     * default constructor initializes averages to 0 and creates an empty arraylist
     */
    public WeeklyTracker() {
        this.daysList = new ArrayList<>();
        this.avgCalories = 0;
        this.avgProtein = 0;
        this.avgCarbs = 0;
        this.avgFat = 0;
        this.avgSugar = 0;
    }

    /**
     * custom addDailyTotals method adds a new day to the weekly totals then updates avgs
     * @param newDay day to be added
     */
    private void addDailyTotals(DailyTracker newDay){

        this.daysList.add(newDay);
        updateWeeklyTotals();
    }

    private void updateWeeklyTotals(){

        int calorieSum = 0;
        int proteinSum = 0;
        int carbsSum = 0;
        int fatSum = 0;
        int sugarSum = 0;

        for(DailyTracker day : daysList){
            calorieSum += day.getTotalCalories();
            proteinSum += day.getTotalProtein();
            carbsSum += day.getTotalCarbs();
            fatSum += day.getTotalFat();
            sugarSum += day.getTotalSugar();
        }
        int s = daysList.size();
        this.avgCalories = calorieSum / s;
        this.avgProtein = proteinSum / s;
        this.avgCarbs = carbsSum / s;
        this.avgFat = fatSum / s;
        this.avgSugar = avgSugar / s;

    }


}

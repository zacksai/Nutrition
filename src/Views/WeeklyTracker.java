package Views;

import java.util.ArrayList;

/**
 * WeeklyTracker class manages a list/binary tree (tbd) of DailyTrackers
 * It automatically updates weekly averages
 */
public class WeeklyTracker {

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

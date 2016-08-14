package ua.goit.practice.firstpractice.FoodForGnomes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FoodForGnomes implements Comparable {
    private static int[] gnomesHeight = {51, 82, 29, 91, 43, 74, 34};
    private static int[] foodWeight = {9, 2, 5, 3, 7, 4, 6};

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    int weight;
    int height;

    public FoodForGnomes(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public static int[] calculate(int[] gnomesHeight, int[] foodWeight) {
        ArrayList<FoodForGnomes> listOfGnomes = new ArrayList<>();
        ArrayList<FoodForGnomes> listOfPortions = new ArrayList<>();

        for (int i = 0; i < gnomesHeight.length; i++) {
            listOfGnomes.add(new FoodForGnomes(gnomesHeight[i], i));
            listOfPortions.add(new FoodForGnomes(foodWeight[i], i));
        }
        Collections.sort(listOfGnomes);
        Collections.sort(listOfPortions);

        int[] arrayGnomes = new int[listOfGnomes.size()];

        for (int i = 0; i < listOfGnomes.size(); i++) {
            arrayGnomes[listOfGnomes.get(i).getWeight()] = listOfPortions.get(i).getWeight();
        }

        return arrayGnomes;
    }

    public static void main(String[] args) {
        int[] indexOfPortion = calculate(gnomesHeight, foodWeight);

        System.out.println("Number of portion for gnomes with height " +
                Arrays.toString(gnomesHeight) + " - " + Arrays.toString(indexOfPortion));
    }
}




package tddkatas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://osherove.com/tdd-kata-1
public class StringCalculator {
    public int Add(String numbers) {
        int sum = -1;
        if (numbers.isEmpty()) {
            return 0;
        }

        ArrayList<Integer> numberArray = toIntArray(numbers.split("[\\n,]"));


        if (numberArray.size() == 0) {
            return 0;
        }


        int itemsSum = 0;
        for (int i = 0; i < numberArray.size(); i++) {
            itemsSum += numberArray.get(i);
        }
        sum = itemsSum;


        return sum;
    }

    private ArrayList<Integer> toIntArray(String[] arr) {
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            numberArray.add(Integer.parseInt(arr[i]));
        }
        return numberArray;
    }
}

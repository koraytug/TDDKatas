package tddkatas;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionArray {

    public int sumOfHourGlass(List<ArrayList<Integer>> list, int row, int col) {
        int itemSum = 0;

        int u1 = list.get(row).get(col);
        int u2 = list.get(row).get(col + 1);
        int u3 = list.get(row).get(col + 2);

        int m = list.get(row + 1).get(col + 1);

        int b1 = list.get(row + 2).get(col);
        int b2 = list.get(row + 2).get(col + 1);
        int b3 = list.get(row + 2).get(col + 2);

        itemSum = u1 + u2 + u3 + m + b1 + b2 + b3;

        return itemSum;
    }

    public int sumOfAllHourGlasses(List<ArrayList<Integer>> hourGlasses) {
        ArrayList<Integer> sumList = new  ArrayList<Integer>();
        for (int i = 0; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                int sum = sumOfHourGlass(hourGlasses,i,j);
                sumList.add(sum);
            }
        }

        int maxItem = sumList.get(0);
        for (int k = 0 ; k< sumList.size(); k++){
            if(sumList.get(k)>maxItem){
                maxItem= sumList.get(k);
            }
        }

        return maxItem;
    }
}

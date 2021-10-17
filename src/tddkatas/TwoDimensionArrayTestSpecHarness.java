package tddkatas;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionArrayTestSpecHarness {

    public List<ArrayList<Integer>> createSampleArray(){
        List<ArrayList<Integer>> hourGlasses = new ArrayList<>();
        ArrayList<Integer> rowOfHourGlass = new ArrayList<Integer>();
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        hourGlasses.add(new ArrayList<Integer>(rowOfHourGlass));


        rowOfHourGlass = new ArrayList<Integer>();
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        hourGlasses.add(new ArrayList<Integer>(rowOfHourGlass));

        //rowOfHourGlass = new ArrayList<int>(Arrays.asList(0, 1, 0, 0, 0, 0));


        //rowOfHourGlass = new ArrayList<int>(Arrays.asList(1, 1, 1, 0, 0, 0));
        rowOfHourGlass = new ArrayList<Integer>();
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        hourGlasses.add(new ArrayList<Integer>(rowOfHourGlass));

        //rowOfHourGlass = new ArrayList<int>(Arrays.asList(0, 0, 2, 4, 4, 0));
        rowOfHourGlass = new ArrayList<Integer>();
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(2);
        rowOfHourGlass.add(4);
        rowOfHourGlass.add(4);
        rowOfHourGlass.add(0);
        hourGlasses.add(new ArrayList<Integer>(rowOfHourGlass));

        //rowOfHourGlass = new ArrayList<int>(Arrays.asList(0, 0, 0, 2, 0, 0));
        rowOfHourGlass = new ArrayList<Integer>();
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(2);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        hourGlasses.add(new ArrayList<Integer>(rowOfHourGlass));

        //rowOfHourGlass = new ArrayList<int>(Arrays.asList(0, 0, 1, 2, 4, 0));
        rowOfHourGlass = new ArrayList<Integer>();
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(0);
        rowOfHourGlass.add(1);
        rowOfHourGlass.add(2);
        rowOfHourGlass.add(4);
        rowOfHourGlass.add(0);
        hourGlasses.add(new ArrayList<Integer>(rowOfHourGlass));
        return hourGlasses;
    }
}

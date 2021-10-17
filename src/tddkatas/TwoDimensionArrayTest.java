package tddkatas;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/2d-array/
public class TwoDimensionArrayTest {
    private static List<ArrayList<Integer>> hourGlasses ;
    TwoDimensionArray twoDimensionArray= new TwoDimensionArray();

    @BeforeAll
    @Description("Prepare Matrix for test")
     static void setup() {
        TwoDimensionArrayTestSpecHarness specHarness = new TwoDimensionArrayTestSpecHarness();
        hourGlasses = specHarness.createSampleArray();

    }

    @Test
    @DisplayName("Second Hour Glass Sum  row:0 col:0")
    public void sum_of_first_hour_glass(){
        int result = twoDimensionArray.sumOfHourGlass(hourGlasses,0,0);

        Assertions.assertEquals(7,result);
    }

    @Test
    @DisplayName("Second Hour Glass Sum  row:0 col:1")
    public void sum_of_second_hour_glass(){
        int result = twoDimensionArray.sumOfHourGlass(hourGlasses,0,1);

        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Sum of all hour glasses")
    public void sum_of_second_all_hour_glasses(){
        int result = twoDimensionArray.sumOfAllHourGlasses(hourGlasses);

        Assertions.assertEquals(19,result);
    }
}

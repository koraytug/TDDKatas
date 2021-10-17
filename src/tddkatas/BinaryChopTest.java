package tddkatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// http://codekata.com/kata/kata02-karate-chop/
public class BinaryChopTest {
    BinaryChop binaryChop = new BinaryChop();

    @Test
    @DisplayName( "returns -1 on empty array")
    public void returns_negative_on_empty_array(){
        int result = binaryChop.chop(3,new ArrayList<>());

        Assertions.assertEquals(-1 ,result);
    }

    @Test
    @DisplayName( "returns index of item in the array")
    public void returns_index_of_item_in_array(){
        ArrayList<Integer> source = new ArrayList<Integer>();
        source.add(1);
        source.add(3);
        source.add(5);
        int result = binaryChop.chop(1,source);

        Assertions.assertEquals(0 ,result);
    }

    @Test
    @DisplayName( "returns -1 if item not exists in the array")
    public void returns_negative_index_of_item_in_array_(){
        ArrayList<Integer> source = new ArrayList<Integer>();
        source.add(1);
        source.add(3);
        source.add(5);
        int result = binaryChop.chop(0,source);

        Assertions.assertEquals(-1 ,result);
    }
}

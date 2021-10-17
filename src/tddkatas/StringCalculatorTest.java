package tddkatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    @DisplayName("Add returns 0 if input string is empty")
    public void returns_zero_if_string_empty(){
       int result = stringCalculator.Add("");

        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("Add returns 0 if input string is only coma")
    public void returns_zero_if_string_only_coma(){
        int result = stringCalculator.Add(",");

        Assertions.assertEquals(result,0);
    }

    @Test
    @DisplayName("Add returns sum if input string has coma and numbers")
    public void returns_sum_if_string_has_coma_and_numbers(){
        int result = stringCalculator.Add("3,5");

        Assertions.assertEquals(8,result);
    }

    @Test
    @DisplayName("Add supports items with new line operator")
    public void support_newline_for_separate_numbers(){
        int result = stringCalculator.Add("3\n5");

        Assertions.assertEquals(8,result);
    }
}

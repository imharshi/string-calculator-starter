package calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould 
{
	StringCalculator stringCalculator = new StringCalculator();
    @Test
    void empty_string_should_return_0(){
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
	void string_with_two_number_should_return_number_as_int(){
    	
		assertEquals(3, stringCalculator.add("1,2"));
	}
    @Test
    void any_amount_Of_Numbers_Return_Values_are_their_Sums() {
        assertEquals(3+6+15+18+46+33, stringCalculator.add("3,6,15,18,46,33"));
    }
    @Test
    void new_line_between_numbers_returnValues_are_their_Sums() {
        assertEquals(6, stringCalculator.add("1\\n2,3"));
    }
}

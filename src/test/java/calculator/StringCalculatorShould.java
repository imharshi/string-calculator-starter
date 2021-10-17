package calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould 
{
	StringCalculator stringCalculator = new StringCalculator();
	//1
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
    
    //2
    @Test
    void any_amount_Of_Numbers_Return_Values_are_their_Sums() {
        assertEquals(3+6+15+18+46+33, stringCalculator.add("3,6,15,18,46,33"));
    }
    
    //3
    @Test
    void new_line_between_numbers_returnValues_are_their_Sums() {
        assertEquals(6, stringCalculator.newLines("1\n2,3"));
    }
    
    //4
    @Test
    void when_Delimiter_Is_Specified_SeparateNumbers() {
        assertEquals(3, stringCalculator.delimiter("//;\n1;2"));
    }
}

package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

    public int add(String input) {
        int returnValue = 0;
        String[] numbersArray = input.split(",");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) { 
                returnValue += Integer.parseInt(number);
            }
        }
        if(numbersArray.length==0) {
        	returnValue = 0;
        }
        if(numbersArray.length==1) {
        	returnValue = Integer.parseInt(input);
        }
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } 
        else {
            for (String number : numbersArray) {
                if (!number.isEmpty()) {
                    Integer.parseInt(number);
                }
            }
            return returnValue;
        }
    } 
    
    public int newLines(String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n"); 
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }

	public int delimiter(String string) {
		String delim = ";|n";
	    String numbersWithoutDelimiter = string;
	    if (string.startsWith("//")) {
	        int delimiterIndex = string.indexOf("//") + 2;
	        delim = string.substring(delimiterIndex, delimiterIndex + 1);
	        numbersWithoutDelimiter = string.substring(string.indexOf("n") + 1);
	    }
	    return delimiter(numbersWithoutDelimiter, delim);
	}

	private int delimiter(String string, String delim) {
		int returnValue = 0;
	    String[] numbersArray = string.split(delim);
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	        }
	    }
	    return returnValue;
	}

	public int negativeNumber(String numbers) {
		String delimiter="";
		int returnValue = 0;
	    String[] numbersArray = numbers.split(delimiter);
	    List negativeNumbers = new ArrayList();
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            int numberInt = Integer.parseInt(number.trim());
	            if (numberInt < 0) {
	                negativeNumbers.add(numberInt);
	            }
	            returnValue += numberInt;
	        }
	    }
	    if (negativeNumbers.size() > 0) {
	        throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
	    }
	    return returnValue;   
	}

	public int numberBigger(String numbers, String delimiter) {
		int returnValue = 0;
        String[] numbersArray = numbers.split(delimiter);
        List negativeNumbers = new ArrayList();
        for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                        int numberInt = Integer.parseInt(number.trim());
                        if (numberInt < 0) {
                                negativeNumbers.add(numberInt);
                        } else if (numberInt <= 1000) {
                                returnValue += numberInt;
                        }
                }
        }
        if (negativeNumbers.size() > 0) {
                throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return returnValue;   
	}

	public int stringMultiply(String string,String number) {
		int returnValue=0;
		string="3";
		
		String[] numberArray = number.split(",");
		for(String num : numberArray) {
			if(!number.trim().isEmpty()) {    
				int numberGot= Integer.parseInt(number); 		//1
				returnValue += numberGot * Integer.parseInt(string);  //1*3 =3 
			}
		}
		return returnValue;
	}

	

	
        
    
}
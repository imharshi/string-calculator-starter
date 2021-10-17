package calculator;

class StringCalculator {

    public int add(String input) {
        int returnValue = 0;
        String[] numbersArray = input.split(",");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) { 
                returnValue += Integer.parseInt(number);
            }
        }
        return returnValue;
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
		String delim = ",|n";
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
    
}
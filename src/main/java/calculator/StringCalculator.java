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
    
}
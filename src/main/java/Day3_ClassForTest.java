public class Day3_ClassForTest {

//    Please post the link to a GitHub repo where you have implemented these test cases together.

    public static void main(String[] args) {

    }

    //   1. Write a test for a method that calculates the sum of two integers.
    public static int addition(int a, int b){     //selbst-method outside 'main method'
        return (a+b);
    }

    //   2. Write a test for a method that checks if a given number is even.
    public static boolean checkIfAGivenNumberIsEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //    3. Write a test for a method that calculates the product of two integers.
    public static int multiply(int a, int b){
        return a*b;
    }

    //    4. Write a test for a method that converts a given string to uppercase.
    //-------can directly use inclusive method:  inputString.toUpperCase!!!
    public static String convertsToUppercase(String inputString){
        char[] charArray = inputString.toCharArray(); //change String to Array of Char
        for(int i = 0; i < inputString.length(); i++){
            if(Character.isLowerCase(charArray[i])){       //   --- Character.isUpperCase()
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
    return new String(charArray);
    }

    //    5. Write a test for a method that checks if a given number is positive.
    public static boolean ifIsPositive(int number){
        if(number <= 0) {
            return false;
        }
        else{
            return true;
        }
    }



}
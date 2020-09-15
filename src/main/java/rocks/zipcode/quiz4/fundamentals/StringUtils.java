package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
         char getMiddleCharacter = string.charAt((string.length() / 2));
        return getMiddleCharacter;
    }

    public static String capitalizeMiddleCharacter(String str) {
        char middleChar = str.charAt((str.length() / 2));
        char middleCap = Character.toUpperCase(middleChar);
        //Place middleCap in the right index
            //str.indexOf(str.length()/2)
        String answer = "";
        for(int index = 0; index < str.length(); index++){
            if(index == str.length()/2){
                answer += middleCap;
            }
            else{
                answer += str.charAt(index);
            }
        }
        return answer;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char middleChar = str.charAt((str.length() / 2));
        char middleCap = Character.toLowerCase(middleChar);
        //Place middleCap in the right index
        //str.indexOf(str.length()/2)
        String answer = "";
        for(int index = 0; index < str.length(); index++){
            if(index == str.length()/2){
                answer += middleCap;
            }
            else{
                answer += str.charAt(index);
            }
        }
        return answer;
    }

    public static Boolean isIsogram(String str) {
        //isogram letter appears
        //loop through string
        //check index of letter against all other indexes
        //must
        //ABCDEFG
        Boolean isItAnIsogram = true;
        for(int index = 0; index < str.length(); index++){
            for(int index2 = index+1; index2 < str.length(); index2++){
                if(String.valueOf(str.charAt(index)).equals(String.valueOf(str.charAt(index2)))){
                    //String.valueOf(str.charAt(index))
                    isItAnIsogram = false;

                }
            }
        }
        return isItAnIsogram;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        Boolean consecutive = false;
        for(int index = 0; index < str.length()-1; index++){
            //((index+1)< str.length)
            if(str.charAt(index) == str.charAt(index+1)){
                consecutive = true;
            }
        }
        return consecutive;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        //Note: Return type is a String
        //Find the consecutive characters✅
        //Remove them
        //Return the String without duplicates
        for(int index = 0; index < str.length()-1; index++){
            //((index+1)< str.length)
            if(str.charAt(index) == str.charAt(index+1)){
                String oldChar = String.valueOf(str.charAt(index+1));
                str = str.replace(oldChar, "" );
            }
        }
        return str;
    }

    public static String invertCasing(String str) {
//      char[] chars = str.toCharArray()
        String x = "";
        for(int index = 0; index <str.length(); index++){
            char characterAtIndex = str.charAt(index);
            //if statement - check casing of element at the index
            //then statement - if uppercase convert to lowercase
            //change char to a string and make it lowercase
            //create another if statement doing the opposite of original if statement
            //
            if(Character.isUpperCase(characterAtIndex)){
                x += str.valueOf(Character.toLowerCase(characterAtIndex));
            }
            else {
                x += str.valueOf(Character.toUpperCase(characterAtIndex));
            }
        }
        return x;
    }

    public static void main(String[] args) {

    }

}
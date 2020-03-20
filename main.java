import java.util.HashMap;

/**
 * @author  Aaron Yam
 * @version 1.0
 */

public class main{
    public static void main(String[] args){ 
        
        boolean result = false;

        char[] inputString1 = args[0].toCharArray();
        char[] inputString2 = args[1].toCharArray();
        boolean sizeCheckResult = checkSize(inputString1, inputString2);
        boolean checkDuplicatesResult = checkDuplicates(inputString1);
        if((sizeCheckResult == true) && (checkDuplicatesResult == true)){
            result = map(inputString1, inputString2);
        }
        System.out.println(result);
        return;
    }

    /**
     * checks to see if characters can map
     * 
     * @param Char[] input1
     * @param Char[] input2
     * @return Boolean if a one to one relationship can be established, return true,
     * otherwise false
     */
    public static boolean map(char[] string1, char[] string2){
        HashMap<Character,Character> association = new HashMap<Character,Character>();
        int i = 0;
        for(char a : string1){
            association.put(a, string2[i]);
            i = i + 1;
        }
        return true;
    }
    
    /**
     * check to see if both input strings are the same length for the one to one
     * relationship
     * 
     * @param char[] input1
     * @param char[] input2
     * @return boolean if both input strings are the same length, return true
     * otherwise false
     */
    public static boolean checkSize(char[] string1, char[] string2){
        if(string1.length == string2.length){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * check to see if first input string has any duplicate characters, 
     * if it does, it will return false, otherwise true
     * 
     * @param char[] input1
     * @return boolean return true if all characters are unique, otherwise
     * false
     */
    public static boolean checkDuplicates(char[] string1){
        for(int i = 0; i < string1.length-1; i++){
            if(string1[i] == string1[i+1]){
                return false;
            }
        }
        return true;
    }


}
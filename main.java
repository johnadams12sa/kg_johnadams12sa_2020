import java.util.HashSet;

/**
 * @author  Aaron Yam
 * @version 1.0
 */

public class main{
    public static void main(String[] args){
        
        Char[] inputString1 = args[0].toCharArray();
        Char[] inputString2 = args[0].toCharArray();
        checkSize(inputString1, inputString2);
        checkDuplicates(inputString1);
        boolean result = map(inputString1, inputString2);
        System.out.println(result);
    }

    /**
     * checks to see if characters can map
     * 
     * @param Char[] input1
     * @param Char[] input2
     * @return Boolean if a one to one relationship can be established, return true,
     * otherwise false
     */
    public boolean map(Char[] string1, Char[] string2){

    }
    
    /**
     * check to see if both input strings are the same length for the one to one
     * relationship
     * 
     * @param Char[] input1
     * @param Char[] input2
     * @return boolean if both input strings are the same length, return true
     * otherwise false
     */
    public boolean checkSize(Char[] string1, Char[] string2){
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
     * @param Char[] input1
     * @return boolean return true if all characters are unique, otherwise
     * false
     */
    public boolean checkDuplicates(Char[] string1){
        
    }


}
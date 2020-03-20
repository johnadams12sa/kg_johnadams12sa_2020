import java.util.HashMap;

/**
 * @author  Aaron Yam
 * @version 1.0
 */

public class main{
    public static void main(String[] args){

        boolean result = false;
        
        Char[] inputString1 = args[0].toCharArray();
        Char[] inputString2 = args[0].toCharArray();
        boolean sizeCheckResult = checkSize(inputString1, inputString2);
        boolean checkDuplicatesResult = checkDuplicates(inputString1);
        if(sizeCheckResult && checkDuplicatesResult){
            result = map(inputString1, inputString2);
        }
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
        HashMap association = new HashMap(string1.length);
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
        for(char a : string1){
            for (char b : string1){
                if(a == b){
                    return false;
                }
            }
        }
        return true;
    }


}
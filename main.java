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

        boolean result = map(inputString1, inputString2);
        System.out.println(result);
        //System.out.println("TEST");
    }

    /**
     * checks to see if characters can map
     * @param string input1
     * @param string input2
     * @return Boolean if a one to one relationship can be established
     */

    public boolean map(Char[] string1, Char[] string2){

    }
    
    /**
     * check to see if both input strings are the same length for the one to one
     * relationship
     * 
     * @param string1 input1
     * @param string2 input2
     * @return boolean if both input strings are the same length or not
     */
    public boolean checkSize(Char[] string1, Char[] string2){
        if(string1.length == string2.length){
            return true;
        }
        else {
            return false;
        }
    }


}
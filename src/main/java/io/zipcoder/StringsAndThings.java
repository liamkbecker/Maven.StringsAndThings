package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int returnInt = 0;
        for(int i = 1; i < input.length(); i++){
            if(!Character.isLetter(input.charAt(i)) && input.charAt(i-1) == 'y' || input.charAt(i-1) == 'z'){
                returnInt = returnInt + 1;
            }
        }
        if(input.charAt(input.length()-1) == 'y' || input.charAt(input.length()-1) == 'z'){
            returnInt = returnInt +1;
        }
        return returnInt;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String returnString = "";

        for(int i = 0; i < base.length() - remove.length(); i++){
            if(base.substring(i, i+remove.length()).equals(remove)){
                
            }
        }

        return returnString;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isCounter = 0;
        int notCounter = 0;

        for(int i = 0; i < input.length() - 1; i++){
            if(input.substring(i, i+2).equals("is")){
                isCounter++;
            }
        }

        for(int i = 0; i < input.length() - 2; i++){
            if(input.substring(i, i+3).equals("not")){
                notCounter++;
            }
        }

        if(isCounter == notCounter){
            return true;
        }
        return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean returnBoolean = false;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'g'){
                if(input.charAt(i-1) == 'g' || input.charAt(i+1) == 'g'){
                    returnBoolean = true;
                } else {
                    returnBoolean = false;
                }
            }
        }
        return returnBoolean;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int returnInt = 0;
        char checker;
        for(int i = 1; i < input.length(); i++){
            checker = input.charAt(i);
            if(input.charAt(i-1) == checker && input.charAt(i+1) == checker){
                returnInt++;
            }
        }
        return returnInt;
    }
}

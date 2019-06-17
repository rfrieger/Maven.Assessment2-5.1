package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) { String reverseString ="";
        for (int i = string1.length() -1; i >= 0 ; i--) {
            reverseString +=  string1.charAt(i);
        }
        return reverseString;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        string1 = reverse(string1);
        string2 = reverse(string2);
        return concatentate(string1,string2);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        String[] stringArr = string.split("");
        String[] charToRemoveString = charactersToRemove.split("");
        String returnString = "";
        for (int i = 0; i <stringArr.length  ; i++) {
            boolean add= true;
            for (int j = 0; j <charToRemoveString.length ; j++) {
                if(stringArr[i].equals(charToRemoveString[j])){
                add = false;}
            }
           if (add) {
               returnString+= stringArr[i];
           }
           add = true;
        }

        return returnString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return reverse(removeCharacters(string, charactersToRemove));
    }
}

package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amountOfPadding; i++) {
            sb.append(' ');
        }

        return sb.substring(stringToBePadded.length()) + stringToBePadded;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amountOfPadding; i++) {
            sb.append(' ');
        }

        return stringToBePadded + sb.substring(stringToBePadded.length());
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat+1; i++) {
            sb.append(stringToBeRepeated);
        }

        return  sb.substring(stringToBeRepeated.length());
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String[] strings = string.split(" ");

        char c=' ';
        boolean isCorrect=false, allLetters=isCorrect;
        int failCount=0;
        for (int j = 0; j <strings.length ; j++) {
            for (int i = 0; i < strings[j].length(); i++) {
                c = strings[j].charAt(i);
                if (!Character.isLetter(c))
                    failCount += 1;
            }
        }
        if(failCount == 0) {
            return true;
        } else
            return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String[] strings = string.split("");
        char c=' ';
        boolean isCorrect=false, allLetters=isCorrect;
        int failCount=0;
        for (int j = 0; j <strings.length ; j++) {
            for (int i = 0; i < strings[j].length(); i++) {
                c = strings[j].charAt(i);
                if (!Character.isDigit(c))
                    failCount += 1;
            }
        }
        if(failCount == 0) {
            return true;
        } else
            return false;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String[] strings = string.split("");
        char c=' ';
        boolean isCorrect=false, allLetters=isCorrect;
        int failCount=0;
        for (int j = 0; j <strings.length ; j++) {
            for (int i = 0; i < strings[j].length(); i++) {
                c = strings[j].charAt(i);
                if (Character.isDigit(c) || Character.isAlphabetic(c))
                    failCount += 1;
            }
        }
        if(failCount == 0) {
            return true;
        } else
            return false;
    }

}

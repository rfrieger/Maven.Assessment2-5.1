package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if(startingIndex> endingIndex) {
            throw new IllegalArgumentException();
        }

        ArrayList<String> arr = new ArrayList();
        for (int i = startingIndex; i < endingIndex ; i++) {
            arr.add(arrayToBeSpliced[i]);
        }



        String[] resultArr = new String[arr.size()];
        resultArr = arr.toArray(resultArr);
        return resultArr;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) throws IllegalArgumentException {
        ArrayList<String> arr = new ArrayList();
        for (int i = startingIndex; i < arrayToBeSpliced.length ; i++) {
            arr.add(arrayToBeSpliced[i]);
        }


        String[] resultArr = new String[arr.size()];
        resultArr = arr.toArray(resultArr);
        return resultArr;
    }
}



//4 6
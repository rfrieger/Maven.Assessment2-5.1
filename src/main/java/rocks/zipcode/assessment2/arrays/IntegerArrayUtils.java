package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < integerArray.length ; i++) {
            arr.add(integerArray[i]);
        }

        arr.add(valueToBeAdded);

        Integer[] resultArr = new Integer[arr.size()];
        resultArr = arr.toArray(resultArr);
        return resultArr;

    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        for (int i = 0; i < integerArray.length ; i++) {
            if(i == indexToInsertAt){
                integerArray[i] = valueToBeInserted;
            }
        }

    return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
       return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for (int i = 0; i < integerArray.length ; i++) {
            if (integerArray[i] % 2 == 0) {
                integerArray[i]++;
            } else if (integerArray[i] % 2 == 1) {
                integerArray[i]--;

            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        for (int i = 0; i < integerArray.length ; i++) {
            if (integerArray[i] % 2 == 0) {
                integerArray[i]++;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (int i = 0; i < input.length; i++) {

            if (input[i] % 2 == 1) {
                input[i]--;
            }
        }
        return input;
    }
}

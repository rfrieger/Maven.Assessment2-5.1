package rocks.zipcode.assessment2.collections;

import java.util.HashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    HashMap<Integer , String > map = new HashMap<Integer, String>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        map.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        return map.get(monthNumber);

        //throw new NullPointerException();
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        int index = 0;
        if(isValidMonth(monthName)) {
            for (Integer i : map.keySet()) {
                if (map.get(i).equals(monthName)) {
                    index = i;
                }
            }
            return index;
        }else return (Integer)null;
        //return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        Boolean isValid = false;
        for (Integer i : map.keySet()) {
            if (i.equals(monthNumber)){
                isValid = true;
            }
        }
        return isValid;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        Boolean isValid = false;
        for (Integer i : map.keySet()) {
            if (map.get(i).equals(monthName)){
                isValid = true;
            }
        }
        return isValid;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
       return map.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        map.replace(monthNumber,monthName);

    }
}

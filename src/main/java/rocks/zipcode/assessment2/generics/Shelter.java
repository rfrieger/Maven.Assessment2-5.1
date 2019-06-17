package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> extends Ageable {
    ArrayList<T> shelter = new ArrayList<>();
    private T elmenet;
    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int  size() {
        return shelter.size();
    }

    public void add(Object object) {
        shelter.add(elmenet);
    }

    public Boolean contains(Object object) {
        if (shelter.contains(object)) {
            return true;
        }else return false;
    }

    public void remove(Object object) {
        shelter.remove(object);
    }

    public Object get(Integer index) {
       return shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}
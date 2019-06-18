package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> {
    private T elmenet;
    List<T> list;

    public Shelter() {
        list = new ArrayList<>();
    }


    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(Object object) {
        list.add((T) object);
    }

    public Boolean contains(Object object) {
        if (list.contains((T) object)) {
            return true;
        } else return false;
    }

    public void remove(Object object) {
        list.remove((T) object);
    }

    public Object get(Integer index) {
        return list.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return list.indexOf(ageable);

    }
}
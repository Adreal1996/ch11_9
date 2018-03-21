package ch11;

/*
Write a method hasEven that accepts a set of integers as a parameter and returns true if the set contains at least
one even integer and false otherwise. If passed the empty set, your method should return false
 */

import java.util.Set;
import java.util.TreeSet;

public class opg9
{
    public static void main(String[] args)
    {

        Set<Integer> list = new TreeSet<>();

        list.add(3);
        list.add(1);
        list.add(9);
        System.out.println(hasEven(list));


    }

    private static boolean hasEven(Set<Integer> list)
    {
        for (Integer Int : list)
        {
            if (Int % 2 == 0)
            {
                return true;
            }
        }
        return false;
    }
}

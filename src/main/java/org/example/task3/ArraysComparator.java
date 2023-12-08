package org.example.task3;

import java.util.Arrays;
import org.example.exceptionsForHW.ArraysSizeException;
import org.example.exceptionsForHW.ArraysTypeException;
public class ArraysComparator {
    public <E, T> boolean compareArrays(E[] array1, T[] array2) throws ArraysSizeException, ArraysTypeException {
        if (array1.length != array2.length) throw new ArraysSizeException();
        if (array1.getClass() != array2.getClass()) throw new ArraysTypeException();
        return Arrays.equals(array1, array2);
    }
}

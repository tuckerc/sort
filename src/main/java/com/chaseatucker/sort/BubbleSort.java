package com.chaseatucker.sort;

import java.util.List;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(List<T> list) throws NullPointerException {
        if (list == null) {
            throw new NullPointerException("list cannot be null!");
        }
        for (T item : list) {
            if (item == null) {
                throw new NullPointerException("list must not contain null values");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    swap(list, i, j);
                }
            }
        }
    }

    private static <T> void swap(List<T> list, int a, int b) {
        T temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}

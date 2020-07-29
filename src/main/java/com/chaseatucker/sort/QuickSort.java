package com.chaseatucker.sort;

import java.util.List;

public class QuickSort {
  public static <T extends Comparable<T>> void sort(List<T> list) {
    sort(list, 0, list.size() - 1);
  }

  private static <T extends Comparable<T>> void sort(List<T> list, int low, int high) {
    if (low < high) {
      int pi = partition(list, low, high);
      sort(list, low, pi - 1);
      sort(list, pi + 1, high);
    }
  }

  private static <T extends Comparable<T>> int partition(List<T> list, int low, int high) {
    T pivot = list.get(high);
    int swapIdx = low - 1;
    for (int i = low; i < high; i++) {
      if (list.get(i).compareTo(pivot) < 0) {
        swapIdx++;
        swap(list, swapIdx, i);
      }
    }
    swap(list, high, swapIdx + 1);
    return swapIdx + 1;
  }

  private static <T extends Comparable<T>> void swap(List<T> list, int a, int b) {
    T temp = list.get(a);
    list.set(a, list.get(b));
    list.set(b, temp);
  }
}

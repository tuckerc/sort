package com.chaseatucker.sort;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class MergeSort {
  public static <T extends Comparable<T>> void sort(List<T> list) {
    sort(list, 0, list.size() - 1);
  }

  private static <T extends Comparable<T>> void sort(List<T> list, int start, int end) {
    int middle = (end - start) / 2 + start;
    if (start < end) {
      sort(list, start, middle);
      sort(list, middle + 1, end);
      merge(list, start, middle, end);
    }
  }

  private static <T extends Comparable<T>> void merge(
      List<T> list, int start, int middle, int end) {
    List<T> tempList = newArrayList();
    int leftIdx = start;
    int rightIdx = middle + 1;
    for(int i = start; i <= end; i++) {
      if(leftIdx <= middle && rightIdx <= end) {
        int comparisonResult = list.get(leftIdx).compareTo(list.get(rightIdx));
        if (comparisonResult <= 0) {
          tempList.add(list.get(leftIdx));
          leftIdx++;
        } else {
          tempList.add(list.get(rightIdx));
          rightIdx++;
        }
      } else if(leftIdx <= middle) {
        tempList.add(list.get(leftIdx));
        leftIdx++;
      } else if(rightIdx <= end) {
        tempList.add(list.get(rightIdx));
        rightIdx++;
      }
    }
    overwriteList(list, tempList, start, end);
  }

  private static <T extends Comparable<T>> void overwriteList(List<T> list, List<T> tempList, int start, int end) {
    int tempListIdx = 0;
    for(int i = start; i <= end; i++) {
      list.set(i, tempList.get(tempListIdx));
      tempListIdx++;
    }
  }
}

package com.chaseatucker.sort;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuickSortTest {

  List<Integer> numbers;
  List<Integer> numbersTrustedSort;

  @Test
  public void sortSmallHappyTest() {
    int size = 10;
    numbers = newArrayList(size);
    for (int i = 0; i < size; i++) {
      numbers.add((int) Math.floor(Math.random() * size));
    }
    numbersTrustedSort = newArrayList(numbers);
    Collections.sort(numbersTrustedSort);
    QuickSort.sort(numbers);
    assertEquals(numbersTrustedSort, numbers);
  }

  @Test
  public void sortMediumHappyTest() {
    int size = 1000;
    numbers = newArrayList(size);
    for (int i = 0; i < size; i++) {
      numbers.add((int) Math.floor(Math.random() * size));
    }
    numbersTrustedSort = newArrayList(numbers);
    Collections.sort(numbersTrustedSort);
    QuickSort.sort(numbers);
    assertEquals(numbersTrustedSort, numbers);
  }

  @Test
  public void sortLargeHappyTest() {
    int size = 100000;
    numbers = newArrayList(size);
    for (int i = 0; i < size; i++) {
      numbers.add((int) Math.floor(Math.random() * size));
    }
    numbersTrustedSort = newArrayList(numbers);
    Collections.sort(numbersTrustedSort);
    QuickSort.sort(numbers);
    assertEquals(numbersTrustedSort, numbers);
  }

  @Test
  public void sortXLHappyTest() {
    int size = 1000000;
    numbers = newArrayList(size);
    for (int i = 0; i < size; i++) {
      numbers.add((int) Math.floor(Math.random() * size));
    }
    numbersTrustedSort = newArrayList(numbers);
    Collections.sort(numbersTrustedSort);
    QuickSort.sort(numbers);
    assertEquals(numbersTrustedSort, numbers);
  }

  @Test
  public void sortFailTest() {
    int size = 10;
    numbers = newArrayList(size);
    for (int i = 0; i < size; i++) {
      numbers.add((int) Math.floor(Math.random() * size));
    }
    numbersTrustedSort = newArrayList(numbers);
    QuickSort.sort(numbers);
    assertNotEquals(numbersTrustedSort, numbers);
  }
}

package com.chaseatucker.sort;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

  List<Integer> listForTesting;
  List<Integer> listSortedFromCollections;

  @Test
  public void sortTestSize10() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 10; i++) {
      int randomInt = (int) Math.floor(Math.random() * 9);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize20() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 20; i++) {
      int randomInt = (int) Math.floor(Math.random() * 19);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize40() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 40; i++) {
      int randomInt = (int) Math.floor(Math.random() * 39);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize80() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 80; i++) {
      int randomInt = (int) Math.floor(Math.random() * 79);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize160() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 160; i++) {
      int randomInt = (int) Math.floor(Math.random() * 159);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize320() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 320; i++) {
      int randomInt = (int) Math.floor(Math.random() * 319);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize640() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 640; i++) {
      int randomInt = (int) Math.floor(Math.random() * 639);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize1280() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 1280; i++) {
      int randomInt = (int) Math.floor(Math.random() * 1279);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize2560() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 2560; i++) {
      int randomInt = (int) Math.floor(Math.random() * 2559);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize5120() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 5120; i++) {
      int randomInt = (int) Math.floor(Math.random() * 5119);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize10240() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 10240; i++) {
      int randomInt = (int) Math.floor(Math.random() * 10239);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize20480() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 20480; i++) {
      int randomInt = (int) Math.floor(Math.random() * 20479);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize40960() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 40960; i++) {
      int randomInt = (int) Math.floor(Math.random() * 40959);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize81920() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 81920; i++) {
      int randomInt = (int) Math.floor(Math.random() * 81919);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize163840() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 163840; i++) {
      int randomInt = (int) Math.floor(Math.random() * 163839);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize327680() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 327680; i++) {
      int randomInt = (int) Math.floor(Math.random() * 327679);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }

  @Test
  public void sortTestSize655360() {
    listForTesting = new ArrayList<>();

    // populate list with random integers
    for(int i = 0; i < 655360; i++) {
      int randomInt = (int) Math.floor(Math.random() * 655359);
      listForTesting.add(randomInt);
    }

    // sort test list
    BubbleSort.sort(listForTesting);

    // copy test list into trusted list
    listSortedFromCollections = newArrayList(ImmutableList.copyOf(listForTesting));
    // sort trusted list using trusted sort algorithm
    Collections.sort(listSortedFromCollections);

    assertEquals(listSortedFromCollections, listForTesting);
  }
}
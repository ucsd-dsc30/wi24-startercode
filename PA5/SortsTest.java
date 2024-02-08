import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class SortsTest {

    ArrayList<Integer> list;

    @BeforeEach
    public void createLists(){
        list = new ArrayList<>();
    }

    @Test
    public void testInsertionSort(){
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        Sorts.insertionSort(list, 0, 4);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(5, 4, 3, 2, 1));
        Sorts.insertionSort(list, 0, list.size() - 1);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(5, 4, 3, 2, 1));
        Sorts.insertionSort(list, 2, 4);
        assertArrayEquals(new Integer[]{5, 4, 1, 2, 3}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 10, 2, 9, 3, 8, 4, 7, 5, 6));
        Sorts.insertionSort(list, 0, list.size() - 1);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 10, 2, 9, 3, 8, 4, 7, 5, 6));
        Sorts.insertionSort(list, 3, 7);
        assertArrayEquals(new Integer[]{1, 10, 2, 3, 4, 7, 8, 9, 5, 6}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 2, 3, 5, 4));
        Sorts.insertionSort(list, 3, 4);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int val = (int) (Math.random() * 100);
            list.add(val);
            expected.add(val);
        }
        Sorts.insertionSort(list, 0, list.size() - 1);
        Collections.sort(expected);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void testQuickSort() {
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        Sorts.quickSort(list, 0, 4);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(5, 4, 3, 2, 1));
        Sorts.quickSort(list, 0, list.size() - 1);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(5, 4, 3, 2, 1));
        Sorts.quickSort(list, 2, 4);
        assertArrayEquals(new Integer[]{5, 4, 1, 2, 3}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 10, 2, 9, 3, 8, 4, 7, 5, 6));
        Sorts.quickSort(list, 0, list.size() - 1);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 10, 2, 9, 3, 8, 4, 7, 5, 6));
        Sorts.quickSort(list, 3, 7);
        assertArrayEquals(new Integer[]{1, 10, 2, 3, 4, 7, 8, 9, 5, 6}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 2, 3, 5, 4));
        Sorts.quickSort(list, 3, 4);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int val = (int) (Math.random() * 100);
            list.add(val);
            expected.add(val);
        }
        Sorts.quickSort(list, 0, list.size() - 1);
        Collections.sort(expected);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void testBucketSort(){
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list = Sorts.bucketSort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(5, 4, 3, 2, 1));
        list = Sorts.bucketSort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 10, 2, 9, 3, 8, 4, 7, 5, 6));
        list = Sorts.bucketSort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list.toArray());

        list.clear();
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int val = (int) (Math.random() * 100);
            list.add(val);
            expected.add(val);
        }
        list = Sorts.bucketSort(list);
        Collections.sort(expected);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void testCountSort(){
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list = Sorts.countSort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(5, 4, 3, 2, 1));
        list = Sorts.countSort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());

        list.clear();
        list.addAll(Arrays.asList(1, 10, 2, 9, 3, 8, 4, 7, 5, 6));
        list = Sorts.countSort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list.toArray());

        list.clear();
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int val = (int) (Math.random() * 100);
            list.add(val);
            expected.add(val);
        }
        list = Sorts.countSort(list);
        Collections.sort(expected);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

}
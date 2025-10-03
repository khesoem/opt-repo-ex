package ch.ethz.ast;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    @DisplayName("Should sort array in ascending order")
    void testSort() {
        // Arrange
        Sort sort = new Sort();
        List<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 30000; i++) {
            arr.add(rand.nextInt());
        }

        // Act
        sort.sort(arr);

        // Assert - check that list is sorted in ascending order
        for (int i = 0; i < arr.size() - 1; i++) {
            assertTrue(arr.get(i) <= arr.get(i + 1),
                    "List is not sorted: arr[" + i + "] = " + arr.get(i) + " > arr[" + (i + 1) + "] = " + arr.get(i + 1));
        }
    }

}

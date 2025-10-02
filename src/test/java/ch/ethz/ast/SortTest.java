package ch.ethz.ast;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    @DisplayName("Should sort array in ascending order")
    void testSort() {
        // Arrange
        Sort sort = new Sort();
        int[] arr = new int[30000];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }

        // Act
        sort.sort(arr);

        // Assert - check that array is sorted in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1],
                    "Array is not sorted: arr[" + i + "] = " + arr[i] + " > arr[" + (i + 1) + "] = " + arr[i + 1]);
        }
    }

}

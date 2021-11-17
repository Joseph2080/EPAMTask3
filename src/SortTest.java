import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void isSorted() {
        int arr[] = {5,4,3,2,1};
        boolean isSorted = Main.isSorted(arr,Main.SortOrder.Descending);
        assertEquals(true,isSorted);
    }

    @Test
    void transform() {
        int arr[] = {5,4,3,2,1};
        int expected[] = {5,5,5,5,5};
        assertEquals(expected, Main.transform(arr,Main.SortOrder.Descending));
    }

    @Test
    void multArithmeticElements() {
        assertEquals(6160,Main.multArithmeticElements(5,3,4));
    }

    @Test
    void sumGeometricElements() {
        assertEquals(175,Main.sumGeometricElements(100,0.5,20));
    }
}
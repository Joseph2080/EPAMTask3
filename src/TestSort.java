import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSort {

    @Test
    public void testIsSorted(){
        int arr[] = {5,4,3,2,1};
        boolean isSorted = Main.isSorted(arr,Main.SortOrder.Descending);
        assertEquals(true,isSorted);
    }

    @Test
    public void testTransform(){
        int arr[] = {5,4,3,2,1};
        int expected[] = {5,5,5,5,5};
        assertEquals(expected, Main.transform(arr,Main.SortOrder.Descending));
    }

    @Test
    public void testMultiArithmetic(){
        assertEquals(6160,Main.multArithmeticElements(5,3,4));
    }

    @Test
    public void testGeoElements(){
        assertEquals(175,Main.sumGeometricElements(100,0.5,20));
    }
}
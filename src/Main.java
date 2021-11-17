public class Main {

    public enum SortOrder{
        Ascending,
        Descending
    }
    public static void main(String args[]){
        //Task 1
        int arr[] ={5,4,3,2,1};
        System.out.println("The array is  sorted:" + isSorted(arr,SortOrder.Descending));
        System.out.println();

        //Task 2
        for(int n:transform(arr,SortOrder.Descending)){
            System.out.print(n + " ");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3: " + multArithmeticElements(5,3,4));
        System.out.println();
        //Task 4
        System.out.println("Task 4: " + sumGeometricElements(100,0.5,20));
        System.out.println();
    }

    /*Task 1.
    Create function IsSorted, determining whether a given array of integer
    values of arbitrary length is sorted in a given order (the order is set up by
            enum value SortOrder). Array and sort order are passed by parameters.
    Function does not change the array.*/
    public static boolean isSorted(int arr[],SortOrder order){
        boolean temp = true;
        //Checks if order is ascending
        if(order == SortOrder.Ascending)
        {
            int head = arr[0];
            for(int i = 1;i < arr.length;i++){
                if(arr[i]<head){
                    temp = false;
                    break;
                }
                head = arr[i];
            }
            return temp;
        }else
            //Checks if order is descending
            if(order == SortOrder.Descending){
                int head = arr[0];
                for(int i = 1;i < arr.length;i++){
                    if(arr[i]>head){
                        temp = false;
                        break;
                    }
                    head = arr[i];
                }
                return temp;
            }
        if(arr.length<=1){
            temp = false;
        }
        return temp;
    }

/*
    Task 2.
    Create  function  Transform,  replacing  the  value  of  each  element  of  an
    integer array with the sum of this element value and its index, only if the
    given array is sorted in the given order (the order is set up by enum value
            SortOrder). Array and sort order are passed by parameters. To check, if
    the array is sorted, the function IsSorted from the Task 1 is called.
    Example,
    For {5, 17, 24, 88, 33, 2} and “ascending” sort order values in the array do
    not change;
    For  {15,  10,  3}  and  “ascending”  sort  order  values  in  the  array  do  not
            change;
    For {15, 10, 3} and “descending” sort order the values in the array are
    changing to {15, 11, 5}*/

    public static int[] transform(int arr[],SortOrder order){
        if(isSorted(arr,order)){
            for(int i =0;i < arr.length;i++){
                int temp = arr[i] + i;
                arr[i] = temp;
            }
        }
        return arr;
    }

    /*Task 3.
    Create  function  MultArithmeticElements,  which  determines  the
    multiplication  of  the  first  n  elements  of  arithmetic  progression  of  real
    numbers with a given initial element of progression a1 and progression step
    t. an is calculated by the formula (an+1 = an + t).
    Example,
    For a1 = 5, t = 3,  n = 4 multiplication equals to 5*8*11*14 = 6160*/
    public static double multArithmeticElements(double a1,double t, int n){
        double total = 1;
        for(int i =0;i <n;i++){
            total*=a1;
            a1 = a1 + t;
        }
        return total;
    }

    /*Task 4.
    Create function SumGeometricElements, determining the sum of the first
    elements of a decreasing geometric progression of real numbers with a
    given initial element of a progression a1 and a given progression step t,
            while the last element must be greater than a given alim. an is calculated
    by the formula (an+1 = an * t), 0<t<1 .*/
    public static double sumGeometricElements(double a1, double t, double alim){
        if(t>0&&t<1) {
            double total = 0;
            while (a1 > alim) {
                total += a1;
                a1 *= t;
            }
            return total;
        }
        return 0;
    }

}

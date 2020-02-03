package arrays;

public class ThreeDimensionsArray {

    public static void main(String[] args) {

        // test is a 3d array
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        int[][][] test2 = {{{1,2,3},{4,5,6}}, {{7,8,9},{10,11,12}} };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}

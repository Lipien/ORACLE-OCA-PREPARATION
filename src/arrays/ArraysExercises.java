package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] arry = new int[0];
        System.out.println(arry.length);
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
            System.out.println(myNumbers.length);
        }

        int[][] square = new int[2][];
        square[0] = new int[5];
        square[1] = new int[3];

        int[][] square1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            square1[i][i] = 5;
        }
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum1 += square1[i][j];
            }
        }
        System.out.println(sum1);

        Object obj1 = new Object();
        Object obj[] = {new Object(), new Object()};
        Object obj2[] = {new Object[1], new Object[2]};

        String[] toString = new String[]{"one", "two", "three"}; // also possible way od initialization
        System.out.println(Arrays.toString(toString));


        int[] numbers2 = new int[]{42, 55, 99};

        int[][][] threeDArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}, {{9, 10}, {11, 12}}};

        Integer[] integerArray1 = {new Integer(100), new Integer(1), new Integer(30), new Integer(50)};
        Integer[] integerArray2 = new Integer[2];
        integerArray2[0] = new Integer(100);
        System.arraycopy(integerArray1, 2, integerArray2, 1, 1);
        for (Integer i : integerArray2) {
            System.out.print(i + " ");
        }


        int a = 2;
        int b = 3;
        List<Integer> test = new ArrayList<>();
        test.add(a);

        Integer integer1 = 1300;
        Integer integer2 = 2000;
        ArrayList<Integer> basicArrayList = new ArrayList<>();
        basicArrayList.add(integer1);
        basicArrayList.add(integer2);
        System.out.println(basicArrayList.get(0)
                + " - " + basicArrayList.get(1)); //1300 – 2000
        System.out.println("Size: " + basicArrayList.size()); // 2

        Integer integer3 = 900;
        basicArrayList.add(1, integer3);
        System.out.println(basicArrayList.get(0)
                + " - " + basicArrayList.get(1)
                + " - " + basicArrayList.get(2));
        System.out.println("Size: " + basicArrayList.size()); // 1300 - 900 - 2000 /n Size: 3
        double sum = 0;
        double[] tempStArray = {1.2, 2.3, 3.2, 4.6, 9.1, 5.4, 8.7};
        for (int i = 0; i < tempStArray.length; i++) {
            sum += tempStArray[i];
        }
        System.out.println(sum);

        sum = 0;
        ArrayList<Double> dobleObj = DoubleStream.of(tempStArray)
                .boxed()
                .collect(Collectors
                        .toCollection(ArrayList::new));
        for (Double avg : dobleObj) {
            sum += avg;
        }
        System.out.println(sum);
    }
}

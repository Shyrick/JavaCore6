package modul6.Arrays;

public class ArrayMain {

    public static void main(String[] args) {

         int [] array = new int[] {1, 2, 3, 4,-5};

        ArraysUtils.sum(array);
        ArraysUtils.min(array);
        ArraysUtils.max(array);
        ArraysUtils.maxPositive(array);
        ArraysUtils.multiplication(array);
        ArraysUtils.reverse(array);
        ArraysUtils.findEvenElements(array);



    }


}

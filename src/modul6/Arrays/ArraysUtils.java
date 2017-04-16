package modul6.Arrays;

public final class ArraysUtils {

    private ArraysUtils() {
    }

    static int sum(int[] array) {

        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sum += array[i];
        }
        System.out.println("The sum of int array is " + sum);
        return sum;
    }

    static int min (int[] array){

        int minVar = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < minVar) {
                minVar = array[i];
            }
        }
        System.out.println("The minimum value of int array is " + minVar);
        return minVar;
    }

    static int max (int[] array){

       int maxVar = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxVar) {
                maxVar = array[i];
            }
        }
        System.out.println("The maximum value of int array is " + maxVar);
        return maxVar;
    }

    static int maxPositive (int[] array) {

        int maxPositive = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > 0) {
                if (array[i] > maxPositive) {
                    maxPositive = array[i];
                }
            }
        }
        System.out.println("The maximum positive value of int array is " + maxPositive);
        return maxPositive;
    }

    static int multiplication (int[] array) {

        int mp = 1;
        for (int i = 0; i < array.length; i++) {
            mp = mp * array[i];
        }
        System.out.println("The multiplication of int array is " + mp);
        return mp;
    }

    static int modulus (int[] array){

        int modulus = array[0] / array[array.length-1];

        System.out.println("The modulus of first and last element at int array is " + modulus);
        return modulus;
    }

    static int secondLargest (int[] array){

        int k = 0;
        int maxVar = array[0];
        int secondMaxVar;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxVar) {
                maxVar = array[i];
                k = i;
            }
        }
        if (k==0) {
            secondMaxVar = array[1];
        }     else  secondMaxVar = array[0];

        for( int i = 0; i <= array.length-1; i++){
            if (i == k) {
                continue;
            }
            if (array[i] > secondMaxVar) {
                secondMaxVar = array[i];
            }

        }
        System.out.println("The second maximum value at int array is  " + secondMaxVar);
        return secondMaxVar;
    }

    static int[] reverse(int[] array){

        int[] reversArray = new int[array.length];
        int j = array.length-1;
        for (int i = 0; i < array.length; i++) {
            reversArray[j] = array[i];
            j--;
        }
        System.out.println("reversArray:");
        for (int i = 0; i < reversArray.length ; i++) {
            System.out.println(reversArray[i]);
        }
        return reversArray;
    }

    static int[] findEvenElements(int[] array){

        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0){
                count ++;
            }
        }
        int[] EvenElementsArray = new int[count];
        int j = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0){
                EvenElementsArray [j] = array [i];
                j++;
            }
        }
        System.out.println("EventElementsArray:");
        for (int i = 0; i < EvenElementsArray.length ; i++) {
            System.out.println(EvenElementsArray[i]);
        }
        return EvenElementsArray;
    }





}

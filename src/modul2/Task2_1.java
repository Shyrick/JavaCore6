package modul2;


public class Task2_1 {

    public static void main(String[] args) {

        int[] array = {100, -54, 33, 21, 101, 18, 33, 15, 3, -3};
        double[] doublearray = {10.0, 15.1, -3.0, 0.5, 5.2, -84.8, 57.1, -12.0, 0.9, -1.5};

        sum(array);
        sum(doublearray);
        min(array);
        min(doublearray);
        max(array);
        max(doublearray);
        maxPositive(array);
        maxPositive(doublearray);
        multiplication(array);
        multiplication(doublearray);
        modulus(array);
        modulus(doublearray);
        secondLargest(array);
        secondLargest(doublearray);
    }

    static int sum(int[] array) {

        int sumresult = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            sumresult = sumresult + array[i];
        }

        System.out.println("The sum of int array is " + sumresult);
        return sumresult;
    }

    static double sum(double[] array) {

        double sumresult = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            sumresult = sumresult + array[i];
        }

        System.out.println("The sum of double array is " + sumresult);
        return sumresult;
    }

    static int min (int[] array){

        int i = 0;
        int minvar = array[i];

        while (i <= array.length-1){

            if (array[i] < minvar) {
                minvar = array[i];
            }

            i++;
        }
        System.out.println("The minimum value of int array is " + minvar);
        return minvar;
    }

    static double min(double[] doublearray){

        int i = 0;
        double minvar = doublearray[i];

        while (i <= doublearray.length-1){

            if (doublearray[i] < minvar) {
                minvar = doublearray[i];
            }

            i++;
        }
        System.out.println("The minimum value of double array is " + minvar);
        return minvar;

    }

    static int max (int[] array){

        int i = 0;
        int maxvar = array[i];

        while (i <= array.length-1){

            if (array[i] > maxvar) {
                maxvar = array[i];
            }

            i++;
        }
        System.out.println("The maximum value of int array is " + maxvar);
        return maxvar;
    }

    static double max(double[] doublearray){

        int i = 0;
        double maxvar = doublearray[i];

        while (i <= doublearray.length-1){

            if (doublearray[i] > maxvar) {
                maxvar = doublearray[i];
            }

            i++;
        }
        System.out.println("The maximum value of double array is " + maxvar);
        return maxvar;

    }

    static int maxPositive (int[] array) {

        int i = 0;
        int maxPositivevar = array[i];

        while (i <= array.length - 1) {

            if (array[i] > 0) {
                if (array[i] > maxPositivevar) maxPositivevar = array[i];
            }
            i++;
        }
        System.out.println("The maximum positive value of int array is " + maxPositivevar);
        return maxPositivevar;
    }

    static double maxPositive (double[] doublearray) {

        int i = 0;
        double maxPositivevar = doublearray[i];

        while (i <= doublearray.length - 1) {

            if (doublearray[i] > 0) {
                if (doublearray[i] > maxPositivevar) maxPositivevar = doublearray[i];
            }
            i++;
        }
        System.out.println("The maximum positive value of double array is " + maxPositivevar);
        return maxPositivevar;
    }

    static int multiplication (int[] array) {

        int mpresult = 1;

        for (int i = 0; i <= array.length - 1; i++) {
            mpresult = mpresult * array[i];
        }

        System.out.println("The multiplication of int array is " + mpresult);
        return mpresult;
    }

    static double multiplication (double[] doublearray) {

        double mpresult = 1;

        for (int i = 0; i <= doublearray.length - 1; i++) {
            mpresult = mpresult * doublearray[i];
        }

        System.out.println("The multiplication of int array is " + mpresult);
        return mpresult;
    }

    static int modulus (int[] array){
        int last = array.length-1;
        int modulusresalt = array[0] / array[last];
        System.out.println("The modulus of first and last element at int array is " + modulusresalt);
        return modulusresalt;
    }

    static double modulus (double[] doublearray){
        int last = doublearray.length-1;
        double modulusresalt = doublearray[0] / doublearray[last];
        System.out.println("The modulus of first and last element at double array is " + modulusresalt);
        return modulusresalt;
    }

    static int secondLargest (int[] array){

        int i = 0; int k = 0;
        int maxvar = array[0];
        int secondmaxvar = array[0];

        while (i <= array.length-1){

            if (array[i] > maxvar) {
                maxvar = array[i];
                k = i;
            }
            i++;
        }
        if (k==0)
            secondmaxvar = array[1];


        for(i = 0; i <= array.length-1; i++){
            if (i == k) {
                continue;
            }
            else{
                if (array[i] > secondmaxvar)
                    secondmaxvar = array[i];
            }

        }

        System.out.println("The second maximum value at int array is  " + secondmaxvar);
        return secondmaxvar;
    }

    static double secondLargest (double[] doublearray){

        int i = 0; int k = 0;
        double maxvar = doublearray[0];
        double secondmaxvar = doublearray[0];

        while (i <= doublearray.length-1){

            if (doublearray[i] > maxvar) {
                maxvar = doublearray[i];
                k = i;
            }
            i++;
        }
        if (k==0)
            secondmaxvar = doublearray[1];


        for(i = 0; i <= doublearray.length-1; i++){
            if (i == k) {
                continue;
            }
            else{
                if (doublearray[i] > secondmaxvar)
                    secondmaxvar = doublearray[i];
            }

        }

        System.out.println("The second maximum value at double array is  " + secondmaxvar);
        return secondmaxvar;
    }

}

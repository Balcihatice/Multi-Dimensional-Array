package multidimensionalaarray;

public class Q06_AyniIndexlerinToplami {

   /*
   Verilen MultiDimensional array`in ayni index`lerinde bulunan degerlerin toplamini veren kodu yaziniz.
    */

    public static void main(String[] args) {


        int arr[][] = {{1, 2}, {3, 4, 5}, {6}};
        int brr[][] = {{7, 8, 9}, {10, 11}, {12}};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < brr.length) {

                for (int j = 0; j < arr[i].length; j++) {

                    System.out.println(arr[i][j] + " + " + brr[i][j] + " = " + (arr[i][j] + brr[i][j]));


                }

            } else {

                for (int j = 0; j < brr[i].length; j++) {

                    System.out.println(arr[i][j] + " + " + brr[i][j] + " = " + (arr[i][j] + brr[i][j]));
                }
            }
        }
    }
}
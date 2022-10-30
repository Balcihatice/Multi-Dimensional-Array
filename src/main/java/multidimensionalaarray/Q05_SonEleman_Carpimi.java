package multidimensionalaarray;

public class Q05_SonEleman_Carpimi {

    public static void main(String[] args) {
    /*
     Asagidaki multi dimensional array'in ic array'lerindeki son elemanlarin carpimini ekrana yazdiran bir program yaziniz
     { {1,2,3},{4,5},{6} }
    */

        int m = 1;

        int[][] nums = {{1, 2, 3}, {4, 5}, {6}};

        for (int[] w : nums) {

            m *= w[w.length - 1];
        }

        System.out.println(m);
    }

}


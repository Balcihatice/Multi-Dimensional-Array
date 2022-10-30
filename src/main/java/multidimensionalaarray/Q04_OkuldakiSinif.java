package multidimensionalaarray;

public class Q04_OkuldakiSinif {
    /*
    // Bir ilkokulda her sinifta ogrenci sayilari 5 olan 3 adet sinif vardir. toplan ogrenci sayisini bulunuz. *Ilk okul 2. sinifa kadardir.
           3 Sube var.
           A B C
          1.siniflar: 5,5,5
          2.siniflar: 5,5,5
          toplam : 30 ogrenci var
     */
    public static void main(String[] args) {

        int arr[][] = {{5, 5, 5}, {5, 5, 5}};

        int toplamOgr = 0;

        for (int[] w : arr)

            for (int k : w)

                toplamOgr += k;

        System.out.println(toplamOgr);
    }
}

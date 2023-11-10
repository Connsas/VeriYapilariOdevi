/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author İsmail
 */
public class BubbleSort {

    public int[] sort(int[] dizi) {

        int tmp, i, j;
        int kontrol = dizi.length / 2;
        for (i = 0; i < dizi.length; i++) {
            if (i < kontrol) {
                for (j = kontrol - 1; j > 0; j--) {
                    if (dizi[j] > dizi[j - 1]) {
                        tmp = dizi[j];
                        dizi[j] = dizi[j - 1];
                        dizi[j - 1] = tmp;
                    }
                }
            } else {
                for (j = kontrol+1; j < dizi.length; j++) {
                    if (dizi[j - 1] > dizi[j]) {
                        tmp = dizi[j];
                        dizi[j] = dizi[j - 1];
                        dizi[j - 1] = tmp;
                    }
                }

            }

        }
        return dizi;
    }

}

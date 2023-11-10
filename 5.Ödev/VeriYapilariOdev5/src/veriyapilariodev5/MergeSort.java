/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapilariodev5;



/**
 *
 * @author İsmail
 */
public class MergeSort {

    
    
    public void mergeSortBagliListe(BagliListe bl) {
        BagliListeyeEkle bagliListeyeEkle = new BagliListeyeEkle();
        int array[] = new int[bl.es];
        Node tmp = bl.head;
        int i = 0;
        array[i++] = tmp.data;
        while(tmp.next != null){
            array[i++] = tmp.next.data;
            tmp = tmp.next;
        }
        int dizi[]=merge(array);
        bl = bagliListeyeEkle.diziyiEkle(dizi, bl);
        BagliListeyiYazdir bagliListeyiYazdir = new BagliListeyiYazdir();
        bagliListeyiYazdir.bagliListeyiYazdir(bl);
    }
    
     
    public int[] merge(int array[]) { //diziyi parçalara ayırmak için kullanılan metot

        int arrayLength;
        arrayLength = array.length;

        if (arrayLength > 1) {
            int l, r, m;
            m = (arrayLength / 2);
            l = 0;
            r = arrayLength;
            if (arrayLength % 2 == 1) {
                m += 1;
            }
            int[] leftArray = new int[m];
            int[] rightArray = new int[arrayLength / 2];
            for (int i = 0; i < m; i++) {
                leftArray[i] = array[i];
            }
            for (int i = 0; i < (arrayLength / 2); i++) {
                rightArray[i] = array[i + m];
            }
            int[] left = merge(leftArray);
            int[] right = merge(rightArray);
            array = sort(left, right);
        }
        return array;
    }

    public int[] sort(int arrayL[], int arrayR[]) { //diziyi sıralayıp birleştirmek için kullanılan metot
        int arrayLenght = arrayL.length + arrayR.length;
        int array[] = new int[arrayLenght];
        int i = 0, j = 0, k = 0;
        while (i < arrayL.length && j < arrayR.length) {
            if (arrayL[i] < arrayR[j]) {
                array[k++] = arrayL[i++];
            } else {
                array[k++] = arrayR[j++];
            }
        }
        while (i < arrayL.length) {
            array[k++] = arrayL[i++];
        }
        while (j < arrayR.length) {
            array[k++] = arrayR[j++];
        }
        return array;
    }

    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veriyapilarifinalodevi_1;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
//Kullanıcının verdiği n tane diziyi tutan n elemanlı dizi
public class ArrayList {

    int listLenght;
    Array arrays[];
    int es;

    public ArrayList(int n) {
        listLenght = n;
        arrays = new Array[n];
        es = 0;
    }

    public void add(Array array) {
        if (es < listLenght) {
            arrays[es++] = array;
        } else {
            System.out.println("Liste boyutu aşıldı. Listeye daha fazla dizi ekleyemessiniz.");
        }

    }

    public int elementsLenghtSum() {
        int elementLenghts = 0;

        for (Array i : arrays) {
            elementLenghts += i.es;
        }
        return elementLenghts;
    }

}

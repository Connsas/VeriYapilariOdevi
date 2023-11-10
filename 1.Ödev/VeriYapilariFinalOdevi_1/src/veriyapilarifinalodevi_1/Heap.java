/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veriyapilarifinalodevi_1;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
//Sıralamanın yapılcağı dizi
public class Heap {

    ArrayList arrayList;
    int heap[];
    int lenght;
    Array list[];
    int es;

    public Heap(ArrayList arrayList) {
        lenght = arrayList.elementsLenghtSum();
        heap = new int[lenght];
        list = arrayList.arrays;
        es = 0;
        addToHeap();
    }

    public void addToHeap() {
        for (Array i : list) {
            for (int j : i.array) {
                heap[es++] = j;
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veriyapilarifinalodevi_1;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(5);
        
        int dizi1[] = {1,5,6,7,9,13,15};
        int dizi2[] = {25,36};
        int dizi3[] = {2,18,21};
        int dizi4[] = {63,67,89,92,95};
        int dizi5[] = {103,151,187};
        
        Array array1 = new Array(dizi1.length,dizi1);
        Array array2 = new Array(dizi2.length,dizi2);
        Array array3 = new Array(dizi3.length,dizi3);
        Array array4 = new Array(dizi4.length,dizi4);
        Array array5 = new Array(dizi5.length,dizi5);
        
        arrayList.add(array1);
        arrayList.add(array2);
        arrayList.add(array3);
        arrayList.add(array4);
        arrayList.add(array5);
        
        Heap heap = new Heap(arrayList);
        HeapSort heapSort = new HeapSort();
        heapSort.sort(heap.heap);
        
        PrintArray printArray = new PrintArray();
        printArray.print(heap.heap);
    }
    
}

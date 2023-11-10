/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author İsmail
 */
public class PrintSortedArray {
    public PrintSortedArray(BubbleSort bubbleSort,int[] dizi){
        int[] array = bubbleSort.sort(dizi);
        for(int i = 0; i<dizi.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}

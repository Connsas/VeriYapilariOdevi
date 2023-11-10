/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veriyapilariodev5;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
public class VeriYapilariOdev5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BagliListe bagliListe = new BagliListe();
        BagliListeyeEkle ble = new BagliListeyeEkle();
        BagliListeyiYazdir bly= new BagliListeyiYazdir();
        MergeSort mergeSort = new MergeSort();
        Node n1 = new Node(9);
        ble.bagliListeyeEkle(n1, bagliListe);
        Node n2 = new Node(7);
        ble.bagliListeyeEkle(n2, bagliListe);
        Node n3 = new Node(12);
        ble.bagliListeyeEkle(n3, bagliListe);
        Node n4 = new Node(5);
        ble.bagliListeyeEkle(n4, bagliListe);
        Node n5 = new Node(3);
        ble.bagliListeyeEkle(n5, bagliListe);
        Node n6 = new Node(21);
        ble.bagliListeyeEkle(n6, bagliListe);
        Node n7 = new Node(28);
        ble.bagliListeyeEkle(n7, bagliListe);
        Node n8 = new Node(22);
        ble.bagliListeyeEkle(n8, bagliListe);
        System.out.println("Karışık Liste");
        bly.bagliListeyiYazdir(bagliListe);
        System.out.println("\nSıralı Liste");
        mergeSort.mergeSortBagliListe(bagliListe);
        
    }
    
}

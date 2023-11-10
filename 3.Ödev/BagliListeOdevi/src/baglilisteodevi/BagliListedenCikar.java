/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baglilisteodevi;

/**
 *
 * @author İsmail
 */
public class BagliListedenCikar {
    
    public BagliListedenCikar(BagliListe bagliListe){
        if(bagliListe.head == null){
            System.out.println("Kuyrukta Eleman Bulunmamakta.");
        }else{
            Node tmp = bagliListe.head;
            bagliListe.head=bagliListe.head.next;
            System.out.println("İlk Eleman Kuyruktan Çıkarıldı : "+tmp.data);
        }
    }
}

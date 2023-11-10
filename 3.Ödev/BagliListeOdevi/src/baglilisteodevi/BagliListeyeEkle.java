/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baglilisteodevi;

/**
 *
 * @author İsmail
 */
public class BagliListeyeEkle {
    
    
    public BagliListeyeEkle(Node node,BagliListe bl){
        Node n = node;
        BagliListe bagliListe = bl;
        if(bagliListe.head == null){
            bagliListe.head = n;
        }else{
            Node tmp = bagliListe.head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = n;
        }
    }
    
}

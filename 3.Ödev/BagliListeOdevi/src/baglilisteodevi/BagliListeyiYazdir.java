/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baglilisteodevi;

/**
 *
 * @author İsmail
 */
public class BagliListeyiYazdir {
    public BagliListeyiYazdir(BagliListe bl){
        Node tmp = bl.head;
        System.out.println(tmp.data);
        while(tmp.next != null){
            System.out.println(tmp.next.data);
            tmp = tmp.next;
        }
    }
}

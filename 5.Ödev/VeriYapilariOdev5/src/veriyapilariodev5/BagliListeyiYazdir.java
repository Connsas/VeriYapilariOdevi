/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veriyapilariodev5;

/**
 *
 * @author İsmail
 */
public class BagliListeyiYazdir {
    public void bagliListeyiYazdir(BagliListe bl){
        Node tmp = bl.head;
        System.out.print(tmp.data);
        while(tmp.next != null){
            System.out.print("-"+tmp.next.data);
            tmp = tmp.next;
        }
    }
}

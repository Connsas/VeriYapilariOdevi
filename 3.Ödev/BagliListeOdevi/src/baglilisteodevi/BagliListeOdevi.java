/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baglilisteodevi;

/**
 *
 * @author İsmail
 */
public class BagliListeOdevi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BagliListe bagliListe = new BagliListe();
        Node n1 = new Node(7);
        Node n2 = new Node(9);
        Node n3 = new Node(5);
        Node n4 = new Node(4);
        
        BagliListeyeEkle bagliListeyeEkle;
        bagliListeyeEkle = new BagliListeyeEkle(n1,bagliListe);
        bagliListeyeEkle = new BagliListeyeEkle(n2,bagliListe);
        bagliListeyeEkle = new BagliListeyeEkle(n3,bagliListe);        
        bagliListeyeEkle = new BagliListeyeEkle(n4,bagliListe);

        BagliListedenCikar bagliListedenCikar = new BagliListedenCikar(bagliListe);
        
        BagliListeyiYazdir yaz = new BagliListeyiYazdir(bagliListe);
    }
    
}

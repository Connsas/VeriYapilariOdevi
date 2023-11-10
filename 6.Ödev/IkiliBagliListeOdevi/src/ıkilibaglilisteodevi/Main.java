/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ıkilibaglilisteodevi;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BagliLeste bl = new BagliLeste();

        Ogrenci ogr1 = new Ogrenci(1, 90);
        Ogrenci ogr2 = new Ogrenci(2, 83);
        Ogrenci ogr3 = new Ogrenci(3, 97);
        Ogrenci ogr4 = new Ogrenci(4, 75);
        Ogrenci ogr5 = new Ogrenci(5, 71);
        Ogrenci ogr6 = new Ogrenci(6, 70);
        Ogrenci ogr7 = new Ogrenci(7, 74);

        Ogrenci ogr8 = new Ogrenci(8, 58);
        Ogrenci ogr9 = new Ogrenci(9, 50);

        Ogrenci ogr10 = new Ogrenci(10, 38);
        Ogrenci ogr11 = new Ogrenci(11, 18);
        Ogrenci ogr12 = new Ogrenci(12, 10);

        Node n1 = new Node(ogr1);
        Node n2 = new Node(ogr2);
        Node n3 = new Node(ogr3);
        Node n4 = new Node(ogr4);
        Node n5 = new Node(ogr5);
        Node n6 = new Node(ogr6);
        Node n7 = new Node(ogr7);
        Node n8 = new Node(ogr8);
        Node n9 = new Node(ogr9);
        Node n10 = new Node(ogr10);
        Node n11 = new Node(ogr11);
        Node n12 = new Node(ogr12);

        bl.AddInOrder(n1);
        bl.AddInOrder(n2);
        bl.AddInOrder(n3);
        bl.AddInOrder(n4);
        bl.AddInOrder(n5);
        bl.AddInOrder(n6);
        bl.AddInOrder(n7);
        bl.AddInOrder(n8);
        bl.AddInOrder(n9);
        bl.AddInOrder(n10);
        bl.AddInOrder(n11);
        bl.AddInOrder(n12);
        bl.print();

    }

}

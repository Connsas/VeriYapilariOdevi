package ıkilibaglilisteodevi;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
public class Node {

    Ogrenci data;
    Node next;
    Node down;
    

    public Node(Ogrenci d) {
        data = d;
        next = null;
        down = null;
   }
}

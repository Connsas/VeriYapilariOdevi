/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ıkilibaglilisteodevi;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
public class BagliLeste {

    Node head;
    int elemanSayisi;

    public BagliLeste() {
        head = null;
        elemanSayisi = 0;
    }

    public void AddInOrder(Node n) {

        if (n.data.sinavNotu > 79 && n.data.sinavNotu < 101) {
            if (head == null) {
                head = n;
            } else if (head.data.sinavNotu < n.data.sinavNotu) {
                n.next = head;
                head = n;
            } else {
                Node tmp = head;

                while (tmp.next != null && tmp.next.data.sinavNotu > n.data.sinavNotu) {
                    tmp = tmp.next;
                }
                n.next = tmp.next;
                tmp.next = n;
            }
        }

        if (n.data.sinavNotu > 59 && n.data.sinavNotu < 80) {
            if (head.down == null) {
                head.down = n;
            } else if (head.down.data.sinavNotu < n.data.sinavNotu) {
                n.next = head.down;
                head.down = n;
            } else {
                Node tmp = head.down;

                while (tmp.next != null && tmp.next.data.sinavNotu > n.data.sinavNotu) {
                    tmp = tmp.next;
                }
                n.next = tmp.next;
                tmp.next = n;
            }
        }

        if (n.data.sinavNotu > 39 && n.data.sinavNotu < 61) {
            if (head.down.down == null) {
                head.down.down = n;
            } else if (head.down.down.data.sinavNotu < n.data.sinavNotu) {
                n.next = head.down.down;
                head.down.down = n;
            } else {
                Node tmp = head.down.down;

                while (tmp.next != null && tmp.next.data.sinavNotu > n.data.sinavNotu) {
                    tmp = tmp.next;
                }
                n.next = tmp.next;
                tmp.next = n;
            }
        }
        
         if (n.data.sinavNotu > 19 && n.data.sinavNotu < 41) {
            if (head.down.down.down == null) {
                head.down.down.down = n;
            } else if (head.down.down.down.data.sinavNotu < n.data.sinavNotu) {
                n.next = head.down.down.down;
                head.down.down.down = n;
            } else {
                Node tmp = head.down.down.down;

                while (tmp.next != null && tmp.next.data.sinavNotu > n.data.sinavNotu) {
                    tmp = tmp.next;
                }
                n.next = tmp.next;
                tmp.next = n;
            }
        }
         
              if (n.data.sinavNotu > 0 && n.data.sinavNotu < 20) {
            if (head.down.down.down.down == null) {
                head.down.down.down.down = n;
            } else if (head.down.down.down.down.data.sinavNotu < n.data.sinavNotu) {
                n.next = head.down.down.down.down;
                head.down.down.down.down = n;
            } else {
                Node tmp = head.down.down.down.down;

                while (tmp.next != null && tmp.next.data.sinavNotu > n.data.sinavNotu) {
                    tmp = tmp.next;
                }
                n.next = tmp.next;
                tmp.next = n;
            }
        }

    }

    public void print() {
        Node tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data.ogrenciNo + "-");
            tmp = tmp.next;
        }
        System.out.println(" ");
        tmp = head.down;

        while (tmp != null) {
            System.out.print(tmp.data.ogrenciNo + "-");
            tmp = tmp.next;
        }

        System.out.println(" ");
        tmp = head.down.down;

        while (tmp != null) {
            System.out.print(tmp.data.ogrenciNo + "-");
            tmp = tmp.next;
        }
        System.out.println(" ");
        
          tmp = head.down.down.down;

        while (tmp != null) {
            System.out.print(tmp.data.ogrenciNo + "-");
            tmp = tmp.next;
        }
        System.out.println(" ");
        
       tmp = head.down.down.down.down;

        while (tmp != null) {
            System.out.print(tmp.data.ogrenciNo + "-");
            tmp = tmp.next;
        }
        System.out.println(" ");

    }

}

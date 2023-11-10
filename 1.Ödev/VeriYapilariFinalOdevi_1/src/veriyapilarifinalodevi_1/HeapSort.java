/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapilarifinalodevi_1;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
public class HeapSort {

    public void heapify(int arr[], int n, int i) {
        int min = i;
        int l = (i * 2) + 1;
        int r = (i * 2) + 2;

        if (l < n && arr[l] < arr[min]) {
            min = l;
        }
        if (r < n && arr[r] < arr[min]) {
            min = r;
        }
        if (min != i) {
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;

            heapify(arr, n, min);
        }

    }

    public void sort(int arr[]) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            heapify(arr, i, 0);
        }
    }

}

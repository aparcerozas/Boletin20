/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_2;

/**
 *
 * @author aparcerozas
 */
public class Tartaglia {
    public void triangulo(int filas){
        int[] a = new int[1];
        for (int i=1;i<=filas;i++) {
            int[] x = new int[i];
            for(int j=0;j<i;j++) {
                if (j==0||j==(i-1)) {
                    x[j] = 1;
                } else {
                    x[j] = a[j] + a[j - 1];
                }
                System.out.print(x[j] + " ");
            }
            a = x;
            System.out.println();
        }
    }
}

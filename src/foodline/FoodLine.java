/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodline;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class FoodLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar =new int[n];
        int m=sc.nextInt();
        for (int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
         for(int i=0;i<m;i++){
             int min= Integer.MAX_VALUE;
             int minIndex=0;
             for(int j=0;j<n;j++){
                 if(ar[j]<min){
                     min=ar[j];
                     minIndex=j;
                 }
             }
             System.out.println(min);
             ar[minIndex]++;
        }
        
    }
    
}

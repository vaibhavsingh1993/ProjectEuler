/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vavasing
 */
public class LargestPalindromeProduct {

    /**
     * @param args the command line arguments
     */
    private static List<Integer> lis = new ArrayList<Integer>();
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=0,c=0;
        for(a = 1; a < 10; a++) {
            for(b = 0; b < 10; b++) {
                for(c = 0; c < 10; c++) {
                    lis.add(100001*a+10010*b+1100*c);
                    
                }
            }
        }
        //System.out.println(lis);
        
        for (int i = 0; i < lis.size(); i++) {
            if(factor(lis.get(lis.size() - i - 1))) {
                System.out.println(lis.get(lis.size() - i - 1));
                break;
            }
        }
    }
    
    static boolean factor(int no)  {
        for (int i = 100; i < 999; i++) {
            if (no % i == 0) {
                if ((no/i) / 1000 == 0) {
                    System.out.println(i);
                    return true;
                }

            }
        }
        return false;
    }
    
}

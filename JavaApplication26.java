/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author mike
 */
public class JavaApplication26 {
public static int mystery(int n) {
      if (n < 10) {
          return (10 * n) + n;
      } else {
          int a = mystery(n / 10);
          int b = mystery(n % 10);
          return (100 * a) + b;
      } 
   }
  public static void main(String[] args) {
       mystery(348);     
    }   
}

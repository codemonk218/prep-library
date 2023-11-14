package com.chandanbhat.prephub.dsa.patterns;

public class Pattern6 {

  // https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1
  // https://www.codingninjas.com/studio/problems/reverse-number-triangle_6581889

  void printInvertedTriangle(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = n; col > row; col--) {
        System.out.print((n - col + 1) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Pattern6 pattern = new Pattern6();
    pattern.printInvertedTriangle(5);
  }
}

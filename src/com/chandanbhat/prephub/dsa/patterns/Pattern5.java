package com.chandanbhat.prephub.dsa.patterns;

public class Pattern5 {

  // https://practice.geeksforgeeks.org/problems/triangle-pattern/1
  // https://www.codingninjas.com/studio/problems/seeding_6581892

  static void printInvertedTriangle(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = n; col > row; col--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void main(String[] args) {
    Pattern5 pattern = new Pattern5();
    pattern.printInvertedTriangle(5);
  }
}

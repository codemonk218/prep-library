package com.chandanbhat.prephub.dsa.patterns;

public class Pattern2 {

  // https://practice.geeksforgeeks.org/problems/right-triangle/1
  // https://www.codingninjas.com/studio/problems/n-2-forest_6570178

  void printTriangle(int n) {
    for (int row = 0; row < n;row++) {
      for (int col = 0; col < row + 1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

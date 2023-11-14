package com.chandanbhat.prephub.dsa.patterns;

public class Pattern3 {

  // https://practice.geeksforgeeks.org/problems/triangle-number/1
  // https://www.codingninjas.com/studio/problems/n-triangles_6573689

  void printNumberTriangle(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = 0; col <= row; col++) {
        System.out.print((col + 1) + " ");
      }
      System.out.println();
    }
  }
}

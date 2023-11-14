package com.chandanbhat.prephub.dsa.patterns;

public class Pattern4 {

  // https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1
  // https://www.codingninjas.com/studio/problems/triangle_6573690

  void printNumberTriangle(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < row + 1; col++) {
        System.out.print((row + 1) + " ");
      }
      System.out.println();
    }
  }
}

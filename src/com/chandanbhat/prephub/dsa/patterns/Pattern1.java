package com.chandanbhat.prephub.dsa.patterns;

public class Pattern1 {

  // https://practice.geeksforgeeks.org/problems/square-pattern/1
  // https://www.codingninjas.com/studio/problems/n-forest_6570177

  void printSquare(int n) {
    for (int rows = 0; rows < n; rows++) {
      for (int columns = 0; columns < n; columns++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

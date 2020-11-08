package org.example.path;

import org.example.tad.Node;

public class Path {

  public static void preOrder(Node node) {
    if (node == null) {
      return;
    } else {
      System.out.print(node.getValue() + " ");
      preOrder(node.getLeft());
      preOrder(node.getRight());
    }
  }

  public static void inOrder(Node node) {
    if (node == null) {
      return;
    } else {
      preOrder(node.getLeft());
      System.out.print(node.getValue() + " ");
      preOrder(node.getRight());
    }
  }

  public static void postOrder(Node node) {
    if (node == null) {
      return;
    } else {
      preOrder(node.getLeft());
      preOrder(node.getRight());
      System.out.print(node.getValue() + " ");
    }
  }
}

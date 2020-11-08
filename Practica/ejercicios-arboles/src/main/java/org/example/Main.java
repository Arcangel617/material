package org.example;

import org.example.path.Path;
import org.example.tad.Node;

public class Main {

  public static void main(String[] args) {
    Node node = new Node("A");
    Node left = new Node("B");
    Node right = new Node("C");

    node.setLeft(left);
    node.setRight(right);

    Path.preOrder(node);
    System.out.println();
    Path.inOrder(node);
    System.out.println();
    Path.postOrder(node);
  }
}

package com.sparta;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinaryTree binTree = new BinaryTree();
        binTree.addElement(17);
        binTree.addElement(234);
        binTree.addElement(20);
        binTree.addElement(13);
        binTree.addElement(4);
        binTree.addElement(9);
        binTree.addElement(22);
        binTree.addElement(45);
        binTree.addElement(2);
        binTree.addElement(64);
        binTree.addElement(121);
        binTree.addElement(100);
        binTree.addElement(24);
        System.out.println(binTree.getNumberOfElements());
        System.out.println(binTree.findElement(17));
        System.out.println(binTree.findElement(3));
        System.out.println(binTree.findElement(4));
        System.out.println(binTree.findElement(22));
        System.out.println(binTree.findElement(234));
        System.out.println(binTree.findElement(45));
        System.out.println(binTree.getNumberOfElements());
        System.out.println(binTree.findElement(121));
        System.out.println(binTree.findElement(9));
        System.out.println(binTree.findElement(12));
        System.out.println(Arrays.toString(binTree.getSortedTreeAsc()));
        System.out.println(Arrays.toString(binTree.getSortedTreeDesc()));
//        System.out.println(binTree.getLeftChild(13));
//        System.out.println(binTree.getLeftChild(17));
//        System.out.println(binTree.getLeftChild(234));
//        System.out.println(binTree.getLeftChild(22));
//        System.out.println(binTree.getLeftChild(13));
//        System.out.println(binTree.getLeftChild(2));
//        System.out.println(binTree.getLeftChild(121));
        System.out.println("Just a big gap");
//        System.out.println(binTree.getRightChild(17));
//        System.out.println(binTree.getRightChild(64));
//        System.out.println(binTree.getRightChild(4));




    }
}

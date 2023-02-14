package com.sparta;

import com.sparta.extensions.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    @DisplayName("Checking No Right Child Exception works")
    void checkNoRightChildException() {
        BinaryTree binTree = new BinaryTree();
        binTree.addElement(12);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binTree.getRightChild(12));
    }

    @Test
    @DisplayName("Checking No Left Child exception works")
    void checkNoLeftChildException() {
        BinaryTree binTree = new BinaryTree();
        binTree.addElement(12);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binTree.getLeftChild(12));
    }

    @ParameterizedTest
    @DisplayName("checking no left child works when only right children are present")
    @ValueSource(ints = {12,13,14,15})
    void checkNoLeftChildExceptionWithOnlyRightChildren(int value) {
        BinaryTree binTree = new BinaryTree();
        binTree.addElement(12);
        binTree.addElement(13);
        binTree.addElement(14);
        binTree.addElement(15);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binTree.getLeftChild(value));
    }

    @ParameterizedTest
    @DisplayName("checking no right child works when only left children are present")
    @ValueSource(ints = {12,11,10,9})
    void checkNoRightChildExceptionWithOnlyLeftChildren(int value) {
        BinaryTree binTree = new BinaryTree();
        binTree.addElement(12);
        binTree.addElement(11);
        binTree.addElement(10);
        binTree.addElement(9);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binTree.getRightChild(value));
    }
}
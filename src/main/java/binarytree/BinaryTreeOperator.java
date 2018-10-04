package binarytree;

import exception.NullArgumentException;

public class BinaryTreeOperator {

    private BinaryTree binaryTree;

    public BinaryTreeOperator(BinaryTree binaryTree) {
        isBinaryTreeProvided(binaryTree);
        this.binaryTree = binaryTree;
    }

    private void isBinaryTreeProvided(BinaryTree binaryTree) {
        if (binaryTree == null) {
            throw new NullArgumentException("Binary Tree could not be null");
        }
    }

    public Integer sum() {
        return sum(binaryTree);
    }

    private Integer sum(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return 0;
        }

        return binaryTree.getValue() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
    }
}
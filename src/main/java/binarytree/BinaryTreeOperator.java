package binarytree;

import exception.NullArgumentException;

public class BinaryTreeOperator {

    private BinaryTree binaryTree;

    BinaryTreeOperator(final BinaryTree binaryTree) {
        isBinaryTreeProvided(binaryTree);
        this.binaryTree = binaryTree;
    }

    private void isBinaryTreeProvided(final BinaryTree binaryTree) {
        if (binaryTree == null) {
            throw new NullArgumentException("Binary Tree could not be null");
        }
    }

    public Integer sum() {
        return sum(binaryTree);
    }

    private Integer sum(final BinaryTree binaryTree) {
        if (binaryTree == null) {
            return 0;
        }

        return binaryTree.getValue() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
    }
}
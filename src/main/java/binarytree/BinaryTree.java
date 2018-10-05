package binarytree;

public class BinaryTree {

    private Integer value;

    private BinaryTree right;

    private BinaryTree left;

    BinaryTree(final Integer value) {
        this.value = value;
    }

    BinaryTree(final Integer value, final BinaryTree right, final BinaryTree left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public Integer getValue() {
        return value;
    }

    public BinaryTree getRight() {
        return right;
    }

    public BinaryTree getLeft() {
        return left;
    }
}
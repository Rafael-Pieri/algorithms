package binarytree;

public class BinaryTree {

    private Integer value;

    private BinaryTree right;

    private BinaryTree left;

    public BinaryTree(Integer value) {
        this.value = value;
    }

    public BinaryTree(Integer value, BinaryTree right, BinaryTree left) {
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
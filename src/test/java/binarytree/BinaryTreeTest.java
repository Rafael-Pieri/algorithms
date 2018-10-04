package binarytree;

import exception.NullArgumentException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    @Test(expected = NullArgumentException.class)
    public void shouldThrowNullArgumentExceptionWhenNodeIsNotProvided() {
        new BinaryTreeOperator(null);
    }

    @Test
    public void shouldSumNodeValuesWhenOnlyOneNodeIsProvided() {
        final Integer expectedValue = 5;
        final BinaryTree binaryTree = new BinaryTree(expectedValue);

        final Integer result = new BinaryTreeOperator(binaryTree)
            .sum();

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldSumNodeValuesWhenOneNodeLevelIsProvided() {
        final Integer expectedValue = 16;

        final BinaryTree binaryTreeB = new BinaryTree(8);
        final BinaryTree binaryTreeC = new BinaryTree(5);
        final BinaryTree binaryTreeA = new BinaryTree(3, binaryTreeB, binaryTreeC);

        final Integer result = new BinaryTreeOperator(binaryTreeA)
            .sum();

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldSumNodeValuesWhenTwoNodeLevelsAreProvided() {
        final Integer expectedValue = 76;

        final BinaryTree binaryTreeG = new BinaryTree(12);
        final BinaryTree binaryTreeF = new BinaryTree(25);
        final BinaryTree binaryTreeE = new BinaryTree(7);
        final BinaryTree binaryTreeD = new BinaryTree(16);
        final BinaryTree binaryTreeC = new BinaryTree(5, binaryTreeF, binaryTreeG);
        final BinaryTree binaryTreeB = new BinaryTree(8, binaryTreeD, binaryTreeE);
        final BinaryTree binaryTreeA = new BinaryTree(3, binaryTreeB, binaryTreeC);

        final Integer result = new BinaryTreeOperator(binaryTreeA)
            .sum();

        assertEquals(expectedValue, result);
    }
}
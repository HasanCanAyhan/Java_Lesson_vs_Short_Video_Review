package mentor_lesson.week31;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    TNode root;

    public BinarySearchTree() {
    }

    void insert(int val) {

        TNode tNode = new TNode(val);

        if (root == null) {
            root = tNode;
            return;// to stop
        }

        TNode curr = root;//start point
        while (true) {

            if (val <= curr.value) {

                if (curr.leftChild == null) {
                    curr.leftChild = tNode;// here: insertion
                    break;
                }

                curr = curr.leftChild;

            } else {
                //val > curr.value

                if (curr.rightChild == null) {
                    curr.rightChild = tNode; // here: insertion
                    break;
                }

                curr = curr.rightChild;

            }


        }

    }

    void preOrder(TNode root) { // root, left, right

        if (root == null) {
            return;
        }

        System.out.print(root.value + " - > ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);


    }

    void inOrder(TNode root) { // left, root, right

        if (root == null) return;

        inOrder(root.leftChild);
        System.out.print(root.value + " -> ");
        inOrder(root.rightChild);


    }

    void postOrder(TNode root) {//left, right, root

        if (root == null) return;

        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.value + " -> ");

    }

    void levelOrder(TNode root) {

        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {

            TNode curr = queue.poll();
            System.out.print(curr.value + " -> ");

            if (curr.leftChild != null) queue.add(curr.leftChild);
            if (curr.rightChild != null) queue.add(curr.rightChild);

        }

    }

    //Task 1: Implement finding an integer value in a BST (Binary Search Tree)
    boolean contains(TNode root, int targetVal) {

        boolean isContains = false;
        if (root == null) return isContains;

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {

            TNode curr = queue.poll();

            if (curr.value == targetVal) return isContains = true;

            if (curr.leftChild != null) queue.add(curr.leftChild);
            if (curr.rightChild != null) queue.add(curr.rightChild);


        }

        return isContains;

    }

    boolean contains2(TNode root, int val) {

        if (root == null) return false;

        TNode curr = root;

        while (curr != null){

            if (val < curr.value) curr = curr.leftChild;
            else if (val > curr.value)  curr = curr.rightChild;
            else { // if curr.val == val
                return true;
            }

        }

        return false;

    }


    //Task 2: Implement a method that returns true if the node is a leaf in a BST
    boolean isLeaf(TNode root){

        return root.leftChild == null && root.rightChild == null;

    }

    //Task 3: Implement a method that prints leaves of a BST.
    void printLeaves(TNode root){

        if (root == null) return;

        if (root.leftChild == null && root.rightChild == null){
            System.out.print(root.value + " , ");
        }


        printLeaves(root.leftChild);
        printLeaves(root.rightChild);

    }

    void printLeaves2(TNode root){

        if (root == null) return;

        if (isLeaf(root)) System.out.print(root.value + ",");

        printLeaves2(root.leftChild);
        printLeaves2(root.rightChild);

    }

    //Task 4: Implement a method that counts leaves of a BST.

    int countLeaves(TNode root) {

        if (root == null) return 0;

        if (isLeaf(root)) return 1;

        return countLeaves(root.leftChild) + countLeaves(root.rightChild);



    }

    //Task 5: Implement a method that returns sum of leaf values of a BST.
    int findSumOfLeaves(TNode root){

        if (root == null) return 0;

        if (isLeaf(root)) return root.value;

        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);

    }

    //Task 6: Implement a method that returns height of a node in a BST.

    int height(TNode root){

        if (root == null) return -1;

        if (isLeaf(root)) return 0;

        return 1 + Math.max(height(root.leftChild),height(root.rightChild));

    } //https://youtu.be/_SiwrPXG9-g

    int sumOfNodeDepths(TNode root, int A){

        if (root == null) return 0;

        return A + sumOfNodeDepths(root.leftChild, A+1) + sumOfNodeDepths(root.rightChild,A+1);

    }

    //week 31- mentor -A_Q
    //Range Sum of BST
    /*
    Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a
    value in the inclusive range [low, high].
     */

    int rangeSumOfBST(TNode root, int low , int high){

        if (root == null) return 0;

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        int sum = 0;
        while (queue.size() > 0){

            TNode current = queue.poll();
            if (low <= current.value && current.value <= high){
                sum += current.value;
            }

            if (current.leftChild != null) queue.add(current.leftChild);
            if (current.rightChild != null) queue.add(current.rightChild);

        }

        return sum;

    }

    public int sumOfRange(TNode root, int low, int high){
        if(root == null) return 0;
        int num = 0;
        if(root.value >= low && root.value <= high) num = root.value;
        return num + sumOfRange(root.leftChild, low, high) + sumOfRange(root.rightChild, low, high);
    }

    //week 31 - mentor - A_Q
    //Same Tree

    boolean sameTree(TNode p, TNode q){

        if (p == null && q == null) return  true;
        if (p == null || q == null) return false;

        return p.value == q.value
                && sameTree(p.leftChild, q.leftChild)
                && sameTree(p.rightChild, q.rightChild);


    }


}

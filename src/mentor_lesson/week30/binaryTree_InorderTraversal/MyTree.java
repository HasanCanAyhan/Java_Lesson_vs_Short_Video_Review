package mentor_lesson.week30.binaryTree_InorderTraversal;

import java.util.*;

public class MyTree {

    TreeNode root;

    public MyTree() {
    }

    //left - root - right
    public static List<Integer> inorderTraversal(TreeNode root) { // using Stack

        Stack<TreeNode> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();

        while (!stack.isEmpty() || root != null) {

            while (root != null) {
                stack.push(root);//3,5
                root = root.left;
            }
            root = stack.pop(); // 4,2,1
            list.add(root.val); // 4,6,2,1,5,3
            root = root.right; // 6,3


        }

        return list;
    }


    public static void preOrderTraversal2(TreeNode root) {  // root, left, right

        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr = root;
        while (stack.size() > 0) {

            curr = stack.pop();
            System.out.print(curr.val + " -> ");
            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);

            }


        }


    }



    static void postOrder_withoutRecursive(TreeNode root) {






    }

    public static void main(String[] args) {

        MyTree tree = new MyTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.left.left = new TreeNode(8);
        tree.root.left.left.right = new TreeNode(9);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);


        System.out.println(inorderTraversal(tree.root));

        System.out.println("-----------------------------------------");


        preOrderTraversal2(tree.root);

        System.out.println();

        System.out.println("-----------------------------------------");

        System.out.println("postOrder-Traversal");
        System.out.println();
        postOrder_withoutRecursive(tree.root);


    }


}

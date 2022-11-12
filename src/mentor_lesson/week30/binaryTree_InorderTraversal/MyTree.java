package mentor_lesson.week30.binaryTree_InorderTraversal;

import java.util.*;

public class MyTree {

    TreeNode root;

    public MyTree() {
    }

    //left - root - right
    public static List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();

        while (!stack.isEmpty() || root != null){

            while (root != null){
                stack.push(root);//3,5
                root = root.left;
            }
            root = stack.pop(); // 4,2,1
            list.add(root.val); // 4,6,2,1,5,3
            root = root.right; // 6,3


        }

        return list;
    }


    public static void main(String[] args) {

        MyTree tree = new MyTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println(inorderTraversal(tree.root));

    }


}

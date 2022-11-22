package mentor_lesson.week30.sum_depthOfEachNodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyTree {

    TreeNode root;

    public MyTree() {
    }

    //left - root - right

    public static int sum_depth_eachNodes(TreeNode root) {

        int count = 0;

        TreeNode current = root;

            if (current.left != null && current.right != null) {

                count += 2;

            }

        current = current.left;

            if (current.left != null && current.right != null) {

                count += 4;

            }


        current = current.left;

            if (current.left != null && current.right != null) {

                count += 6;

            }

           current = root.right;

            if (current.right != null && current.left != null){
                count += 4;
            }


        return count;


    }


    public static int sum_depth_eachNodes2(TreeNode root) {



        TreeNode curr = root;


        int sum = 0;
        for (int i = 1; i <= 3; i++) {

            if (i == 1) {
                if (curr.left != null) {
                    sum++;
                }
                if (curr.right != null) {
                    sum++;
                }
            }

            curr = root.left;

            if (i == 2) {
                if (curr.left != null && curr.left != null) {
                    sum += 4;
                }
                if (curr.right != null && curr.right != null) {
                    sum += 4;
                }
            }


            curr = root.left.left;


            if (i == 3) {
                if (curr.left != null) {
                    sum += 3;
                }
                if (curr.right != null) {
                    sum += 3;
                }
            }


        }

        return sum;

    }




    public static void main(String[] args) {

        MyTree tree = new MyTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.left.left = new TreeNode(6);
        tree.root.left.left.right = new TreeNode(7);
        tree.root.right.left = new TreeNode(8);
        tree.root.right.right = new TreeNode(9);



        int i = sum_depth_eachNodes2(tree.root);
        System.out.println("i = " + i);


    }


}

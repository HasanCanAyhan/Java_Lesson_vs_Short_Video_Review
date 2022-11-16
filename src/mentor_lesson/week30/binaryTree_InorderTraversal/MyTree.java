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

    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TreeNode>  queue=new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while(!queue.isEmpty()){
            TreeNode toVisit=queue.poll();
            //poll:Retrieves and removes the head of this queue, or returns null if this queue is empty.
            System.out.print(toVisit.val+", ");
            if (toVisit.left!=null){
                queue.add(toVisit.left);
                sum += height(toVisit);
            }


            if (toVisit.right!=null) {
                queue.add(toVisit.right);
                sum += height(toVisit);
            }

        }

        System.out.println("sum = " + sum);
    }

    int height(TreeNode root){

        if (root == null) return -1;

        if (isLeaf(root)) return 0;

        return 1 + Math.max(height(root.left), height(root.right));

    }

    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
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

        System.out.println();


        tree.levelOrderTraversal();


    }


}

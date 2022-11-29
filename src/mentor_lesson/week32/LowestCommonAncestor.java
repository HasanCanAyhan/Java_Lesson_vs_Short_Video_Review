package mentor_lesson.week32;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LowestCommonAncestor {

    TNode root;

    public LowestCommonAncestor() {
    }








    public int lowestCommonAncestor(TNode root, int p, int q) {

        if (root == null) return -1;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(root.value);
        stack2.push(root.value);
        TNode curr = root;

        while (!stack1.isEmpty() && curr != null){

            if (curr.leftChild != null && curr.leftChild.value != p ){
                if (curr.rightChild .value == p ){
                    curr = curr.rightChild;
                    stack1.push(curr.value);
                    break;
                }else {
                    curr = curr.leftChild;
                    stack1.push(curr.value);
                }

            }


        }

        if (curr.value == p){

            curr = root;

            while (!stack2.isEmpty() && curr != null){

                if (curr.rightChild != null && curr.rightChild.value != q ){
                    if (curr.leftChild .value == q ){
                        curr = curr.leftChild;
                        stack2.push(curr.value);
                        break;
                    }else {
                        curr = curr.rightChild;
                        stack2.push(curr.value);
                    }

                }


            }


        }

        System.out.println(stack1);
        System.out.println(stack2);

        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() != stack2.peek()){
            stack1.pop();
            stack2.pop();
        }


        return stack1.peek();




    }


    public static void main(String[] args) {

        LowestCommonAncestor tree
                = new LowestCommonAncestor();
        tree.root = new TNode(1);
        tree.root.leftChild = new TNode(2);
        tree.root.rightChild = new TNode(3);
        tree.root.leftChild.leftChild = new TNode(4);
        tree.root.leftChild.rightChild = new TNode(5);
        tree.root.rightChild.leftChild = new TNode(6);
        tree.root.rightChild.rightChild = new TNode(7);

        VisualizeTree.printTree(tree.root,null,false);

        int i = tree.lowestCommonAncestor(tree.root, 5, 6);
        System.out.println("i = " + i);

    }



}

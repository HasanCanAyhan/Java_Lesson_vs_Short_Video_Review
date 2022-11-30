package mentor_lesson.week32.lowestCommonAncestor;


import java.util.Stack;

//https://youtu.be/13m9ZCB8gjw
//https://youtu.be/_-QHfMDde90

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

            if (curr.leftChild != null &&  curr.leftChild.value != p ){
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




    } // hard coded


    public TNode lowestCommonAncestor_recursive(TNode root, TNode p, TNode q){

        if (root == null) return null;

        if (root == p || root == q){
            return root;
        }


        //Result
        TNode leftNode = lowestCommonAncestor_recursive(root.leftChild, p, q);
        TNode rightNode = lowestCommonAncestor_recursive(root.rightChild, p, q);

        if (leftNode == null && rightNode == null) return null;
        if (leftNode != null && rightNode != null) return root;

        return (leftNode != null) ? leftNode : rightNode;




        /*
        if (leftNode == null){
            return rightNode;
        } else if (rightNode == null) {
            return leftNode;
        }else { // both left && right node are not null, give the root
            return root;
        }


         */
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

        System.out.println("------------------------");


        LowestCommonAncestor tree1
                = new LowestCommonAncestor();
        TNode a = new TNode(1);
        TNode b = new TNode(2);
        TNode c = new TNode(3);
        TNode d = new TNode(4);
        TNode e = new TNode(5);
        TNode f = new TNode(6);
        TNode g = new TNode(7);

        tree1.root = a;
        tree.root.leftChild = b;
        tree.root.rightChild = c;
        tree.root.leftChild.leftChild = d;
        tree.root.leftChild.rightChild = e;
        tree.root.rightChild.leftChild = f;
        tree.root.rightChild.rightChild = g;


        TNode tNode = tree1.lowestCommonAncestor_recursive(tree.root, e, f);
        System.out.println(tNode.value);

    }



}

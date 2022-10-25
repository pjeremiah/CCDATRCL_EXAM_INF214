// Binary Tree in Java
public class Exam {

    public static void main(String[] args) {

        // Do not remove
        Node A;
        Node B;
        Node C;
        Node D;
        Node E;
        Node F;
        Node G;
        Node H;
        Node I;

        // Part 1: Binary Tree Traversal
        // Print the required string pattern by constructing a binary tree and traverse
        // each node using a specific traversal method.

        System.out.println("1. Print the last six digits of your student number using IN-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        A = new Node('1');
        B = new Node('0');
        C = new Node('9');
        D = new Node('4');
        E = new Node('1');
        F = new Node('4');

        E.left = D;
        E.right = F;

        D.left = B;

        B.left = A;
        B.right = C;

        System.out.print("\nIn-Order Traversal: ");
        traverseInOrder(E);

        // ===========================================================================================
        System.out.println("");
        System.out.println("2. Print last six digits of your student number using PRE-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        A = new Node('1');
        B = new Node('0');
        C = new Node('9');
        D = new Node('4');
        E = new Node('1');
        F = new Node('4');

        A.left = B;
        A.right = F;

        B.left = C;

        C.left = D;
        C.right = E;


        System.out.print("\nPre-Order Traversal: ");
        traversePreOrder(A);

        // ===========================================================================================
        System.out.println("");
        System.out.println("3. Print last six digits of your student number using POST-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        A = new Node('1');
        B = new Node('0');
        C = new Node('9');
        D = new Node('4');
        E = new Node('1');
        F = new Node('4');

        F.left = D;
        F.right = E;

        D.left = C;

        C.left = A;
        C.right = B;

        System.out.print("\nPost-Order Traversal: ");
        traversePostOrder(F);

        // ===========================================================================================
        // Part 2: Binary Expression Tree
        // Print the expression by constructing a binary expression tree and traverse
        // each node using INORDER traversal

        System.out.println("");
        System.out.println("4. Print the expression \"(8 + 4) * (7 - 9)\" using IN-ORDER Traversal");
        A = new Node('+');
        B = new Node('*');
        C = new Node('-');
        D = new Node('8');
        E = new Node('4');
        F = new Node('7');
        G = new Node('9');

        C.left = B;
        C.right = G;

        B.left = A;
        B.right = F;

        A.left = D;
        A.right = E;

        System.out.print("\nIn-Order Traversal: ");
        traverseInOrder(C);

        // ===========================================================================================
        System.out.println("");
        System.out.println("5. Print the expression \"5 / 8 + 3 - 6 * 1\" using IN-ORDER Traversal");
        A = new Node('/');
        B = new Node('+');
        C = new Node('-');
        D = new Node('*');
        E = new Node('5');
        F = new Node('8');
        G = new Node('3');
        H = new Node('6');
        I = new Node('1');

        C.left = B;
        C.right = D;

        B.left = A;
        B.right = G;

        A.left = E;
        A.right = F;

        D.left = H;
        D.right = I;

        System.out.print("\nIn-Order Traversal: ");
        traverseInOrder(C);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}

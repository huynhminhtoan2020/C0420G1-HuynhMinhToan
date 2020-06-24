package bai12_Java_Collection_Map_Tree.baiTap;

public class BaiTap2_PostOrder_BST {
    //tao 1 class chua Node, right vaf left hien tai:
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // tao lop cay nhi phan
    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        // tao ham duyet postorder:  goi lai ham de quy (Node node)
        void printPostorder(Node node) {
            if (node == null)
                return;
            // PostOrder theo kieu Left - Right - root
            // gia tri dau on left
            printPostorder(node.left);
            // gia tri thu 2 - on right
            printPostorder(node.right);
            // gia tri root
            System.out.print(node.key + " ");
        }

        // tuong tu lam cho duyet InOrder _ theo (Left- root-right)
        void printInorder(Node node) {
            if (node == null)
                return;
            printInorder(node.left);
            System.out.print(node.key + " ");
            printInorder(node.right);
        }

        // tuong tu cho preorder ( theo root- left- right)
        void printPreorder(Node node) {
            if (node == null)
                return;
            System.out.print(node.key + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }

        // de quy lai cac ham PostOrder/ InOrder/preOrder
        void printPostorder() {
            printPostorder(root);
        }

        void printInorder() {
            printInorder(root);
        }

        void printPreorder() {
            printPreorder(root);
        }

           public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(10);
            tree.root.left = new Node(22);
            tree.root.right = new Node(33);
            tree.root.left.left = new Node(44);
            tree.root.left.right = new Node(55);

            System.out.println("Duyet theo Preorder: ");
            tree.printPreorder();

            System.out.println("\n Duyet theo Inorder : ");
            tree.printInorder();

            System.out.println("\nDuyet theo Postorder: ");
           tree.printPostorder();
        }
    }
}

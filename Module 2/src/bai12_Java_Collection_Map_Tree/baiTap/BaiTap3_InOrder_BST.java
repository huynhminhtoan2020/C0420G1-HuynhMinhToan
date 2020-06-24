package bai12_Java_Collection_Map_Tree.baiTap;

public class BaiTap3_InOrder_BST {

    static class BinarySearchTree {
        class Node {
            int key;
            Node left, right;

            public Node(int item) {
                key = item;
                left = right = null;
            }
        }
        Node root;

        // Constructor
        BinarySearchTree() {
            root = null;
        }

        // tao ham insert()
        void insert(int key) {
            root = insertRec(root, key);
        }

         Node insertRec(Node root, int key) {

            if (root == null) {
                root = new Node(key);
                return root;
            }

                       if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);

            return root;
        }


        void inorder() {
            inorderRec(root);
        }


        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.println(root.key);
                inorderRec(root.right);
            }
        }
        public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
            tree.insert(50);
            tree.insert(30);
            tree.insert(12);
            tree.insert(40);
            tree.insert(19);
            tree.insert(60);
            tree.insert(55);
            tree.inorder();
        }
    }

}

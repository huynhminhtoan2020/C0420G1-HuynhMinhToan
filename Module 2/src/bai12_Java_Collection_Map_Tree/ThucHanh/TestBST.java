package bai12_Java_Collection_Map_Tree.ThucHanh;

public class TestBST {
    public static void main(String[] args) {
        BST <String> tree = new BST<>() ;
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jone");
        tree.insert("Messi");
        System.out.println("Inorder (sorted):");
        tree.inorder();
        System.out.println("The number of nodes is:" +tree.getSize());
    }
}

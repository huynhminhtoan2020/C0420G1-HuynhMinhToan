package bai12_Java_Collection_Map_Tree.ThucHanh;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
public interface Tree <E> {
        public boolean insert (E e);
        public void inorder();
        public int getSize();
    }

}

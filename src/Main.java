import sun.reflect.generics.tree.Tree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

//        System.out.println("Hien thi cay trung to: ");
//        tree.inorder();
//        System.out.println("\nHien thi cay tien to: ");
//        tree.preoder();
//        System.out.println("\nHien thi cay hau to: ");
//        tree.postoder();
//
//        System.out.println("\n");
//        tree.search(15);

//        System.out.println("\n\nTrước khi xóa 70:");
//        tree.inorder();
        tree.delete(30);
//        System.out.println("\nSau khi xóa 70:");
        tree.inorder();
    }
}

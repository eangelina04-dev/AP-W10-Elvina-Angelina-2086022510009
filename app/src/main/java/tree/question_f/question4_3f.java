package tree.question_f;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    List<TreeNode> children = new ArrayList<>();

    TreeNode(int data) {
        this.data = data;
    }
}

public class question4_3f {
    static void printAtDepth(TreeNode node, int currentDepth, int targetDepth) {

        if (node == null || currentDepth > targetDepth) {
            return;
        }

        if (currentDepth == targetDepth) {
            System.out.print(node.data + " ");
            return; // jangan turun lagi
        }

        for (TreeNode child : node.children) {
            printAtDepth(child, currentDepth + 1, targetDepth);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        root.children.add(n2);
        root.children.add(n3);
        root.children.add(n4);

        n3.children.add(n5);
        n3.children.add(n6);

        int n = 1; 

/*
 Tree Structure:
 Root node: 1
 Children of 1: 2, 3, 4
 Children of 3: 5, 6

 Visual representation:

        1
      / | \
     2  3  4
       / \
      5   6

Output (The nodes in depth (1: The Test Case): 2 3 4
*/

        printAtDepth(root, 0, n);
    }
}


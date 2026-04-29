package tree.question_e;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int data;
    List<TreeNode> children = new ArrayList<>();

    TreeNode(int data) {
        this.data = data;
    }
}

public class question4_3e {
    static void printLeafBFS(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.children.isEmpty()) {
                System.out.print(current.data + " ");
            }

            for (TreeNode child : current.children) {
                queue.add(child);
            }
        }
    }

    // Test Case
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

Output(the leaf node): 2 4 5 6
*/
    printLeafBFS(root);
    }
}


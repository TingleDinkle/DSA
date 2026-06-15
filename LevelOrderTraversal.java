// =============================================================
// Figures 27–32: Level Order Traversal (BFS) of Binary Tree
// using Recursion — O(n) time and O(n) space
// =============================================================

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    // Figure 27: Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    // Figure 28: Level Order recursive
    static void levelOrderRecursive(Node root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        // Add a new level if needed
        if (level >= result.size()) {
            result.add(new ArrayList<>());
        }
        // Add the node's data based on the level
        result.get(level).add(root.data);

        // Recur for left and right children
        levelOrderRecursive(root.left, level + 1, result);
        levelOrderRecursive(root.right, level + 1, result);
    }

    // Figure 29: Traverse function
    static List<List<Integer>> traverse(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderRecursive(root, 0, result);
        return result;
    }

    // Figure 30: Main function
    public static void main(String[] args) {
        //         5
        //        / \
        //       3   8
        //      / \   \
        //     2   4   9

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        List<List<Integer>> result = traverse(root);

        // Print level by level (Figure 31 & 32: Output / Tree structure)
        System.out.println("Level Order Traversal:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Level " + i + ": " + result.get(i));
        }
    }
}

// ---- Figure 31: Expected Output ----
/*
Level Order Traversal:
Level 0: [5]
Level 1: [3, 8]
Level 2: [2, 4, 9]
*/

// ---- Figure 32: Tree structure ----
/*
         5
        / \
       3   8
      / \   \
     2   4   9
*/

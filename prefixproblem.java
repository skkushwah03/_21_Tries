package _21_Tries;

public class Prefiproblem {
    static class Node {   // <-- make it static
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void main(String[] args) {
        String arr[] = {"apple", "app", "mango", "man", "woman"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
}
 
// package _21_Tries;

// public class Prefiproblem {
//     class Node {
//         Node[] children = new Node[26];
//         boolean eow = false;
//         int freq;

//         public Node() {
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//             freq = 1;
//         }
//     }
//     public static Node root = new Node();
//     public static void insert(String word) {
//         Node curr = root;
//         for (int level = 0; level < word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if (curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             } else {
//                 curr.children[idx].freq++;
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static void main(String[] args) {
//         String arr[]={"apple","app","mango","man","woman"};
//         for(int i=0;i<arr.length;i++){
//             insert(arr[i]);
//         }
//     }
// }

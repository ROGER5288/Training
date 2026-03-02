package Heap;

import java.util.PriorityQueue;

//Node class
class Node {
	 char ch;
	 int freq;
	 Node left, right;
	
	 Node(char ch, int freq) {
	     this.ch = ch;
	     this.freq = freq;
	 }
	
	 Node(int freq, Node l, Node r) {
	     this.freq = freq;
	     this.left = l;
	     this.right = r;
	 }
	}
	
	public class HuffmanCoding {
	
	
	 // ================= LOGIC FUNCTION =================
	 static Node buildHuffman(char[] chars, int[] freq) {
	
	     PriorityQueue<Node> pq =
	             new PriorityQueue<>((a,b) -> a.freq - b.freq);
	
	     // add nodes to heap
	     for(int i = 0; i < chars.length; i++) {
	         pq.add(new Node(chars[i], freq[i]));
	     }
	
	     // build tree
	     while(pq.size() > 1) {
	
	         Node left = pq.poll();
	         Node right = pq.poll();
	
	         Node parent = new Node(left.freq + right.freq, left, right);
	
	         pq.add(parent);
	     }
	
	     return pq.poll(); // root
	 }
	
	
	 // ================= PRINT CODES =================
	 static void printCodes(Node root, String code) {
	
	     if(root == null) return;
	
	     // leaf node
	     if(root.left == null && root.right == null) {
	         System.out.println(root.ch + " : " + code);
	     }
	
	     printCodes(root.left, code + "0");
	     printCodes(root.right, code + "1");
	 }
	 
	 // ================= MAIN =================
	 public static void main(String[] args) {
	
	     char[] chars = {'a','b','c','d','e','f'};
	     int[] freq  = {5,9,12,13,16,45};
	
	     Node root = buildHuffman(chars, freq);
	
	     System.out.println("Huffman Codes:");
	     printCodes(root, "");
	 }
}

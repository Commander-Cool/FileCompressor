
public class Node implements java.io.Serializable {
	
	char value;
	int freq;
	Node left;
	Node right;
	
	public Node (int f, Node l, Node r) {
		this.freq = f;
		this.left = l;
		this.right = r;
		this.value = 0;
	}
	
	public Node (char v, int f) {
		this.value = v;
		this.freq = f;
	}
	
	
}

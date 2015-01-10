import java.util.ArrayList;

public class HuffmanTree {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Row, Row, Row Your Boat";
		Nodes nodes = new Nodes();
		ArrayList<Integer> freq = new ArrayList<Integer>();
		freq = nodes.freq(string);
		System.out.println(freq);
	}
}

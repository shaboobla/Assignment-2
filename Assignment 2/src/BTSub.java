
public class BTSub extends BinaryTree {

	public void preOrderNumber(Node focusNode) {
		int n = 0;
		if (focusNode != null){
			++n;
			focusNode.preOrderNum = n;
			
			preOrderNumber(focusNode.leftChild);
			
			preOrderNumber(focusNode.rightChild);
		}

	}

	public void inOrderNumber() {

	}

	public void postOrderNumber() {

	}

	public static void main(String[] args) {

		BTSub bt = new BTSub();

		bt.addNode(50, 'a');
		bt.addNode(25, 'b');
		bt.addNode(15, 'c');
		bt.addNode(30, 'd');
		bt.addNode(75, 'e');
		bt.addNode(65, 'f');
		bt.addNode(85, 'g');

	}
}

/* class Nodes {

	
	int key;
	char chr;

	Nodes leftChild;
	Nodes rightChild;

	public Nodes(int key, char chr) {
		this.key = key;
		this.chr = chr;
	}

	public String toString() {
		return chr + " has a key of " + key;
	}
} */


public class BTSub extends BinaryTree {

	public int preOrderNumber() {

	}

	public int inOrderNumber() {

	}

	public int postOrderNumber() {

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

class Node {

	int preOrderNum;
	int inOrderNum;
	int postOrderNum;

}

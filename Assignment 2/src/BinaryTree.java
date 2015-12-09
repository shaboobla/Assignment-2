
public class BinaryTree {

	Node root;

	public void addNode(int key, char chr) {
		Node newNode = new Node(key, chr);
		if (root == null)
			root = newNode;
		else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}

	}

	public void preOrderNext(Node focuseNode) {

	}

	public void inOrderNext(Node focuseNode) {

	}

	public void postOrderNext(Node focuseNode) {

	}

	public void preOrderTraverse(Node focusNode) {
		if (focusNode != null) {

			System.out.println(focusNode);

			preOrderTraverse(focusNode.leftChild);

			preOrderTraverse(focusNode.rightChild);

		}
	}

	public void inOrderTraverse(Node focusNode) {

		if (focusNode != null) {
			inOrderTraverse(focusNode.leftChild);

			System.out.println(focusNode);

			inOrderTraverse(focusNode.rightChild);

		}
	}

	public void postOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			postOrderTraverse(focusNode.leftChild);

			postOrderTraverse(focusNode.rightChild);

			System.out.println(focusNode);
		}
	}

	public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50, 'a');
		theTree.addNode(25, 'b');
		theTree.addNode(15, 'c');
		theTree.addNode(30, 'd');
		theTree.addNode(75, 'e');
		theTree.addNode(65, 'f');
		theTree.addNode(85, 'g');

		theTree.inOrderTraverse(theTree.root);
		System.out.println();
		theTree.postOrderTraverse(theTree.root);
		System.out.println();
		theTree.preOrderTraverse(theTree.root);

	}
}

class Node {

	int key;
	char chr;

	Node leftChild;
	Node rightChild;

	Node(int key, char chr) {
		this.key = key;
		this.chr = chr;
	}

	public String toString() {
		return chr + " has a key of " + key;
	}
}

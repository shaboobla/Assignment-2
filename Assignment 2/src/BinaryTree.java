
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
						parent.leftChild.parent = parent;
						return;
					} else {
						focusNode.parent = parent;
					}

				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						parent.rightChild.parent = parent;
						return;
					} else {
						focusNode.parent = parent;
					}
				}
			}
		}

	}

	public void inOrderNext(Node x) {

		Node check = root;

		if (x.key <= check.key) {
			while (check != x) {
				if (check.leftChild != null)
					check = check.leftChild;

			}
			if (check == x) {
				if (check.rightChild != null) {
					check = check.rightChild;
					System.out.println(check);
				} else {
					check = check.parent;
					if (check == null)
						System.out.println("There is only one node in this Tree.");
					else
						System.out.println(check);
				}

			}

		}
		if (x.key > check.key){
			while(check != x){
				if(check.rightChild != null)
					check = check.rightChild;
			}
			
			if(check == x){
				if(check.rightChild != null){
					check = check.rightChild;
					System.out.println(check);
					
				} else System.out.println("The next value is null.");
			}
		}
	}

	public void preOrderNext(int key) {

	}

	public void postOrderNext(int key) {

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

		theTree.inOrderNext(25);
		/* theTree.preOrderTraverse(theTree.root);
		System.out.println();
		theTree.inOrderTraverse(theTree.root);
		System.out.println();
		theTree.postOrderTraverse(theTree.root); */

	}
}

class Node {

	int key;
	char chr;

	Node parent;
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

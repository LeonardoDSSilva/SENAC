public class Arvore {
	No<Integer> root = null;

	public void insert(int info, No<Integer> place) {
		if (place == null) {
			root = new No<Integer>(info);
			System.out.println("Root: " + root.info);
		} else if (info < place.info) {
			if (place.left == null) {
				place.left = new No<Integer>(info);
				System.out.println("Left: " + place.left.info);
			} else {
				insert(info, place.left);
			}
		} else if (info > place.info) {
			if (place.right == null) {
				place.right = new No<Integer>(info);
				System.out.println("Right: " + place.right.info);
			} else {
				insert(info, place.right);
			}
		}
	}

	public void inOrder(No<Integer> place) {
		if (place.left != null) {
			inOrder(place.left);
		}
		System.out.print(" " + place.info);
		if (place.right != null) {
			inOrder(place.right);
		}
	}

	public void preOrder(No<Integer> place) {
		System.out.print(" " + place.info);
		if (place.left != null) {
			preOrder(place.left);
		}
		if (place.right != null) {
			preOrder(place.right);
		}
	}

	public void postOrder(No<Integer> place) {
		if (place.left != null) {
			postOrder(place.left);
		}
		if (place.right != null) {
			postOrder(place.right);
		}
		System.out.print(" " + place.info);
	}
}

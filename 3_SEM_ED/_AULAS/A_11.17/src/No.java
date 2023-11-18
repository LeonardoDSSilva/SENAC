public class No<T> {
	T info;
	No<T> left;
	No<T> right;

	public No(T info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}
}
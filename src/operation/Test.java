package operation;

public class Test {
	public static void main(String[] args) {
		Thread th = new Thread(BookManager.bm);
		th.start();
	}
}

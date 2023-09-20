
public class NumberBox {

	public static void main(String[] args) {
		// Number Box
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			System.out.printf("% 4d", num);
			if (num % 10 == 0) {
				System.out.println();
			}
		}

	}

}

package starTreeAssesment;

public class StarTree {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 8; i++) {
			for (j = 7; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

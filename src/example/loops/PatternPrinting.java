package example.loops;

public class PatternPrinting {

	public static void main(String[] args) {
		// pattern printing using for loop
		// square pattern
		int z = 5;

		for (int m = 1; m <= z; m++) {
			for (int n = 1; n <= z; n++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// increasing triangle
		for (int x = 1; x <= z; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------");
		// decreasing triangle
		for (int a = 1; a <= z; a++) {
			for (int b = a; b <= z; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-----------");

		// right sided triangle
		for (int o = 1; o <= z; o++) {
			for (int p = o; p <= z; p++) {
				System.out.print("  ");
			}
			for (int p = 1; p <= o; p++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}

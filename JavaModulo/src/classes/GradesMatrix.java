package classes;

public class GradesMatrix {
	public static void main(String[] args) {

		String names[][] = { { "cassiano", "caio" }, { "marcos", "jao" } };
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length; j++) {
				System.out.println("Name{"+i+"-"+j+"]: "+names[i][j]);
			}
		}
	}
}

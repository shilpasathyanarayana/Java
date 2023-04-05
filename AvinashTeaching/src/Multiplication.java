/**
 * 
 */

/**
 * @author shilp
 *
 */
public class Multiplication {

	public void calculation(int table, int from, int to) {
		for (int i =from; i <=to; i++) {
			System.out.printf("%d *%d = %d", table, i, table * i);
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.calculation(5, 1, 10);
	}

}

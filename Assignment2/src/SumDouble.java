
public class SumDouble {

	public static void main(String[] args) {
		double total = 0;
		for (int i = 0; i < args.length; i++) {
			double num = Double.parseDouble(args[i]);
			total = total + num;
		}
		System.out.println(total);
	}

}

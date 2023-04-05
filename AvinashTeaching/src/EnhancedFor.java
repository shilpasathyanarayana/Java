
public class EnhancedFor {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Shilpa";
		names[1] = "Avinash";
		names[2] = "Ruby";
		names[3] = "Khushnoor";
		names[4] = "Mandeep Bitch";

		for (int i = 0; i < 3; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		int i = 0;
		while (i < 3) {
			System.out.println(names[i]);
			i++;
		}
		System.out.println();
		for (String name : names) {
			System.out.println(name);
		}
	}

}

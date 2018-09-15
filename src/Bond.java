
public class Bond {

	public Bond() {

	}

	void findCode(Vault vault) {
		for (int i = 0; i < 1000001; i++) {
			System.out.println("Trying code..." + i);
			if (vault.tryCode(i)) {
				System.out.println("You have found the code! The code was " + i);
				break;
			}
		}
	}
}

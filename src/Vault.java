import java.util.Random;

public class Vault {

	Random rand = new Random();

	public int vaultCode = rand.nextInt(1000001);
	public int codeAttempt;
	public boolean codeTrue;

	public Vault() {

	}

	boolean tryCode(int codeAttempt) {

		if (codeAttempt == vaultCode) {
			return true;

		} else {
			return false;
		}
	}
}

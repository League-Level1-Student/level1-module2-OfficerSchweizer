import java.util.Random;

public class Vault {

	Random rand = new Random();

	public int vaultCode = rand.nextInt(100);
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
	
	
	
	
//	void tryCode(int codeAttempt) {
//
//		if (codeAttempt == vaultCode) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//		
//	}
	
	
}

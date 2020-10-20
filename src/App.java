public class App {

	public static void main(String[] args) {
		System.out.println("La suma de los números primos que hay entre los 50 primeros números: " + addPrimeNumbersUpto50());
		System.out.println("La suma de los 50 primeros números primos: " + add50FirstPrimeNumbers());
	}

	public static int addPrimeNumbersUpto50() {
		int result = 0;

		for (int i = 1; i <= 50 ; i++) {
			if (isPrime(i)) {
				result += i;
			}
		}
		return result;
	}

	public static int add50FirstPrimeNumbers() {
		int result = 0;
		int primeCounter = 0;
		int i = 1;

		while (primeCounter < 50) {
			if (isPrime(i)) {
				result += i;
				primeCounter++;
			}
			i++;
		}
		return result;
	}

	public static boolean isPrime(int n) {
		if (n==2) return true;

		if (n < 2 || n%2 == 0)  {
			return false;
		}

		for(int i=3; i*i <= n; i+=2) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
package java.calculate;

public class Subtraction {
	/**
	 * 別クラスのコンストラクタを呼び出す
	 * テスト対象メソッド
	 */
	public void subtract() {
		Multiple multiple = new Multiple();
	}

	Multiple muliple;

	/**
	 * staticメソッドと依存関係のある
	 * テスト対象メソッド
	 * @param a
	 * @param b
	 * @return
	 */
	public int subtract(int a, int b) {
		int sum;

		try {
			sum = a - Multiple.staticMulti(b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return sum;
	}

}

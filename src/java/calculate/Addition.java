package java.calculate;

public class Addition implements AdditionIF {

	private Multiple multiple = new Multiple();
	Squared squared = new Squared();

	/**
	 * スタブ化使用サンプル用
	 * テスト対象メソッド
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		int sum;
		try {

			sum = a + this.multiple.multi(a, b);

		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return sum;
	}
	/**
	 * finalメソッドと
	 * 依存関係のあるテスト対象メソッド
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b, int c) {
		int sum;

		try {
			sum = a + b + this.squared.finalSquare(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return sum;
	}

}

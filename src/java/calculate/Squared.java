package java.calculate;

public class Squared {
	/**
	 * PowerMock確認用
	 * finalメソッド
	 * @param a
	 * @return
	 */
	public final int finalSquare(int a) {
		int resultNum;

		try {
			resultNum = a * a;

		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return resultNum;
	}

}

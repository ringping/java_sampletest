package java.calculate;

public class Multiple {

	/**
	 * PowerMock確認用コンストラクタ
	 */
	public Multiple() {
		System.out.println("コンストラクタが呼び出されました");
	}

	/**
	 * publicメソッド
	 * @param a
	 * @param b
	 * @return
	 */
	public int multi(int a, int b) {
		int resultNum;
		try {
			
			resultNum = a * b;

		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return resultNum;
	}

	/**
	 * PowerMock確認用staticメソッド
	 * @param a
	 * @return
	 */
	static int staticMulti(int a) {
		int resultNum;
		try {
			
			resultNum = 2 * a;
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return resultNum;
	}

	/**
	 * privateメソッドと
	 * 依存関係のあるテスト対象メソッド
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int multi(int a, int b, int c) {
		int resultNum;
		try {
			resultNum = a * b + privateMulti(c, c, c, c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return resultNum;
	}

	/**
	 * PowerMock確認用privateメソッド
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	private int privateMulti(int a, int b, int c, int d) {
		int resultNum;
		try {
			resultNum = (a + b) * (c + d);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
		return resultNum;
	}
}

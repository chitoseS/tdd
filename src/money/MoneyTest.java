//TODO
// $5 + 10 CHF = $10
// $5 * 2 = $10
// amountをprivateにする
// Dollarの副作用どうする
// Moneyの丸め処理をどうする

package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * TDD練習
 * 異なる通貨の為替レートに基づいて換算されているか確認する。
 *
 */
public class MoneyTest {
	/*
	 * Dollarクラスがない
	 * コンストラクタがない
	 * timesメソッドがない
	 * amountメソッドがない
	 */
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}

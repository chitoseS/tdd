//TODO
// []$5 + 10 CHF = $10
// [x]$5 * 2 = $10
// []amountをprivateにする
// []Dollarの副作用どうする
// [x]Moneyの丸め処理をどうする
// [x]equals
// []hashCode()

package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * TDD練習
 * 異なる通貨の為替レートに基づいて換算されているかテストする
 *
 */
public class MoneyTest {
	/*
	 * 副作用どうする
	 */
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}

	/*
	 * 第3章
	 * 5ドルは5ドルでなければならない
	 */
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}
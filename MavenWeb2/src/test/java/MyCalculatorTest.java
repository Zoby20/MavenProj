import static org.junit.Assert.*;

import org.junit.Test;

import com.jenk.MyCalculator;

public class MyCalculatorTest {

	@Test
	public void test1() {
		assertEquals(10,new MyCalculator().getsum(5,5));
	}
	@Test
	public void test2() {
		assertEquals(5,new MyCalculator().getsum(2,3));
	}
	@Test
	public void test3() {
		assertEquals(5,new MyCalculator().getdiff(10,5));
	}
	@Test
	public void test4() {
		assertEquals(0,new MyCalculator().getdiff(5,5));
	}


}

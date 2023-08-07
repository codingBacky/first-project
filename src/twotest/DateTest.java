package twotest;

import java.util.Date;

import org.junit.Test;

public class DateTest {
	@Test
	public void DateTest1() {
		System.out.printf("%1$tY년 %1$tm월 %1$td일\n", new Date() );
	}
}

package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Test;

import junit.framework.Assert;

public class DateUtilsTest {
@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
		System.out.println(DateUtils.isEqualOrFutureDate(date));
				DateUtils.isEqualOrFutureDate(date);
	}
@Test
public void deveRetornarTrueParaDatasPassadas() {
	LocalDate date = LocalDate.of(2010, 01, 01);
	Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
	System.out.println(DateUtils.isEqualOrFutureDate(date));
			DateUtils.isEqualOrFutureDate(date);
}
@Test
public void deveRetornarTrueParaDatasAtuais() {
	LocalDate date = LocalDate.now();
	Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	System.out.println(DateUtils.isEqualOrFutureDate(date));
			DateUtils.isEqualOrFutureDate(date);
}
}

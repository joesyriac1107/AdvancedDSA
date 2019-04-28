package academy.learnProgramming.algorithm.kmp;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class KnuthMorrisPratTest {
	
	KnuthMorrisPratt kmp;
	String pattern;
	String arr;
	@Before
	public void setup() {
		kmp = new KnuthMorrisPratt();
		pattern = "ababac";
		arr="abazacabababac";
	}
	
	@Test
	public void computeLongestSPTableTest() {
		int[] result = {0,0,1,2,3,0};
		Assert.assertTrue(Arrays.equals(result, kmp.computeLongestSPTable(pattern.toCharArray())));
		
	}

	@Test
	public void searchTest() {
		Assert.assertEquals(8, kmp.search(arr.toCharArray(), pattern.toCharArray()));
		
		
	}
}

package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringClassTests {

	@Test
	 void deepCompareTest() {
		String str1 = "123,tT89";
		String str2 = "123,tT89";
		String str3 = "19";
		String str4 = "kugy";
		String str5 = "98Tt,321";
		int expected1[] = {8, 0};
		int expected2[] = {1, 1};
		int expected3[] = {0, 8};
		int expected4[] = {0, 0};
		assertArrayEquals(expected1, Strings.deepNoRepetedCompare(str1, str2));
		assertArrayEquals(expected2, Strings.deepNoRepetedCompare(str1, str3));
		assertArrayEquals(expected3, Strings.deepNoRepetedCompare(str1, str5));
		assertArrayEquals(expected4, Strings.deepNoRepetedCompare(str1, str4));
	}
	
	@Test
	void isAnagramTests() {
		String str1 = "Hello";
		String str2 = "Helll";
		String str3 = "eloHl";
		String str4 = "Hel";
		String str5 = "����";
		String str6 = "����";
		assertTrue(Strings.isAnagram(str1, str3));
		assertFalse(Strings.isAnagram(str1, str2));
		assertFalse(Strings.isAnagram(str1, str4));
		assertTrue(Strings.isAnagram(str1, str1));
		assertTrue(Strings.isAnagram(str5, str6));
		assertFalse(Strings.isAnagram(str1, str6));
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findarray;

import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 *
 * @author chuck
 */
public class FindArrayImplTest extends TestCase {

	private MyFindArray arrayUtils = new MyFindArray();

	public void testFindArrayDoesntExist() {

		int[] largeArray = {1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {8, 9, 10};

		int expected = -1;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArrayExistSimple() {

		int[] largeArray = {1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {3, 4, 5};

		int expected = 2;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArrayExistFirstPosition() {

		int[] largeArray = {1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {1, 2, 3};

		int expected = 0;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArrayExistLastPosition() {

		int[] largeArray = {1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {5, 6, 7};

		int expected = 4;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArrayDoesntExistPartiallyEqual() {

		int[] largeArray = {1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {6, 7, 8};

		int expected = -1;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArrayExistPartiallyEqual() {

		int[] largeArray = {1, 2, 3, 1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {1, 2, 3, 4};

		int expected = 3;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArraySubArrayEmpty() {

		int[] largeArray = {1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {};

		int expected = 0;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArraySubArrayLargerThanArray() {

		int[] largeArray = {1, 2, 3, 4, 5, 6, 7};
		int[] subArray = {4, 5, 6, 7, 8, 9, 10, 11};

		int expected = -1;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

	public void testFindArrayExistsVeryComplex() {

		int[] largeArray = {1234, 56, -345, 789, 23456, 6745};
		int[] subArray = {56, -345, 789};

		int expected = 1;
		int actual = arrayUtils.findArray(largeArray, subArray);

		assertEquals(expected, actual);
	}

}

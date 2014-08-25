/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteration;

import iteration.Function2;
import iteration.MyFolder;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author chuck
 */
public class MyFolderTest {

	private final MyFolder<Integer, Integer> mf;

	public MyFolderTest() {
		this.mf = new MyFolder<Integer, Integer>();
		MyFolder<Object, Object> myFolder = new iteration.MyFolder<Object, Object>();
	}

	@Test
	public void testSomeMethod() {
		Queue<Integer> qe = new LinkedList<Integer>();

		for (int i = I; i > 0; i--) {
			qe.add(1);
			qe.add(2);
			qe.add(3);
		}
		Integer fold = mf.fold(0, qe, new Plus());

		Assert.assertEquals(new Integer(6*I), fold);
	}
	private static final int I = 100000;
	
	@Test
	public void listEmpty() {
		Queue<Integer> qe = new LinkedList<Integer>();
		Integer fold = mf.fold(0, qe, new Plus());

		Assert.assertEquals(new Integer(0),fold);
	}

	public class Plus implements Function2 {

		@Override
		public Object apply(Object t, Object u) {
			return (Integer) t + (Integer) u;
		}

	}
}

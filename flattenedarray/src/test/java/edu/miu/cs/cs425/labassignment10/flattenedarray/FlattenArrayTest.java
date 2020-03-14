package edu.miu.cs.cs425.labassignment10.flattenedarray;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlattenArrayTest {
	
private FlattenedArray flattenedArr=null;
	@Before
	public void setUp() throws Exception {
		flattenedArr= new FlattenedArray();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testFlattenArray() {
		int[] expected= {1,3,0,4,6};
		int[][] x= {{1,3},{0},{4,6}};
		int[][]y = null;
		int[] actual= flattenedArr.flattenArray(x);
		assertTrue(Arrays.equals(expected, actual));
	}
	@Test
	public void testFlattenArray2() {
		int[] expected2=null;
		
		int[][]actual2 = null;
		int[] actual= flattenedArr.flattenArray(actual2);
		assertTrue(Arrays.equals(actual, expected2));
	}

}

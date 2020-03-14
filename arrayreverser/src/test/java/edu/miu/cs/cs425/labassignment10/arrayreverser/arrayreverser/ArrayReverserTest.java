package edu.miu.cs.cs425.labassignment10.arrayreverser.arrayreverser;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import edu.miu.cs.cs425.labassignment10.arrayreverser.arrayreverser.service.InterfaceReverseArray;
public class ArrayReverserTest {
private ArrayReverser arryRev;
	private InterfaceReverseArray iarryRev= mock(InterfaceReverseArray.class);
	@Before
	public void setUp() throws Exception {
		this.arryRev= new ArrayReverser(iarryRev);
	}

	@After
	public void tearDown() throws Exception {
		this.arryRev=null;
	}

	@Test
	public void testComputeReverseArray() {
		int[] expected= new int[]{9,4,0,3,1};
		int[][] x=new int[][] {{1,3},{0},{4,9}};
		//Integer[][] inputArray = new Integer[][] { { 1, 3 }, { 0 }, { 4, 5, 9 } };

		when(iarryRev.computeReverseArray(new int[][] {{1,3},{0},{4,9}})).thenReturn(new int[] {9,4,0,3,1 });

		int[] actual = arryRev.computeReverseArray(x);
		
		assertArrayEquals(expected, actual);
		verify(iarryRev).computeReverseArray(x);
		
	}

	@Test
	public void testComputeReverseArrayNull() {
		int[] expected= null;
		int[][] x=null;
		when(iarryRev.computeReverseArray(new int[][] {{1,3},{0},{4,9}})).thenReturn(new int[] {9,4,0,3,1 });

		int[] actual = arryRev.computeReverseArray(x);
		
		assertArrayEquals(expected, actual);
		verify(iarryRev).computeReverseArray(x);
		
	}
}

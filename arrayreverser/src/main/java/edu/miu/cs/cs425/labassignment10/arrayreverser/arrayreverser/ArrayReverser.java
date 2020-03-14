package edu.miu.cs.cs425.labassignment10.arrayreverser.arrayreverser;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import edu.miu.cs.cs425.labassignment10.arrayreverser.arrayreverser.service.InterfaceReverseArray;

public class ArrayReverser {

	private InterfaceReverseArray rsa;

	public ArrayReverser(InterfaceReverseArray rsa) {

		this.rsa = rsa;
	}

	public ArrayReverser() {
		
	}

	public static void main(String[] args) {
//		ArrayReverser rr = new ArrayReverser();
//		
//		int[][] x= {{1,3},{0},{4,6}};
//	System.out.println(Arrays.toString(rr.computeReverseArray(x)));
		
	}

	public int[] computeReverseArray(int[][] arry) {

		int[] reverse = rsa.computeReverseArray(arry);
		return Arrays.stream(reverse).boxed()
			     .sorted(Comparator.reverseOrder())
			     .mapToInt(i -> i).toArray();
	}
}

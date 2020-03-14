package edu.miu.cs.cs425.labassignment10.flattenedarray;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenedArray {

	public static void main(String[] args) {
//		int[][] x= {{1,3},{0},{4,6}};
//	System.out.println(Arrays.toString(flattenArray(x)));
	}
	
	
	public  int[] flattenArray(int[][] flatten) {
		if(flatten==null) return null;
	return Stream.of(flatten).flatMapToInt(n->Arrays.stream(n)).toArray();
	}

	
}

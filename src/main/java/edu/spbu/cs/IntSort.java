package edu.spbu.cs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//test commit
/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
  public static void sort (int array[]) {
    //Arrays.sort(array);
	  for (int i = 0; i < array.length - 1; i++)
		{
		    int j = i + 1;
			while ((j > 0) && (array[j] < array[j - 1]))
			{
	            int temp = array.array[j - 1];
	            array[j - 1] = array[j];
	            array[j] = temp;
	            j--;
			}
		}
  }

  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}

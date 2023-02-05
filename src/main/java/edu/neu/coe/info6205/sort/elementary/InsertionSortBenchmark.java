/**
 * 
 */
package edu.neu.coe.info6205.sort.elementary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.neu.coe.info6205.sort.BaseHelper;
import edu.neu.coe.info6205.sort.GenericSort;
import edu.neu.coe.info6205.util.Config;

/**
 * @author udaykiranreddy
 *
 */
public class InsertionSortBenchmark {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		

				if (args.length == 0)
		            throw new RuntimeException("Syntax: Insertion sort [experiments]");
		        for(int i=0;i<args.length;i++) {
		        int m = Integer.parseInt(args[i]);
		        reverseSorted(m);
				randomOrder(m);
				partiallySorted(m);
				fullySorted(m);
		        }

		        
			}
			private static void fullySorted(int n) throws Exception{
				final List<Integer> list = new ArrayList<>();
				for(int i=0;i<n;i++) {
//					list.add(i);
				}
				Integer[] xs = list.toArray(new Integer[0]);
		        
		        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(InsertionSortBenchmark.class));
		        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
		        long startTime = System.nanoTime();
		        sorter.sort(xs);
		        long endTime = System.nanoTime();
		        System.out.println("Time taken for Fully sorted array when n = " + n + " is " + (endTime-startTime)/Math.pow(10,6));
		        
				
			}
			
			private static void reverseSorted(int n) throws Exception{
				final List<Integer> list = new ArrayList<>();
				
				for(int i=n;i>0;i--) {
					list.add(i);
				}
				Integer[] xs = list.toArray(new Integer[0]);
		        
		        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(InsertionSortBenchmark.class));
		        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
		        long startTime = System.nanoTime();
		        sorter.sort(xs);
		        long endTime = System.nanoTime();
		        System.out.println();

		        System.out.println("Time taken for reverse sorted array when n =" + n + " is " + (endTime-startTime)/Math.pow(10,6));
				
			}
			
			private static void randomOrder(int n) throws Exception{
				final List<Integer> list = new ArrayList<>();
				Random random = new Random();
				for(int i=n;i>0;i--) {
					list.add(random.nextInt());
				}
				Integer[] xs = list.toArray(new Integer[0]);
		        
		        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(InsertionSortBenchmark.class));
		        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
		        long startTime = System.nanoTime();
		        sorter.sort(xs);
		        long endTime = System.nanoTime();
		        System.out.println("Time taken for random taken array when n = " + n + " is " + (endTime-startTime)/Math.pow(10,6));		
			}
			
			private static void partiallySorted(int n) throws Exception{
				final List<Integer> list = new ArrayList<>();
				Random random = new Random();
				for(int i=0;i<n/2;i++) {
					list.add(random.nextInt());
				}
				for(int i=n/2;i<n;i++) {
					list.add(i);
				}
				Integer[] xs = list.toArray(new Integer[0]);
		        
		        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(InsertionSortBenchmark.class));
		        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
		        long startTime = System.nanoTime();
		        sorter.sort(xs);
		        long endTime = System.nanoTime();
		        System.out.println("Time taken for partially ordered array when n = " + n + " is " + (endTime-startTime)/Math.pow(10,6));		
			}
		

	}



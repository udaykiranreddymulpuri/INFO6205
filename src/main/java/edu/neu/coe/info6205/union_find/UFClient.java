/**
 * 
 */
package edu.neu.coe.info6205.union_find;

import java.util.Random;

/**
 * @author udaykiranreddy
 *
 */
public class UFClient {

	/**
	 * @param args
	 */

	public static int count(int n) {

		int m = 0;

		UF_HWQUPC ufind = new UF_HWQUPC(n);
		Random random = new Random();

		while (ufind.components() >= 2) {
			int x = random.nextInt(n);
			int y = random.nextInt(n);
			if (!ufind.isConnected(x, y)) {// checking if the sites are connected
				ufind.union(x, y);// performing union operation on sites if they are not already connected
			}
			m++;
		}

		return m / 50;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		int m = 0;

		for (int i = 0; i < args.length; i++) {
			m = 0;
			n = Integer.valueOf(args[i]);
			for (int j = 0; j < 50; j++) {
				m += count(n);
			}

			System.out.println("Number of pairs generated for n ="+n+" is m="+m);
			

		}

	}

}



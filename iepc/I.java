
// "static void main" must be defined in a public class.
import java.util.Scanner;

import java.util.Arrays;

public class I{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int n = sc.nextInt();
        
        int cur = n;
        for (int i = 0; i < l - 1; i++) {
        	cur = cur / 2;
        	if (cur == 0) {
        		System.out.println("impossible");
        		return;
        	}
        }
        
        int[] a = new int[l];
        int[] b = null;
        a[0] = n;
        
        System.out.println(n);
        
        for (int i = 1; i < l; i++) {
        	b = new int[l];
        	for (int j = 0; j < i + 1; j++) {
        		if (j == 0) {
        			b[j] = a[j] / 2;
        		} else {
        			b[j] = a[j - 1] - b[j - 1];
        		}
        		if (j != i) {
        			System.out.printf("%d ", b[j]);
        		} else {
        			System.out.println(b[j]);
        		}
        	}
        	a = b;
        }
        
    }
}

package com.fgs.uva_online_judge;

import java.util.Scanner;

/*
1 10
100 200
201 210
900 1000
 */

public class Solution {
    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World!");
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.printf("%d %d %d\n", i, j, s.get_max_cycle(i, j));
        }
        //System.out.println(s.get_cycle(22, 1));
    }

    public int get_max_cycle(int i, int j) {
        int max = 0;
        for (int x = i; x <= j; x++) {ß
            int n = get_cycle(x, 1);
            if (max < n) max = n;
        }
        return max;
    }

    public int get_cycle(int i, int j) {
        int cnt = 0;
        int x = i;
        while (x > j) {
            //System.out.println(x);
            if (x % 2 == 1) {
                x =( x * 3) + 1;
            } else {
                x = x / 2;
            }
            cnt++;
        }
        return cnt + 1;
    }

}

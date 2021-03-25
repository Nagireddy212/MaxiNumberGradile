
package Bridgelabz;

import java.util.Arrays;
public class FindMaxNumber<N extends Comparable<N>> {
    N max;
    public N Maxtest(N...args){
        Arrays.sort(args);
        max = args[args.length - 1];
        return max;
    }
    public void printMax() {
        System.out.println(max);
    }

    public static void main(String[] args) {
        System.out.println("Find Maximum number");

    }
}
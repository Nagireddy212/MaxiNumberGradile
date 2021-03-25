
package Bridgelabz;

    public class FindMaxNumber <N extends Comparable<N>> {
        N A, B, C;
        N max;
        public FindMaxNumber(N A, N B, N C) {
            this.A = A;
            this.B = B;
            this.C = C;
    }
        public N Maxtest(){
            max = A;
            if(B.compareTo(max) > 0)
                max = B;
            if(C.compareTo(max) > 0)
                max = C;
            return max;
        }
    public static void main(String[] args) {
        System.out.println("Find Maximum number");

    }
}
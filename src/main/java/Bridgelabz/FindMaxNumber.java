package Bridgelabz;

public class FindMaxNumber {
    public Integer testMax(Integer A, Integer B, Integer C){
        int max = A;
        if(B.compareTo(max) > 0)
            max = B;
        if(C.compareTo(max) > 0)
            max = C;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Find Maximum number");
        FindMaxNumber FindMaxNumbers = new FindMaxNumber();
    }
}

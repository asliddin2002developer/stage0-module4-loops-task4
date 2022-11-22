package school.mjc.stage0.loops.task4;

public class TwoRangesSum {

    public static void main(String[] args) {
        printSumOfTwoRanges(10, 10);
    }
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        }else{
            int skip = numberToSkip;
            int sumSkipped = 0;
            int sumCount = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (i == skip){
                    sumSkipped+=skip;
                    skip += skip;

                }else {
                    sumCount += i;
                }

            }
        System.out.println("skipped sum is " +sumSkipped +
                "\ncounted sum is "+sumCount);
        }

    }
}

package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int skip = 3;
        for (int i = 1; i <= lastPrinted; i++){
            if (i == skip){
                skip += skip;
            }else {
                System.out.println(i);
            }

        }

    }
}

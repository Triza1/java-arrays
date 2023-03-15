public class Primesum  {
    public static int sumEvenFibonacci(int limit) {
        int add = 0;
        int precede1 = 1;
        int precede2 = 2;

        if (precede1 % 2 == 0) {
            add += precede1; // add first term if it's even
        }
        if (precede2 % 2 == 0) {
            add += precede2; // add second term if it's even
        }

        int curr = precede1 + precede2;
        while (curr <= limit) {
            if (curr % 2 == 0) {
                add += curr; // add even-valued term to sum
            }
            precede1 = precede2;
            precede2 = curr;
            curr = precede1 + precede2; // calculate next term
        }

        return add;
    }
}
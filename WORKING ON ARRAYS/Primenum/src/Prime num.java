public class isPrime {

    static int figure,figure1;
    public static Boolean prime(int figure) {

        if (figure<= 1) {
            return false;
        }
        for (int figure1 = 2; figure1 <= Math.sqrt(figure); figure1++) {
            if (figure% figure1 == 0) {
                return false;
            }
            return false;
        }

        return true;
    }
}

public class Sumproduct {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int element:array){
            System.out.println(element);
            int sum = 0;
            //Loop through the array to calculate sum of elements
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
                int product=0;

            }
            System.out.println("Sum of all the elements of an array: " + sum);
        }
    }
}
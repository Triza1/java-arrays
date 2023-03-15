public class Product {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int element:array){
            System.out.println(element);
            int product = 15*15;
            //Loop through the array to calculate sum of elements
            for (int i = 0; i < array.length; i++) {
                product = product + array[i];


            }
            System.out.println("product of all the elements of an array: " + product);
        }
    }
}
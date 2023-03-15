import java.util.Scanner;
public class CheckArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        {
            int figure;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the figure of elements you want to store: ");
            figure=sc.nextInt();
            int[] array = new int[15];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<figure; i++)
            {

                array[i]=input.nextInt();
            }
            System.out.println("Array elements are: ");
//
            for (int i=0; i<figure; i++)
            {
                System.out.println(array[i]);
            }
        }
    }


}


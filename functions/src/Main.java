import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //calculate min and max of 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = input.nextInt();

        System.out.println("Enter second number: ");
        int second = input.nextInt();

        System.out.println("Enter third number: ");
        int third = input.nextInt();

        int largest = largest(first,second,third);
        int smallest = smallest(first,second,third);
        System.out.println("largest number is: "+largest);
        System.out.println("smallest number is: "+ smallest);

        input.close();
    }

    private static int smallest(int a, int b, int c) {
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }

    static int largest(int a,int b,int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        //check if number is even or odd
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();
        if(isEven(number)){
            System.out.println(number+ " is even");
        }else{
            System.out.println(number+ " is odd");
        }
    }

    static boolean isEven(int number){
        if ((number %2)==0 ){
            return true;
        }else{
            return false;
        }
    }
}

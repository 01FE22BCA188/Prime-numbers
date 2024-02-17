import java.util.Scanner;

class primenumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        
        System.out.println("Prime numbers in the given range are: ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
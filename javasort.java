import java.util.Scanner;

public class javasort {

    // for display array
    public static int display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 100;
        int k = 0;
        while (k < m) {

            System.out.println("<-----WELCOME TO BUBBLE SORT ------>");
            System.out.println("Enter the how many numbers to be sorted:");
            int n = sc.nextInt();
            System.out.println("Enter the numbers:");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Numbers after sorting: ");
            display(arr);
            System.out.println("\nDo you want to continue?\n Enter -->1 if yes else -->0 ");
            int lp = sc.nextInt();
            if (lp == 1) {
                continue;
            } 
            else {
                System.out.println("Succesfully exited!");
                break;
            }
            
        }

    }
}

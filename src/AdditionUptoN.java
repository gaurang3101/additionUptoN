import java.util.Scanner;

public class AdditionUptoN {
    int n=0;
    int sum=0;
    public void adding() {
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public AdditionUptoN(int n) {
        this.n=n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any natural number - ");
        int number = sc.nextInt();
        AdditionUptoN addn = new AdditionUptoN(number);
        addn.adding();
    }
}

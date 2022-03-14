import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        boolean loop=true;
        Scanner sc2=new Scanner(System.in);
        while (loop){
            System.out.println("\nEnter your preferred bank :");
            System.out.println("\n1)SBI \n2)ICICI \n3)Federal Bank\n4)Exit\n");
            choice=sc2.nextInt();
            switch (choice) {
                case 1 -> {
                    Loan bank1 = new Loan("SBI", .10f, .08f, .12f, .07f);
                    bank1.menu();
                }
                case 2 -> {
                    Loan bank2 = new Loan("ICICI", .11f, .08f, .15f, .08f);
                    bank2.menu();
                }
                case 3 -> {
                    Loan bank3 = new Loan("Federal Bank", .12f, .09f, .13f, .085f);
                    bank3.menu();
                }
                case 4 -> loop = false;
                default -> System.out.println("\nEnter a valid Choice !");
            }
        }

    }
}

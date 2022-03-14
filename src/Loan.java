import java.util.Scanner;
import java.lang.*;

public class Loan {
    private String bank_name;
    private float personal_interest;
    private float house_interest;
    private float gold_interest;
    private float edu_interest;

    Scanner sc= new Scanner(System.in);

    Loan(String name,float p_int,float h_int,float g_int,float edu_int){
        bank_name=name;
        personal_interest=p_int;
        house_interest=h_int;
        gold_interest=g_int;
        edu_interest=edu_int;

    }
    public void menu() {

        System.out.println("\nEnter the loan type : ");
        System.out.println("1)Personal Loan \n2)House Loan \n3)Gold Loan\n4)Education Loan");
        int ln_type = sc.nextInt();
        switch (ln_type) {
            case 1 -> personalLoan();
            case 2 -> houseLoan();
            case 3 -> goldLoan();
            case 4 -> educationLoan();
        }
    }

    void personalLoan(){
        System.out.println("\nEnter the loan amount ");
        float p=sc.nextFloat();
        System.out.println("\nEnter the loan term in months (12,24,or 36)");
        int term= sc.nextInt();
        float n=term/12 ;
        double interest= p*(Math.pow((1+personal_interest),n)-1);
        print(interest,term,p,personal_interest);

    }
    void houseLoan(){
        System.out.println("\nEnter the loan amount ");
        float p=sc.nextFloat();
        System.out.println("\nEnter the loan term in months (24,48, or 120)");
        int term= sc.nextInt();
        float n=term/12 ;
        double interest= p*(Math.pow((1+personal_interest),n)-1);
        print(interest,term,p,house_interest);
    }
    void goldLoan(){
        System.out.println("\nEnter the weight of gold in grams ");
        float p= sc.nextFloat() * 4200;
        System.out.println("\nEnter the loan term in months (12,24,or 36)");
        int term= sc.nextInt();
        float n=term/12 ;
        double interest= p*(Math.pow((1+personal_interest),n)-1);
        print(interest,term,p,gold_interest);
    }
    void educationLoan(){
        System.out.println("\nEnter the loan amount ");
        float p=sc.nextFloat();
        System.out.println("\nEnter the loan term in months (24 or 48)");
        int term= sc.nextInt();
        float n=term/12 ;
        double interest= p*(Math.pow((1+personal_interest),n)-1);
        print(interest,term,p,edu_interest);
    }
    void print(double interest,int term,float amount,float rate){
        System.out.println("\n|***********************************|");
        System.out.println("\n*********Welcome to "+bank_name+"**********");
        System.out.println("\nThe Total Amount is : "+String.format("%.2f",amount));
        System.out.println("\nThe  interest rate is : "+rate*100+"%");
        System.out.println("\nThe Total interest is : "+String.format("%.2f",interest));
        System.out.println("\nThe loan term is : "+term+" months");
        System.out.println("\n|***********************************|");
    }
}

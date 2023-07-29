import java.util.Scanner;
public class MainClass {
    public static void main(String[] args){
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber=21012002;
        int atmpin=2002;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to ATM interface");
        System.out.println("Enter ATM number");
        int atmNumber=in.nextInt();
        System.out.println("Enter Pin: ");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin))
    {
    
    
        while (true) {
             System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View Main Statement\n5.Exit");
            System.out.println("Enter Choice:");
            int ch=in.nextInt();
            if(ch==1){
                op.viewBalance();
            }
            else if (ch==2) {
                System.out.println("Enter Withdrawn Amount");
                double withdrawAmount=in.nextDouble();
                op.withdrawAmount(withdrawAmount);

            }
            else if (ch==3) {
                System.out.println("Enter amount to drposit");
                double depositAmount=in.nextDouble();
                op.depositAmount(depositAmount);
            } 
            else if(ch==4){
                op.viewMiniStatement();
            }
            else if (ch==5) {
               System.out.println("Collect your ATM card\n Thank you for choosing ATM interface"); 
            }
            else{
                System.out.println("Please enter your correct choice");
            }
            }  

    }
    else{
        System.out.println("Incorrect Atm number or Pin");
        System.exit(0);
    }
    }
}

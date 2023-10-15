import java.util.Scanner;
public class BankingApplication{
    public static vid main(String[] args)
    {
        BankAccount obj1=new BankAccount("XYZ","RT71234");
        obj1.showMenu();
    }
}

class BankAccount
{
    int balance;
    int previoustrans;
    String customerName;
    String customerId;

    BankAccount(String cname,String cid)
    {
        customerName=cname;
        customerId=cid;
    }
    void deposit(int amount)
    {
        if(amount!=0)
        {
            balance=balance+amount;
            previoustrans=amount;
        }
    }

    void withdraw(int amount)
    {
        if(amount!=0)
        {
            balance=balance-amount;
            previoustrans=-amount;
        }
    }

    void getPreviousTrans()
    {
        if(previoustrans>0)
        {
            System.out.println("Deposited:"+previoustrans);
        }
        else if(previoustrans<0)
        {
            System.out.println("Withdrawn:"+Math.abs(previoustrans));

        }
        else
        System.out.println("o transaction occured");
    }
    void showMenu()
    {
     char option='\0';
      Scanner scan=new Scanner(System.in);

      System.out.println("WELCOME"+customerName);
      System.out.println("YOUR ID IS"+customerId);
      System.out.println("\n");
      System.out.println("A. CHECK BALANCE");
      System.out.println("B. DEPOSIT");
      System.out.println("C. WITHDRAW");
      System.out.println("D. Previous Transaction");
      System.out.println("E. Exit");

    }

        do
        {
            System.out.println("=============================================================");
            System.out.println("Enter an option");
            System.out.println("=============================================================");
            option = Scanner.next().charAt(0);
            System.out.println("\n");

            switch(option)
            {
                case 'A':
                    System.out.println("-------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("-------------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("-------------------------------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("-------------------------------");
                    int amount=Scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("-------------------------------");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("-------------------------------");
                    int amount2=Scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("-------------------------------");
                    getPreviousTrans();
                    System.out.println("-------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("=============================================");
                    break;
                
                default:
                    System.out.println("Invalid Option !!.please enter again");
                    break;
            }
        }while(option !='E');

        System.out.println("Thankyou for using services");
}
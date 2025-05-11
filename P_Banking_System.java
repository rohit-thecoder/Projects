package src;

import java.util.Scanner;

public class P_Banking_System {
    public static void main(String[] args) {

            double balance =1000;
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Enter PIN ");
                int p = sc.nextInt();
                if (p==1212){
                    System.out.println("You can procced");break;
                }else System.out.println("Invalid ");


            }
            while (true){
                System.out.println("Choice Option ");
                System.out.println("1. Deposit ");
                System.out.println("2. Withdraw ");
                System.out.println("3. Check the Balance ");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                if(choice ==1){
                    System.out.println("Enter the Deposit Amount :");
                    double depositAmount = sc.nextDouble();
                    if(depositAmount>0){
                        balance += depositAmount;
                        System.out.println("Deposit Amount :" +depositAmount);
                        System.out.println("Updated Balance :" + balance);

                    }
                    else {
                        System.out.println("Invalid Amount");
                    }
                }
                else if (choice ==2){
                    System.out.println("Enter the Withdraw Amount :");
                    double withdrawAmount = sc.nextDouble();
                    if(withdrawAmount<=balance && balance>0){
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn :"+ withdrawAmount);
                        System.out.println("Updated Balance:"+ balance);
                    }
                    else if (withdrawAmount>balance){
                        System.out.println("Insufficent Amount!");
                    }
                    else {
                        System.out.println("Invalid Amount!");
                    }
                }
                else if(choice ==3) {
                    System.out.println("Balance :" + balance);
                }
                else if (choice ==4){
                    System.out.println("thank you!");
                }
                else {
                    System.out.println("Wrong Choice , try again");

                }
            }

        }
    }






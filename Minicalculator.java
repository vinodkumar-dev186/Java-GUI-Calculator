import java.util.Scanner;
public class Minicalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("enter first number");
        long a=sc.nextLong();
        System.out.println("enter second number");
        long b=sc.nextLong();
        System.out.println("enter operator('+','-','*','/','%')");
        char op=sc.next().charAt(0);
        long Result=0;
        boolean valid=true;
        switch(op) {
            case'+':
            Result = a+b;
            break;
            case'-':
            Result = a-b;
            break;
            case'*':
            Result = a*b;
            break;
            case'/':
            if(b==0){
                System.out.println("Error:cannot divide by zero");
            }else{
                Result=a/b;
            }
            break;
            case'%':
            Result=a%b;
            break;
            default:
                System.out.println("not valid");
                valid=false;
        }
        if(valid){
            System.out.println("result="+Result);
        }
        System.out.println("do want to continue?, yes or no");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("no")){
                break;
            }
        }
        System.out.println("calculator closed");
        sc.close();
}
}
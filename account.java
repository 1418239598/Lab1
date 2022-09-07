import java.util.Scanner;

//public class exercises1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        account user = new account();
//        user.setUser("YHT");
//        user.setPassword("3441");
//        user.setMoney(10000);
//        user.introduce();
//        user.expense(2000,input);
//        user.expense(9000,input);
//        user.income(3.14);
//        user.introduce();
//        input.close();
//        return;
//    }
//}
public class account{
    String account;
    String password;
    double money;
    public void setUser(String account)
    {
        this.account=account;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public void setMoney(double money)
    {
        this.money=money;
    }
    public void introduce()
    {
        System.out.printf("%s's account has a balance of %.2f dollar.\n",account,money);
    }
    public void expense(double spend, Scanner in)
    {
        if(spend>money)
        {
            System.out.printf("Plan to expense %.2f dollar but no sufficient funds.\n",spend);
            return;
        }
        System.out.println("Please input your password:");
//        String fuck=in.next();
//        System.out.println(fuck+"  "+password);
        if(in.next().equals(password))
        {
            money-=spend;
            System.out.printf("Expense %.2f dollar and balance %.2f dollar.\n",spend,money);
            return;
        }
        else
        {
            System.out.println("Fuck you!");
        }
    }
    public void income(double income)
    {
        if(income<=0)
        {
            System.out.println("Son of a bitch! no money in!");
        }
        else
        {
            money+=income;
            System.out.printf("Got %.2f as income, balance is %.2f dollar.\n",income,money);
        }
    }
}

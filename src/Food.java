import java.util.ArrayList;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        ArrayList<Food> foodlist=new ArrayList<Food>();
        Scanner input =new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            foodlist.add(new Food());
            foodlist.get(i).setId(i+1);
            foodlist.get(i).setName(input.next());
            foodlist.get(i).setType(input.next());
            foodlist.get(i).setSize(input.nextInt());
            foodlist.get(i).setPrice(input.nextDouble());

        }
        System.out.println("---------------welcome, this is Start of the Menu----------------");
        for(Food i:foodlist)
        {
            i.getMenu();
        }
        System.out.println("----------------welcome, this is End of the Menu-----------------");
        input.close();
        return;
    }
}
public class Food
{
    private int id;
    private String name;
    private String type;
    private int size;
    private double price;
    public void getMenu()
    {
        System.out.printf("[id] %d\t[type] %8s\t[name] %7s [size] %-2d (Inches) %.2f $\t\n",id,type,name,size,price);
    }

    public void setId(int id) {
        this.id = id;
    }

    //    public void setId(int id)
//    {
//        this.id=id;
//    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setSize(int size)
    {
        this.size=size;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
}
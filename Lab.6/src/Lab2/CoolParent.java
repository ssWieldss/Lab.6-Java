package Lab2;

import java.util.Scanner;

public class CoolParent extends Human {

    private double pocketmoney;

    public CoolParent()
    {
        super();
        this.pocketmoney = 0;
    }

    public CoolParent(String name, int age, String sex, double pocketmoney)
    {
        super(name, age, sex);
        this.pocketmoney = pocketmoney;
    }

    public double GetPocketmoney() {return pocketmoney;}
    public void SetPocketmoney(double pocketmoney) {this.pocketmoney = pocketmoney;}

    public String toString()
    {
        return super.toString() + "\t" + pocketmoney;
    }

    public CoolStudent CreatePair (CoolParent coolparent)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента");
        String name = sc.nextLine();
        System.out.println("Введите пол студента");
        String sex = sc.nextLine();

        CoolStudent coolstud = new CoolStudent(name, coolparent.GetAge() - 25, sex,
                coolparent.GetName(), Math.log10(coolparent.GetPocketmoney()));
        return coolstud;
    }
}

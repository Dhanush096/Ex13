package exp13;

import java.util.*;

public class Exp131 {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int i=0,n;
        futs f = new futs();
        System.out.print("\n1-To insert\t2-To Display\t3-To find average\n4-To display Highest & Lowest\t5-To display evens");
        while(i==0)
        {
            System.out.print("\nEnter your Choice : ");
            n = o.nextInt();
            switch(n)
            {
                case 1:
                    f.add();
                    break;
                case 2:
                    f.dip();
                    break;   
                case 3:
                    f.age();
                    break;
                case 4:
                    f.hlm();
                    break;
                case 5:
                    f.eves();
                    break;
                default:
                    i = i+1;
                    break;
            }
        }
    }
    
}

class futs
{
    Scanner o = new Scanner(System.in);
    ArrayList<Integer> abs = new ArrayList<>();
    void add()
    {
        System.out.print("\nEnter Data : ");
        int d = o.nextInt();
        abs.add(d);
        
    }
    void dip()
    {
        System.out.print("\nThe List is "+abs+" of Size "+abs.size());
    }
    void age()
    {
        int s=0;
        for(int i=0;i<abs.size();i++)
        {
            s = s + abs.get(i);
        }
        double a = s/abs.size();
        System.out.print("\nThe Average value of the given list is "+a);
    }
    void hlm()
    {
        int h = abs.get(0),l = abs.get(0);
        for(int i=1;i<abs.size();i++)
        {
            if(h < abs.get(i))
            {
                h = abs.get(i);
            }
        }
        for(int i=1;i<abs.size();i++)
        {
            if(l > abs.get(i))
            {
                l = abs.get(i);
            }
        }
        System.out.print("\nThe Largest value of the given list is "+h+"\nThe Smallest value of the given list is "+l);
    }
    void eves()
    {
        int a;
        System.out.print("\nThe Evens : ");
        for(int i=0;i<abs.size();i++)
        {
            a = abs.get(i);
            if(a%2 == 0)
            {
                System.out.print(a+"  ");
            }
        }
    }
}

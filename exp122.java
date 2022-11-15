
package exp13;

import java.util.*;

public class exp132 {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int i=0,n;
        emp e = new emp();
        System.out.print("\n1-To insert\t2-To Display\t3-To Arrange");
        while(i==0)
        {
            System.out.print("\nEnter your Choice : ");
            n = o.nextInt();
            switch(n)
            {
                case 1:
                    e.add();
                    break;
                case 2:
                    e.dip();
                    break;   
                case 3:
                    e.age();
                    break;
                default:
                    i = i+1;
                    break;
            }
        }
    }
}

class emp
{
    Scanner o = new Scanner(System.in);
    ArrayList<String> nm = new ArrayList<>();
    ArrayList<Float> sal = new ArrayList<>();
    void add()
    {
        System.out.print("\nEnter the Employee name : ");
        String s = o.next();
        System.out.print("\nEnter the Salary name : ");
        Float f = o.nextFloat();
        nm.add(s);
        sal.add(f);
    }
    void dip()
    {
        System.out.print("\nThere are "+nm.size()+" Employees working here and their detail are as follows\n"+nm+"\n"+sal);
    }
    void age()
    {
        System.out.print(nm);
        ArrayList<String> t = nm;
        System.out.print(" "+t);
        ArrayList<String> z = nm;
        Collections.sort(t, Collections.reverseOrder());
        System.out.print(" "+z+" "+nm+" "+sal+" "+t);
        int i;
            for(i=0;i<nm.size();i++)
            {
                System.out.print("\n"+t.get(i)+" - "+sal.get(z.indexOf(t.get(i))));
            }
    }
}

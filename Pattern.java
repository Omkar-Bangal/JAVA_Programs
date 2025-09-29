

//     java.lang.Object


class Employee
{
    private String ename;
    private int eid;

    public Employee()
    {
    }

    public Employee(String ename, int eid)
    {
        this.ename = ename;
        this.eid = eid;
    }

    public void setEname(String ename)
    {
        this.ename = ename;
    }

    public String getEname()
    {
        return ename;
    }

    public void setEid(int eid)
    {
        this.eid = eid;
    }

    public int getEid()
    {
        return eid;
    }

    public boolean equals(Object o)
    {
        if(o instanceof Employee)
        {
            Employee obj = (Employee)o;

            if(eid == obj.eid && ename.equals(obj.ename))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return eid;
    }

    public String toString()
    {
        return ename+" "+eid;
    }
}

public class Pattern
{
    public static void main(String [] args)
    {
        Employee e1 = new Employee("ABC", 101);
        Employee e2 = new Employee("ABC", 101);

        if(e1.equals(e2))
        {
            System.out.println("\n EQUAL ");
        }
        else
        {
            System.out.println("\n NOT EQUAL ");
        }

        String s1 = new String("ABC");
        String s2 = new String("ABC");

        System.out.println("\n s1.hashCode() = "+s1.hashCode());
        System.out.println("\n s2.hashCode() = "+s2.hashCode());

        System.out.println("\n e1.hashCode() = "+e1.hashCode());
        System.out.println("\n e2.hashCode() = "+e2.hashCode());

        System.out.println("\n s1 = "+s1.toString());
        System.out.println("\n e1 = "+e1.toString());
    }
}



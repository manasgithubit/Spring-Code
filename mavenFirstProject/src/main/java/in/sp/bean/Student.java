package in.sp.bean;

public class Student
{
       private String name;
       private String address;
       private int rollnum;
       private float marks;
       
     //Using setter and getter method
       public String getName()
       {
        return name;
       }
       public void setName(String name)
       {
        this.name = name;
       }
       public String getAddress()
       {
        return address;
       }
       public void setAddress(String address)
       {
        this.address = address;
       }
       public int getRollnum()
       {
        return rollnum;
       }
       public void setRollnum(int rollnum)
       {
        this.rollnum = rollnum;
       }
       public float getMarks()
       {
        return marks;
       }
       public void setMarks(float marks)
       {
        this.marks = marks;
       }
       public void Display()
       {
            System.out.println("name:"+ name);
            System.out.println("address:"+ address);
            System.out.println("rollnum:"+ rollnum);
            System.out.println("marks:"+ marks);
       }
    /* //Using toString
       @Override
       public String toString()
       {
        return "Student [name=" + name + ", address=" + address + ", rollnum=" + rollnum + ", marks=" + marks + "]";
       }*/
}

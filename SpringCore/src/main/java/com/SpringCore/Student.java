package com.SpringCore;

public class Student
{
     private Integer studentId;
     private String studentName;
     private String studentAddress;
     
     //Using Setter and Getter Method
     public Integer getStudentId()
     {
      return studentId;
     }
     public void setStudentId(Integer studentId)
     {
      System.out.println("Setting StudentId");
      this.studentId = studentId;
     }
     public String getStudentName()
     {
      return studentName;
     }
     public void setStudentName(String studentName)
     {
      System.out.println("Setting studentName");
      this.studentName = studentName;
     }
     public String getStudentAddress()
     {
      return studentAddress;
     }
     public void setStudentAddress(String studentAddress)
     {
      System.out.println("Setting studentAddress");
      this.studentAddress = studentAddress;
     }
     
     public Student(Integer studentId, String studentName, String studentAddress)
     {
      super();
      this.studentId = studentId;
      this.studentName = studentName;
      this.studentAddress = studentAddress;
     }
     public Student()
     {
      super();
     }
     @Override
     public String toString()
     {
      return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
        + "]";
     }
}

package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
         String configLocation = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        Student student = context.getBean(Student.class);
        student.Display();
        //System.out.println( "Hello World!" );
    }
}

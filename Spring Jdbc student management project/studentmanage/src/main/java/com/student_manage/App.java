package com.student_manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student_manage.student.Student;
import com.student_manage.student.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Welcome to Student Management App" );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            
            System.out.println("Press 1 to ADD student");
            System.out.println("Press 2 to Delete student");
            System.out.println("Press 3 to Display student");
            System.out.println("Press 4 to Update student");
            System.out.println("Press 5 to Exit student");

            int c = Integer.parseInt(br.readLine());

            if (c==1) {
                System.out.println("Enter user name");
                String name = br.readLine();

                System.out.println("Enter user phone");
                String phone = br.readLine();

                System.out.println("Enter user city");
                String city = br.readLine();
                
                Student st = new Student(name, phone, city);
                boolean studentadd = StudentDao.insertStudentToDB(st);
                if (studentadd) {
                    System.out.println("student add successfully");
                }else{
                    System.out.println("something went wrong");
                }
                System.out.println(st);
            }else if (c==2) {
                // delete user
                System.out.println("Enter Student id to delete");
                int userId = Integer.parseInt(br.readLine());    
                boolean studentdelete =StudentDao.deleteStudent(userId);      
                if (studentdelete) {
                    System.out.println("Deleted ..........");
                }else {
                    System.out.println("something went wrong");
                }
            }else if (c==3) {
                StudentDao.showAllStudent();
                
            }else if (c==4) {
                System.out.println("Enter Student Id to update");
                int userIdupdate= Integer.parseInt(br.readLine());

                System.out.println("Enter user name");
                String name = br.readLine();

                System.out.println("Enter user phone");
                String phone = br.readLine();

                System.out.println("Enter user city");
                String city = br.readLine();
                
                Student st = new Student(name, phone, city);

                boolean updatestudent =StudentDao.updateStudent(st, userIdupdate);
                if (updatestudent) {
                    System.out.println("update ..........");
                    
                }else{
                    System.out.println("something wont wrong");
                }
                System.out.println(st);

            }else if (c==5) {
                break;
            }else{
                
            }
        }
        System.out.println("thanks");
    }
}

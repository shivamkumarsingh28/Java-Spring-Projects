package com.student_manage.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// import com.mysql.jdbc.PreparableStatement;

public class StudentDao {

    // Insert class
    public static boolean insertStudentToDB(Student st) {
        boolean f = false;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'insertStudentToDB'");
        try {
            Connection con = CP.createC();
            String q = "insert into students(sname, sphone, scity) values(?,?,?)";

            // Prepared Statement
            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            pstmt.executeUpdate();
            f = true;
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return f;
    }

    // delete class by id
    public static boolean deleteStudent(int userId) {
        // TODO Auto-generated method stub

        boolean f = false;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'insertStudentToDB'");
        try {
            Connection con = CP.createC();
            String q = "delete from students where sid=?";

            // Prepared Statement
            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setInt(1, userId);
            

            pstmt.executeUpdate();
            f = true;
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return f;
    }

    // show data class
    public static void showAllStudent() {
       
        try {
            Connection con = CP.createC();
            String q = "select * from students;";

            // Prepared Statement
            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(q);

            while (set.next()) {
                
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString("scity");

                System.out.println("ID:" + id);
                System.out.println("Name:" + name);
                System.out.println("Phone:" + phone);
                System.out.println("City:" + city);
                System.out.println("**************************");
            }
           

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

    // Update data class
    public static boolean updateStudent(Student st, int userIdupdate) {
        // TODO Auto-generated method stub
        boolean u = false;
        try {
            Connection con = CP.createC();
            String q = "update students set sname = ?, sphone = ?, scity=? where sid=?";

            PreparedStatement upstmt = con.prepareStatement(q);

            upstmt.setString(1, st.getStudentName());
            upstmt.setString(2, st.getStudentPhone());
            upstmt.setString(3, st.getStudentCity());
            upstmt.setInt(4, userIdupdate);

            upstmt.executeUpdate();
            u = true;


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return u;


    }
    
}

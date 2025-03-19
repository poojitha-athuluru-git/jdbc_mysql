//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.mysql.cj.protocol.Resultset;

import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {

        String url ="jdbc:mysql://localhost:3306/student";
        String uname = "root";
        String pass = "password";
        String query = "select sname from details where rollno=1";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con  = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("sname");
        System.out.println(name);
        st.close();
        con.close();

    }
}
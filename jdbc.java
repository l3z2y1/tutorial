import java.sql.*;
public class jdbc{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","","");
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from qw");
while(rs.next()){
System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
}
}catch(Exception e){
System.out.println("error");
}
}
}

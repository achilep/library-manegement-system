
import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.SQLException;


public class connectiondb {
    Connection con;
    Statement st;
    ResultSet rs;
    public connectiondb(){
    try{
    Class.forName("org.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
    }
    try{
    con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","docteurp");
    }catch(SQLException e){
        System.err.println("error"+e);
    }
    }
    Connection obtenirconnexion(){return con;}
    public void getdata(){
        try {
            String querry ="select firsname,lastname from user";
            rs=st.executeQuery(querry);
            System.out.println("from database");
            while(rs.next()){
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                System.out.println("name"+firstname+"lastname"+lastname);
            }
        }
    catch(Exception e){
    System.out.println(e);
    }    
    }
    public static void main(String[] args){
        
        connectiondb connection=new connectiondb();
        connection.getdata();
    }
}

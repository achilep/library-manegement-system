
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="register")
@SessionScoped
public class user_registration {
    private Statement st;
    private ResultSet rs;
    public connectiondb connect;
    private String fisrtname;
    private String lastname;
    private String date_of_birth;
    private Date date_birth;
    private String username;
    private String phone_number;
    private String email;
    private String town;
    private String password;
    private int number_of_book_borrow;
    public user_registration(){
        
    }
    public String getFisrtname() {
        return fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumber_of_book_borrow() {
        return number_of_book_borrow;
    }

    public void setNumber_of_book_borrow(int number_of_book_borrow) {
        this.number_of_book_borrow = number_of_book_borrow;
    }

    @Override
    public String toString() {
        return "user_registration{" + "fisrtname=" + fisrtname + ", lastname=" + lastname + ", date_of_birth=" + date_of_birth + ", date_birth=" + date_birth + ", username=" + username + ", phone_number=" + phone_number + ", email=" + email + ", town=" + town + ", password=" + password + ", number_of_book_borrow=" + number_of_book_borrow + '}';
    }
    public void valide(){
        /*if(fisrtname==null)
            return "invalide name";*/
                connect=new connectiondb();
            date_birth=new Date(0,0,0);
            number_of_book_borrow=1;
        try {
            String querry="insert into user(matricule_user,firstname,lastname,username,phone_number,email,town,password,number_of_book_borrow)"
                + "values(default,'firstname','lastname','username','phone_number','email','town','password',default)";
            st=connect.con.createStatement();
            rs =st.executeQuery(querry);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
           
           
           
    
    }
    
}
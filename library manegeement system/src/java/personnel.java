public class personnel {
    private String fisrtname;
    private String lastname;
    private String username;
    private String phone_nuumber;
    private String email;
    private String town;
    private String password;
    private String function;

    public personnel(String fisrtname, String lastname, String username, String phone_nuumber, String email, String town, String password, String function) {
        this.fisrtname = fisrtname;
        this.lastname = lastname;
        this.username = username;
        this.phone_nuumber = phone_nuumber;
        this.email = email;
        this.town = town;
        this.password = password;
        this.function = function;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone_nuumber() {
        return phone_nuumber;
    }

    public void setPhone_nuumber(String phone_nuumber) {
        this.phone_nuumber = phone_nuumber;
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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "personnel{" + "fisrtname=" + fisrtname + ", lastname=" + lastname + ", username=" + username + ", phone_nuumber=" + phone_nuumber + ", email=" + email + ", town=" + town + ", password=" + password + ", function=" + function + '}';
    }
    
    }

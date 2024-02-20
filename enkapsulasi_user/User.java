
package enkapsulasi_user;


public class User {
    //constructor
    private String username;
    private String password;
    private int Id ;
    private boolean status; //true : menikah, false 
    
    public User(String username, String password, int Id, boolean status){
        this.username = username;
        this.password = password;
        this.Id = Id;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    public boolean getstatus() {
        return status;
    }

    public void setstatus(boolean status) {
        this.status = status;
    }
    
}

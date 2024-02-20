
package enkapsulasi_user;


public class Enkapsulasi_User {

    
    public static void main(String[] args) {
        User nisa = new User("menyala","kakakkuh",2,false);

    // menggunakan method setter
    nisa.setUsername("nisa");
    nisa.setPassword("hahay");
    nisa.setId(0);
    nisa.setstatus(false);
    
    // menggunakan method getter
    System.out.println("Username: " + nisa.getUsername());
    System.out.println("Password: " + nisa.getPassword()); 
    }
    
}

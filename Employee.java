
package helloFX;

/**
 *
 * @author Nousa
 */
public class Employee {
   private String name;
   private String id;
   private String password;
   private String phone;
   private String email;
   
   public Employee(){
       
   }
   public Employee(String id, String name, String password, String phone, String email) {
       this.id = id;
       this.name = name;
       this.password = password;
       this.phone = phone;
       this.email = email; 
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getName() {
       return name;
   }
   public void setID(String id) {
       this.id = id;
   }
   public String getID() {
       return id;
   }
   public void setPassword(String password) {
       this.password = password;
   }
   public String getPassword() {
       return password;
   }
   public void setPhone(String phone) {
       this.phone = phone;
   }
   public String getPhone() {
       return phone;
   }
   public void setEmail(String email) {
       this.email = email;
   }
   public String getEmail() {
       return email;
   }
}

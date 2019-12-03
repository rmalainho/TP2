public class User {
    private String Name;
    private String Email;
    private String Username;
    private String Password;
    private String Address;

    public User(String Name, String Email, String Username, String Password, com.sun.xml.internal.ws.wsdl.writer.document.http.Address Address){
        this.Name = Name;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
        this.Address = Address;
    }

    public String getName () {return Name;}
    public String getEmail () {return Email;}
    public String getUsername () {return Username;}
    public String getPassword () {return Password;}
    public String getAddress() {return Address;}

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAdress(String Address) {
        this.Address = Address;
    }

    public String toString() {
        return String.format( "Name: %s , Email: %s, Username: %s, Password: %s, Address: %s", getName(), getEmail(), getUsername(), getPassword(), getAddress());
    }

}
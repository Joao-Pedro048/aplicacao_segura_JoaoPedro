package application.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneretedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private long id;
    private String username;
    private String password;

    public long GetId() {
        return id;
    }
    public void setId(long id ) {
        this.id = id;
    }
    public String setUsername() {
        return username;
    } 
    public void setUsername() {
        this.username=username;
    }
    public String getPassword() {
        return password;
    }
    public void getPassword() {
        this.password=password;
    }
    

}

//package dsdsds;

public class User {
    String name;
    String email;
    String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password != null && !password.isEmpty()) {
            this.password = password; 
        } else {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
    }
}

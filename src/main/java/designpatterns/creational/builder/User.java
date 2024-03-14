package designpatterns.creational.builder;

import lombok.ToString;


@ToString
public class User {

    private final String username;
    private final String password;
    private final String email;
    private final String mobile;
    private final String firstName;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    private User(UserBuilder builder) {
        //to initialize using builder class
        //do not create setters
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.firstName = builder.firstName;
    }

    //inner class to create obj

    static class UserBuilder {
        private String username;
        private String password;
        private String email;
        private String mobile;
        private String firstName;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setMobile(String mobile) {
            this.mobile = mobile;return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;return this;
        }

        public UserBuilder() {

        }

        public User build(){
           User u = new User(this);
           return u;
        }
    }

}

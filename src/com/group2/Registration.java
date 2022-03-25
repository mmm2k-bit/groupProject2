package com.group2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email.contains("@yahoo.com")){
            this.email=email;
        }else{
            System.out.println("You can only use Yahoo email");
        }
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Username can not be empty");
        }else if (userName.length()<6){
            System.out.println("Username can not be less than 6 characters");
        }
        else {
            this.userName = userName;
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(password.isEmpty()||(password.length()<6)){
            System.out.println("Password can not be empty or less than 6 characters");
        }else if(password.equals(this.userName)){
            System.out.println("Password can not be the same as Username");
        }else{
            this.password = password;
        }
    }
}

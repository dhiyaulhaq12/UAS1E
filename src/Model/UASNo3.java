package Model;

import java.security.MessageDigest;
import java.util.ArrayList;

public class UASNo3 {
    private String UserID;
    private String Username;
    private ArrayList<String>MY_MESSAGES;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public ArrayList<String> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<String> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public UASNo3 (){

    }

    public UASNo3(String userID, String username, ArrayList<String> MY_MESSAGES) {
        UserID = userID;
        Username = username;
        this.MY_MESSAGES = MY_MESSAGES;
    }
}

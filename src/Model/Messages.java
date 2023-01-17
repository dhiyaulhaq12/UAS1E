package Model;

public class Messages {
    private String UserID;
    private String UserName;
    private String WhatYouposts;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getWhatYouposts() {
        return WhatYouposts;
    }

    public void setWhatYouposts(String whatYouposts) {
        WhatYouposts = whatYouposts;
    }

    public Messages() {

    }

    public Messages(String userID, String userName, String whatYouposts) {
        UserID = userID;
        UserName = userName;
        WhatYouposts = whatYouposts;
    }
}

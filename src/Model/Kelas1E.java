package Model;
import Model.UASNo3;
import Model.Messages;
import java.util.Scanner;
import java.util.ArrayList;
public class Kelas1E {
    public static void main(String[] args) {
        UASNo3 social = new UASNo3();
        social.setUserID("001");
        social.setUsername("@whitehat");
        System.out.println("USER ID : " + social.getUserID());
        System.out.println("USER NAME : " + social.getUsername());
        int jum_msg=3;
        Scanner sc = new Scanner(System.in);
        ArrayList<UAS1E>xMsg = new ArrayList<>();
        for(int index=0;index<jum_msg;index++){
            Messages msg = new Messages();
            msg.setuserID.getUserID();
            msg.setUserName(social.getUserName());
            System.out.print("Post Message " + String.valueOf(index+1) + " = ");
            String _msg = sc.nextLine();
            msg.setWhatYouPosts(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);
        //TODO :
        //  BUATLAH METHOD ShowPosts untuk menampilkan
        //  pesan yang telah di posting oleh user
        social.ShowPosts(social);
    }
}

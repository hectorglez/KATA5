package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MailListReaderDDBB {

    public static ArrayList<String> read() {
        ArrayList<String> mailList = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:KATADB");
            System.out.println("Opened database successfully");
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAIL FROM MAILS");
            while (rs.next()) {
                String mail = rs.getString("MAIL");
                if(!mail.contains("@"))continue;
                mailList.add(mail);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return mailList;
    }

    public MailListReaderDDBB() {
    }
}

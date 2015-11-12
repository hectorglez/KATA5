/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.IOException;
import java.util.ArrayList;


public class Kata4 {

    
    public static void main(String[] args) throws IOException {
        String nameFile = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4\\DATA\\emailsfilev1.txt";
        ArrayList<String> mailArray  = MailListReaderDDBB.read();
        System.out.println(mailArray.size());
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histogram).execute();
    }
}

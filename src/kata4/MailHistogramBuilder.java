/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.util.ArrayList;


public class MailHistogramBuilder {
    
    public static Histogram<String> build (ArrayList<String> mailList){
        Histogram<String> histogram = new Histogram<>();
        for (String mail : mailList) {
            Mail domi = new Mail(mail);
            histogram.increment(domi.getDominio());
        }
        return histogram;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;


public class Mail {
    private final String mail;

    public String getMail() {
        return mail;
    }

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDominio(){
        return mail.split("@")[1];
    }
    
}

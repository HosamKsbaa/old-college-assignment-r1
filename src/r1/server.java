/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class server {
    public void run(){
        
        
        
         try {
             
             ServerSocket s2=new ServerSocket(9090);
             while(true){
             Socket s1=s2.accept();
             InputStream is=s1.getInputStream();
             System.out.println(is.read());
             }
             
             
             
             
             
         } catch (IOException ex) {
             Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}

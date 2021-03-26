/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r1;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class clint2 {
    Scanner in=new Scanner(System.in);
    String name;
    int port;
    int ip;
    float data;
    
    
     public void run(){
             /*System.out.println("enter you name ");
            name=in.nextLine();
            System.out.println("enter you port int ");
            port=in.nextInt();
            System.out.println("enter you ip int ");
            ip=in.nextInt();
            System.out.println("connection starting ");*/
            
            
            try {
                Socket s1 = new Socket("localhost",9090);

                DataInputStream dis = new DataInputStream(s1.getInputStream());
                DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
                while(true)
                {
                    System.out.println("write your massage ");

                    dos.writeFloat(data);
                    System.out.println("massage incoming ");
                    data=dis.readFloat();
                    System.out.println(data);

                }
            } catch (IOException ex) {Logger.getLogger(clint2.class.getName()).log(Level.SEVERE, null, ex);}
    }
}

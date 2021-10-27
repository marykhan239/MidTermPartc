/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author marya
 */
public class TestUserprofile {
    
   
      private String userId;
      private String genre;
      
        
        public TestUserprofile(String userId, String genre){
            this.userId=userId;
            this.genre=genre;
            
        }
        
        public String favoriteMovie(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your user ID: ");
        userId=sc.next();
        
        System.out.println("Enter the name of your favorite movie:");
        genre=sc.next();
        
        System.out.print(userId);
        System.out.print(genre);
        
        return userId;
        
        
        }
        
}
    


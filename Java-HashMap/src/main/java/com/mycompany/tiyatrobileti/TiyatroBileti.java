
package com.mycompany.tiyatrobileti;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TiyatroBileti {

    

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String> list = new HashMap<Integer,String>(16);
        boolean cikis = true;
        while (cikis){
            System.out.println("Please select the action you want to do..."
            + "\n****************************************"
            +"\n1- Ticket assignment screen"
            +" \n2- Show ticket list"
            +"\n3- Cancel ticket"
            +"\n4- Update ticket"
            +"\n0- Stop console"
            +"\n***************************************");
            int secenek=-1;
            try {
                secenek= scanner.nextInt();
            scanner.nextLine();
            switch (secenek) {
            case 1:
                   System.out.println("Welcome..!");
        System.out.println("Ticket capacity is 15");
         
         String isim;
         boolean exit = true;
         while (exit) { 
          
            System.out.println("Enter '0' for back to MainMenu"
                    + "\nEnter the seat number you want to assign"
                    + "\nAvaiable seat numbers: "
            );
            for(int i = 1;i<16;i++ ){
                if(list.get(i)==null){
                    System.out.print(i+","
                    );
                    
                    
                }
            }
            int option;
            try {
                
                System.out.println("\n**********************************");
              
                option=scanner.nextInt();
              scanner.nextLine(); 
              if(list.get(option)==null&&option!=0&&option<16){
                       System.out.println("Please enter name");
                       String name = scanner.nextLine();
                       
                       isim=name;
                    list.put(option, name);
                    
                    System.out.println("*********************************************"
                     +"Assignment successful..!"
                   +"\n*********************************************"
                    +"\nSeat number:.....  "+option
                    +"\nName:.....  "+ isim
                    +"\n*********************************************");
                    }
              else if(option==0){
                  System.out.println("Console is stopping");
                  exit=false;}
                  else if(option>15){
                  System.out.println("Max number of seats is 15..!");
                          }
              
                    else{
                        System.out.println("This seat number is not avaiable..!");
                        for(int i = 1;i<16;i++ ){
                if(list.get(i)==null){
                    System.out.print(i+",");
                    
                    
        }
            
        }

        }
            } catch (InputMismatchException e) {
                 System.out.println("**********************************");
                System.out.println("An invalid character was entered..!");
                 System.out.println("**********************************");
                option=0;
                scanner.nextLine();
            }

             
}
        break;
            case 2:
                for(int i = 1;i<16;i++){
                    if(list.get(i)==null)
                    System.out.println("Seat Number " + i + "   " + "Avaiable");
                
                else{
                        System.out.println("Seat Number " + i + "   " + list.get(i));
                        }
                }
                System.out.println("****************************************");
                break;
            case 3:
                System.out.println("Assigned seat numbers list;"
                +"\n*********************************************");
                   for(int i = 1;i<16;i++){
                    if(list.get(i)==null){
                        
                    }
                    
                   else{
                        System.out.println("Seat number " + i + "   " + list.get(i));
                        }
                }
                   System.out.println("*********************************************");
                   System.out.println("Please enter the seat number you want to delete...");
                   int sil = scanner.nextInt();
                   scanner.nextLine();
                   list.remove(sil);
                   System.out.println("*********************************************"
                           +"\nThe deletion was successful "
                           +"\n*********************************************"
                   +"\nCurrent List:"
                   +"\n*********************************************");
                    for(int i = 1;i<16;i++){
                    if(list.get(i)==null){
                        
                    }
                    
                   else{
                        System.out.println("Seat number " + i + "   " + list.get(i));
                        }
                }
                     System.out.println("*********************************************");
                    
                    break;
            case 4:
                System.out.println("Assigned seat numbers list;"
                +"\n*********************************************");
                  for(int i = 1;i<16;i++){
                    if(list.get(i)==null){
                        
                    }
                    
                   else{
                        System.out.println("Bilet no " + i + "   " + list.get(i));
                        }
                }
                  System.out.println("*********************************************");
                   System.out.println("Please enter the seat number you want to update");
                   int guncel = scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Please enter name");

                   String guncelisim = scanner.nextLine();
                   list.put(guncel, guncelisim);
                   System.out.println("The update is complete. New List ;");
                   System.out.println("***************************************");
                    for(int i = 1;i<16;i++){
                    if(list.get(i)==null){
                        
                    }
                    
                   else{
                        System.out.println("Seat number " + i + "   " + list.get(i));
                        }
                }
                    break;
            case 0: 
                cikis=false;
                
                break;
            default:
                
        }
            } catch (Exception e) {
                System.out.println("An invalid character was entered..!");
                secenek=-1;
                scanner.nextLine();
            }

            
        }
        
        
     
    }}

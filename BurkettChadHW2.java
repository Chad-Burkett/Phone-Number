import java.util.Scanner;

public class BurkettChadHW2
{
      public static void main(String args[])
      {
      //variables
      int length;
      String phoneNum;
      Scanner get=new Scanner(System.in);
      boolean area, exchange, number;
      area=exchange=number=false;
      
      //get the number
      System.out.println("Please enter your phone number:   ");
      System.out.println("Correct format is: xxx-yyy-zzzz");
      phoneNum=get.next();
      
      //find the length
      length=phoneNum.length();
      
      if(length==12)
        {  
        //if length is 12
        if(phoneNum.charAt(3)=='-' && phoneNum.charAt(7)=='-')
             { //dash if
            //check if area code is legal
            if(phoneNum.charAt(0)>='2' && !(phoneNum.charAt(0) =='9'  && (phoneNum.charAt(1) =='1' &&  (phoneNum.charAt(2) =='1'))))
               area=true;
            else
               System.out.println("This number "+phoneNum+" is not valid, please check your area code.");
           
                   //check if exchange is legal      
                if(phoneNum.charAt(4)>='2' && !(phoneNum.charAt(4) =='9'  && (phoneNum.charAt(5) =='1' &&  (phoneNum.charAt(6) =='1'))))
                  exchange=true;
                else
                  System.out.println("This number "+phoneNum+" is not valid, please check your exchange number.");
               
                      //check if number is legal
                    if((phoneNum.charAt(8)>='0' && phoneNum.charAt(9)>='0' && phoneNum.charAt(10)>='0' && phoneNum.charAt(11)>='0'))
                        number=true;
                    else 
                      System.out.println("This number "+phoneNum+" is not valid.");
              } //dash if
                         else
                            System.out.println("This number "+phoneNum+" is not valid, correct format is: xxx-yyy-zzzz");
        
        } //length if
      else
       System.out.println("Please check the length of your phone number. Add dashes if needed.");

      //display legal phone number
      {
      if(area && exchange && number);         
         System.out.print("Phone Number: ");
         System.out.print("(");
         System.out.print(phoneNum.charAt(0));
         System.out.print(phoneNum.charAt(1));
         System.out.print(phoneNum.charAt(2));
         System.out.print(")");
         System.out.print(" ");
         System.out.print(phoneNum.charAt(4));
         System.out.print(phoneNum.charAt(5));
         System.out.print(phoneNum.charAt(6));
         System.out.print(phoneNum.charAt(7));
         System.out.print(phoneNum.charAt(8));
         System.out.print(phoneNum.charAt(9));
         System.out.print(phoneNum.charAt(10));
         System.out.print(phoneNum.charAt(11));
                                       
         

      }  
      
         
    } 
}         



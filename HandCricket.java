import java.util.*;
class HandCricket
{
    public static void main ()
{
        Scanner obj = new Scanner(System.in);char repeat;//ts=my total score and comp_ts = comp's total score
        //The below vars are when we bat
        char choice; String c,c_1; c=""; c_1=""; int bat,c_bat;bat=0;c_bat=0; int ts , comp_ts;ts=0;comp_ts=0;int score_tobeat = 0;//c=my batting input c_1=Comp's batting input
        
        //The below vars are when we bowl
        int bowl,c_bowl;String C=""; String C_1="";
        //random -
        int toss=0;//toss-
        //random vars //comp_choose = comp's choice 
        int oddeve,c_oddeve,t_oddeve;choice=' ';int comp_choose;//oddeve-our selection c_oddeve - comp's toss  t_oddeve = to store sum of both tosses
        System.out.println("Enter Your name");
        String name = obj.nextLine();
      do
      {  
        System.out.println("Hello There! "+name +" \nWelcome to Hand Cricket!  \nI hope you know the rules already so i won't explain them again ^_^");
        
        //Toss
        System.out.println("Odd or eve! \nchoose 1 for odd and 2 for eve");
        oddeve=obj.nextInt();
        if(oddeve!=1&&oddeve!=2)
        {
        System.out.println("You entered a wrong number so you are disqualified!");
        System.exit(0);
        }
        
        c_oddeve= (int)(Math.random()*6)+1;
        System.out.println("Enter Your number between 1 and 6");
        toss=obj.nextInt();
        if(toss<=0&&toss>=7)
        {
        System.out.println("You entered a wrong number so you are disqualified!");
        System.exit(0);
        }
        System.out.println("The computer chose "+ c_oddeve);
        t_oddeve=toss+c_oddeve;
        if(t_oddeve%2==0)//even case
        {
            System.out.println("Its an Eve!");
            if(oddeve==2)//we won the toss
            {
            System.out.println("GG you won the toss");
            System.out.println("Choose one of the following - \nB- You bowl first \nb - You bat first");
            choice = obj.next().charAt(0);
            }
            else if(oddeve==1)//we lost the toss
            {
             System.out.println("Sorry you lost the toss. Now the computer will choose to bat or bowl first.");
             comp_choose=(int)(Math.random()*2)+1;
             if(comp_choose==1)
             {System.out.println("The computer chose to bowl first!"); choice ='b';}
             else if(comp_choose==2)
             {System.out.println("The computer chose to bat first!"); choice ='B';}
            }
        }
        
        if(t_oddeve%2!=0)//odd case
        {
            System.out.println("Its an Odd!");
            if(oddeve==1)//we won the toss
            {
            System.out.println("GG you won the toss");
            System.out.println("Choose one of the following - \nB- You bowl first \nb - You bat first");
            choice = obj.next().charAt(0);
            }
            else if(oddeve==2)//we lost the toss
            {
             System.out.println("Sorry you lost the toss. Now the computer will choose to bat or bowl first.");
             comp_choose=(int)(Math.random()*2)+1;
             if(comp_choose==1)
             {System.out.println("The computer chose to bowl first!"); choice ='b';}
             else if(comp_choose==2)
             {System.out.println("The computer chose to bat first!"); choice ='B';}
            }
        }
        
        
        switch(choice)
        {
            case 'b' : System.out.println("You are batting");
                       //We bat!
                        do
                      {
                       System.out.println("Enter a no. from 1 to 6");
                       bat=obj.nextInt();
                       if(bat<=0&&bat>=7)
                       {
                            System.out.println("You entered a wrong number so you are disqualified!");
                            System.exit(0);
                        }
                       c_bat=(int)(Math.random()*6)+1;
                       switch(c_bat)//Comp's Score
                       {
                        case 1: c_1="One";break;
                        case 2: c_1="Two";break;
                        case 3: c_1="Three";break;
                        case 4: c_1="Four";break;
                        case 5: c_1="Five";break;
                        case 6: c_1="Six";break;
                        }
                        switch(bat)//My Score
                        {
                         case 1: c="One";break;
                         case 2: c="Two";break;
                         case 3: c="Three";break;
                         case 4: c="Four";break;
                         case 5: c="Five";break;
                         case 6: c="Six";break;
                        }
                        
                         System.out.println("You chose "+c+"\nAnd the computer chose "+c_1);
                         ts+=bat;
                         if(bat!=c_bat)
                         System.out.println("Your current score is "+ts);
                         else
                         System.out.println("Your current score is "+(ts-bat));
                       
                     }while(bat!=c_bat);
                    score_tobeat=ts+1;
                       if(bat==c_bat)
                        {
                         System.out.println("OUT!");
                         System.out.println("Your total score is "+(ts-bat));
                         System.out.println("The target for the computer to beat is "+(score_tobeat-bat));
                       
                        }
                      
                        
                        
                    System.out.println("Now its your time to ball! \nGet ready!"); 
                    
                    //We bowl
                 do
                  { 
                    System.out.println("Enter a no. from 1 to 6");
                    bowl=obj.nextInt();
                        if(bowl<=0&&bat>=7)
                       {
                            System.out.println("You entered a wrong number so you are disqualified!");
                            System.exit(0);
                        }
                    
                    c_bowl=(int)(Math.random()*6)+1;
                    switch(c_bowl)//Comp's Score
                       {
                        case 1: C_1="One";break;
                        case 2: C_1="Two";break;
                        case 3: C_1="Three";break;
                        case 4: C_1="Four";break;
                        case 5: C_1="Five";break;
                        case 6: C_1="Six";break;
                        }
                        switch(bowl)//My Score
                        {
                         case 1: C="One";break;
                         case 2: C="Two";break;
                         case 3: C="Three";break;
                         case 4: C="Four";break;
                         case 5: C="Five";break;
                         case 6: C="Six";break;
                        }
                      
                       System.out.println("You chose "+C+"\nAnd the computer chose "+C_1);
                          comp_ts+=c_bowl;
                          if(bowl!=c_bowl)
                          System.out.println("The computer's current score is "+comp_ts);
                          else
                          System.out.println("The computer's current score is "+(comp_ts -c_bowl));
                    }while(bowl!=c_bowl && comp_ts<score_tobeat);
                    if(bowl==c_bowl)
                    {
                         System.out.println("OUT!");
                         System.out.println("The Computer's final score is "+(comp_ts-c_bowl));
                       
                    }
                        
                       //Result of the match
                     if(comp_ts<ts)//ts=our score
                     System.out.println("GG! YOU WON!");
                     else if(comp_ts>=score_tobeat)
                     System.out.println("Sorry You lost Better Luck next time :)");
                     else if(comp_ts==ts)
                     System.out.println("The Match resulted in a draw");
                     break;//end of the choice when we choose to bat first.
        
        
        
        
        
        case  'B' :System.out.println("You are bowling");
                   
                      //We bowl
                 do
                  { 
                    System.out.println("Enter a no. from 1 to 6");
                    bowl=obj.nextInt();
                        if(bowl<=0&&bat>=7)
                       {
                            System.out.println("You entered a wrong number so you are disqualified!");
                            System.exit(0);
                        }
                    
                    c_bowl=(int)(Math.random()*6)+1;
                    switch(c_bowl)//Comp's Score
                       {
                        case 1: C_1="One";break;
                        case 2: C_1="Two";break;
                        case 3: C_1="Three";break;
                        case 4: C_1="Four";break;
                        case 5: C_1="Five";break;
                        case 6: C_1="Six";break;
                        }
                        switch(bowl)//My Score
                        {
                         case 1: C="One";break;
                         case 2: C="Two";break;
                         case 3: C="Three";break;
                         case 4: C="Four";break;
                         case 5: C="Five";break;
                         case 6: C="Six";break;
                        }
                      
                       System.out.println("You chose "+C+"\nAnd the computer chose "+C_1);
                          comp_ts+=c_bowl;
                          if(bowl!=c_bowl)
                          System.out.println("The computer's current score is "+comp_ts);
                          else
                          System.out.println("The computer's current score is "+(comp_ts -c_bowl));
                    }while(bowl!=c_bowl);
                     score_tobeat=comp_ts+1;
  
                    if(bowl==c_bowl)
                    {
                         System.out.println("OUT!");
                         System.out.println("The Computer's final score is "+(comp_ts-c_bowl));
                         System.out.println("The target to beat is "+(score_tobeat-c_bowl));
                        }
                                      
                    
                    System.out.println("Now its your time to bat! \nGet ready!"); 
                    
                      //We bat!
                        do
                      {
                       System.out.println("Enter a no. from 1 to 6");
                       bat=obj.nextInt();
                       if(bat<=0&&bat>=7)
                       {
                            System.out.println("You entered a wrong number so you are disqualified!");
                            System.exit(0);
                        }
                       c_bat=(int)(Math.random()*6)+1;
                       switch(c_bat)//Comp's Score
                       {
                        case 1: c_1="One";break;
                        case 2: c_1="Two";break;
                        case 3: c_1="Three";break;
                        case 4: c_1="Four";break;
                        case 5: c_1="Five";break;
                        case 6: c_1="Six";break;
                        }
                        switch(bat)//My Score
                        {
                         case 1: c="One";break;
                         case 2: c="Two";break;
                         case 3: c="Three";break;
                         case 4: c="Four";break;
                         case 5: c="Five";break;
                         case 6: c="Six";break;
                        }
                        
                         System.out.println("You chose "+c+"\nAnd the computer chose "+c_1);
                         ts+=bat;
                         if(bat!=c_bat)
                         System.out.println("Your current score is "+ts);
                         else
                         System.out.println("Your current score is "+(ts-bat));
                       
                     }while(bat!=c_bat&&bat<comp_ts);
                     
                       //Result of the match
                     if(ts>comp_ts)//ts=our score
                     System.out.println("GG! YOU WON!");
                     else if(ts<comp_ts)
                     System.out.println("Sorry You lost Better Luck next time :)");
                     else if(comp_ts==ts)
                     System.out.println("The Match resulted in a draw");
                     break;//end of the choice when we choose to bowl first.
                     
                     default:System.out.println("Sorry Wrong choice \n*EXIT*");
                             System.exit(0);
                             break;
        }           //end of switch case.


            System.out.println("if you want to play again press 'R'"+"\nTo exit press E");
            repeat =obj.next().charAt(0);
            if(repeat=='E')
            {
             System.out.println("*EXIT*");
             System.exit(0);
            }
            else if(repeat !='R')
            {
             System.out.println("sorry wrong input. "+ "\n*EXIT*");
             System.exit(0);
            }
                }while(repeat=='R');
}
}
    

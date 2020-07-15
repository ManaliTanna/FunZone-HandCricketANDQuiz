import java.io.*;
import java.lang.*;
public class Quiz
{
    public void Main3()throws IOException
    {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t WELCOME TO THE QUIZ. BE SMART AND ENJOY!");
        System.out.println("\t\t\t   THE TOPICS :- ");//intro
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();

        System.out.println("\t\t\t(1) TEENS");//menu
        System.out.println("\t\t\t(2) COMPUTER SCIENCE");
        System.out.println("\t\t\t(3) GENERAL KNOWLEDGE");

        System.out.print(" ENTER YOUR CHOICE  : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice=Integer.parseInt(br.readLine());
        int sc1,sc2,sc3;
        
        switch(choice)//switch
        {
            //QUIZ FOR TEENS
            case 1:

            System.out.println("\t\t\t START");
            sc1=0;

            System.out.println();//Q1-TEENS
            System.out.println("Q. Who puts together the team of S.H.I.E.L.D? ");
            System.out.println("\t(1)Hawkeye  \t(2)Captain America");
            System.out.println("\t(3)Hulk     \t(4)Phil coulson");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s1=Integer.parseInt(br.readLine());
            if(s1==4 )
            {
                System.out.println("CORRECT ANSWER!");
                sc1=sc1+5;
                System.out.println("CURRENT SCORE: "+sc1);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(4)Phil coulson  ");
            }

            System.out.println();//Q2-TEENS
            System.out.println("Q. Which is the most played song of the 20th century? ");
            System.out.println("\t(1)We will rock you  \t(2)You've Lost That Lovin' Feelin");
            System.out.println("\t(3)sorry             \t(4)closer");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s2=Integer.parseInt(br.readLine());
            if(s2==2 )
            {
                System.out.println("CORRECT ANSWER!");
                sc1=sc1+5;
                System.out.println("CURRENT SCORE: "+sc1);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(2)You've Lost That Lovin' Feelin   ");
            }

            System.out.println();//Q3-TEENS
            System.out.println("Q. In the movie 'Finding Nemo' what is Nemo's dads name? ");
            System.out.println("\t(1)Marlin  \t(2)Martin");
            System.out.println("\t(3)Malin   \t(4)Magnin");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s3=Integer.parseInt(br.readLine());
            if(s3==1 )
            {
                System.out.println("CORRECT ANSWER!");
                sc1=sc1+5;
                System.out.println("CURRENT SCORE: "+sc1);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(1)Marlin  ");
            }

            System.out.println("");
            System.out.println("\t\t\t YOUR FINAL SCORE OUT OF 15:"+sc1);
            System.out.println("\t\t\t--------------------------------");
            break;

            //THIS IS QUIZ FOR COMP
            case 2:

            System.out.println("\t\t\t START");
            sc2=0;

            System.out.println();//Q1-COMP
            System.out.println("Q. What is the fill form of GUI  ");
            System.out.println("\t(1)Graphical User Interform  \t(2)Graphics Under Innovation");
            System.out.println("\t(3)Graphic Using Interface   \t(4)Graphical User Interface");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s4=Integer.parseInt(br.readLine());
            if(s4==4 )
            {
                System.out.println("CORRECT ANSWER!");
                sc2=sc2+5;
                System.out.println("CURRENT SCORE: "+sc2);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(4)Graphical User Interface  ");
            }

            System.out.println();//Q2-COMP
            System.out.println("Q. The hardware that most people consider the 'brain' of the computer. It takes instructions from software, makes calculations, and helps run the show! ");
            System.out.println("\t(1)MOTHER BOARD  \t(2)CPU");
            System.out.println("\t(3)PC            \t(4)FAQ ");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s5=Integer.parseInt(br.readLine());
            if(s5==2 )
            {
                System.out.println("CORRECT ANSWER!");
                sc2=sc2+5;
                System.out.println("CURRENT SCORE: "+sc2);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(2)CPU   ");
            }

            System.out.println();//Q3-COMP
            System.out.println("Q. October 1958: Physicist Invents First Video Game. What did it relate to? ");
            System.out.println("\t(1)A simple tennis game    \t(2)Racing");
            System.out.println("\t(3)A simple baseball game  \t(4)Basketball");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s6=Integer.parseInt(br.readLine());
            if(s6==1 )
            {
                System.out.println("CORRECT ANSWER!");
                sc2=sc2+5;
                System.out.println("CURRENT SCORE: "+sc2);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(1)A simple tennis game  ");
            }

            System.out.println("");
            System.out.println("\t\t\t YOUR FINAL SCORE OUT OF 15:"+sc2);
            System.out.println("\t\t\t--------------------------------");
            break;

            //THIS IS QUIZ FOR GENERAL KNOWLEDGE
            case 3:

            System.out.println("\t\t\t START");
            sc3=0;

            System.out.println();//Q1-GK
            System.out.println("Q. What's the definition of the word 'principal'?  ");
            System.out.println("\t(1)Fundamental       \t(2) Value or rule governing behaviour ");
            System.out.println("\t(3)A law or theorem  \t(4)The first or most important");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s7=Integer.parseInt(br.readLine());
            if(s7==4 )
            {
                System.out.println("CORRECT ANSWER!");
                sc3=sc3+5;
                System.out.println("CURRENT SCORE: "+sc3);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(4)The first or most important  ");
            }

            System.out.println();//Q2-GK
            System.out.println("Q. What is two-thirds of 108?");
            System.out.println("\t(1)64  \t(2)72");
            System.out.println("\t(3)54  \t(4)62 ");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s8=Integer.parseInt(br.readLine());
            if(s8==2 )
            {
                System.out.println("CORRECT ANSWER!");
                sc3=sc3+5;
                System.out.println("CURRENT SCORE: "+sc3);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(2)72   ");
            }

            System.out.println();//Q3-GK
            System.out.println("Q. Which athlete has won the most Olympic medals? ");
            System.out.println("\t(1)Carl Lewis       \t(2)Mark Spitz ");
            System.out.println("\t(3)Michael Phelps   \t(4)Larisa Latynina ");
            System.out.print("YOUR ANSWER (please enter the number): ");
            int s9=Integer.parseInt(br.readLine());
            if(s9==3)
            {
                System.out.println("CORRECT ANSWER!");
                sc3=sc3+5;
                System.out.println("CURRENT SCORE: "+sc3);
            }
            else
            {
                System.out.println("INCORRECT ANSWER. CORRECT ANSWER:(3)Michael Phelps  ");
            }

            System.out.println("");
            System.out.println("\t\t\t YOUR FINAL SCORE OUT OF 15:"+sc3);
            System.out.println("\t\t\t--------------------------------");
            break;

            default:
            System.out.println("Please enter appropriate choice!");
        }//switch
        //if(choice<=0 || choice>3)
        //{
            //obj.main();//to exit
        //}
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t THANKYOU FOR PLAYING! HOPE YOU ENJOYED :)"); 
    }//method
}//class

           
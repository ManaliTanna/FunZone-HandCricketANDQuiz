import java.io.*;
public class handcricket
{
    String name; // to accept the player's name;
    int aa; // converting the random real number generated by 'rr' into a random whole number run for the computer;
    int ii; // used in for loops;
    int bb; // to accept the player's number;
    double rr; // to generate a random real number;
    int cheat; // to end the game if wrong input is entered; to keep a check whilst the game is running as to whether the game has ended or not;
    int score1; // to store the latest runs scored by the player;
    int score2; // to store the latest runs scored by the computer;
    int c; // used in for loops to create a specific design;
    int choice; // used to decide whether the game needs to be ended or restarted;
    int infinity=1; // used to keep the game running until the player decides to end the game;
    
    handcricket()//constructor
    {
        name=" ";
        aa=0;
        ii=0;
        bb=0;
        rr=0;
        cheat=0;
        score1=0;
        score2=0;
        c=0;
        choice=0;
        infinity=1;
    }


    public void Main2()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
        handcricket object2=new handcricket();//calling constructor is done and object is created
        while(infinity>0)
        {
            score1=0;
            score2=0;
            System.out.println("-----------------------");
            System.out.println("~~WELCOME TO THE GAME~~");
            System.out.println("-----------------------");
            System.out.println();
            System.out.print("Enter Your Name: ");
            name=br.readLine();

            for(c=0;c<=2;c++)
            {
                System.out.println("========================================================================");
            }

            System.out.println("Hello "+name+",");
            System.out.println();
            System.out.println("WELCOME TO THE CRICKET-MANIA");
            System.out.println("\t\t\t------------------");
            System.out.println("\t\t\tInstructions:-");
            System.out.println("\t\t\t------------------");
            System.out.println("1. This game is played just like the actual hand cricket game.");
            System.out.println("");
            System.out.println("2. Please understamd the game first.");
            System.out.println("");
            System.out.println("3. You Will First Bat. Enter Any Number From 1 To 10.");
            System.out.println();
            System.out.println("4. Any number entered below 0 or above 10 will not be considered.");
            System.out.println();
            System.out.println("5. If The Number Entered By The Computer Is Same As The Number Entered By You,You Will Be Declared As Out.");

            System.out.println();
            System.out.println("6. Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
            System.out.println();
            System.out.println("7. After Getting Out, You Will Have To Bowl.");
            System.out.println();
            System.out.println("8. Try To Enter A Number Similar To The Number Entered By The Computer.");
            System.out.println();
            System.out.println("9. If The Sum Of Numbers Entered By The Computer Becomes More Than Your Score, It Will Win.");
            System.out.println();
            System.out.println("10.But If You Enter A Number Same As The Number Entered By The Computer, You Win!");
            System.out.println();
            System.out.println("--------------------------------HAVE FUN-----------------------------------------------");

            System.out.println("=======================================================================================");

            System.out.println("YOU ARE BATTING:");

            System.out.println("========================================================================================"); 

            for(ii=1;ii>0;ii++)
            {
                System.out.println("");
                System.out.print("Enter Your Number: ");
                bb=Integer.parseInt(br.readLine());
                rr=((Math.random())*10);
                rr=rr+1;
                aa=(int)(rr);
                System.out.println("");
                System.out.println("Computer's Number: "+aa);
                System.out.println("");
                System.out.println("\t\t*-*-*-*-*-*");
                System.out.println("");

                if(bb==aa)
                {
                    System.out.println(" ");
                    System.out.println("HOWZATTT!!!!!!");
                    System.out.println(" ");

                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE = "+score1);
                    System.out.println("################");

                    System.out.println(" ");
                    break;
                }

                else if(bb>0&&bb<=10) 
                { 
                    score1=score1+bb; 
                } 
                else if(bb>10||bb<=0)
                {
                    for(c=0;c<=2;c++)
                    {
                        System.out.println("====================================");
                    }
                    System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                    cheat++;
                    break;
                }

                System.out.println("Your Current Score Is "+score1);
                System.out.println("");
                System.out.println("\t\t*-*-*-*-*-*");
            }

            for(c=0;c<=2;c++) 
            { 
                if(cheat>0)
                {
                    break;
                }
                System.out.println("====================================");
            }

            for(c=0;c<1;c++) 
            { 
                if(cheat>0)
                {
                    break;
                }
                System.out.println("YOU ARE BOWLING:");
            }

            for(ii=1;ii>0;ii++)
            {
                if(cheat>0)
                {
                    break;
                }

                System.out.println("");
                System.out.print("Enter Your Number: ");
                bb=Integer.parseInt(br.readLine());
                rr=((Math.random())*10);
                rr=rr+1;
                aa=(int)(rr);
                System.out.println("----------------------------------");
                System.out.println("Computer's Number: "+aa);
                System.out.println("-----------------------------------");
                System.out.println("\t\t*-*-*-*-*-*");
                System.out.println("");

                if(aa==bb)
                {
                    System.out.println(" ");
                    System.out.println("COMPUTER IS OUTT!!!!");
                    System.out.println(" ");

                    System.out.println("################");
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("################");

                    System.out.println(" ");
                    break;
                }

                else if(bb>0&&bb<=10) 
                { 
                    score2=score2+aa; 
                } 
                else if(bb>10||bb<=0)
                {
                    //for(c=0;c<=2;c++) 
                    //{ 
                    System.out.println("===================================="); 
                    //} 
                    System.out.println("You have either tried to cheat or entered a wrong input. Game Over!"); 
                    cheat++; break; 
                } 
                if(score2>score1)
                {
                    System.out.println(" ");
                    System.out.println("THE COMPUTER HAS SCORED MORE THAN YOUU!!!");
                    System.out.println(" ");

                    System.out.println("################");
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("################");

                    System.out.println(" ");
                    break;
                }

                System.out.println("Computer's Current Score Is "+score2);
                System.out.println("");
                System.out.println("*-*-*-*-*-*");
            }

            for(c=0;c<=1;c++) 
            { 
                if(cheat>0)
                {
                    break;
                }

                System.out.println("====================================");
            }

            for(ii=0;ii<1;ii++) 
            { 
                if(cheat>0)
                {
                    break;
                }

                System.out.println(" ");

                System.out.println("################");
                System.out.println("YOUR FINAL SCORE = "+score1);
                System.out.println("COMPUTER'S FINAL SCORE = "+score2);

                System.out.println("################");
                System.out.println(" ");

                if((score1)>(score2))
                {
                    System.out.println("Congratulations "+name+"!! You Have Defeated The Almighty, Computer!!");
                }

                else if((score1)<(score2))
                {
                    System.out.println("Sorry "+name+", But The Computer Has Defeated You..!");
                }

                else
                {
                    System.out.println("It's a Tie..! :(");
                }

            }

            //for(c=0;c<=2;c++)
            //{
            System.out.println("====================================");
            //}

            System.out.println("");
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println("");
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            choice=Integer.parseInt(br.readLine());
            System.out.println("");

            if(choice==1)
            {
                System.out.print('\f');
            }

            else
            {
                System.out.print('\f');
                System.out.println("Good Bye! THANKYOU FOR PLAYING");
                break;
            }

        }
    }
}
import java.io.*;
public class UltraMain
{

    public static void main(String args[])throws IOException
    {  
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        UltraMain object1=new UltraMain();//creating object of the class
        handcricket object2=new handcricket();
        Quiz object3= new Quiz();
        ComputerApp object4=new ComputerApp();
        System.out.println("--------------------------------------------------------------------------------------------------------------- ");
        System.out.println("                                   W    L   O    E");
        System.out.println("                                      E    C   M  ");
        long j;
        System.out.println("");
        for(j=0;j<=1000000000;j++); //time delay

        System.out.println("                                      TO FunZone");

        System.out.println("");
        for(j=0;j<=1000000000;j++);

        System.out.println("                    GET READY TO INVOLVE YOURSELF IN A WHOLE LOT OF FUN :)");

        for(j=0;j<=1000000000;j++);
        System.out.println("--------------------------------------------------------------------------------------------------------------- ");
        System.out.println("\t\t\t\tWE HAVE:-");                   
        System.out.println("\t\t\t\t----------");                     
        for(j=0;j<=1000000000;j++);              
        System.out.println("\t\t\t1.HAND CRICKET(GAME)");                               
        for(j=0;j<=1000000000;j++);        
        System.out.println("\t\t\t2.FUN QUIZ");        
        for(j=0;j<=1000000000;j++);                                                                        
        System.out.println("\t\t\t3.OTHER APPLICATIONS");          
        for(j=0;j<=1000000000;j++);                                                                        
        System.out.println("--------------------------------------------------------------------------------------------------------------- ");                                                                                           
        System.out.println();                                          
        System.out.print("\t\tEnter choice(Enter 4 if you wish to exit page) : ");
        int ch=Integer.parseInt(br.readLine());

        switch(ch) 
        {
            case 1:
            object2.Main2();//call main2 function of handcricket
            break;

            case 2:
            object3.Main3();//call function main3 of quiz
            break;

            case 3:
            object4.Main4();//call main4 of ComputerApp
            break;

            case 4:
            System.out.println("");
            System.out.println("\t\t\t -----THANKYOU FOR VISITING-----");
            System.exit(0);
            break;
        }
    }
}

    
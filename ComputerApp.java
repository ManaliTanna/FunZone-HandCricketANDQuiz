import java.io.*;
public class ComputerApp
{
    void primeFactors(int num)
    { 
        for(int i=1; i<=num; i++)
        { 
            if(num%i==0)//check if i is a factor or not
            { //now check if i is prime or not
                int count=0;
                for(int j=1; j<=i; j++)
                { 
                    if( i%j==0 )//to count number of factors
                    
                        count++;
                    
                }
                if(count==2)
                { 
                    System.out.println( "---- Prime Factor="+i+" ----" );
                    System.out.println();
                }
            }
        }
    }//primeFactors
    void palindrome(String word)
    { 
        String reverse="";
        int l=word.length();
        for(int i=l-1; i>=0; i--)//read the string in reverse
        { 
            char c=word.charAt(i);
            reverse=reverse+c;
        }
        if(word.equalsIgnoreCase(reverse))
        {
            System.out.println("----Palindrome----");
            System.out.println();
        }
        else
        {
            System.out.println("----Not a Palindrome----");
            System.out.println();
        }
    }//palindrome
    public  void Main4()throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ComputerApp obj=new ComputerApp();
        int choice=0;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
        while(choice!=3)//option 3 is to exit
        { 
            System.out.println("\t\t1. Display prime factors of 2 input numbers");
            System.out.println("\t\t2. Display palindrome words of 2 input words");
            System.out.println("\t\t3. Exit");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("ENTER YOUR CHOICE:-");
            
            choice=Integer.parseInt(br.readLine());
            switch(choice)
            { 
                case 1: 
                for(int i=1; i<=2; i++)//for 2 numbes
                { 
                    System.out.println("ENTER NUMBER");
                    int num=Integer.parseInt(br.readLine());
                    obj.primeFactors(num);
                }
                break;
                case 2: 
                for(int i=1; i<=2; i++)//for 2 numbes
                { 
                    System.out.println("ENTER WORD");
                    String word=br.readLine();
                    obj.palindrome(word);
                }
                case 3: 
                break;

                default: 
                System.out.println("\t\t\t----Wrong choice----");
            }//switch
        }//while
        System.out.println("\t\t\tTHANKYOU FOR USING THE PROGRAM");
    }//main
}//class
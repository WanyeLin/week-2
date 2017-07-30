
import java.util.*;

/** 专业水平的注释
 *	静态方法执行创建对象的命令
 *
 *
 */


public class UltimateDecision{


    public static void main(String args[])
    {	boolean coming = false ;
        int roll_the_dice = 0  ;
        int random_number = (int)(Math.random()*100);
        String choice  ;
        memebership staff = new memebership("baby",0);

        System.out.println("Start this game?");
        Scanner in = new Scanner(System.in);
        choice = in.next();

        while(choice.equals("Yes"))
        {do{
            System.out.println("Input the number you guess :");

            roll_the_dice = in.nextInt();

            if(roll_the_dice - random_number == 0)
                coming = true ;
            else if (roll_the_dice - random_number >0)
                System.out.println("your number is a little bit beyond the number i want" );
            else
                System.out.println("your number is smaller than the random number");

            staff.addCount();

        }while(coming == false);

            System.out.println("Bingo");
            System.out.println("You have tried "+staff.getCount()+" times before you succeeded");
            System.out.println("Do you want to try again?");

            choice = in.next();
        }
        System.out.println("Bye");


    }

}

class memebership{
    private String id ;

    private int  count  ;
    /**constructor which is to be used by the person who needs it */
    public memebership(String self_id , int judgement )
    {
        id = self_id ;
        count = judgement;
    }

    public void addCount()
    {
        count+=1 ;
    }

    public int getCount()
    {
        return count ;
    }




}



package Start_Package;

import Home_Package.Player;

public class Special_Reward {
    public static void increase_score(Player P, int rate) throws IncreaseException
    {
        double s = (double)rate/100;
        int k= (int) ((P.calculate_score())*s);
        int final_score = P.calculate_score()+k;

        if(final_score>5000)
        {
            throw new IncreaseException("Score can't be more than 5000.\nScore after special reward: 5000");
            //System.out.println("Score can't be more than 5000.");
            //final_score = 5000;
            //System.out.println("Score after special reward: "+final_score);
        }
        else
        {
            System.out.println("Score after special reward: "+final_score);
        }
    }

    public static void increase_score(Player P, int rate,int limit) throws IncreaseException
    {
        double s = (double)rate/100;
        int k= (int) ((P.calculate_score())*s);
        int final_score = P.calculate_score()+k;

        if(final_score>limit)
        {
            throw new IncreaseException("Score can't cross the limit value.\nScore after special reward: "+P.calculate_score());
            //System.out.println("Score can't be more than 5000.");
            //final_score = 5000;
            //System.out.println("Score after special reward: "+final_score);
        }
        else
        {
            System.out.println("Score after special reward: "+final_score);
        }
    }



}

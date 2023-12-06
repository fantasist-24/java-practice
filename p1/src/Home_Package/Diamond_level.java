package Home_Package;

import Reward_Package.R_B;
import Reward_Package.R_C;

public class Diamond_level extends Player implements R_B, R_C{
    int no_of_diamond;
    public Diamond_level(String name, int id, int score, int no_of_kill,int no_of_diamond) {
        super(name, id, score, no_of_kill);
        this.no_of_diamond=no_of_diamond;
    }

    @Override
    public int calculate_score() {
        return no_of_kill*200;
    }

    @Override
    public void calculate_reward() {

    }

    @Override
    public void print_info() {
        System.out.println("Info of diamond Level Player: ");
        System.out.println("Name: "+ get_name());
        System.out.println("Id: "+get_id());
        System.out.println("No of kills: "+get_kill());
        System.out.println("No of diamonds: "+increase_diamond());
        System.out.println("Score: "+increase_score());

    }

    @Override
    public int increase_score() {
        return calculate_score()+100;
    }

    @Override
    public int increase_diamond() {
        return no_of_diamond+5;
    }
}

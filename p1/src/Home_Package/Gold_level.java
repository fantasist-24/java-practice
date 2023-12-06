package Home_Package;

import Reward_Package.R_A;

public class Gold_level extends Player implements R_A {
    int no_of_gold;
    public Gold_level(String name, int id, int score, int no_of_kill,int no_of_gold) {
        super(name, id, score, no_of_kill);
        this.no_of_gold=no_of_gold;
    }

    @Override
    public int calculate_score() {
        return no_of_kill*100;
    }

    @Override
    public void calculate_reward() {


    }

    @Override
    public void print_info() {
        System.out.println("Info of Golden Level Player: ");
        System.out.println("Name: "+ get_name());
        System.out.println("Id: "+get_id());
        System.out.println("No of kills: "+get_kill());
        System.out.println("No of golds: "+increase_gold());
        System.out.println("Score: "+calculate_score());

    }

    @Override
    public int increase_gold() {
        return no_of_gold+5;
    }
}

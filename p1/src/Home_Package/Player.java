package Home_Package;

public abstract class Player {

        private String name;
        private int id;
        protected int score;
        protected int no_of_kill;

        public Player(String name,int id, int score,int no_of_kill)
        {
            this.name=name;
            this.id=id;
            this.score=score;
            this.no_of_kill=no_of_kill;
        }
        public abstract int calculate_score();
        public abstract void calculate_reward();
        public abstract void print_info();

        String get_name()
        {
            return name;
        }
        int get_id()
        {
            return id;
        }
        int get_kill()
        {
            return no_of_kill;
        }
}

class Citrus5P1{
    //public varriables
    public String team_name;
    public int team_number;
    //private varriables
    private int ball_scored = 0;
    private int climb_level = 0; 
    // constructor robot - no need to call this in main 
    public Citrus5P1(String user_name, int team_number) {
        this.team_name = user_name;
        this.team_number = team_number;
    }
    public int ball_count(int number){
        ball_scored += number;
        return ball_scored;
    }
    public int update_climb(int number){
        climb_level = number;
        return climb_level;
    }
    public int score_calculator(int user_ball, int user_climb){
        int total_score = 0;
        switch (user_climb){
            case 1:
                total_score = 8;
                break;
            case 2: 
                total_score = 11;
                break;
            case 3:
                total_score = 14;
                break;
            case 4:
                total_score = 18;
                break;
        }
        total_score += user_ball;
        return total_score;
    }
}

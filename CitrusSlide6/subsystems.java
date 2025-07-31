package CitrusSlide6;
class Robot_class{
    String name;
    int number;
    Robot_class(String user_name, int user_number){
        this.name = user_name;
        this.number = user_number;
    }
}
class subsystems extends Robot_class{
    subsystems(String user_name, int user_number){
        super(user_name,user_number);
    }
    private int shooter_speed;
    private int hood_angle;
    private void shooter_setter(int user_speed){
        shooter_speed = user_speed;
    }
    private void hood_setter(int user_angle){
        hood_angle = user_angle;
    }
    private void result(){
        System.out.println("The hood angle " + hood_angle);
        System.out.println("The shooter speed " + shooter_speed);
    }
}

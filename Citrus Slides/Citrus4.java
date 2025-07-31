public class Citrus4 {
    public static void main(String[] args){
        System.out.println(even_odd(2));
        System.out.println(even_odd(3));
        System.out.println(even_odd(4));


    }
    static boolean even_odd(int number){
        boolean is_even = false;
        if(number % 2 == 0){
            is_even = true;
        }
        return is_even;
    }
}
    


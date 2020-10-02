package eglon.FizzBuzz;

public class FizzBuzz {
    public static void FizzBuzz(String[] args){
        FizzyBuzzy(101);
    }


    public static int FizzyBuzzy(int n) {
        for (int i = 1; i <= 101; i++) {
            if (i == 101) {
                break;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i <= 101) {
                System.out.println(i);
            } else {
                break;
            }

        }
        return n;
    }
}

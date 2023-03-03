package fizzBuzzExercise;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++){
            System.out.println(FizzBuzzGame(i));
        }

    }

    public static String FizzBuzzGame(int numero){
        if (numero % 3 == 0 && numero % 5 == 0){
            return "FizzBuzz";
        } else if (numero % 3 ==0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        }

        //System.out.println(numero);
        return String.valueOf(numero);
    }


}

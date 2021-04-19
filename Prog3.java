public class Prog3 {
    public static void main(String[] args) throws Exception {
        System.out.println("13是不是質數？" + MyMath.checkPrime(13));
        System.out.println("第10個費式數列是？" + MyMath.fib(10));
    }
}

class MyMath{
    public static Boolean checkPrime(int prime) {
            if ( prime %2 == 0 || prime %3 == 0 || prime %5 == 0 || prime %7 == 0 ){
                return false;
            }else{
                return true;
            }
    }

    public static Integer fib(int index) {
        int[] result = new int[index];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < result.length; i++){
            result[i] = result[i-1] + result[i-2];
        }
        return result[index-1];
    }
}

public class Reduce {
    public static void main(String[] args) {
        int n = 100, counter = 0;
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n --;
            }
            counter ++;
        }
        System.out.println(counter);

    }
}

public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 1; i < 1000; i++){
            boolean divBy3 = i % 3 == 0,
                    divBy5 = i % 5 == 0;
            if(divBy5 || divBy3){
                counter ++;
            }
        }
        System.out.println(counter);
    }
}

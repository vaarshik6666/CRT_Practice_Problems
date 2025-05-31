public class No_Single_Even_Digits {
    public static void main(String[] args){
        int num = 160;
        int count = 0;
        for (int i = 1; i <= num; i++){
            int result = counting(i);
            if (result%2 == 0) count++;
        }
        System.out.println(count);
    }

    public static int counting(int i){
        while (i > 9){
            int result = 0;
            while (i > 0){
                int temp = i%10;
                result += temp;
                i /= 10;
            }
            i = result;
        }
        return i;
    }
}
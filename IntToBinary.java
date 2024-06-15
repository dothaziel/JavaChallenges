public class IntToBinary {

    public static String intToBinary(int number) {
        String b = "";
        for(int n = number; n > 0; n = n/2) {
            if(n % 2 == 0) {
                b = 0 + b;
                continue;
            }
            b = 1 + b;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(intToBinary(8)); // 1000
        System.out.println(intToBinary(122)); // 1111010
        System.out.println(intToBinary(66)); // 1000010
    }

    
}
public class AddBinary {
    
    //https://leetcode.com/problems/add-binary/
    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;

        while(i>=0 || j>=0 || carry==1){
            int sum = carry;
            System.out.println(a.charAt(i)-'0');
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';

            res.append(sum % 2);
            carry = sum / 2;
        }

        return res.reverse().toString();

    }

    public static void main(String[] args) {
        String res = addBinary("11", "1");

        System.out.println(res);
    }
}

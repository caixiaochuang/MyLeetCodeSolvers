public class reverseString {

    public void reverseString(char[] s) {

        StringBuilder sb = new StringBuilder();
        reverseString(sb , s,0);

        //s = sb.toString().toCharArray();

        System.out.println(sb.toString());

    }

    public void reverseString(StringBuilder sb , char [] s ,int index){

        if(index < s.length) {
            reverseString(sb,s,index+1);
            
            sb.append(s[index]);
        }
    }

    public static void main(String[] args) {
        new reverseString() . reverseString("hello".toCharArray());
    }

}

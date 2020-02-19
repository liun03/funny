public class ReverseString {
    public void reverseString(char[] s) {

        int length = s.length;
        int counter = 0;
        while(counter < length/2){
            char tmp = s[counter];
            s[counter] = s[length-counter-1];
            s[length-counter-1] = tmp;
            System.out.println(s);
            counter++;
        }

    }

}

public class RemoveAllAdjDuplicates {

    public String removeDuplicates(String S) {
        boolean finished = false;
        while(!finished){
            char[] tmp = S.toCharArray();
            for(int i = 0; i<tmp.length-1; i++) {
                if(tmp[i] == tmp[i+1]) {
                    S = S.substring(0,i) + S.substring(i+2, tmp.length);
                    break;
                }
                if (i==tmp.length-2){
                    finished = true;
                }

            }
            if("".equals(S) || S.length() == 1){
                finished = true;
            }

        }
        return S;

    }

}

//https://www.hackerrank.com/challenges/append-and-delete/

public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        int x = 0;
        int n = 0;
        if(s.length()> t.length()) {
             n = t.length();
        } else {
             n = s.length();
        }
        if(s.length()-k>t.length()){
            return "No";
        }
        else{
            for(int i=0;i<n;i++){
                if(t.charAt(i)==s.charAt(i)){
                    x++;
                }
                else{
                    break;
                }
            }
            if (s.length()+t.length()<k){
                return "Yes";
            }
            int difference = s.length()-x+t.length()-x;
            if (difference>k){
                return "No";
            }
            else if(difference%2==k%2){
                return "Yes";
            }
            else{
                return "No";
            }


        }

    }

    public static void main(String args[]) {
       System.out.println(appendAndDelete("y","yu",2));
    }
}


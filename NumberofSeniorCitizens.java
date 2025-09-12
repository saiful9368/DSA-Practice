class Solution {
    public int countSeniors(String[] details) {
        int n=0;
        for(int i=0;i<details.length;i++){
            String a=details[i].substring(11,13);
            int x=Integer.parseInt(a);
            if(x>60){
                n++;
            }
            
        }
        return n;
    }
}

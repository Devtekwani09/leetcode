class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x = 0;
        for(int i=0; i<op.length; i++){
            if(op[i].equals("--X")){
                x--;
            }
            else if(op[i].equals("X--")){
                x--;
            }
            else if(op[i].equals("++X")){
                x++;
            }
            else{
                x++;
            }
        }
        return x;
        
    }
}
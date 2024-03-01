class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack <>();
        int record = 0;
        for(String op : operations){
           switch(op){
                   case "+" -> {
                       int top = st.pop();
                       int newTop = st.peek();
                       st.push(top);
                       st.push(top + newTop);
                   }
                   
                   case "D" -> {
                       st.push(2 * st.peek() );
                   }
                   
                   case "C" -> {
                       st.pop();
                   }
                   default -> {
                       int res = Integer.parseInt(op);
                       st.push(res);
                   }
           }
        }
        while(!st.isEmpty()){
            record += st.pop();
        }
        return record;
    }
}
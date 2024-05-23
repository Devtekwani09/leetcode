class Pair<U,V>{
    public U first;
    public V second;
    
    public Pair(U first, V second){
        this.first = first;
        this.second = second;
    }
    
}

class MinStack {

    Stack<Pair<Integer,Integer>> st;
    
    public MinStack() {
        st = new Stack();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair<>(val,val));
        }
        else{
            st.push(new Pair(val, Math.min(val, st.peek().second)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().first;
    }
    
    public int getMin() {
        return st.peek().second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
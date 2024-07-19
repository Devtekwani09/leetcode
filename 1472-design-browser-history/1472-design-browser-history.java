class BrowserHistory {
    Stack <String> current = new Stack <>();
    Stack <String> fwd = new Stack<>();

    public BrowserHistory(String homepage) {
        current.add(homepage);
        fwd.clear();
    }
    
    public void visit(String url) {
        current.add(url);
        fwd.clear();
    }
    
    public String back(int steps) {
        while(current.size() > 1 && steps > 0){
            fwd.add(current.pop());
            steps--;
        }
        return current.peek();
    }
    
    public String forward(int steps) {
        while(!fwd.isEmpty() && steps > 0){
            current.add(fwd.pop());
            steps--;
        }
        // if(fwd.isEmpty()){
        //     return null;
        // }
        return current.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
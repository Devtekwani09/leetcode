class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sqstu = 0;
        int cirstu = 0;
        
        for(int choice : students){
            if(choice == 0){
                sqstu++;
            }
            else{
                cirstu++;
            }
        }
        
        for(int choice : sandwiches){
            if(choice == 0 && sqstu == 0){
                return cirstu;
            }
            else if(choice == 1 && cirstu == 0){
                return sqstu;
            }
            else if(choice==0){
                sqstu--;
            }
            else{
                cirstu--;
            }
        }
        
        return 0;
    }
}
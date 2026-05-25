class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> result =new ArrayList<>();
      backtrack(1,n,k,new ArrayList<>(),result);
    return result;
    }
    static void  backtrack(int cur_val,int n,int k,List<Integer>cur_arr,List<List<Integer>> result){
      
      if(cur_arr.size()==k){ // base condition
        result.add(new ArrayList<>(cur_arr));
        return;
      }
      if(cur_val>n)
      return;
      
      cur_arr.add(cur_val); // Taken 
      backtrack(cur_val+1,n,k,cur_arr,result);
      
      cur_arr.remove(cur_arr.size()-1); // Not taken
      backtrack(cur_val+1,n,k,cur_arr,result);
    }
   
    }
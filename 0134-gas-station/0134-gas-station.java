class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0;
        int tcost=0;
        for(int i=0;i<gas.length;i++){
            tgas+=gas[i];
            tcost+=cost[i];
        }
        if(tgas<tcost){
            return -1;
        }
        int s=0;
        int tank=0;
        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
            if(tank<0){
                s=i+1;
                tank=0;
            }
        }
        return s;

    }
}
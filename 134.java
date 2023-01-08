class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int totGas = 0, totCost = 0;
        for(int i = 0 ; i<n; i++){
            totGas += gas[i];
            totCost += cost[i];
        }
        if(totGas < totCost) 
            return -1;

        int remGas = 0, a = 0;
        for(int i = 0 ; i < n; i++){
            remGas = remGas +(gas[i] - cost[i]);
            if(remGas < 0 ){
                a = i+1;
                remGas = 0;
            }
        }
        return a;
    }
}

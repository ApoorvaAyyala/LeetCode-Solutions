class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            queue.add(i);
        }
        int seconds=0;
        while(!queue.isEmpty()){
            int person=queue.poll();
            seconds++;
            tickets[person]--;
            if(person==k && tickets[person]==0){
                return seconds;
            }
            if(tickets[person]>0){
                queue.add(person);
            }
        }
        return seconds;
    }
}
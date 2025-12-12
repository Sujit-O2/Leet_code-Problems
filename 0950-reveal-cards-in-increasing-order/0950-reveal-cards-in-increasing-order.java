class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int a[]=new int[deck.length];
        Arrays.sort(deck);
        Queue<Integer> qq=new LinkedList();
        for(int i=0;i<deck.length;i++){
            qq.offer(i);
        }
        for(int i:deck){
            a[qq.poll()]=i;
            if(!qq.isEmpty()){
                qq.offer(qq.poll());
            }
        }
        return a;
        
    }
}
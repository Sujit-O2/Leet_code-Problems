class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> ii=new Stack();
        int num=1;
        StringBuffer bb=new StringBuffer();
        for(char c:pattern.toCharArray()){
            ii.push(num++);
            if(c == 'I'){
                while(!ii.isEmpty()){
                    bb.append(ii.pop());


                }
            }

        }
        ii.push(num);

        while (!ii.isEmpty()) {
            bb.append(ii.pop());
        }
        return bb.toString();
        
    }
}
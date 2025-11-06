class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         ArrayList<String> list = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<>();
        for(String word : s1.split(" ")) {
        	map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String word : s2.split(" ")) {
        	map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String w : map.keySet()) {
        	if(map.get(w) ==1) {
        		list.add(w);
        	}
        }
        String[] res = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	res[i] = list.get(i);
        }
        return res;
    }
}
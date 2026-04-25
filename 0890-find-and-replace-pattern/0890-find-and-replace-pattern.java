class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        String p = normalize(pattern);

        for(String word : words){
            if(normalize(word).equals(p)){
                ans.add(word);
            }
        }

        return ans;
    }

    private String normalize(String s){
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int id = 0;

        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,id++);
            }
            sb.append(map.get(ch)).append(",");
        }

        return sb.toString();
    }
}
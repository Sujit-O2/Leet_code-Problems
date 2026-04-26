class Solution {

    int[] parent = new int[26];

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for(int i=0;i<26;i++){
            parent[i]=i;
        }

        // union equivalent chars
        for(int i=0;i<s1.length();i++){

            int a = s1.charAt(i)-'a';
            int b = s2.charAt(i)-'a';

            union(a,b);
        }

        StringBuilder ans = new StringBuilder();

        // build result
        for(char c : baseStr.toCharArray()){
            ans.append((char)(find(c-'a')+'a'));
        }

        return ans.toString();
    }

    private int find(int x){
        if(parent[x]==x)
            return x;

        return parent[x]=find(parent[x]); // path compression
    }

    private void union(int a,int b){

        int pa=find(a);
        int pb=find(b);

        if(pa==pb) return;

        // smaller lexicographic root becomes parent
        if(pa < pb){
            parent[pb]=pa;
        }else{
            parent[pa]=pb;
        }
    }
}
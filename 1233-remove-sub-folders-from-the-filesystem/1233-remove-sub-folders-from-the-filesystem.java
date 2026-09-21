class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String >aa= new ArrayList<String>();
        String pa="";
        Arrays.sort(folder);
        for(String s: folder){
            if (pa.isEmpty() || !s.startsWith(pa + "/")) {
                aa.add(s);
                pa=s;

            }

        }
        return aa;
        
    }
}
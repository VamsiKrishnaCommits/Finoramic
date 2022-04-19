public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    
      HashMap<HashMap<String,Integer>,ArrayList<Integer>> hm=new HashMap<>();
        
        for(int j=0;j<A.size();j++){
String a=A.get(j);
        HashMap<String , Integer> h=new HashMap<String,Integer>();
            for(int i=0;i<a.length();i++){
h.put(a.charAt(i)+"",h.getOrDefault(a.charAt(i)+"",0)+1);
            
            }
            if(hm.get(h)==null){
ArrayList<Integer> l=new ArrayList<Integer>();
                l.add(j+1);
                hm.put(h,l);
            }
            else{
                hm.get(h).add(j+1);
            } 
        }
       ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        for(Map.Entry<HashMap<String,Integer>,ArrayList<Integer>> e: hm.entrySet()){
        a.add(e.getValue());
        }
        
        return a;    
    
    
    }
}

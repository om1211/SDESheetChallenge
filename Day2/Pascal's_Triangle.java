class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> r,prev=null;
        for(int i=0;i<numRows;++i)
        {
            r=new ArrayList<Integer>();
            for(int j=0;j<=i;++j)
            {
                if(j==0 || j==i)
                {
                    r.add(1);
                }
                else{
                    r.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=r;
            res.add(r);
        }
        return res;
    }
}

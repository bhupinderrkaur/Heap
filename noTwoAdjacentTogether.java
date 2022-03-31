class Solution
{
	static class Pair
	{
	    char ch;
	    int freq;
	    
	    Pair(char ch,int freq)
	    {
	        this.ch = ch;
	        this.freq = freq;
	    }
	};
	
	public static String noTwoAdjacentTogether(String str) 
	{
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(char ch : str.toCharArray())
            hm.put(ch,hm.getOrDefault(ch,0)+1); //put everything in map
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            return b.freq-a.freq;
        }); //max heap sorted acc to freq cz we gotta be greedayyy
        
        for(char ch : hm.keySet())
            pq.add(new Pair(ch,hm.get(ch))); //fill pq from map
            
        StringBuilder sb = new StringBuilder();
            
        while(!pq.isEmpty())
        {
            if(pq.size() == 1 && pq.peek().freq > 1)
                return "-1"; //one element present multiple times
            else if(pq.size() == 1 && pq.peek().freq == 1) 
            {    
                sb.append(pq.peek().ch);
                break;
            }
            else
            {
                Pair temp1 = pq.remove();
                Pair temp2 = pq.remove();
                sb.append(temp1.ch);
                sb.append(temp2.ch);
                
                if(temp1.freq>1)
                    pq.add(new Pair(temp1.ch,temp1.freq-1));
                if(temp2.freq>1)
                    pq.add(new Pair(temp2.ch,temp2.freq-1));
            }
        }
        return sb.toString();
	}
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Replace 
{
	//least recently used replacement
	private String LRU(String refstring, int capacity)
	{
		//put string into int array
		int[] refInts = Arrays.stream(refstring.substring(1, refstring.length()-1).split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		
		//fault location tracker
		int[] faultLocation = new int[20];
		HashSet<Integer> frame = new HashSet<>(capacity);
		HashMap<Integer, Integer> index = new HashMap<>();
		int pageFaults = 0;
		
		//iterate through array
		for(int j = 0; j<refInts.length; j++)
		{
			if(frame.size() < capacity)
			{
				//check if the frame contains current character
				if(!frame.contains(refInts[j]))
				{
					//add new character to frame and increment page faults
					frame.add(refInts[j]);
					faultLocation[j] = refInts[j];
					pageFaults++;
					
				}
				
				index.put(refInts[j], j);
				
			}
			else
			{
				if(!frame.contains(refInts[j]))
				{
					//log least recently used
					int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;
					Iterator<Integer> it = frame.iterator();
					while (it.hasNext()) {
						int temp = it.next();
						if(index.get(temp)<lru)
						{
							lru = index.get(temp);
							val = temp;
						}
					}
					frame.remove(val);
					index.remove(val);
					frame.add(refInts[j]);
					
					pageFaults++;
				}
				
				index.put(refInts[j], j);
			}
			
		}
		
		String numberofframes = Integer.toString((int)Math.ceil(refInts.length/capacity));
		String faultLocations = Arrays.toString(faultLocation);
		String faults = Integer.toString(pageFaults);
		String finalString = "Number of Frames: "+ numberofframes +"\n"+ "Fault Locations: "+faultLocations+"\n" + "Faults: "+faults;
		return finalString;

	}
	
	//first in first out replacement
	private String FIFO(String refstring, int capacity)
	{
		int[] refInts = Arrays.stream(refstring.substring(1, refstring.length()-1).split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		int[] faultLocation = new int[20];
		
		HashSet<Integer> frame = new HashSet<>(capacity);
		Queue<Integer> index = new LinkedList<>();
		
			 int pageFaults = 0; 
			    for (int i=0; i<refInts.length; i++) 
			    {  
			        if (frame.size() < capacity) 
			        { 
			            //insert it into set if not present 
			            if (!frame.contains(refInts[i])) 
			            { 
			                frame.add(refInts[i]);  
			                faultLocation[i] = refInts[i];
			                pageFaults++; 
			   
			                //push the current page into the queue 
			                index.add(refInts[i]); 
			            } 
			        } 
			   
			        //else do fifo if set is full
			        else
			        {
			            if (!frame.contains(refInts[i])) 
			            { 
			                int val = index.peek(); 
			                index.poll(); 
			                frame.remove(val); 
			                frame.add(refInts[i]); 
			    
			                index.add(refInts[i]); 
			   
			                pageFaults++; 
			            } 
			        } 
			    } 
			    
		String numberofframes = Integer.toString((int)Math.ceil(refInts.length/capacity));
		String faultLocations = Arrays.toString(faultLocation);
		String faults = Integer.toString(pageFaults);
		String finalString = "Number of Frames: "+ numberofframes +"\n"+ "Fault Locations: "+faultLocations+"\n" + "Faults: "+faults;
		return finalString;
		
	}
	
	//optimal replacement
	private String Optimal(String refstring, int capacity)
	{
		int[] refInts = Arrays.stream(refstring.substring(1, refstring.length()-1).split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		int[] faultLocation = new int[20];
		
		
		return refstring;
		
	}
	
	
	//public methods for running replacement algorithms
	public String runLRU(String refstring, int frameCapacity)
	{
		return LRU(refstring, frameCapacity);
	}
	public String runFIFO(String refstring, int frameCapacity)
	{
		return FIFO(refstring, frameCapacity);
	}
	public String runOpt(String refstring, int frameCapacity)
	{
		return Optimal(refstring, frameCapacity);
	}
}

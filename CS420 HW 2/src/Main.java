import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main
{
	PrintWriter FileWriter;
	File lruOut = new File("LRU_BAW.txt");
	File fifoOut = new File("FIFO_BAW.txt");
	File optimalOut = new File("Optimal_BAW.txt");
	Replace replacementAlg = new Replace();
	String refString = "[1, 2, 3, 4, 2, 1, 5, 6, 2, 1, 2, 3, 7, 6, 3, 2, 1, 2, 3, 6]";
	
	public static void main(String[] args) 
	{
		Main m = new Main();
		int frameCapacity = 3;
		//run LRU replacement alg
		m.replaceLRU(frameCapacity);
		//run FIFO replacement alg
		m.replaceFIFO(frameCapacity);
		//run optimal replacement alg
		m.replaceOptimal(frameCapacity);

	}
	
	private void replaceLRU(int frameCapacity)
	{
		Main m = new Main();
		
		/*pass reference string to public run class of replace
		 *store faults in output
		*/
		String lruOutput = m.replacementAlg.runLRU(m.refString, frameCapacity);
		
		
		//print to screen 
		System.out.printf("Reference string: %s\n", refString);
		System.out.printf("LRU output: %s \n\n", lruOutput);
		try {
			//file to write to
			m.FileWriter = new PrintWriter(m.lruOut);
			//string to write to file
			m.FileWriter.printf("Reference string: %s\n", refString);
			m.FileWriter.println(lruOutput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.FileWriter.close();
	}
	
	private void replaceFIFO(int frameCapacity)
	{
		Main m = new Main();
		
		/*pass reference string to public run class of replace
		 *store faults in output
		*/
		String fifoOutput = replacementAlg.runFIFO(m.refString, frameCapacity);
	
		
		//print to screen 
		System.out.printf("Reference string: %s\n", refString);
		System.out.printf("FIFO output: %s \n\n", fifoOutput);
		try {
			//file to write to
			m.FileWriter = new PrintWriter(m.fifoOut);
			//string to write to file
			m.FileWriter.printf("Reference string: %s\n", refString);
			m.FileWriter.println(fifoOutput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.FileWriter.close();
	}
	
	private void replaceOptimal(int frameCapacity)
	{
		
		Main m = new Main();
		
		/*pass reference string to public run class of replace
		 *store faults in output
		*/
		String optOutput = replacementAlg.runOpt(m.refString, frameCapacity);
		
		//print to screen 
		System.out.printf("Reference string: %s\n", refString);
		System.out.printf("Optimal output: %s \n\n", optOutput);
		try {
			//file to write to
			m.FileWriter = new PrintWriter(m.optimalOut);
			//string to write to file
			m.FileWriter.printf("Reference string: %s\n", refString);
			m.FileWriter.println(optOutput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.FileWriter.close();
	}
	
}

import edu.iastate.cs.ptolemy.runtime.diagnostics.Contract;

public class Point extends Fig{
	int x, y;
	
	void setX(int x){
		announce Changed(this){
			System.out.println("[Announce, Start]");
			this.x = x;
			System.out.println("[Announce, End]");
		}
	}
}
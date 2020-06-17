
public class Main {

	public static void main(String[] args) {
		int[][] test1 = {
			{1, 2, 3},
			{4, 5, 6},
			{1, 1, 1}
		};
		
		int[][] test2 = {
				{7, 8, 1},
				{9, 10, 1},
				{11, 12, 1}
		};
		
		print(
			add(test1, test2)
		);
		
		print(
			subtract(test1, test2)
		);
		
		print(
			multiply(test1, test2)
		);
	}
	
	public static int[][] multiply(int[][] a1, int[][] a2) {
	    if(a1.length != a2[0].length){ return null; }
	    if(a1[0].length != a2.length){ return null; }

	    int xBounds = Math.min(a1.length, a2.length);
	    int yBounds = Math.min(a1[0].length, a2[0].length);

	    int[][] a3 = new int[xBounds][yBounds];
	    
	    for(int x=0; x<a3.length; x++) {
	    	for(int y=0; y<a3[0].length; y++) {
	    		
	    		int sum = 0;
	    		for(int m=0; m<a1[0].length; m++) {
	    			sum += (a1[x][m] * a2[m][y]);
	    		}
	    		
	    		
	    		
	    		a3[x][y] = sum;
	    	}
	    }
	    


	    return a3;
	}
	

	


	  public static int[][] add(int[][] a1, int[][] a2) {
	    if(a1.length != a2.length){ return null; }
	    if(a1[0].length != a2[0].length){ return null; }
	    int[][] a3 = new int[a1.length][a1[0].length];

	    for(int x=0; x<a1.length; x++){
	      for(int y=0; y<a1[0].length; y++){
	        a3[x][y] = a1[x][y] + a2[x][y];
	      }
	    }
	    
	    return a3;
	  }

	  public static int[][] subtract(int[][] a1, int[][] a2) {
	    if(a1.length != a2.length){ return null; }
	    if(a1[0].length != a2[0].length){ return null; }
	    int[][] a3 = new int[a1.length][a1[0].length];

	    for(int x=0; x<a1.length; x++){
	      for(int y=0; y<a1[0].length; y++){
	        a3[x][y] = a1[x][y] - a2[x][y];
	      }
	    }
	    
	    return a3;
	  }
	  
	  private static void print(int[][] a) {
		  if(a == null) {
			  System.out.println("Illegal Arguments Provided");
			  return;
		  }
		  
		  for(int x=0; x<a.length; x++){
		      for(int y=0; y<a[0].length; y++){
		    	  int n = a[x][y];
		    	  String s = n + "";
		    	  if(Math.abs(n) < 10){ s = " " + s; }
		    	  if(n >= 0){ s = " " + s; }
		    	  
		    	  System.out.print(s);
		      }
		      System.out.println();
		  }
		  System.out.println();
	  }
}

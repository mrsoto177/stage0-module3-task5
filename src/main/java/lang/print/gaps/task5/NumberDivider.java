package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
    	
    	int divisor = 5;
    	
    	float result = toBeDivided /divisor;
    	
    	System.out.println(result);
    }
    
    public static void main(String[] args) {
        NumberDivider numDivider = new NumberDivider();        
        int toBeDivided = 30;
        numDivider.divide(toBeDivided);
    }
}

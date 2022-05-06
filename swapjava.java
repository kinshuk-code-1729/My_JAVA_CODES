class swapjava{
	public static void main(String args[]){
		int x = 8,y = 6;
		
		System.out.println("Before Swapping");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println("After Swapping");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
    }
}
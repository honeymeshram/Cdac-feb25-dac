class FibonacciSeries{
	public static void main(String []args){
		int prev=0;
		int next=1;
		System.out.print(prev+" "+next);
		for(int i=3;i<11;i++){
			int res=prev+next;
			System.out.print(" "+res);
			prev=next;
			next=res;
		}
	}
}
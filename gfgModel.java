	public static void main (String[] args) 
	{
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int N,W;
		    N=s.nextInt();
		    W=s.nextInt();
		    int [] weight=new int [N];
		    int [] value=new int [N];
		    for(int j=0;j<N;j++)
		    {
		        weight[j]=s.nextInt();
		    }
		    for(int j=0;j<N;j++)
		    {
		        value[j]=s.nextInt();
		    }
		    System.out.println(knapSack(weight,value,W,N));
		}
	}

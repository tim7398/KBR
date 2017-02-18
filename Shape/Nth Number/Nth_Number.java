

/*n is current state, N is the biggest state */
public class Nth_Number
{
	public static void Nth(int n, int N) 
	{
		if( n == 0)
		{
			return;
		}
		Nth(--n,N);
		for(int x = 1; x <= N;x++)
		{
			if(x >= (N-n))
			{
			  System.out.print(n+1);
			  continue;
			}
			System.out.print(".");	
		}
		System.out.println();
		return;

	}

	public static void main(String args[]) 
	{
		
		Nth(5,5);
	}

}

// This recursive function should work to find the nth term. 
/*keeps recursing until it gets to the base case, then it calculates how many periods to output based on the current state, which is 1. 
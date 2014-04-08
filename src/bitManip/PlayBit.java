package bitManip;

public class PlayBit {



	
	public static int updateBits (int i, int j, int n ,int m)
	
	{
		int k =0;
		
		int left = ~0 << (j+1);
		
		int right = (1 << i) -1;
		
		//System.out.println(left);
		
		int mask = left | right;
		
		int n_cleared = n & mask;
		
		int m_shifted = m << i;
		
		k = n_cleared | m_shifted;
		
		return k;
	}
	
	public static int bitSwap(int a , int b)
	{
		int f = 0;
		
		for (int c = a^b; c!=0; c = c >> 1)
		{
			f = f + (c & 1);
		}
				
		return f;
		
	}
	
	public static int evenOdd(int a)
	{
		
		return (  ( (a & 0xaaaaaaaa) >> 1) | ( (a & 0x55555555) << 1) ); 
		
	}
	
	public static void main(String[] args) {
		
		long maxInt = ((long)Integer.MAX_VALUE) + 1;
		System.out.println(maxInt/8);
		//byte[] bitVector = new byte[(int) maxInt/8];
		
		System.out.println(maxInt);
		System.out.println(updateBits(2,6,512,19));

		int p = ~0 << 5;
		p = (1 << 4) - 1;
		System.out.println(Integer.toBinaryString(p));
		
		p = (1 << 5) - 1;
		
		System.out.println(bitSwap(29,15));
		
		System.out.println(Integer.toBinaryString(36));
		
		System.out.println(Integer.toBinaryString(evenOdd(26)));
	}

}

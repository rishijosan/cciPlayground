package bitManip;

public class bitPacking {

	public static long maxInt = ((long)Integer.MAX_VALUE) + 1;
	public static byte[] bitVector = new byte[(int) (maxInt/8)];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setInt(128);
		setInt(111);
		setInt(4746);
		
		System.out.println(getInt(128) + "\n" + getInt(111) + "\n" + getInt(4746)  + "\n" + getInt(8336)  );
		

	}
	
	public static void setInt (int n)
	{
		bitVector[n/8] |= 1 << (n%8);
	}
	
	public static boolean getInt (int n)
	{
		int contByte = bitVector[n/8];
		return (contByte >> (n%8) & 1) == 1;
	
	}

}

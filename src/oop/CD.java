package oop;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class CD {
	
	int ID;
	String name;
	Set<Song> songs;
	Hashtable<String, String> table;
	
	
	public static void main(String[] args)
	{
		
		CD disc1 = new CD();
		disc1.songs.add(new Song());
	}

}

class Song{
	
	String name;
	String Album;
	String Artist;
}
package oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Jigsaw {

	ArrayList<ArrayList<piece>> jigsaw = new ArrayList<ArrayList<piece>>();
	piece[][] puzzle = new piece[8][8];
	
}



class piece{

int row;
int col;

HashMap<Integer,Integer> testH;

piece left;
piece right;
piece up;
piece down;

public piece(int row, int col)
{
	this.row = row;
	this.col = col;
	testH = new HashMap<Integer,Integer>();
	testH.put(1,2);
}




}



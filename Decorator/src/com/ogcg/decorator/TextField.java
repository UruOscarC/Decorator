package com.ogcg.decorator;

public class TextField implements Widget {

	private int width, height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }
	    
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("TXTField: " + width + ", " + height );
	}

}

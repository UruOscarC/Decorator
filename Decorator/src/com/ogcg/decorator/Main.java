package com.ogcg.decorator;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Widget widget = 
			new BorderDecorator(
				new BorderDecorator(
					new ScrollDecorator(
						new TextField(80, 24)
					)
					, "red", "big"
				)
			);
		widget.draw();
	}
}
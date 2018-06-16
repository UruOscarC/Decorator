package com.ogcg.decorator;

public class BorderDecorator extends Decorator {
	
	private String color;
	private String size;
	
	public BorderDecorator(Widget widget) {
        super(widget);
        this.color =  "black" ;
        this.size = "small";
    }
	
    public BorderDecorator(Widget widget, String color, String size) {
        super(widget);
        this.color = color != null ? color : "black" ;
        this.size = size != null ? size : "small";
    }
    
    public void draw() {
        super.draw();
        System.out.println("  BorderDecorator:" + color + "-" + size);
    }
}

package rollball.model;

import rollball.common.P2d;

public class RectBoundingBox implements BoundingBox {

	private P2d p0,p1;
	
	public RectBoundingBox(P2d p0, P2d p1){
		this.p0 = p0;
		this.p1 = p1;
	}
	
	public P2d getULCorner(){
		return p0;
	}
	
	public P2d getBRCorner(){
		return p1;
	}
	
	//check if the ball is in beetwen the obj perimeter
	public boolean isCollidingWith(P2d p, double radius){
		return (p.y + radius > p1.y && p.y - radius < p0.y && p.x + radius > p0.x && p.x - radius < p1.x);
	}
}

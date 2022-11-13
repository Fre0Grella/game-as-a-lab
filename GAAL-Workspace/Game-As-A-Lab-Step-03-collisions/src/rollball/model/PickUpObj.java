package rollball.model;

import rollball.common.*;

public class PickUpObj extends GameObject {

	private double edge;
	
	public PickUpObj(P2d pos, double edge){
		super(pos, new V2d(0,0),new RectBoundingBox(new P2d(pos.x - edge/2, pos.y + edge/2), 
		new P2d(pos.x + edge/2, pos.y - edge/2)));
		this.edge = edge;
	}
	
	public double getEdge(){
		return edge;
	}
	
}

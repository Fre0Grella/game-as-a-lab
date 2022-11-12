package rollball.input;

import rollball.common.V2d;
import rollball.model.Ball;
import rollball.model.World;



public class Move implements Command {
    

    Direction dir;

    public Move(Direction dir) {
        this.dir = dir;
    }



    @Override
    public void execute(World scene) {
        Ball ball = scene.getBall();
		double speed = ball.getCurrentVel().module();
		ball.setVel(new V2d(dir.getX(),dir.getY()).mul(speed));
    }
    
}

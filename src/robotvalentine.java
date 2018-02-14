import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class robotvalentine {
private static final Color Color = null;

public static void main(String[] args) {
	
	Robot Tim = new Robot();
Robot.setWindowImage("hearts.jpeg");

Tim.penDown();
Object red;
Tim.setPenColor(Color.orange);
Tim.setSpeed(80);
Tim.setPenWidth(50);
Tim.setAngle(30);
Tim.move(150);
for(int i = 0; i < 180; i++) {
Tim.move(1);
Tim.turn(-1);}

Tim.setAngle(-30);
for(int i = 0; i < 180; i++) {
Tim.move(1);
Tim.turn(-1);}
Tim.move(200);
Tim.moveTo(100, 250);
Tim.setAngle(0);
Tim.move(300);
Tim.moveTo(800, 200);


































}

}

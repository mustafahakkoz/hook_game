
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Lvl1Pane extends Pane{
	BooleanProperty piece1Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece2Completed = new SimpleBooleanProperty(false);
	BooleanProperty collision = new SimpleBooleanProperty(false);
	
	
	public Lvl1Pane() {
		paintLvl1();
		
	}
	
	public void paintLvl1() {

		//first piece (right to left)
		Circle circle1 = new Circle();
	    circle1.setCenterX(320);
	    circle1.setCenterY(170);
	    circle1.setRadius(18);
	    circle1.setStroke(Color.rgb(90,86,83));
	    
	    Line line1 = new Line(302, 170, 48, 170);
	    line1.setStrokeWidth(1);
	    line1.setStroke(Color.rgb(90,86,83));
	    
	    Line line2 = new Line(48, 170, 48, 44);
	    line2.setStrokeWidth(1);
	    line2.setStroke(Color.rgb(90,86,83));
	    
	    Line line3 = new Line(48, 44, 58, 44);
	    line3.setStrokeWidth(1);
	    line3.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline1 = new Line(58, 34, 58, 54);
	    vBoldline1.setStrokeWidth(3);
	    vBoldline1.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline1 = new Line(58, 44, 212, 44);
	    Boldline1.setStrokeWidth(3);
	    Boldline1.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle1= new Arc(232,44,20,20,0,180);
	    halfCircle1.setStrokeWidth(3);
	    halfCircle1.setStroke(Color.rgb(90,86,83));
	    halfCircle1.setType(ArcType.OPEN);
	    halfCircle1.setFill(Color.TRANSPARENT);
	    
	    Line Boldline2 = new Line(252, 44, 292, 44);
	    Boldline2.setStrokeWidth(3);
	    Boldline2.setStroke(Color.rgb(90,86,83));
	    
	    //second piece (right to left)
	    Line Boldline3 = new Line(232, 37, 232, 153);
	    Boldline3.setStrokeWidth(3);
	    Boldline3.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline2 = new Line(222, 153, 242, 153);
	    vBoldline2.setStrokeWidth(3);
	    vBoldline2.setStroke(Color.rgb(90,86,83));
	    
	    Line line4 = new Line(232, 153, 232, 208);
	    line4.setStrokeWidth(1);
	    line4.setStroke(Color.rgb(90,86,83));
	    
	    Circle circle2 = new Circle();
	    circle2.setCenterX(232);
	    circle2.setCenterY(226);
	    circle2.setRadius(18);
	    circle2.setStroke(Color.rgb(90,86,83));
	    
	    getChildren().clear();  
	    getChildren().addAll(circle1, line1, line2,line3,vBoldline1,Boldline1,halfCircle1,Boldline2,Boldline3,vBoldline2,line4,circle2);
	
	    // Create a handler for moving piece1
	    EventHandler<ActionEvent> eventHandler1 = e1 -> {
	    	//if there's no collision, move nodes
	    	if(Boldline2.getStartY()<Boldline3.getStartY() || Boldline2.getStartX()!=Boldline3.getStartX() ){
		       if(vBoldline1.getEndY()-vBoldline1.getStartY()<41) {
		    	   vBoldline1.setEndY(vBoldline1.getEndY()+1);
		    	   vBoldline1.setStartY(vBoldline1.getStartY()-1);
		       }
		       if(Boldline1.getEndX()!=58) {
		    	   Boldline1.setEndX(Boldline1.getEndX()-1);	    	   
		       }	       
		       if(halfCircle1.getCenterX()+20!=58) {
		    	   halfCircle1.setCenterX(halfCircle1.getCenterX()-1);
		       }
		       if(Boldline2.getStartX()!=58) {
		    	   Boldline2.setStartX(Boldline2.getStartX()-1);
		    	   Boldline2.setEndX(Boldline2.getEndX()-1);	    	   
		       }
		       if(Boldline2.getStartX()==58 && Boldline2.getEndX()!=58) {
		    	   Boldline2.setEndX(Boldline2.getEndX()-1);
		       }
		       if(Boldline2.getEndX()==58) piece1Completed.setValue(true);
	    	}
	    	else collision.setValue(true);
	      };
	      
	   // Create a handler for moving piece2
	      EventHandler<ActionEvent> eventHandler2 = e2 -> {	    	  
		       if(vBoldline2.getEndX()-vBoldline2.getStartX()<41) {
		    	   vBoldline2.setEndX(vBoldline2.getEndX()+1);
		    	   vBoldline2.setStartX(vBoldline2.getStartX()-1);
		       }
		       if(Boldline3.getStartY()!=153) {
		    	   Boldline3.setStartY(Boldline3.getStartY()+1);	    	   
		       }
		      if(Boldline3.getStartY()==153) piece2Completed.setValue(true);
		      };
		
		
		      
		      
	    
	   // Create an animation for moving piece1
		Timeline animation1 = new Timeline(
		new KeyFrame(Duration.millis(10), eventHandler1));
		animation1.setCycleCount(Timeline.INDEFINITE);
		
		// Create an animation for moving piece2
		Timeline animation2 = new Timeline(
				new KeyFrame(Duration.millis(10), eventHandler2));
		animation2.setCycleCount(Timeline.INDEFINITE);
		
		// Start animation when click on filled circle	    
	    circle1.setOnMouseClicked(e1->animation1.play());
	    circle2.setOnMouseClicked(e2->animation2.play());
	    
	    collision.addListener(ov ->{
	    	animation1.stop();
	    	animation2.stop();
	    	collision.setValue(false);
	    	paintLvl1();
	    });
	    
	    piece1Completed.addListener(ov -> DisplayGame.completedLevels[0].setValue(true));
	    
	   // if(piece1Completed.getValue()==true && piece2Completed.getValue()==true)DisplayGame.completedLevels[0].setValue(true);
	}
}

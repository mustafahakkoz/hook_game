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

public class Lvl3Pane extends Pane{
	BooleanProperty piece1Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece2Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece3Completed = new SimpleBooleanProperty(false);
	BooleanProperty collision = new SimpleBooleanProperty(false);
	
	public Lvl3Pane() {
		paintLvl3();
	}
	
	public void paintLvl3() {
		
		//first piece (left to right)
		Circle circle1 = new Circle();
	    circle1.setCenterX(64);
	    circle1.setCenterY(181);
	    circle1.setRadius(18);
	    circle1.setStroke(Color.rgb(90,86,83));
	    
	    Line line1 = new Line(82, 181, 304, 181);
	    line1.setStrokeWidth(1);
	    line1.setStroke(Color.rgb(90,86,83));
	    
	    Line line2 = new Line(304, 181, 304, 171);
	    line2.setStrokeWidth(1);
	    line2.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline1 = new Line(299, 171, 309, 171);
	    vBoldline1.setStrokeWidth(3);
	    vBoldline1.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline1 = new Line(304, 171, 304, 123);
	    Boldline1.setStrokeWidth(3);
	    Boldline1.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle1= new Arc(304,103,20,20,90,-180);
	    halfCircle1.setStrokeWidth(3);
	    halfCircle1.setStroke(Color.rgb(90,86,83));
	    halfCircle1.setType(ArcType.OPEN);
	    halfCircle1.setFill(Color.TRANSPARENT);
	    
	    Line Boldline2 = new Line(304, 83, 304, 49);
	    Boldline2.setStrokeWidth(3);
	    Boldline2.setStroke(Color.rgb(90,86,83));
	    
	    //second piece (left to right)
	    Circle circle2 = new Circle();
	    circle2.setCenterX(116);
	    circle2.setCenterY(210);
	    circle2.setRadius(18);
	    circle2.setStroke(Color.rgb(90,86,83));
	    
	    Line line3 = new Line(134, 210, 218, 210);
	    line3.setStrokeWidth(1);
	    line3.setStroke(Color.rgb(90,86,83));
	    
	    Line line4 = new Line(218, 210, 218, 103);
	    line4.setStrokeWidth(1);
	    line4.setStroke(Color.rgb(90,86,83));
	    
	    Line line5 = new Line(218, 103, 228, 103);
	    line5.setStrokeWidth(1);
	    line5.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline2 = new Line(228, 98, 228, 108);
	    vBoldline2.setStrokeWidth(3);
	    vBoldline2.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline3 = new Line(228, 103, 311, 103);
	    Boldline3.setStrokeWidth(3);
	    Boldline3.setStroke(Color.rgb(90,86,83));
	    
	    //third piece (left to right)
	    Circle circle3 = new Circle();
	    circle3.setCenterX(180);
	    circle3.setCenterY(251);
	    circle3.setRadius(18);
	    circle3.setStroke(Color.rgb(90,86,83));
	    
	    Line line6 = new Line(180, 233, 180, 56);
	    line6.setStrokeWidth(1);
	    line6.setStroke(Color.rgb(90,86,83));
	    
	    Line line7 = new Line(180, 56, 190, 56);
	    line7.setStrokeWidth(1);
	    line7.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline3 = new Line(190, 51, 190, 61);
	    vBoldline3.setStrokeWidth(3);
	    vBoldline3.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline4 = new Line(190, 56, 284, 56);
	    Boldline4.setStrokeWidth(3);
	    Boldline4.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle2= new Arc(304,56,20,20,0,180);
	    halfCircle2.setStrokeWidth(3);
	    halfCircle2.setStroke(Color.rgb(90,86,83));
	    halfCircle2.setType(ArcType.OPEN);
	    halfCircle2.setFill(Color.TRANSPARENT);
	    
	    Line Boldline5 = new Line(324, 56, 373, 56);
	    Boldline5.setStrokeWidth(3);
	    Boldline5.setStroke(Color.rgb(90,86,83));
	    
	    getChildren().clear();  
	    getChildren().addAll(circle1,line1,line2,vBoldline1,Boldline1,halfCircle1,Boldline2,circle2,line3,line4,line5,vBoldline2,Boldline3,circle3,line6,line7,vBoldline3,Boldline4,halfCircle2,Boldline5);
	    
	 // Create a handler for moving piece1
	    EventHandler<ActionEvent> eventHandler1 = e1 -> {
	    	//collision conditions for piece1
	    	if(Boldline3.getEndX()>Boldline2.getStartX() && Boldline3.getEndY()==Boldline2.getStartY() ){
	    		collision.setValue(true);
	    	}
	    	
	    	//Move nodes, if there's no collision
	    	else {
		       if(vBoldline1.getEndX()-vBoldline1.getStartX()<41) {
		    	   vBoldline1.setEndX(vBoldline1.getEndX()+1);
		    	   vBoldline1.setStartX(vBoldline1.getStartX()-1);
		       }
		       if(Boldline1.getEndY()!=171) {
		    	   Boldline1.setEndY(Boldline1.getEndY()+1);	    	   
		       }	       
		       if(halfCircle1.getCenterY()-20!=171) {
		    	   halfCircle1.setCenterY(halfCircle1.getCenterY()+1);
		       }
		       if(Boldline2.getStartY()!=171) {
		    	   Boldline2.setEndY(Boldline2.getEndY()+1);
		    	   Boldline2.setStartY(Boldline2.getStartY()+1);	    	   
		       }
		       if(Boldline2.getStartY()==171 && Boldline2.getEndY()!=171) {
		    	   Boldline2.setEndY(Boldline2.getEndY()+1);
		       }
		       if(Boldline2.getEndY()==171) piece1Completed.setValue(true);
	    	}
	      };
	      
	   // Create a handler for moving piece2
	      EventHandler<ActionEvent> eventHandler2 = e2 -> {	    	  
		       if(vBoldline2.getEndY()-vBoldline2.getStartY()<41) {
		    	   vBoldline2.setEndY(vBoldline2.getEndY()+1);
		    	   vBoldline2.setStartY(vBoldline2.getStartY()-1);
		       }
		       if(Boldline3.getEndX()!=228) {
		    	   Boldline3.setEndX(Boldline3.getEndX()-1);	    	   
		       }
		      if(Boldline3.getEndX()==228) piece2Completed.setValue(true);
		      };
	      
	   // Create a handler for moving piece3
	    EventHandler<ActionEvent> eventHandler3 = e3 -> {
	    	//collision conditions for piece3
	    	if(Boldline2.getEndY()<Boldline5.getStartY() && Boldline2.getEndX()==Boldline5.getStartX() ){
	    		collision.setValue(true);
	    	}
	    	
	    	//Move nodes, if there's no collision
	    	else {
		       if(vBoldline3.getEndY()-vBoldline3.getStartY()<41) {
		    	   vBoldline3.setEndY(vBoldline3.getEndY()+1);
		    	   vBoldline3.setStartY(vBoldline3.getStartY()-1);
		       }
		       if(Boldline4.getEndX()!=190) {
		    	   Boldline4.setEndX(Boldline4.getEndX()-1);	    	   
		       }	       
		       if(halfCircle2.getCenterX()+20!=190) {
		    	   halfCircle2.setCenterX(halfCircle2.getCenterX()-1);
		       }
		       if(Boldline5.getStartX()!=190) {
		    	   Boldline5.setEndX(Boldline5.getEndX()-1);
		    	   Boldline5.setStartX(Boldline5.getStartX()-1);	    	   
		       }
		       if(Boldline5.getStartX()==190 && Boldline5.getEndX()!=190) {
		    	   Boldline5.setEndX(Boldline5.getEndX()-1);
		       }
		       if(Boldline5.getEndX()==190) piece3Completed.setValue(true);
	    	}
		};
		      
	    // Create an animation for moving piece1
 		Timeline animation1 = new Timeline(
 		new KeyFrame(Duration.millis(10), eventHandler1));
 		animation1.setCycleCount(Timeline.INDEFINITE);
 		
 		// Create an animation for moving piece2
 		Timeline animation2 = new Timeline(
 		new KeyFrame(Duration.millis(10), eventHandler2));
 		animation2.setCycleCount(Timeline.INDEFINITE);
 		
 		// Create an animation for moving piece3
 		Timeline animation3 = new Timeline(
 		new KeyFrame(Duration.millis(10), eventHandler3));
 		animation3.setCycleCount(Timeline.INDEFINITE);
 		
 		// Start animation when click on filled circle	    
 	    circle1.setOnMouseClicked(e1->animation1.play());
 	    circle2.setOnMouseClicked(e2->animation2.play());
 	    circle3.setOnMouseClicked(e3->animation3.play());
 	    
 	    collision.addListener(ov ->{
 	    	animation1.stop();
 	    	animation2.stop();
 	    	animation3.stop();
 	    	collision.setValue(false);
 	    	paintLvl3();
 	    });
 	    
 	   piece3Completed.addListener(ov -> DisplayGame.completedLevels[2].setValue(true));
 	    //if(piece1Completed.getValue()==true && piece2Completed.getValue()==true && piece3Completed.getValue()==true)DisplayGame.completedLevels[2].setValue(true);
 	
	}
}
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

public class Lvl2Pane extends Pane{
	BooleanProperty piece1Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece2Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece3Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece4Completed = new SimpleBooleanProperty(false);
	BooleanProperty collision = new SimpleBooleanProperty(false);
	
	public Lvl2Pane() {
		paintLvl2();
	}
	
	public void paintLvl2() {
		
		//first piece (left to right)
		Circle circle1 = new Circle();
	    circle1.setCenterX(65);
	    circle1.setCenterY(264);
	    circle1.setRadius(18);
	    circle1.setStroke(Color.rgb(90,86,83));
	    
	    Line line1 = new Line(65, 246, 65, 65);
	    line1.setStrokeWidth(1);
	    line1.setStroke(Color.rgb(90,86,83));
		
	    Line line2 = new Line(65, 65, 75, 65);
	    line2.setStrokeWidth(1);
	    line2.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline1 = new Line(75, 70, 75, 60);
	    vBoldline1.setStrokeWidth(3);
	    vBoldline1.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline1 = new Line(75, 65, 140, 65);
	    Boldline1.setStrokeWidth(3);
	    Boldline1.setStroke(Color.rgb(90,86,83));
	    
	    //second piece (left to right)
	    Circle circle2 = new Circle();
	    circle2.setCenterX(133);
	    circle2.setCenterY(264);
	    circle2.setRadius(18);
	    circle2.setStroke(Color.rgb(90,86,83));
	    
	    Line line3 = new Line(133, 246, 133, 205);
	    line3.setStrokeWidth(1);
	    line3.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline2 = new Line(128, 205, 138, 205);
	    vBoldline2.setStrokeWidth(3);
	    vBoldline2.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline2 = new Line(133, 205, 133, 163);
	    Boldline2.setStrokeWidth(3);
	    Boldline2.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle1= new Arc(133,143,20,20,90,180);
	    halfCircle1.setStrokeWidth(3);
	    halfCircle1.setStroke(Color.rgb(90,86,83));
	    halfCircle1.setType(ArcType.OPEN);
	    halfCircle1.setFill(Color.TRANSPARENT);
	    
	    Line Boldline3 = new Line(133, 123, 133, 85);
	    Boldline3.setStrokeWidth(3);
	    Boldline3.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle2= new Arc(133,65,20,20,90,-180);
	    halfCircle2.setStrokeWidth(3);
	    halfCircle2.setStroke(Color.rgb(90,86,83));
	    halfCircle2.setType(ArcType.OPEN);
	    halfCircle2.setFill(Color.TRANSPARENT);
	    
	    Line Boldline4 = new Line(133, 45, 133, 29);
	    Boldline4.setStrokeWidth(3);
	    Boldline4.setStroke(Color.rgb(90,86,83));
	    
	    //third piece (left to right)
	    Circle circle3 = new Circle();
	    circle3.setCenterX(183);
	    circle3.setCenterY(264);
	    circle3.setRadius(18);
	    circle3.setStroke(Color.rgb(90,86,83));
	    
	    Line line4 = new Line(183, 246, 183, 205);
	    line4.setStrokeWidth(1);
	    line4.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline3 = new Line(178, 205, 188, 205);
	    vBoldline3.setStrokeWidth(3);
	    vBoldline3.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline5 = new Line(183, 205, 183, 136);
	    Boldline5.setStrokeWidth(3);
	    Boldline5.setStroke(Color.rgb(90,86,83));
	     
	    //fourth piece (left to right)
	    Line Boldline6 = new Line(126, 143, 163, 143);
	    Boldline6.setStrokeWidth(3);
	    Boldline6.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle3= new Arc(183,143,20,20,0,180);
	    halfCircle3.setStrokeWidth(3);
	    halfCircle3.setStroke(Color.rgb(90,86,83));
	    halfCircle3.setType(ArcType.OPEN);
	    halfCircle3.setFill(Color.TRANSPARENT);
	    
	    Line Boldline7 = new Line(203, 143, 320, 143);
	    Boldline7.setStrokeWidth(3);
	    Boldline7.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline4 = new Line(320, 138, 320, 148);
	    vBoldline4.setStrokeWidth(3);
	    vBoldline4.setStroke(Color.rgb(90,86,83));
	    
	    Line line5 = new Line(320, 143, 330, 143);
	    line5.setStrokeWidth(1);
	    line5.setStroke(Color.rgb(90,86,83));
	    
	    Line line6 = new Line(330, 143, 330, 246);
	    line6.setStrokeWidth(1);
	    line6.setStroke(Color.rgb(90,86,83));
	    
	    Circle circle4 = new Circle();
	    circle4.setCenterX(330);
	    circle4.setCenterY(264);
	    circle4.setRadius(18);
	    circle4.setStroke(Color.rgb(90,86,83));
	    
	    getChildren().clear();  
	    getChildren().addAll(circle1, line1, line2,vBoldline1,Boldline1,circle2,line3,vBoldline2,Boldline2,halfCircle1,Boldline3,halfCircle2,Boldline4,circle3,line4,vBoldline3,Boldline5,Boldline6,halfCircle3,Boldline7,vBoldline4,line5,line6,circle4);
	
	      // Create a handler for moving piece1
	      EventHandler<ActionEvent> eventHandler1 = e1 -> {	    	  
		       if(vBoldline1.getEndY()-vBoldline1.getStartY()<41) {
		    	   vBoldline1.setEndY(vBoldline1.getEndY()+1);
		    	   vBoldline1.setStartY(vBoldline1.getStartY()-1);
		       }
		       if(Boldline1.getEndX()!=75) {
		    	   Boldline1.setEndX(Boldline1.getEndX()-1);	    	   
		       }
		      if(Boldline1.getEndX()==75) piece1Completed.setValue(true);
		      };
		   
		  // Create a handler for moving piece2      
	      EventHandler<ActionEvent> eventHandler2 = e2 -> {
	    	// collision conditions for piece4
	    	if(Boldline1.getEndX()>Boldline4.getStartX() && Boldline1.getEndY()==Boldline4.getStartY() ){
	    		collision.setValue(true);
	    	}
	    	if(Boldline6.getStartX()<Boldline3.getStartX() && Boldline6.getStartY()==Boldline3.getStartY() ){
	    		collision.setValue(true);
	    	}
	    	
	    	//Move nodes, if there's no collision
	    	else {
		       if(vBoldline2.getEndX()-vBoldline2.getStartX()<41) {
		    	   vBoldline2.setEndX(vBoldline2.getEndX()+1);
		    	   vBoldline2.setStartX(vBoldline2.getStartX()-1);
		       }
		       if(Boldline2.getEndY()!=205) {
		    	   Boldline2.setEndY(Boldline2.getEndY()+1);	    	   
		       }	       
		       if(halfCircle1.getCenterY()-20!=205) {
		    	   halfCircle1.setCenterY(halfCircle1.getCenterY()+1);
		       }
		       if(Boldline3.getStartY()!=205) {
		    	   Boldline3.setStartY(Boldline3.getStartY()+1);
		    	   Boldline3.setEndY(Boldline3.getEndY()+1);	    	   
		       }
		       if(Boldline3.getStartY()==205 && Boldline3.getEndY()!=205) {
		    	   Boldline3.setEndY(Boldline3.getEndY()+1);
		       }
		       if(halfCircle2.getCenterY()-20!=205) {
		    	   halfCircle2.setCenterY(halfCircle2.getCenterY()+1);
		       }
		       if(Boldline4.getStartY()!=205) {
		    	   Boldline4.setStartY(Boldline4.getStartY()+1);
		    	   Boldline4.setEndY(Boldline4.getEndY()+1);	    	   
		       }
		       if(Boldline4.getStartY()==205 && Boldline4.getEndY()!=205) {
		    	   Boldline4.setEndY(Boldline4.getEndY()+1);
		       }
		       if(Boldline4.getEndY()==205) piece2Completed.setValue(true);
	    	}

	      };
	      
	   // Create a handler for moving piece3
	      EventHandler<ActionEvent> eventHandler3 = e3 -> {	    	  
		       if(vBoldline3.getEndX()-vBoldline3.getStartX()<41) {
		    	   vBoldline3.setEndX(vBoldline3.getEndX()+1);
		    	   vBoldline3.setStartX(vBoldline3.getStartX()-1);
		       }
		       if(Boldline5.getEndY()!=205) {
		    	   Boldline5.setEndY(Boldline5.getEndY()+1);	    	   
		       }
		      if(Boldline5.getEndY()==205) piece3Completed.setValue(true);
		      };
	      
	   // Create a handler for moving piece4
	    EventHandler<ActionEvent> eventHandler4 = e4 -> {
	    	//collision conditions for piece4
	    	if(Boldline5.getEndY()<Boldline6.getEndY() && Boldline5.getEndX()==Boldline6.getEndX() ){
	    		collision.setValue(true);
	    	}
	    	
	    	//Move nodes, if there's no collision
	    	else {
		       if(vBoldline4.getEndY()-vBoldline4.getStartY()<41) {
		    	   vBoldline4.setEndY(vBoldline4.getEndY()+1);
		    	   vBoldline4.setStartY(vBoldline4.getStartY()-1);
		       }
		       if(Boldline7.getStartX()!=320) {
		    	   Boldline7.setStartX(Boldline7.getStartX()+1);	    	   
		       }	       
		       if(halfCircle3.getCenterX()-20!=320) {
		    	   halfCircle3.setCenterX(halfCircle3.getCenterX()+1);
		       }
		       if(Boldline6.getEndX()!=320) {
		    	   Boldline6.setEndX(Boldline6.getEndX()+1);
		    	   Boldline6.setStartX(Boldline6.getStartX()+1);	    	   
		       }
		       if(Boldline6.getEndX()==320 && Boldline6.getStartX()!=320) {
		    	   Boldline6.setStartX(Boldline6.getStartX()+1);
		       }
		       if(Boldline2.getStartX()==320) piece4Completed.setValue(true);
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
		
		// Create an animation for moving piece4
		Timeline animation4 = new Timeline(
		new KeyFrame(Duration.millis(10), eventHandler4));
		animation4.setCycleCount(Timeline.INDEFINITE);
		
		// Start animation when click on filled circle	    
	    circle1.setOnMouseClicked(e1->animation1.play());
	    circle2.setOnMouseClicked(e2->animation2.play());
	    circle3.setOnMouseClicked(e3->animation3.play());
	    circle4.setOnMouseClicked(e4->animation4.play());
	    
	    collision.addListener(ov ->{
	    	animation1.stop();
	    	animation2.stop();
	    	animation3.stop();
	    	animation4.stop();
	    	collision.setValue(false);
	    	paintLvl2();
	    });
	    
	    piece2Completed.addListener(ov -> DisplayGame.completedLevels[1].setValue(true));
	    //if(piece1Completed.getValue()==true && piece2Completed.getValue()==true && piece3Completed.getValue()==true && piece4Completed.getValue()==true)DisplayGame.completedLevels[1].setValue(true);
	
	}
}
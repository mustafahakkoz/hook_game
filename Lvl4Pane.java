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

public class Lvl4Pane extends Pane{
	BooleanProperty piece1Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece2Completed = new SimpleBooleanProperty(false);
	BooleanProperty collision = new SimpleBooleanProperty(false);
	BooleanProperty horizontalDisconnector = new SimpleBooleanProperty(false); //condition of disconnector Horizontal-true, vertical-false.
	
	public Lvl4Pane() {
		paintLvl4();
	}
	
	public void paintLvl4() {
		
		//first piece (left to right)
		Circle circle1 = new Circle();
	    circle1.setCenterX(84);
	    circle1.setCenterY(166);
	    circle1.setRadius(18);
	    circle1.setStroke(Color.rgb(90,86,83));
	    
	    Line line1 = new Line(102, 166, 152, 166);
	    line1.setStrokeWidth(1);
	    line1.setStroke(Color.rgb(90,86,83));
	    
	    Circle disconnector1 = new Circle();
	    disconnector1.setCenterX(172);
	    disconnector1.setCenterY(166);
	    disconnector1.setRadius(20);
	    disconnector1.setStroke(Color.rgb(90,86,83));
	    disconnector1.setFill(Color.TRANSPARENT);
	    
	    Line dcline1 = new Line(172, 146, 172, 186);
	    dcline1.setStrokeWidth(1);
	    dcline1.setStroke(Color.rgb(90,86,83));
	    
	    Line line2 = new Line(192, 166, 322, 166);
	    line2.setStrokeWidth(1);
	    line2.setStroke(Color.rgb(90,86,83));
	    
	    Line line3 = new Line(322, 166, 322, 156);
	    line3.setStrokeWidth(1);
	    line3.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline1 = new Line(317, 156, 327, 156);
	    vBoldline1.setStrokeWidth(3);
	    vBoldline1.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline1 = new Line(322, 156, 322, 44);
	    Boldline1.setStrokeWidth(3);
	    Boldline1.setStroke(Color.rgb(90,86,83));
	    
	    //second piece (left to right)
	    Circle circle2 = new Circle();
	    circle2.setCenterX(172);
	    circle2.setCenterY(249);
	    circle2.setRadius(18);
	    circle2.setStroke(Color.rgb(90,86,83));
	    
	    Line line4 = new Line(172, 230, 172, 186);
	    line4.setStrokeWidth(1);
	    line4.setStroke(Color.rgb(90,86,83));
	    
	    Line line5 = new Line(172, 145, 172, 51);
	    line5.setStrokeWidth(1);
	    line5.setStroke(Color.rgb(90,86,83));
	    
	    Line line6 = new Line(172, 51, 182, 51);
	    line6.setStrokeWidth(1);
	    line6.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline2 = new Line(182, 46, 182, 56);
	    vBoldline2.setStrokeWidth(3);
	    vBoldline2.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline2 = new Line(182, 51, 302, 51);
	    Boldline2.setStrokeWidth(3);
	    Boldline2.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle1= new Arc(322,51,20,20,0,180);
	    halfCircle1.setStrokeWidth(3);
	    halfCircle1.setStroke(Color.rgb(90,86,83));
	    halfCircle1.setType(ArcType.OPEN);
	    halfCircle1.setFill(Color.TRANSPARENT);
	    
	    Line Boldline3 = new Line(342, 51, 354, 51);
	    Boldline3.setStrokeWidth(3);
	    Boldline3.setStroke(Color.rgb(90,86,83));
	    
	    getChildren().clear();  
	    getChildren().addAll(circle1,line1,disconnector1,dcline1,line2,line3,vBoldline1,Boldline1,circle2,line4,line5,line6,vBoldline2,Boldline2,halfCircle1,Boldline3);
	    
	    //event handler for disconnector
	    disconnector1.setOnMouseClicked(e->{
	    	if(horizontalDisconnector.getValue()==false) {
		    	dcline1.setStartX(152);
		    	dcline1.setStartY(166);
		    	dcline1.setEndX(192);
		    	dcline1.setEndY(166);
		    	horizontalDisconnector.setValue(true);
	    	}
	    	else {
	    		dcline1.setStartX(172);
		    	dcline1.setStartY(146);
		    	dcline1.setEndX(172);
		    	dcline1.setEndY(186);
		    	horizontalDisconnector.setValue(false);
	    	}
	    });
	    
	 // Create a handler for moving piece1
      EventHandler<ActionEvent> eventHandler1 = e1 -> {	 
	       if(vBoldline1.getEndX()-vBoldline1.getStartX()<41) {
	    	   vBoldline1.setEndX(vBoldline1.getEndX()+1);
	    	   vBoldline1.setStartX(vBoldline1.getStartX()-1);
	       }
	       if(Boldline1.getEndY()!=156) {
	    	   Boldline1.setEndY(Boldline1.getEndY()+1);	    	   
	       }
	       if(Boldline1.getEndY()==156) piece1Completed.setValue(true); 	 
      };
      
      	// Create a handler for moving piece2
		EventHandler<ActionEvent> eventHandler2 = e2 -> {
			//collision conditions for piece2
			if(Boldline1.getEndY()<Boldline3.getStartY() && Boldline1.getEndX()==Boldline3.getStartX() ){
				collision.setValue(true);
			}
			
			//Move nodes, if there's no collision
			else {
		       if(vBoldline2.getEndY()-vBoldline2.getStartY()<41) {
		    	   vBoldline2.setEndY(vBoldline2.getEndY()+1);
		    	   vBoldline2.setStartY(vBoldline2.getStartY()-1);
		       }
		       if(Boldline2.getEndX()!=182) {
		    	   Boldline2.setEndX(Boldline2.getEndX()-1);	    	   
		       }	       
		       if(halfCircle1.getCenterX()+20!=182) {
		    	   halfCircle1.setCenterX(halfCircle1.getCenterX()-1);
		       }
		       if(Boldline3.getStartX()!=182) {
		    	   Boldline3.setEndX(Boldline3.getEndX()-1);
		    	   Boldline3.setStartX(Boldline3.getStartX()-1);	    	   
		       }
		       if(Boldline3.getStartX()==182 && Boldline3.getEndX()!=182) {
		    	   Boldline3.setEndX(Boldline3.getEndX()-1);
		       }
		       if(Boldline3.getEndX()==182) piece2Completed.setValue(true);
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
		
		// Start animation when click on filled circle	    
 	    circle1.setOnMouseClicked(e1-> {if(horizontalDisconnector.getValue()) animation1.play();});
 	    
 	    circle2.setOnMouseClicked(e2-> {if(!horizontalDisconnector.getValue()) animation2.play();});
 	    
 	   collision.addListener(ov ->{
	    	animation1.stop();
	    	animation2.stop();
	    	collision.setValue(false);
	    	paintLvl4();
	    });
	    
 	  piece2Completed.addListener(ov -> DisplayGame.completedLevels[3].setValue(true));
	   //if(piece1Completed.getValue()==true && piece2Completed.getValue()==true)DisplayGame.completedLevels[3].setValue(true);
	
	}
}
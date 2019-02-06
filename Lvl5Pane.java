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

public class Lvl5Pane extends Pane{
	BooleanProperty piece1Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece2Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece3Completed = new SimpleBooleanProperty(false);
	BooleanProperty piece4Completed = new SimpleBooleanProperty(false);
	BooleanProperty collision = new SimpleBooleanProperty(false);
	BooleanProperty horizontalDisconnector1 = new SimpleBooleanProperty(false); //condition of disconnector1 Horizontal-true, vertical-false.
	BooleanProperty horizontalDisconnector2 = new SimpleBooleanProperty(true); //condition of disconnector2 Horizontal-true, vertical-false.

	public Lvl5Pane() {
		paintLvl5();
	}
	
	public void paintLvl5() {
		
		//first piece (left to right)
		Circle circle1 = new Circle();
	    circle1.setCenterX(50);
	    circle1.setCenterY(187);
	    circle1.setRadius(18);
	    circle1.setStroke(Color.rgb(90,86,83));
	    
	    Line line1 = new Line(68, 187, 123, 187);
	    line1.setStrokeWidth(1);
	    line1.setStroke(Color.rgb(90,86,83));
	    
	    Circle disconnector1 = new Circle();
	    disconnector1.setCenterX(144);
	    disconnector1.setCenterY(187);
	    disconnector1.setRadius(20);
	    disconnector1.setStroke(Color.rgb(90,86,83));
	    disconnector1.setFill(Color.TRANSPARENT);
	    
	    Line dcline1 = new Line(144, 167, 144, 207);
	    dcline1.setStrokeWidth(1);
	    dcline1.setStroke(Color.rgb(90,86,83));
	    
	    Line line2 = new Line(164, 187, 216, 187);
	    line2.setStrokeWidth(1);
	    line2.setStroke(Color.rgb(90,86,83));
	    
	    Line line3 = new Line(216, 187, 216, 177);
	    line3.setStrokeWidth(1);
	    line3.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline1 = new Line(211, 177, 221, 177);
	    vBoldline1.setStrokeWidth(3);
	    vBoldline1.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline1 = new Line(216, 177, 216, 124);
	    Boldline1.setStrokeWidth(3);
	    Boldline1.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle1= new Arc(216,104,20,20,90,180);
	    halfCircle1.setStrokeWidth(3);
	    halfCircle1.setStroke(Color.rgb(90,86,83));
	    halfCircle1.setType(ArcType.OPEN);
	    halfCircle1.setFill(Color.TRANSPARENT);
	    
	    Line Boldline2 = new Line(216, 84, 216, 62);
	    Boldline2.setStrokeWidth(3);
	    Boldline2.setStroke(Color.rgb(90,86,83));
	    
	    //second piece (left to right)
	    Circle circle2 = new Circle();
	    circle2.setCenterX(50);
	    circle2.setCenterY(251);
	    circle2.setRadius(18);
	    circle2.setStroke(Color.rgb(90,86,83));
	    
	    Line line4 = new Line(68, 251, 123, 251);
	    line4.setStrokeWidth(1);
	    line4.setStroke(Color.rgb(90,86,83));
	    
	    Circle disconnector2 = new Circle();
	    disconnector2.setCenterX(144);
	    disconnector2.setCenterY(251);
	    disconnector2.setRadius(20);
	    disconnector2.setStroke(Color.rgb(90,86,83));
	    disconnector2.setFill(Color.TRANSPARENT);
	    
	    Line dcline2 = new Line(124, 251, 164, 251);
	    dcline2.setStrokeWidth(1);
	    dcline2.setStroke(Color.rgb(90,86,83));
	    
	    Line line5 = new Line(164, 251, 286, 251);
	    line5.setStrokeWidth(1);
	    line5.setStroke(Color.rgb(90,86,83));
	    
	    Line line6 = new Line(286, 251, 286, 241);
	    line6.setStrokeWidth(1);
	    line6.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline2 = new Line(281, 241, 291, 241);
	    vBoldline2.setStrokeWidth(3);
	    vBoldline2.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline3 = new Line(286, 241, 286, 89);
	    Boldline3.setStrokeWidth(3);
	    Boldline3.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle2= new Arc(286,69,20,20,90,-180);
	    halfCircle2.setStrokeWidth(3);
	    halfCircle2.setStroke(Color.rgb(90,86,83));
	    halfCircle2.setType(ArcType.OPEN);
	    halfCircle2.setFill(Color.TRANSPARENT);
	    
	    Line Boldline4 = new Line(286, 49, 286, 36);
	    Boldline4.setStrokeWidth(3);
	    Boldline4.setStroke(Color.rgb(90,86,83));
	    
	    //third  piece (left to right)
	    Circle circle3 = new Circle();
	    circle3.setCenterX(144);
	    circle3.setCenterY(317);
	    circle3.setRadius(18);
	    circle3.setStroke(Color.rgb(90,86,83));
	    
	    Line line7 = new Line(144, 299, 144, 271);
	    line7.setStrokeWidth(1);
	    line7.setStroke(Color.rgb(90,86,83));
	    
	    Line line8 = new Line(144, 231, 144, 208);
	    line8.setStrokeWidth(1);
	    line8.setStroke(Color.rgb(90,86,83));
	
	    Line line9 = new Line(144, 167, 144, 69);
	    line9.setStrokeWidth(1);
	    line9.setStroke(Color.rgb(90,86,83));
	    
	    Line line10 = new Line(144, 69, 154, 69);
	    line10.setStrokeWidth(1);
	    line10.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline3 = new Line(154, 64, 154, 74);
	    vBoldline3.setStrokeWidth(3);
	    vBoldline3.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline5 = new Line(154, 69, 196, 69);
	    Boldline5.setStrokeWidth(3);
	    Boldline5.setStroke(Color.rgb(90,86,83));
	    
	    Arc halfCircle3= new Arc(216,69,20,20,0,180);
	    halfCircle3.setStrokeWidth(3);
	    halfCircle3.setStroke(Color.rgb(90,86,83));
	    halfCircle3.setType(ArcType.OPEN);
	    halfCircle3.setFill(Color.TRANSPARENT);
	    
	    Line Boldline6 = new Line(236, 69, 293, 69);
	    Boldline6.setStrokeWidth(3);
	    Boldline6.setStroke(Color.rgb(90,86,83));
	    
	    //fourth  piece (left to right)
	    Circle circle4 = new Circle();
	    circle4.setCenterX(263);
	    circle4.setCenterY(317);
	    circle4.setRadius(18);
	    circle4.setStroke(Color.rgb(90,86,83));
	    
	    Line line11 = new Line(263, 299, 263, 104);
	    line11.setStrokeWidth(1);
	    line11.setStroke(Color.rgb(90,86,83));
	    
	    Line line12 = new Line(263, 104, 253, 104);
	    line12.setStrokeWidth(1);
	    line12.setStroke(Color.rgb(90,86,83));
	    
	    Line vBoldline4 = new Line(253, 99, 253, 109);
	    vBoldline4.setStrokeWidth(3);
	    vBoldline4.setStroke(Color.rgb(90,86,83));
	    
	    Line Boldline7 = new Line(253, 104, 209, 104);
	    Boldline7.setStrokeWidth(3);
	    Boldline7.setStroke(Color.rgb(90,86,83));
	    
	    
	    
	    getChildren().clear();  
	    getChildren().addAll(circle1,line1,disconnector1,dcline1,line2,line3,vBoldline1,Boldline1,halfCircle1,Boldline2,circle2,line4,disconnector2,dcline2,line5,line6,vBoldline2,Boldline3,halfCircle2,Boldline4,circle3,line7,line8,line9,line10,vBoldline3,Boldline5,halfCircle3,Boldline6,circle4,line11,line12,vBoldline4,Boldline7);
	    
	  //event handler for disconnector1
	    disconnector1.setOnMouseClicked(e->{
	    	if(horizontalDisconnector1.getValue()==false) {
		    	dcline1.setStartX(124);
		    	dcline1.setStartY(187);
		    	dcline1.setEndX(164);
		    	dcline1.setEndY(187);
		    	horizontalDisconnector1.setValue(true);
	    	}
	    	else {
	    		dcline1.setStartX(144);
		    	dcline1.setStartY(167);
		    	dcline1.setEndX(144);
		    	dcline1.setEndY(207);
		    	horizontalDisconnector1.setValue(false);
	    	}
	    });
	    
	  //event handler for disconnector2
	    disconnector2.setOnMouseClicked(e->{
	    	if(horizontalDisconnector2.getValue()==true) {
		    	dcline2.setStartX(144);
		    	dcline2.setStartY(271);
		    	dcline2.setEndX(144);
		    	dcline2.setEndY(231);
		    	horizontalDisconnector2.setValue(false);
	    	}
	    	else {
	    		dcline2.setStartX(124);
		    	dcline2.setStartY(251);
		    	dcline2.setEndX(164);
		    	dcline2.setEndY(251);
		    	horizontalDisconnector2.setValue(true);
	    	}
	    });
	    
	 // Create a handler for moving piece1
	    EventHandler<ActionEvent> eventHandler1 = e1 -> {
	    	//collision conditions for piece1
	    	if(Boldline7.getEndX()<Boldline2.getStartX() && Boldline7.getEndY()==Boldline2.getStartY() ){
	    		collision.setValue(true);
	    	}
	    	
	    	//Move nodes, if there's no collision
	    	else {
		       if(vBoldline1.getEndX()-vBoldline1.getStartX()<41) {
		    	   vBoldline1.setEndX(vBoldline1.getEndX()+1);
		    	   vBoldline1.setStartX(vBoldline1.getStartX()-1);
		       }
		       if(Boldline1.getEndY()!=177) {
		    	   Boldline1.setEndY(Boldline1.getEndY()+1);	    	   
		       }	       
		       if(halfCircle1.getCenterY()-20!=177) {
		    	   halfCircle1.setCenterY(halfCircle1.getCenterY()+1);
		       }
		       if(Boldline2.getStartY()!=177) {
		    	   Boldline2.setEndY(Boldline2.getEndY()+1);
		    	   Boldline2.setStartY(Boldline2.getStartY()+1);	    	   
		       }
		       if(Boldline2.getStartY()==177 && Boldline2.getEndY()!=177) {
		    	   Boldline2.setEndY(Boldline2.getEndY()+1);
		       }
		       if(Boldline2.getEndY()==177) piece1Completed.setValue(true);
	    	}
	      };
	      
	   // Create a handler for moving piece2
	    EventHandler<ActionEvent> eventHandler2 = e2 -> {
	    	//collision conditions for piece2
	    	if(Boldline6.getEndX()>Boldline4.getStartX() && Boldline6.getEndY()==Boldline4.getStartY() ){
	    		collision.setValue(true);
	    	}
	    	
	    	//Move nodes, if there's no collision
	    	else {
		       if(vBoldline2.getEndX()-vBoldline2.getStartX()<41) {
		    	   vBoldline2.setEndX(vBoldline2.getEndX()+1);
		    	   vBoldline2.setStartX(vBoldline2.getStartX()-1);
		       }
		       if(Boldline3.getEndY()!=241) {
		    	   Boldline3.setEndY(Boldline3.getEndY()+1);	    	   
		       }	       
		       if(halfCircle2.getCenterY()-20!=241) {
		    	   halfCircle2.setCenterY(halfCircle2.getCenterY()+1);
		       }
		       if(Boldline4.getStartY()!=241) {
		    	   Boldline4.setEndY(Boldline4.getEndY()+1);
		    	   Boldline4.setStartY(Boldline4.getStartY()+1);	    	   
		       }
		       if(Boldline4.getStartY()==241 && Boldline4.getEndY()!=241) {
		    	   Boldline4.setEndY(Boldline4.getEndY()+1);
		       }
		       if(Boldline4.getEndY()==241) piece2Completed.setValue(true);
	    	}
	      };
	      
	   // Create a handler for moving piece3
			EventHandler<ActionEvent> eventHandler3 = e3 -> {
				//collision conditions for piece3
				if(Boldline2.getEndY()<Boldline6.getStartY() && Boldline2.getEndX()==Boldline6.getStartX() ){
					collision.setValue(true);
				}
				
				//Move nodes, if there's no collision
				else {
			       if(vBoldline3.getEndY()-vBoldline3.getStartY()<41) {
			    	   vBoldline3.setEndY(vBoldline3.getEndY()+1);
			    	   vBoldline3.setStartY(vBoldline3.getStartY()-1);
			       }
			       if(Boldline5.getEndX()!=154) {
			    	   Boldline5.setEndX(Boldline5.getEndX()-1);	    	   
			       }	       
			       if(halfCircle3.getCenterX()+20!=154) {
			    	   halfCircle3.setCenterX(halfCircle3.getCenterX()-1);
			       }
			       if(Boldline6.getStartX()!=154) {
			    	   Boldline6.setEndX(Boldline6.getEndX()-1);
			    	   Boldline6.setStartX(Boldline6.getStartX()-1);	    	   
			       }
			       if(Boldline6.getStartX()==154 && Boldline6.getEndX()!=154) {
			    	   Boldline6.setEndX(Boldline6.getEndX()-1);
			       }
			       if(Boldline6.getEndX()==154) piece3Completed.setValue(true);
				}
			};
	    
		// Create a handler for moving piece4
	      EventHandler<ActionEvent> eventHandler4 = e4 -> {	    	  
		       if(vBoldline4.getEndY()-vBoldline4.getStartY()<41) {
		    	   vBoldline4.setEndY(vBoldline4.getEndY()+1);
		    	   vBoldline4.setStartY(vBoldline4.getStartY()-1);
		       }
		       if(Boldline7.getEndX()!=253) {
		    	   Boldline7.setEndX(Boldline7.getEndX()+1);	    	   
		       }
		      if(Boldline7.getEndX()==253) piece4Completed.setValue(true);
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
 	    circle1.setOnMouseClicked(e1-> {if(horizontalDisconnector1.getValue()) animation1.play();});
 	    circle2.setOnMouseClicked(e2-> {if(horizontalDisconnector2.getValue()) animation2.play();});
 	    circle3.setOnMouseClicked(e3-> {if(!horizontalDisconnector1.getValue() && !horizontalDisconnector2.getValue()) animation3.play();});
 	    circle4.setOnMouseClicked(e4->animation4.play());
 	    
 	    collision.addListener(ov ->{
 	    	animation1.stop();
 	    	animation2.stop();
 	    	animation3.stop();
 	    	animation4.stop();
 	    	collision.setValue(false);
 	    	paintLvl5();
 	    });
 	    
 	   piece2Completed.addListener(ov -> DisplayGame.completedLevels[4].setValue(true));
 	    //if(piece1Completed.getValue()==true && piece2Completed.getValue()==true && piece3Completed.getValue()==true && piece4Completed.getValue()==true)DisplayGame.completedLevels[4].setValue(true);
 	
	}
}
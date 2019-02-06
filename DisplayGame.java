import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayGame extends Application {
	public static BooleanProperty level1Completed = new SimpleBooleanProperty();
	public static BooleanProperty level2Completed = new SimpleBooleanProperty();
	public static BooleanProperty level3Completed = new SimpleBooleanProperty();
	public static BooleanProperty level4Completed = new SimpleBooleanProperty();
	public static BooleanProperty level5Completed = new SimpleBooleanProperty();
	
	public static BooleanProperty completedLevels[] = {
			level1Completed,
			level2Completed,
			level3Completed,
			level4Completed,
			level5Completed
	};
	
	public int currentLevel=1;
	
	// Declare an array of Strings for level titles
	private String[] lvlTitles = {"Level-1", "Level-2", "Level-3",
		    "Level-4", "Level-5"};
	
	// Declare an array of Strings for level panes
	private Pane[] lvlPanes = {
		    new Lvl1Pane(),
		    new Lvl2Pane(),
		    new Lvl3Pane(),
		    new Lvl4Pane(),
		    new Lvl5Pane()
	};
	
	
		    
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		//Create a ListView to list levels
		ListView<String> lv = new ListView<>(FXCollections.observableArrayList(lvlTitles));
		lv.setPrefSize(100, 500);
		lv.setStyle("-fx-background-color: rgb(240,240,232)");
		
		//Create a Pane to display level
		Pane lvlPane = new Pane(new Label("Select a level to start the game ..."));	
		
		//Create a HBox to display buttons
		HBox buttonPane = new HBox(30);
		buttonPane.setPadding(new Insets(15, 15, 15, 15));
		buttonPane.setStyle("-fx-background-color: rgb(240,240,232)");
		Button restartBtn = new Button("Restart");
		Button nextBtn = new Button("Next");
		buttonPane.getChildren().addAll(restartBtn,nextBtn);
		
				
		//Create a BorderPane to place lvlPane and buttonPane in CENTER and BOTTOM of right side of screen
		BorderPane gamePane = new BorderPane();
		gamePane.setCenter(lvlPane);
		//gamePane.setBottom(buttonPane); 
		
		//Create a HBox to hold gamePane and ListView together
		HBox mainPane = new HBox();
	    mainPane.getChildren().add(lv);
	    mainPane.getChildren().add(gamePane);
	    
	    //Listener to call relevant Level for each LvlTitles[] in ListView
	    lv.getSelectionModel().selectedItemProperty().addListener(
	    	      ov -> { 
	    	        lvlPane.getChildren().clear();
	    	        for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
	    	          if(i==0) 
	    	        	  lvlPane.getChildren().add(lvlPanes[i]);	    	       	    	        
	    	          else {
	    	        	  if(i>0 && completedLevels[i-1].getValue()==true)
	    	        		  lvlPane.getChildren().add(lvlPanes[i]);
	    	        	  else 
	    	        		  lvlPane.getChildren().add(new Label("You cannot reach this level yet."));
	    	          }
	    	          currentLevel=i;
	    	        }
	    	    });
		
	    
	    
	    DisplayGame.completedLevels[0].addListener(ov->{
	    	lvlPane.getChildren().clear();
	    	lvlPane.getChildren().add(lvlPanes[1]);
	    	currentLevel=2;
	    	});
	    DisplayGame.completedLevels[1].addListener(ov->{
	    	lvlPane.getChildren().clear();
	    	lvlPane.getChildren().add(lvlPanes[2]);
	    	currentLevel=3;
	    	});
	    DisplayGame.completedLevels[2].addListener(ov->{
	    	lvlPane.getChildren().clear();
	    	lvlPane.getChildren().add(lvlPanes[3]);
	    	currentLevel=4;
	    	});
	    DisplayGame.completedLevels[3].addListener(ov->{
	    	lvlPane.getChildren().clear();
	    	lvlPane.getChildren().add(lvlPanes[4]);
	    	currentLevel=5;
	    	});
	    DisplayGame.completedLevels[4].addListener(ov->{
	    	lvlPane.getChildren().clear();
	    	lvlPane.getChildren().add(new Label("Game over..."));
	    	});
	    
	    restartBtn.setOnMouseClicked(e -> {
	    	lvlPane.getChildren().clear();
	    	lvlPane.getChildren().add(lvlPanes[currentLevel-1]);
	    	});
	    
	    
	    
	    //Build the scene
	    Scene scene = new Scene(mainPane, 500, 400);
	    primaryStage.setTitle("CSE1142 Spring Project"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }

	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }
}
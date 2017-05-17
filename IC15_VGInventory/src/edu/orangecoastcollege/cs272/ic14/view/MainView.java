package edu.orangecoastcollege.cs272.ic14.view;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {		
		ViewNavigator.setStage(primaryStage);
		ViewNavigator.loadScene("Welcome to in.vent.ory", ViewNavigator.SIGN_IN_SCENE);
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}

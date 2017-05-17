package edu.orangecoastcollege.cs272.ic14.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.cs272.ic14.controller.Controller;
import edu.orangecoastcollege.cs272.ic14.model.VideoGame;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class VideoGamesListScene implements Initializable {

	private static Controller controller = Controller.getInstance();

	@FXML
	private ListView<VideoGame> allVideoGamesLV;
	@FXML
	private ComboBox<String> publishersCB;
	@FXML
	private ComboBox<String> platformsCB;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		allVideoGamesLV.setItems(controller.getAllVideoGames());
		platformsCB.setItems(controller.getDistinctPlatforms());
		publishersCB.setItems(controller.getDistinctPublishers());
	}
	
	@FXML
	public Object addGameToInventory()
	{
		VideoGame selectedGame = allVideoGamesLV.getSelectionModel().getSelectedItem();
		if (controller.addGameToInventory(selectedGame))
			System.out.println("SUCCESS");
		else
			System.out.println("Could not add game.");
		return this;
	}
	
	@FXML
	public Object viewInventory()
	{
		ViewNavigator.loadScene("User's Video Games", ViewNavigator.VIEW_INVENTORY_SCENE);
		return this;
	}

}

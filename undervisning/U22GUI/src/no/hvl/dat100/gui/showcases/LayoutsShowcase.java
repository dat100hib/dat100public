package no.hvl.dat100.gui.showcases;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutsShowcase extends Application {
	
	public void showBorderPane() {
	
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setPrefWidth(500);
		element1.setPrefHeight(100);

		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setPrefWidth(100);
		element2.setPrefHeight(300);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setPrefWidth(300);
		element3.setPrefHeight(300);
		
		StackPane element4 = new StackPane();
		element4.setStyle("-fx-background-color: #0000FF;");
		element4.setPrefWidth(100);
		element4.setPrefHeight(300);
		
		StackPane element5 = new StackPane();
		element5.setStyle("-fx-background-color: #00FFFF;");
		element5.setPrefWidth(500);
		element5.setPrefHeight(100);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(element1);
		borderPane.setLeft(element2);
		borderPane.setCenter(element3);
		borderPane.setRight(element4);
		borderPane.setBottom(element5);
		
		Stage stage = new Stage();
		stage.setScene(new Scene(borderPane, 500, 500));
		stage.show();
		
	}
	
	
	public void showVBox() {
		
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setPrefWidth(400);
		element1.setPrefHeight(150);

		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setPrefWidth(400);
		element2.setPrefHeight(150);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setPrefWidth(400);
		element3.setPrefHeight(150);
		
		StackPane element4 = new StackPane();
		element4.setStyle("-fx-background-color: #0000FF;");
		element4.setPrefWidth(400);
		element4.setPrefHeight(150);
		
		VBox vbox = new VBox();
		vbox.getChildren().add(element1);
		vbox.getChildren().add(element2);
		vbox.getChildren().add(element3);
		vbox.getChildren().add(element4);
		
		
		Stage stage = new Stage();
		stage.setScene(new Scene(vbox, 400, 600));
		stage.show();
	}
	
	
public void showHBox() {
		
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setPrefWidth(150);
		element1.setPrefHeight(200);

		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setPrefWidth(150);
		element2.setPrefHeight(200);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setPrefWidth(150);
		element3.setPrefHeight(200);
		
		StackPane element4 = new StackPane();
		element4.setStyle("-fx-background-color: #0000FF;");
		element4.setPrefWidth(150);
		element4.setPrefHeight(200);
		
		HBox hbox = new HBox();
		hbox.getChildren().add(element1);
		hbox.getChildren().add(element2);
		hbox.getChildren().add(element3);
		hbox.getChildren().add(element4);
		
		
		Stage stage = new Stage();
		stage.setScene(new Scene(hbox, 600, 200));
		stage.show();
	}


	public void showStackPane() {
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setMaxWidth(200);
		element1.setMaxHeight(100);
	
		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setMaxWidth(90);
		element2.setMaxHeight(90);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setMaxWidth(45);
		element3.setMaxHeight(45);
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(element1);
		stackPane.getChildren().add(element2);
		stackPane.getChildren().add(element3);
		
		Stage stage = new Stage();
		stage.setScene(new Scene(stackPane, 200, 100));
		stage.show();
		
	}


	@Override
	public void start(Stage mainStage) throws Exception {
	
		VBox buttonContainer = new VBox();
		VBox.setMargin(buttonContainer, new Insets(5));
		
		Button showVBoxBtn = new Button("VBox");
		showVBoxBtn.setOnMouseClicked(evt -> {
			showVBox();
		});
		buttonContainer.getChildren().add(showVBoxBtn);
		
		Button showHBoxBtn = new Button("HBox");
		showHBoxBtn.setOnMouseClicked(evt -> {
			showHBox();
		});
		buttonContainer.getChildren().add(showHBoxBtn);
		
		Button showBorderPaneBtn = new Button("BorderPane");
		showBorderPaneBtn.setOnMouseClicked(evt -> {
			showBorderPane();
		});
		buttonContainer.getChildren().add(showBorderPaneBtn);
		
		Button showStackPaneBtn = new Button("StackPane");
		showStackPaneBtn.setOnMouseClicked(evt -> {
			showStackPane();
		});
		buttonContainer.getChildren().add(showStackPaneBtn);
		
		Button showTilePaneBtn = new Button("TilePane");
		showTilePaneBtn.setOnMouseClicked(evt -> {
			shwowTilePane();
		});
		buttonContainer.getChildren().add(showTilePaneBtn);
		
		Button showGridPaneBtn = new Button("GridPane");
		showGridPaneBtn.setOnMouseClicked(evt -> {
			showGridPane();
		});
		buttonContainer.getChildren().add(showGridPaneBtn);
		
		Button showFlowPaneBtn = new Button("FlowPane");
		showFlowPaneBtn.setOnMouseClicked(evt -> {
			showFlowPane();
		});
		buttonContainer.getChildren().add(showFlowPaneBtn);
		
		Button showAnchorPaneBtn = new Button("AnchorPane");
		showAnchorPaneBtn.setOnMouseClicked(evt -> {
			showAnchorPane();
		});
		buttonContainer.getChildren().add(showAnchorPaneBtn);
		
		mainStage.setScene(new Scene(buttonContainer));
		mainStage.show();
		
	}
	
	public void shwowTilePane() {
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setPrefWidth(100);
		element1.setPrefHeight(200);

		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setPrefWidth(100);
		element2.setPrefHeight(200);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setPrefWidth(100);
		element3.setPrefHeight(200);
		
		StackPane element4 = new StackPane();
		element4.setStyle("-fx-background-color: #0000FF;");
		element4.setPrefWidth(100);
		element4.setPrefHeight(200);
		
		StackPane element5 = new StackPane();
		element5.setStyle("-fx-background-color: #00FFFF;");
		element5.setPrefWidth(100);
		element5.setPrefHeight(200);
		
		StackPane element6 = new StackPane();
		element6.setStyle("-fx-background-color: #FF00FF;");
		element6.setPrefWidth(100);
		element6.setPrefHeight(200);
		
		TilePane tilePane = new TilePane();
		tilePane.getChildren().add(element1);
		tilePane.getChildren().add(element2);
		tilePane.getChildren().add(element3);
		tilePane.getChildren().add(element4);
		tilePane.getChildren().add(element5);
		tilePane.getChildren().add(element6);
		
		Stage stage = new Stage();
		stage.setScene(new Scene(tilePane, 300, 400));
		stage.show();
	}
	
	public void showGridPane() {
		
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setPrefWidth(50);
		element1.setPrefHeight(100);

		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setPrefWidth(50);
		element2.setPrefHeight(50);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setPrefWidth(50);
		element3.setPrefHeight(50);
		
		StackPane element4 = new StackPane();
		element4.setStyle("-fx-background-color: #0000FF;");
		element4.setPrefWidth(50);
		element4.setPrefHeight(150);
		
		StackPane element5 = new StackPane();
		element5.setStyle("-fx-background-color: #00FFFF;");
		element5.setPrefWidth(100);
		element5.setPrefHeight(50);
		
		StackPane element6 = new StackPane();
		element6.setStyle("-fx-background-color: #FF00FF;");
		element6.setPrefWidth(150);
		element6.setPrefHeight(50);
		
		GridPane gridPane = new GridPane();
		gridPane.add(element1, 0, 0, 2, 1);
		gridPane.add(element2, 0, 1, 1, 1);
		gridPane.add(element3, 1, 1, 1, 1);
		gridPane.add(element4, 2, 0, 1, 3);
		gridPane.add(element5, 0, 2, 2, 1);
		gridPane.add(element6, 0, 3, 3, 1);
		
		Stage stage = new Stage();
		stage.setScene(new Scene(gridPane, 150, 200));
		stage.show();
		
	}
	
	public void showFlowPane() {
		
		
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setPrefWidth(50);
		element1.setPrefHeight(25);

		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setPrefWidth(10);
		element2.setPrefHeight(75);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setPrefWidth(100);
		element3.setPrefHeight(50);
		
		StackPane element4 = new StackPane();
		element4.setStyle("-fx-background-color: #0000FF;");
		element4.setPrefWidth(100);
		element4.setPrefHeight(100);
		
		StackPane element5 = new StackPane();
		element5.setStyle("-fx-background-color: #00FFFF;");
		element5.setPrefWidth(40);
		element5.setPrefHeight(40);
		
		StackPane element6 = new StackPane();
		element6.setStyle("-fx-background-color: #FF00FF;");
		element6.setPrefWidth(10);
		element6.setPrefHeight(75);
		
		FlowPane flowPane = new FlowPane();
		flowPane.setPrefWrapLength(175);
		flowPane.getChildren().add(element1);
		flowPane.getChildren().add(element2);
		flowPane.getChildren().add(element3);
		flowPane.getChildren().add(element4);
		flowPane.getChildren().add(element5);
		flowPane.getChildren().add(element6);
		
		Stage stage = new Stage();
		stage.setScene(new Scene(flowPane, 175, 200));
		stage.show();
		
		
	}

	public void showAnchorPane() {
		
		
		StackPane element1 = new StackPane();
		element1.setStyle("-fx-background-color: #00FF00;");
		element1.setPrefWidth(400);
		element1.setPrefHeight(400);

		StackPane element2 = new StackPane();
		element2.setStyle("-fx-background-color: #FFFF00;");
		element2.setPrefWidth(50);
		element2.setPrefHeight(50);
		
		StackPane element3 = new StackPane();
		element3.setStyle("-fx-background-color: #FF0000;");
		element3.setPrefWidth(100);
		element3.setPrefHeight(25);
		
		AnchorPane anchorPane = new AnchorPane();
		anchorPane.getChildren().add(element1);
		anchorPane.getChildren().add(element2);
		anchorPane.getChildren().add(element3);
		AnchorPane.setTopAnchor(element1, 0.0);
		AnchorPane.setBottomAnchor(element2, 0.0);
		AnchorPane.setRightAnchor(element3, 0.0);
		
		Stage stage = new Stage();
		stage.setScene(new Scene(anchorPane, 400, 400));
		stage.show();

	}
	
	
		
	
	// AnchorPane

	public static void main(String[] args) {
		launch(args);
	}

}

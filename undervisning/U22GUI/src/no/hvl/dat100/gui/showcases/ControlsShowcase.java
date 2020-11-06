package no.hvl.dat100.gui.showcases;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Pagination;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.TreeView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.web.HTMLEditor;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.Duration;
import javafx.util.StringConverter;
import no.hvl.dat100.gui.showcases.lib.Data;
import no.hvl.dat100.gui.showcases.lib.Inventory;
import no.hvl.dat100.gui.showcases.lib.MoneyFormatCell;
import no.hvl.dat100.gui.showcases.lib.Person;

public class ControlsShowcase extends Application {

	@Override
	public void start(Stage mainStage) throws Exception {

		VBox buttonContainer = new VBox();
		VBox.setMargin(buttonContainer, new Insets(5));

		Button showAccordionBtn = new Button("Accordion");
		showAccordionBtn.setOnMouseClicked(evt -> {
			showAccordion();
		});
		buttonContainer.getChildren().add(showAccordionBtn);

		Button showButtonBtn = new Button("Button");
		showButtonBtn.setOnMouseClicked(evt -> {
			showButton();
		});
		buttonContainer.getChildren().add(showButtonBtn);

		Button showCheckboxBtn = new Button("Checkbox");
		showCheckboxBtn.setOnMouseClicked(evt -> {
			showChekBox();
		});
		buttonContainer.getChildren().add(showCheckboxBtn);

		Button showChoiceBtn = new Button("Choice");
		showChoiceBtn.setOnMouseClicked(evt -> {
			showChoice();
		});
		buttonContainer.getChildren().add(showChoiceBtn);

		Button showColorpickerBtn = new Button("Colorpicker");
		showColorpickerBtn.setOnMouseClicked(evt -> {
			showColorPicker();
		});
		buttonContainer.getChildren().add(showColorpickerBtn);

		Button showDatepickerBtn = new Button("Datepicker");
		showDatepickerBtn.setOnMouseClicked(evt -> {
			showDatepicker();
		});
		buttonContainer.getChildren().add(showDatepickerBtn);

		Button showDialogBtn = new Button("Dialog");
		showDialogBtn.setOnMouseClicked(evt -> {
			showDialog();
		});
		buttonContainer.getChildren().add(showDialogBtn);

		Button showHTMLEDitorBtn = new Button("HTMLEditor");
		showHTMLEDitorBtn.setOnMouseClicked(evt -> {
			showHtmlEdior();
		});
		buttonContainer.getChildren().add(showHTMLEDitorBtn);

		Button showHyperlink = new Button("Hyperlink");
		showHyperlink.setOnMouseClicked(evt -> {
			showHyperLink();
		});
		buttonContainer.getChildren().add(showHyperlink);

		Button showListView = new Button("Listview");
		showListView.setOnMouseClicked(evt -> {
			showListView();
		});
		buttonContainer.getChildren().add(showListView);

		Button showMenuBtn = new Button("Menu");
		showMenuBtn.setOnMouseClicked(evt -> {
			showMenu();
		});
		buttonContainer.getChildren().add(showMenuBtn);

		Button showPaginationBtn = new Button("Pagination");
		showPaginationBtn.setOnMouseClicked(evt -> {
			showPagination();
		});
		buttonContainer.getChildren().add(showPaginationBtn);

		Button showProgressBarBtn = new Button("Progressbar");
		showProgressBarBtn.setOnMouseClicked(evt -> {
			showProgressBar();
		});
		buttonContainer.getChildren().add(showProgressBarBtn);

		Button showProgressIndicator = new Button("Progressindicator");
		showProgressIndicator.setOnMouseClicked(evt -> {
			showProgressIndicator();
		});
		buttonContainer.getChildren().add(showProgressIndicator);

		Button showRadiotBtn = new Button("Radiobutton");
		showRadiotBtn.setOnMouseClicked(evt -> {
			showRadioButton();
		});
		buttonContainer.getChildren().add(showRadiotBtn);

		Button showScrollbar = new Button("Scrollbar");
		showScrollbar.setOnMouseClicked(evt -> {
			showScrollBar();
		});
		buttonContainer.getChildren().add(showScrollbar);

		Button showSpinner = new Button("Spinner");
		showSpinner.setOnMouseClicked(evt -> {
			showSpinner();
		});
		buttonContainer.getChildren().add(showSpinner);

		Button showSplitPane = new Button("Splitpane");
		showSplitPane.setOnMouseClicked(evt -> {
			showSplitPane();
		});
		buttonContainer.getChildren().add(showSplitPane);

		Button showTabs = new Button("Tab");
		showTabs.setOnMouseClicked(evt -> {
			showTabs();
		});
		buttonContainer.getChildren().add(showTabs);

		Button showTableView = new Button("Tableview");
		showTableView.setOnMouseClicked(evt -> {
			showTableView();
		});
		buttonContainer.getChildren().add(showTableView);

		Button showTextField = new Button("Textfield");
		showTextField.setOnMouseClicked(evt -> {
			showTextField();
		});
		buttonContainer.getChildren().add(showTextField);

		Button showToggleButton = new Button("Togglebutton");
		showToggleButton.setOnMouseClicked(evt -> {
			showToggleButton();
		});
		buttonContainer.getChildren().add(showToggleButton);

		Button showToolbar = new Button("Toolbar");
		showToolbar.setOnMouseClicked(evt -> {
			showToolbar();
		});
		buttonContainer.getChildren().add(showToolbar);

		Button showTreeTable = new Button("Treetableview");
		showTreeTable.setOnMouseClicked(evt -> {
			showTreeTableView();
		});
		buttonContainer.getChildren().add(showTreeTable);

		Button showTreeView = new Button("Treeview");
		showTreeView.setOnMouseClicked(evt -> {
			showTreeView();
		});
		buttonContainer.getChildren().add(showTreeView);

		Button showWebView = new Button("Webview");
		showWebView.setOnMouseClicked(evt -> {
			showWebView();
		});
		buttonContainer.getChildren().add(showWebView);

		mainStage.setScene(new Scene(buttonContainer));
		mainStage.show();

	}

	private void showWebView() {
		WebView webView = new WebView();

		final WebEngine webEngine = webView.getEngine();
		final String DEFAULT_URL = "http://www.oracle.com/us/index.html";
		webEngine.load(DEFAULT_URL);

		final TextField locationField = new TextField(DEFAULT_URL);
		final ChangeListener<String> changeListener = (ObservableValue<? extends String> observable, String oldValue,
				String newValue) -> {
			locationField.setText(newValue);
		};
		webEngine.locationProperty().addListener(changeListener);
		locationField.setOnAction((event) -> {
			webEngine.load(locationField.getText().startsWith("http://") ? locationField.getText()
					: "http://" + locationField.getText());
		});

		Button goButton = new Button("Go");
		goButton.setMinSize(Button.USE_PREF_SIZE, Button.USE_PREF_SIZE);
		goButton.setDefaultButton(true);
		goButton.setOnAction((event) -> {
			webEngine.load(locationField.getText().startsWith("http://") ? locationField.getText()
					: "http://" + locationField.getText());
		});

		// Layout logic
		HBox hBox = new HBox(5);
		hBox.getChildren().setAll(locationField, goButton);
		HBox.setHgrow(locationField, Priority.ALWAYS);

		final VBox vBox = new VBox(5);
		vBox.getChildren().setAll(hBox, webView);
		vBox.setPrefSize(800, 400);
		VBox.setVgrow(webView, Priority.ALWAYS);

		Stage stage = new Stage();
		stage.setScene(new Scene(vBox));
		stage.show();
	}

	private void showTreeView() {
		final TreeItem<String> treeRoot = new TreeItem<String>("Root node");
		treeRoot.getChildren().addAll(Arrays.asList(new TreeItem<String>("Child Node 1"),
				new TreeItem<String>("Child Node 2"), new TreeItem<String>("Child Node 3")));

		treeRoot.getChildren().get(2).getChildren()
				.addAll(Arrays.asList(new TreeItem<String>("Child Node 4"), new TreeItem<String>("Child Node 5"),
						new TreeItem<String>("Child Node 6"), new TreeItem<String>("Child Node 7"),
						new TreeItem<String>("Child Node 8")));

		final TreeView treeView = new TreeView();
		treeView.setShowRoot(true);
		treeView.setRoot(treeRoot);
		treeRoot.setExpanded(true);

		Stage stage = new Stage();
		stage.setScene(new Scene(treeView));
		stage.show();
	}

	private TreeItem<Inventory> getData() {
		final TreeItem<Inventory> rootItem = new TreeItem<>(new Inventory("Root", new Data("Root data"), ""));
		final TreeItem<Inventory> child1Item = new TreeItem<>(
				new Inventory("Child 1", new Data("Child 1 data"), "My notes"));
		final TreeItem<Inventory> child2Item = new TreeItem<>(
				new Inventory("Child 2", new Data("Child 2 data"), "Notes"));
		TreeItem<Inventory> child3Item = new TreeItem<>(
				new Inventory("Child 3", new Data("Child 3 data"), "Observations"));
		rootItem.setExpanded(true);
		rootItem.getChildren().addAll(child1Item, child2Item);
		child1Item.getChildren().add(child3Item);
		return rootItem;
	}

	private void showTreeTableView() {
		final TreeTableColumn<Inventory, String> nameColumn = new TreeTableColumn<>("Name");
		nameColumn.setEditable(false);
		nameColumn.setMinWidth(130);
		nameColumn.setCellValueFactory(new TreeItemPropertyValueFactory("name"));

		final TreeTableColumn<Inventory, String> dataColumn = new TreeTableColumn<>("Data");
		dataColumn.setEditable(false);
		dataColumn.setMinWidth(150);
		dataColumn.setCellValueFactory(new TreeItemPropertyValueFactory("data"));

		final TreeTableColumn<Inventory, String> notesColumn = new TreeTableColumn<>("Notes (editable)");
		final Callback<TreeTableColumn<Inventory, String>, TreeTableCell<Inventory, String>> notes = TextFieldTreeTableCell
				.<Inventory>forTreeTableColumn();
		notesColumn.setEditable(true);
		notesColumn.setMinWidth(150);
		notesColumn.setCellValueFactory(new TreeItemPropertyValueFactory("notes"));
		notesColumn.setCellFactory(notes);

		final TreeTableView treeTableView = new TreeTableView(getData());
		treeTableView.setEditable(true);
		treeTableView.setPrefSize(430, 200);
		treeTableView.getColumns().setAll(nameColumn, dataColumn, notesColumn);

		Stage stage = new Stage();
		stage.setScene(new Scene(treeTableView));
		stage.show();
	}

	private void showToolbar() {
		ToolBar toolbar = new ToolBar();
		toolbar.getItems().add(new Button("Home"));
		toolbar.getItems().add(new Button("Options"));
		toolbar.getItems().add(new Button("Help"));

		Stage stage = new Stage();
		stage.setScene(new Scene(toolbar));
		stage.show();
	}

	private void showToggleButton() {
		// create label to show result of selected toggle button
		final Label label = new Label();
		label.setStyle("-fx-font-size: 2em;");
		label.setAlignment(Pos.CENTER);
		ToggleGroup group = new ToggleGroup();
		// create 3 toggle buttons and a toogle group for them
		final ToggleButton cat = new ToggleButton("Cat");
		final ToggleButton dog = new ToggleButton("Dog");
		final ToggleButton horse = new ToggleButton("Horse");
		cat.setMinSize(72, 40);
		dog.setMinSize(72, 40);
		horse.setMinSize(72, 40);
		cat.setToggleGroup(group);
		dog.setToggleGroup(group);
		horse.setToggleGroup(group);
		final ChangeListener<Toggle> changeListener = (ObservableValue<? extends Toggle> observable, Toggle oldValue,
				Toggle selectedToggle) -> {
			if (selectedToggle != null) {
				label.setText(((ToggleButton) selectedToggle).getText());
			} else {
				label.setText("...");
			}
		};
		group.selectedToggleProperty().addListener(changeListener);
		// select the first button to start with
		group.selectToggle(cat);
		// add buttons and label to grid and set their positions
		GridPane.setConstraints(cat, 0, 0);
		GridPane.setConstraints(dog, 1, 0);
		GridPane.setConstraints(horse, 2, 0);
		GridPane.setConstraints(label, 0, 1, 3, 1, HPos.CENTER, VPos.BASELINE);
		final GridPane grid = new GridPane();
		grid.setVgap(20);
		grid.setHgap(12);
		grid.getChildren().addAll(cat, dog, horse, label);
		grid.setAlignment(Pos.CENTER);

		Stage stage = new Stage();
		stage.setScene(new Scene(grid));
		stage.show();
	}

	private void showTextField() {
		TextField text = new TextField("Text");
		text.setMaxSize(140, TextField.USE_COMPUTED_SIZE);

		Stage stage = new Stage();
		stage.setScene(new Scene(text));
		stage.show();

	}

	private void showTableView() {
		final ObservableList<Person> data = FXCollections.observableArrayList(
				new Person(true, "Jacob", "Smith", "jacob.smith@example.com"),
				new Person(false, "Sue", "Jones", "sue@example.com"),
				new Person(true, "Ethan", "Fox", "ethan.fox@example.com"),
				new Person(true, "Emma", "Jones", "emma.jones@example.com"),
				new Person(false, "Mike", "Brown", "mike.brown@example.com"));
		StringConverter<Object> sc = new StringConverter<Object>() {
			@Override
			public String toString(Object t) {
				return t == null ? null : t.toString();
			}

			@Override
			public Object fromString(String string) {
				return string;
			}
		};

		TableColumn invitedCol = new TableColumn<>();
		invitedCol.setText("Invited");
		invitedCol.setMinWidth(70);
		invitedCol.setCellValueFactory(new PropertyValueFactory("invited"));
		invitedCol.setCellFactory(CheckBoxTableCell.forTableColumn(invitedCol));

		TableColumn firstNameCol = new TableColumn();
		firstNameCol.setText("First");
		firstNameCol.setCellValueFactory(new PropertyValueFactory("firstName"));
		firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

		TableColumn lastNameCol = new TableColumn();
		lastNameCol.setText("Last");
		lastNameCol.setCellValueFactory(new PropertyValueFactory("lastName"));
		lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

		TableColumn emailCol = new TableColumn();
		emailCol.setText("Email");
		emailCol.setMinWidth(200);
		emailCol.setCellValueFactory(new PropertyValueFactory("email"));
		emailCol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

		TableView tableView = new TableView();
		tableView.setItems(data);
		tableView.setEditable(true);
		tableView.getColumns().addAll(invitedCol, firstNameCol, lastNameCol, emailCol);

		Stage stage = new Stage();
		stage.setScene(new Scene(tableView));
		stage.show();

	}

	private TabPane tabPane;
	private Tab tab1;
	private Tab tab2;
	private Tab tab3;
	private Tab internalTab;

	private void showTabs() {
		tabPane = new TabPane();
		tabPane.setPrefSize(400, 360);
		tabPane.setMinSize(TabPane.USE_PREF_SIZE, TabPane.USE_PREF_SIZE);
		tabPane.setMaxSize(TabPane.USE_PREF_SIZE, TabPane.USE_PREF_SIZE);
		tab1 = new Tab();
		tab2 = new Tab();
		tab3 = new Tab();
		internalTab = new Tab();

		tabPane.setRotateGraphic(false);
		tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.SELECTED_TAB);
		tabPane.setSide(Side.TOP);
		final VBox vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setTranslateX(10);
		vbox.setTranslateY(10);
		// Initial tab with buttons for experimenting
		tab1.setText("Tab 1");
		tab1.setTooltip(new Tooltip("Tab 1 Tooltip"));

		setUpControlButtons(vbox);
		tab1.setContent(vbox);
		tabPane.getTabs().add(tab1);
		// Tab2 has longer label and toggles tab closing
		tab2.setText("Longer Tab");
		final VBox vboxLongTab = new VBox();
		vboxLongTab.setSpacing(10);
		vboxLongTab.setTranslateX(10);
		vboxLongTab.setTranslateY(10);

		Label explainRadios = new Label("Closing policy for tabs:");
		vboxLongTab.getChildren().add(explainRadios);
		ToggleGroup closingPolicy = new ToggleGroup();

		for (TabClosingPolicy policy : TabClosingPolicy.values()) {
			final RadioButton radioButton = new RadioButton(policy.name());
			radioButton.setMnemonicParsing(false);
			radioButton.setToggleGroup(closingPolicy);
			radioButton.setOnAction((event) -> {
				final TabClosingPolicy radioPolicy = TabClosingPolicy.valueOf(radioButton.getText());
				tabPane.setTabClosingPolicy(radioPolicy);
			});
			if (policy.name().equals(TabClosingPolicy.SELECTED_TAB.name())) {
				radioButton.setSelected(true);
			}
			vboxLongTab.getChildren().add(radioButton);
		}
		tab2.setContent(vboxLongTab);
		tabPane.getTabs().add(tab2);
		// Tab 3 has a checkbox for showing/hiding tab labels
		tab3.setText("Tab 3");
		final VBox vboxTab3 = new VBox();
		vboxTab3.setSpacing(10);
		vboxTab3.setTranslateX(10);
		vboxTab3.setTranslateY(10);

		final CheckBox cb = new CheckBox("Show labels on original tabs");
		cb.setSelected(true);
		cb.setOnAction((event) -> {
			if (cb.isSelected()) {
				tab1.setText("Tab 1");
				tab2.setText("Longer Tab");
				tab3.setText("Tab 3");
				internalTab.setText("Internal Tabs");

			} else {
				tab1.setText("");
				tab2.setText("");
				tab3.setText("");
				internalTab.setText("");
			}
		});
		vboxTab3.getChildren().add(cb);
		tab3.setContent(vboxTab3);
		tabPane.getTabs().add(tab3);
		// Internal Tabs
		internalTab.setText("Internal Tabs");
		setupInternalTab();
		tabPane.getTabs().add(internalTab);
		Stage stage = new Stage();
		stage.setScene(new Scene(tabPane));
		stage.show();
	}

	private void toggleTabPosition(TabPane tabPane) {
		Side pos = tabPane.getSide();
		if (pos == Side.TOP) {
			tabPane.setSide(Side.RIGHT);
		} else if (pos == Side.RIGHT) {
			tabPane.setSide(Side.BOTTOM);
		} else if (pos == Side.BOTTOM) {
			tabPane.setSide(Side.LEFT);
		} else {
			tabPane.setSide(Side.TOP);
		}
	}

	private void toggleTabMode(TabPane tabPane) {
		if (!tabPane.getStyleClass().contains(TabPane.STYLE_CLASS_FLOATING)) {
			tabPane.getStyleClass().add(TabPane.STYLE_CLASS_FLOATING);
		} else {
			tabPane.getStyleClass().remove(TabPane.STYLE_CLASS_FLOATING);
		}
	}

	private void setupInternalTab() {
		StackPane internalTabContent = new StackPane();
		final TabPane internalTabPane = new TabPane();
		internalTabPane.getStyleClass().add(TabPane.STYLE_CLASS_FLOATING);
		internalTabPane.setSide(Side.LEFT);

		internalTabPane.setPrefSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);
		final Tab innerTab = new Tab();
		innerTab.setText("Tab 1");
		final VBox innerVbox = new VBox();
		innerVbox.setSpacing(10);
		innerVbox.setTranslateX(10);
		innerVbox.setTranslateY(10);
		Button innerTabPosButton = new Button("Toggle Tab Position");
		innerTabPosButton.setOnAction((e) -> {
			toggleTabPosition(internalTabPane);
		});
		innerVbox.getChildren().add(innerTabPosButton);
		{
			Button innerTabModeButton = new Button("Toggle Tab Mode");
			innerTabModeButton.setOnAction((e) -> {
				toggleTabMode(internalTabPane);
			});
			innerVbox.getChildren().add(innerTabModeButton);
		}
		innerTab.setContent(innerVbox);
		internalTabPane.getTabs().add(innerTab);

		for (int i = 1; i < 5; i++) {
			Tab tab = new Tab();
			tab.setText("Tab " + i);
			tab.setContent(new Region());
			internalTabPane.getTabs().add(tab);
		}
		internalTabContent.getChildren().add(internalTabPane);
		internalTab.setContent(internalTabContent);
	}

	private void setUpControlButtons(VBox vbox) {
		// Toggle style class floating
		final Button tabModeButton = new Button("Toggle Tab Mode");
		tabModeButton.setOnAction((e) -> {
			toggleTabMode(tabPane);
		});
		vbox.getChildren().add(tabModeButton);
		// Tab position
		final Button tabPositionButton = new Button("Toggle Tab Position");
		tabPositionButton.setOnAction((e) -> {
			toggleTabPosition(tabPane);
		});
		// Add tab and switch to it
		final Button newTabButton = new Button("Switch to New Tab");
		newTabButton.setOnAction((e) -> {
			Tab t = new Tab("Testing");
			t.setContent(new Button("Howdy"));
			tabPane.getTabs().add(t);
			tabPane.getSelectionModel().select(t);
		});
		vbox.getChildren().add(newTabButton);
		// Add tab
		final Button addTabButton = new Button("Add Tab");
		addTabButton.setOnAction((e) -> {
			Tab t = new Tab("New Tab");
			t.setContent(new Region());
			tabPane.getTabs().add(t);
		});
		vbox.getChildren().add(addTabButton);
	}

	private void showSplitPane() {
		Region region1 = new Region();
		Region region2 = new Region();
		Region region3 = new Region();
		region1.getStyleClass().add("rounded");
		region2.getStyleClass().add("rounded");
		region3.getStyleClass().add("rounded");

		final SplitPane splitPane = new SplitPane();
		final String hidingSplitPaneCss = getClass().getResource("HiddenSplitPane.css").toExternalForm();
		splitPane.setId("hiddenSplitter");
		splitPane.getItems().addAll(region1, region2, region3);
		splitPane.setDividerPositions(0.33, 0.66);
		splitPane.getStylesheets().add(hidingSplitPaneCss);

		Stage stage = new Stage();
		stage.setScene(new Scene(splitPane));
		stage.show();

	}

	private void showSpinner() {
		String[] styles = { "spinner", // defaults to arrows on right stacked vertically
				Spinner.STYLE_CLASS_ARROWS_ON_RIGHT_HORIZONTAL, Spinner.STYLE_CLASS_ARROWS_ON_LEFT_VERTICAL,
				Spinner.STYLE_CLASS_ARROWS_ON_LEFT_HORIZONTAL, Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL,
				Spinner.STYLE_CLASS_SPLIT_ARROWS_HORIZONTAL };

		TilePane tilePane = new TilePane();
		tilePane.setPrefColumns(6); // preferred columns
		tilePane.setPrefRows(3); // preferred rows
		tilePane.setHgap(20);
		tilePane.setVgap(30);

		Pane root = new Pane();
		root.setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
		root.setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);

		for (int i = 0; i < styles.length; i++) {
			/* Integer spinners */
			SpinnerValueFactory svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
			Spinner sp = new Spinner();
			sp.setValueFactory(svf);
			sp.getStyleClass().add(styles[i]);
			sp.setPrefWidth(80);
			tilePane.getChildren().add(sp);
		}

		for (int i = 0; i < styles.length; i++) {
			/* Double spinners */
			SpinnerValueFactory svf = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 1.0, 0.5, 0.01);
			Spinner sp = new Spinner();
			sp.setValueFactory(svf);
			sp.getStyleClass().add(styles[i]);
			sp.setPrefWidth(90);
			tilePane.getChildren().add(sp);
		}

		for (int i = 0; i < styles.length; i++) {
			/* String spinners */
			ObservableList<String> items = FXCollections.observableArrayList("Grace", "Matt", "Katie");
			SpinnerValueFactory svf = new SpinnerValueFactory.ListSpinnerValueFactory<>(items);
			Spinner sp = new Spinner();
			sp.setValueFactory(svf);
			sp.setPrefWidth(100);
			sp.getStyleClass().add(styles[i]);
			tilePane.getChildren().add(sp);
		}

		root.getChildren().add(tilePane);
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
	}

	private ScrollBar xscrollBar;
	private ScrollBar yscrollBar;
	private double xscrollValue = 0;
	private double yscrollValue = 15;
	private static final int xBarWidth = 393;
	private static final int xBarHeight = 15;
	private static final int yBarWidth = 15;
	private static final int yBarHeight = 393;
	private static final int circleRadius = 90;

	private void showScrollBar() {
		Rectangle bg = new Rectangle(xBarWidth + yBarWidth, xBarHeight + yBarHeight, Color.rgb(90, 90, 90));
		Rectangle box = new Rectangle(100, 100, Color.rgb(150, 150, 150));
		box.setTranslateX(147);
		box.setTranslateY(147);

		Circle circle = new Circle(45, 45, circleRadius, Color.rgb(90, 210, 210));
		circle.setOpacity(0.4);
		circle.relocate(0, 15);

		final ChangeListener<Number> xValueListener = (observable, oldValue, newValue) -> {
			setScrollValueX(xscrollBar.getValue(), circle);
		};
		xscrollBar = horizontalScrollBar();
		xscrollBar.setUnitIncrement(20.0);
		xscrollBar.valueProperty().addListener(xValueListener);
		final ChangeListener<Number> yValueListener = (ObservableValue<? extends Number> observable, Number oldValue,
				Number newValue) -> {
			setScrollValueY(yscrollBar.getValue(), circle);
		};
		yscrollBar = verticalScrollBar();
		yscrollBar.setUnitIncrement(20.0);
		yscrollBar.valueProperty().addListener(yValueListener);

		yscrollBar.setTranslateX(yBarHeight);
		yscrollBar.setTranslateY(yBarWidth);
		yscrollBar.setOrientation(Orientation.VERTICAL);

		Group group = new Group();
		group.getChildren().addAll(bg, box, circle, xscrollBar, yscrollBar);

		Stage stage = new Stage();
		stage.setScene(new Scene(group));
		stage.show();

	}

	private ScrollBar horizontalScrollBar() {
		final ScrollBar scrollBar = new ScrollBar();
		scrollBar.setMinSize(-1, -1);
		scrollBar.setPrefSize(xBarWidth, xBarHeight);
		scrollBar.setMaxSize(xBarWidth, xBarHeight);
		scrollBar.setVisibleAmount(50);
		scrollBar.setMax(xBarWidth - (2 * circleRadius));
		return scrollBar;
	}

	private ScrollBar verticalScrollBar() {
		final ScrollBar scrollBar = new ScrollBar();
		scrollBar.setMinSize(-1, -1);
		scrollBar.setPrefSize(yBarWidth, yBarHeight);
		scrollBar.setMaxSize(yBarWidth, yBarHeight);
		scrollBar.setVisibleAmount(50);
		scrollBar.setMax(yBarHeight - (2 * circleRadius));
		return scrollBar;
	}

	private void setScrollValueX(double v, Circle circle) {
		this.xscrollValue = v;
		circle.relocate(xscrollValue, yscrollValue);
	}

	private void setScrollValueY(double v, Circle circle) {
		this.yscrollValue = v + xBarHeight;
		circle.relocate(xscrollValue, yscrollValue);
	}

	private void showRadioButton() {
		HBox hbox = new HBox(18);
		hbox.setAlignment(Pos.CENTER);
		VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setAlignment(Pos.CENTER_LEFT);

		ToggleGroup tg = new ToggleGroup();
		RadioButton rb1 = new RadioButton("Hello");
		rb1.setToggleGroup(tg);

		RadioButton rb2 = new RadioButton("Bye");
		rb2.setToggleGroup(tg);
		rb2.setSelected(true);

		RadioButton rb3 = new RadioButton("Disabled");
		rb3.setToggleGroup(tg);
		rb3.setSelected(false);
		rb3.setDisable(true);

		vbox.getChildren().addAll(rb1, rb2, rb3);
		hbox.getChildren().add(vbox);

		Stage stage = new Stage();
		stage.setScene(new Scene(hbox));
		stage.show();

	}

	final Timeline timeline = new Timeline();

	public void play() {
		originalLocale = Locale.getDefault();
		timeline.play();
	}

	@Override
	public void stop() {
		Locale.setDefault(originalLocale);

		timeline.stop();
	}

	private void showProgressIndicator() {
		GridPane gridPane = new GridPane();

		ProgressIndicator p1 = new ProgressIndicator();
		p1.setPrefSize(50, 50);

		ProgressIndicator p2 = new ProgressIndicator(0.25);
		p2.setPrefSize(50, 50);

		ProgressIndicator p3 = new ProgressIndicator(0.5);
		p3.setPrefSize(50, 50);

		ProgressIndicator p4 = new ProgressIndicator(1.0);
		p4.setPrefSize(50, 50);

		// styled ProgressIndicator
		final ProgressIndicator p5 = new ProgressIndicator();
		p5.setPrefSize(100, 100);
		p5.styleProperty().bind(Bindings.createStringBinding(() -> {
			final double percent = p5.getProgress();
			if (percent < 0) {
				// progress bar went indeterminate
				return null;
			}
			//
			// poor man's gradient for stops: red, yellow 50%, green
			// Based on
			// http://en.wikibooks.org/wiki/Color_Theory/Color_gradient#Linear_RGB_gradient_with_6_segments
			//
			final double m = (2d * percent);
			final int n = (int) m;
			final double f = m - n;
			final int t = (int) (255 * f);
			int r = 0, g = 0, b = 0;
			switch (n) {
			case 0:
				r = 255;
				g = t;
				b = 0;
				break;
			case 1:
				r = 255 - t;
				g = 255;
				b = 0;
				break;
			case 2:
				r = 0;
				g = 255;
				b = 0;
				break;

			}
			final String style = String.format("-fx-progress-color: rgb(%d,%d,%d)", r, g, b);
			return style;
		}, p5.progressProperty()));
		// animate the styled ProgressIndicator
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(true);
		final KeyValue kv0 = new KeyValue(p5.progressProperty(), 0);
		final KeyValue kv1 = new KeyValue(p5.progressProperty(), 1);
		final KeyFrame kf0 = new KeyFrame(Duration.ZERO, kv0);
		final KeyFrame kf1 = new KeyFrame(Duration.millis(3000), kv1);
		timeline.getKeyFrames().addAll(kf0, kf1);

		gridPane.add(p1, 1, 0);
		gridPane.add(p2, 0, 1);
		gridPane.add(p3, 1, 1);
		gridPane.add(p4, 2, 1);
		gridPane.add(p5, 1, 2);

		gridPane.setHgap(20);
		gridPane.setVgap(20);
		gridPane.setAlignment(Pos.CENTER);

		Stage stage = new Stage();
		stage.setScene(new Scene(gridPane));
		stage.show();

	}

	private void showProgressBar() {

		double y = 15;
		final double SPACING = 15;
		ProgressBar p1 = new ProgressBar();
		p1.setLayoutY(y);

		y += SPACING;
		ProgressBar p2 = new ProgressBar();
		p2.setPrefWidth(150);
		p2.setLayoutY(y);

		y += SPACING;
		ProgressBar p3 = new ProgressBar();
		p3.setPrefWidth(200);
		p3.setLayoutY(y);

		y = 15;
		ProgressBar p4 = new ProgressBar(0.25);
		p4.setLayoutX(215);
		p4.setLayoutY(y);

		y += SPACING;
		ProgressBar p5 = new ProgressBar(0.50);
		p5.setPrefWidth(150);
		p5.setLayoutX(215);
		p5.setLayoutY(y);

		y += SPACING;
		ProgressBar p6 = new ProgressBar(1);
		p6.setPrefWidth(200);
		p6.setLayoutX(215);
		p6.setLayoutY(y);

		Group group = new Group();
		group.getChildren().addAll(p1, p2, p3, p4, p5, p6);

		Stage stage = new Stage();
		stage.setScene(new Scene(group));
		stage.show();

	}

	private static final Image[] images = new Image[7];
	private static final String[] urls = { "/ensemble/samples/shared-resources/Animal1.jpg",
			"/ensemble/samples/shared-resources/Animal2.jpg", "/ensemble/samples/shared-resources/Animal3.jpg",
			"/ensemble/samples/shared-resources/Animal4.jpg", "/ensemble/samples/shared-resources/Animal5.jpg",
			"/ensemble/samples/shared-resources/Animal6.jpg", "/ensemble/samples/shared-resources/Animal7.jpg" };

	private void showPagination() {
		VBox outerBox = new VBox();
		outerBox.setAlignment(Pos.CENTER);
		// Images for our pages
		for (int i = 0; i < images.length; i++) {
			String url = getClass().getResource(urls[i]).toExternalForm();
			images[i] = new Image(url, false);
		}

		Pagination pagination = new Pagination(7);
		pagination.setPageFactory((pageIndex) -> createAnimalPage(pageIndex));
		// Style can be numeric page indicators or bullet indicators
		Button styleButton = new Button("Toggle pagination style");
		styleButton.setOnAction((me) -> {
			ObservableList<String> styleClass = pagination.getStyleClass();
			if (!styleClass.contains(Pagination.STYLE_CLASS_BULLET)) {
				styleClass.add(Pagination.STYLE_CLASS_BULLET);
			} else {
				styleClass.remove(Pagination.STYLE_CLASS_BULLET);
			}
		});

		outerBox.getChildren().addAll(pagination, styleButton);
		Stage stage = new Stage();
		stage.setScene(new Scene(outerBox));
		stage.show();
	}

	private VBox createAnimalPage(int pageIndex) {
		VBox box = new VBox();
		ImageView iv = new ImageView(images[pageIndex]);
		box.setAlignment(Pos.CENTER);
		Label desc = new Label("PAGE " + (pageIndex + 1));
		box.getChildren().addAll(iv, desc);
		return box;
	}

	private void showMenu() {
		final String os = System.getProperty("os.name");
		VBox vbox = new VBox(20);
		vbox.setPrefSize(300, 100);
		final MenuBar menuBar = new MenuBar();

		MenuItem menu111 = new MenuItem("blah");
		final MenuItem menu112 = new MenuItem("foo");
		final CheckMenuItem menu113 = new CheckMenuItem("Show \"foo\" item");
		menu113.setSelected(true);
		menu113.selectedProperty().addListener((Observable valueModel) -> {
			menu112.setVisible(menu113.isSelected());
		});
		final String INFO = "/ensemble/samples/shared-resources/menuInfo.png";
		final Image INFO_MENU_IMAGE = new Image(getClass().getResourceAsStream(INFO));
		Menu menu11 = new Menu("Submenu 1", new ImageView(INFO_MENU_IMAGE));
		menu11.getItems().addAll(menu111, menu112, menu113);
		MenuItem menu121 = new MenuItem("Item 1");
		MenuItem menu122 = new MenuItem("Item 2");
		Menu menu12 = new Menu("Submenu 2");
		menu12.getItems().addAll(menu121, menu122);

		final String change[] = { "Change Text", "Change Back" };
		final MenuItem menu13 = new MenuItem(change[0]);
		menu13.setAccelerator(KeyCombination.keyCombination("Shortcut+C"));
		menu13.setOnAction((t) -> {
			final String menuText = menu13.getText().equals(change[0]) ? change[1] : change[0];
			menu13.setText(menuText);
		});

		Menu menu1 = new Menu("Options");
		menu1.getItems().addAll(menu11, menu12, menu13);
		menuBar.getMenus().addAll(menu1);

		if (os != null && os.startsWith("Mac")) {
			Menu systemMenuBarMenu = new Menu("MenuBar Options");

			final String check = "Use System Menu Bar (Only works on Mac)";
			final CheckMenuItem useSystemMenuBarCB = new CheckMenuItem(check);
			useSystemMenuBarCB.setSelected(true);
			BooleanProperty selectedCB = useSystemMenuBarCB.selectedProperty();
			menuBar.useSystemMenuBarProperty().bindBidirectional(selectedCB);
			systemMenuBarMenu.getItems().add(useSystemMenuBarCB);

			menuBar.getMenus().add(systemMenuBarMenu);

			HBox hbox = new HBox();
			hbox.setAlignment(Pos.CENTER);
			sysMenuLabel.setStyle("-fx-font-size: 24");
			hbox.getChildren().add(sysMenuLabel);
			vbox.getChildren().add(hbox);
			sysMenuLabel.setVisible((menuBar.getHeight() == 0));
			ChangeListener<? super Number> heightListener = (ObservableValue<? extends Number> ov, Number old,
					Number now) -> {
				sysMenuLabel.setVisible((menuBar.getHeight() == 0));
			};
			menuBar.heightProperty().addListener(heightListener);
		}

		vbox.getChildren().addAll(menuBar);

		Stage stage = new Stage();
		stage.setScene(new Scene(vbox));
		stage.show();
	}

	private final Label sysMenuLabel = new Label("Using System Menu");

	private void showListView() {
		final Number[] data = { 100.00, -12.34, 33.01, 71.00, 23000.00, -6.00, 0, 42223.00, -12.05, 500.00, 430000.00,
				1.00, -4.00, 1922.01, -90.00, 11111.00, 3901349.00, 12.00, -1.00, -2.00, 15.00, 47.50, 12.11 };
		final ObservableList<Number> numbers = FXCollections.<Number>observableArrayList(Arrays.asList(data));
		final ListView<Number> listView = new ListView<>(numbers);

		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		listView.setCellFactory((ListView<java.lang.Number> list) -> new MoneyFormatCell());

		Stage stage = new Stage();
		stage.setScene(new Scene(listView));
		stage.show();

	}

	private void showHyperLink() {
		HBox hbox = new HBox(18);
		hbox.setAlignment(Pos.CENTER);

		VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setAlignment(Pos.CENTER_LEFT);

		String IMAGE_48 = "/ensemble/samples/shared-resources/icon-48x48.png";
		Image ICON_48 = new Image(getClass().getResourceAsStream(IMAGE_48));
		ImageView iv = new ImageView(ICON_48);
		Hyperlink h1 = new Hyperlink("Hyperlink");
		h1.setPrefWidth(80);
		h1.setMinWidth(Hyperlink.USE_PREF_SIZE);

		Hyperlink h2 = new Hyperlink("Hyperlink with Image");
		h2.setPrefWidth(200);
		h2.setMinWidth(Hyperlink.USE_PREF_SIZE);
		h2.setGraphic(iv);

		vbox.getChildren().addAll(h1, h2);
		hbox.getChildren().add(vbox);

		Stage stage = new Stage();
		stage.setScene(new Scene(hbox));
		stage.show();
	}

	private final String INITIAL_TEXT = "<html><body>Lorem ipsum dolor sit " + "amet, consectetur adipiscing elit."
			+ "Nam tortor felis, pulvinar in scelerisque cursus, pulvinar " + "at ante. Nulla consequat "
			+ "congue lectus in sodales. </body></html> ";

	private void showHtmlEdior() {

		HTMLEditor htmlEditor = new HTMLEditor();
		htmlEditor.setHtmlText(INITIAL_TEXT);

		ScrollPane htmlSP = new ScrollPane();
		htmlSP.setFitToWidth(true);
		htmlSP.setPrefWidth(htmlEditor.prefWidth(-1)); // Workaround of RT-21495
		htmlSP.setPrefHeight(245);
		htmlSP.setVbarPolicy(ScrollBarPolicy.NEVER);
		htmlSP.setContent(htmlEditor);

		final Label htmlLabel = new Label();
		htmlLabel.setWrapText(true);

		ScrollPane scrollPane = new ScrollPane();
		scrollPane.getStyleClass().add("noborder-scroll-pane");
		scrollPane.setContent(htmlLabel);
		scrollPane.setFitToWidth(true);

		Button showHTMLButton = new Button("Show the HTML below");
		showHTMLButton.setOnAction((arg0) -> {
			htmlLabel.setText(htmlEditor.getHtmlText());
		});

		VBox vRoot = new VBox();
		vRoot.setAlignment(Pos.CENTER);
		vRoot.setSpacing(5);
		vRoot.getChildren().addAll(htmlSP, showHTMLButton, scrollPane);

		Stage stage = new Stage();
		stage.setScene(new Scene(vRoot));
		stage.show();
	}

	private void showDialog() {
		Group group = new Group();

		HBox alertBox = new HBox(10);
		VBox dialogCreators = new VBox(20);

		ComboBox<String> alert_types = new ComboBox<String>();
		alert_types.getItems().addAll("Information", "Warning", "Confirmation", "Error");
		alert_types.setValue("Information");

		Button create = new Button("Create Alert");
		create.setTooltip(new Tooltip("Create an Alert Dialog"));
		create.setOnAction(e -> {
			String type = (String) alert_types.getValue();
			switch (type) {
			case "Information":
				setAlertType(AlertType.INFORMATION);
				break;
			case "Warning":
				setAlertType(AlertType.WARNING);
				break;
			case "Confirmation":
				setAlertType(AlertType.CONFIRMATION);
				break;
			case "Error":
				setAlertType(AlertType.ERROR);
				break;
			}
			createAlert();
		});

		alertBox.getChildren().addAll(alert_types, create);

		Button exception = new Button("Create Exception Dialog");
		exception.setTooltip(new Tooltip("Create an Exception Dialog"));
		exception.setOnAction(e -> createExceptionDialog(new RuntimeException("oops")));

		Button input = new Button("Create Text Input Dialog");
		input.setTooltip(new Tooltip("Create an Text Input Dialog"));
		input.setOnAction(e -> createTextInputDialog());

		dialogCreators.getChildren().addAll(alertBox, exception, input);

		group.getChildren().add(dialogCreators);

		Stage stage = new Stage();
		stage.setScene(new Scene(group));
		stage.show();

	}

	private AlertType type = AlertType.INFORMATION;

	public void setAlertType(AlertType at) {
		type = at;
	}

	protected Alert createAlert() {
		Alert alert = new Alert(type, "");
		alert.initModality(Modality.APPLICATION_MODAL);
		alert.getDialogPane().setContentText(type + " text.");
		alert.getDialogPane().setHeaderText(null);
		alert.showAndWait().filter(response -> response == ButtonType.OK)
				.ifPresent(response -> System.out.println("The alert was approved"));
		return alert;
	}

	protected Dialog<ButtonType> createExceptionDialog(Throwable th) {
		Dialog<ButtonType> dialog = new Dialog<ButtonType>();

		dialog.setTitle("Program exception");

		final DialogPane dialogPane = dialog.getDialogPane();
		dialogPane.setContentText("Details of the problem:");
		dialogPane.getButtonTypes().addAll(ButtonType.OK);
		dialogPane.setContentText(th.getMessage());
		dialog.initModality(Modality.APPLICATION_MODAL);

		Label label = new Label("Exception stacktrace:");
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		th.printStackTrace(pw);
		pw.close();

		TextArea textArea = new TextArea(sw.toString());
		textArea.setEditable(false);
		textArea.setWrapText(true);

		textArea.setMaxWidth(Double.MAX_VALUE);
		textArea.setMaxHeight(Double.MAX_VALUE);
		GridPane.setVgrow(textArea, Priority.ALWAYS);
		GridPane.setHgrow(textArea, Priority.ALWAYS);

		GridPane root = new GridPane();
		root.setVisible(false);
		root.setMaxWidth(Double.MAX_VALUE);
		root.add(label, 0, 0);
		root.add(textArea, 0, 1);
		dialogPane.setExpandableContent(root);
		dialog.showAndWait().filter(response -> response == ButtonType.OK)
				.ifPresent(response -> System.out.println("The exception was approved"));
		return dialog;
	}

	protected Dialog createTextInputDialog() {
		TextInputDialog textInput = new TextInputDialog("");
		textInput.setTitle("Text Input Dialog");
		textInput.getDialogPane().setContentText("First Name:");
		textInput.showAndWait().ifPresent(response -> {
			if (response.isEmpty()) {
				System.out.println("No name was inserted");
			} else {
				System.out.println("The first name is: " + response);
			}
		});
		return textInput;
	}

	private final static ObservableList<String> locales = FXCollections.observableArrayList();
	private DatePicker datePicker;
	private MenuBar datePickerMenuBar;
	private final LocalDate today = LocalDate.now();
	private final LocalDate tomorrow = today.plusDays(1);
	private Locale originalLocale;
	private HBox hbox;
	static {
		locales.addAll(new String[] { "en-US", "ar-SA", "en-GB", "cs-CZ", "el-GR", "he-IL", "hi-IN", "ja-JP",
				"ja-JP-u-ca-japanese", "ru-RU", "sv-SE", "th-TH", "th-TH-u-ca-buddhist", "th-TH-u-ca-buddhist-nu-thai",
				"zh-CN", "en-US-u-ca-islamic-umalqura", "ar-SA-u-ca-islamic-umalqura", "en-u-ca-japanese-nu-thai" });
	}

	private void showDatepicker() {
		Text datePickerText = new Text("Date:");

		hbox = new HBox(18);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(datePickerText);

		datePicker = createDatePicker();

		VBox vbox = new VBox(22);
		vbox.getChildren().addAll(datePickerMenuBar, hbox);
		vbox.setPrefSize(300, 200);
		vbox.setMinSize(VBox.USE_PREF_SIZE, VBox.USE_PREF_SIZE);

		Stage stage = new Stage();
		stage.setScene(new Scene(vbox));
		stage.show();
	}

	private DatePicker createDatePicker() {
		hbox.getChildren().remove(datePicker);
		LocalDate value = null;
		if (datePicker != null) {
			value = datePicker.getValue();
		}
		DatePicker picker = new DatePicker();
		// day cell factory
		final Callback<DatePicker, DateCell> dayCellFactory = new Callback<DatePicker, DateCell>() {
			@Override
			public DateCell call(final DatePicker datePicker) {
				return new DateCell() {
					@Override
					public void updateItem(LocalDate item, boolean empty) {
						super.updateItem(item, empty);
						if (item.isBefore(today)) {
							setStyle("-fx-background-color: #8099ff;");
						} else {
							if (item.equals(tomorrow)) {
								setTooltip(new Tooltip("Tomorrow is important"));
							}
						}
					}
				};
			}
		};
		// Create the menubar to experiment with the DatePicker
		datePickerMenuBar = createMenuBar(dayCellFactory);
		// Listen for DatePicker actions
		picker.setOnAction((t) -> {
			LocalDate isoDate = picker.getValue();
			if ((isoDate != null) && (!isoDate.equals(LocalDate.now()))) {
				for (Menu menu : datePickerMenuBar.getMenus()) {
					if (menu.getText().equals("Options for Locale")) {
						for (MenuItem menuItem : menu.getItems()) {
							if (menuItem.getText().equals("Set date to today")) {
								if ((menuItem instanceof CheckMenuItem) && ((CheckMenuItem) menuItem).isSelected()) {
									((CheckMenuItem) menuItem).setSelected(false);
								}
							}
						}
					}
				}
			}
		});
		hbox.getChildren().add(picker);
		if (value != null) {
			picker.setValue(value);
		}
		return picker;
	}

	private MenuBar createMenuBar(final Callback<DatePicker, DateCell> dayCellFac) {
		final MenuBar menuBar = new MenuBar();
		final ToggleGroup localeToggleGroup = new ToggleGroup();
		// Locales
		Menu localeMenu = new Menu("Locales");
		Iterator<String> localeIterator = locales.iterator();
		while (localeIterator.hasNext()) {
			RadioMenuItem localeMenuItem = new RadioMenuItem(localeIterator.next());
			localeMenuItem.setToggleGroup(localeToggleGroup);
			localeMenu.getItems().add(localeMenuItem);
		}

		Menu optionsMenu = new Menu("Options for Locale");
		// Style DatePicker with cell factory
		// XXX - localize
		final String MSG = "Use cell factory to color past days and add tooltip to tomorrow";
		final CheckMenuItem cellFactoryMenuItem = new CheckMenuItem(MSG);
		optionsMenu.getItems().add(cellFactoryMenuItem);
		cellFactoryMenuItem.setOnAction((t) -> {
			if (cellFactoryMenuItem.isSelected()) {
				datePicker.setDayCellFactory(dayCellFac);
			} else {
				datePicker.setDayCellFactory(null);
			}
		});

		// Set date to today
		final CheckMenuItem todayMenuItem = new CheckMenuItem("Set date to today");
		optionsMenu.getItems().add(todayMenuItem);
		todayMenuItem.setOnAction((t) -> {
			if (todayMenuItem.isSelected()) {
				datePicker.setValue(today);
			}
		});

		// Set date to today
		final CheckMenuItem showWeekNumMenuItem = new CheckMenuItem("Show week numbers");
		optionsMenu.getItems().add(showWeekNumMenuItem);
		showWeekNumMenuItem.setOnAction((t) -> {
			datePicker.setShowWeekNumbers(showWeekNumMenuItem.isSelected());
		});

		final ChangeListener<Toggle> listener = (ObservableValue<? extends Toggle> observable, Toggle old,
				Toggle now) -> {
			if (localeToggleGroup.getSelectedToggle() != null) {
				RadioMenuItem item = (RadioMenuItem) localeToggleGroup.getSelectedToggle();
				String selectedLocale = item.getText().replace('_', '-');
				Locale locale = Locale.forLanguageTag(selectedLocale);
				Locale.setDefault(locale);
				datePicker = createDatePicker();
				final boolean showWeek = showWeekNumMenuItem.isSelected();
				datePicker.setShowWeekNumbers(showWeek);
			}
		};
		localeToggleGroup.selectedToggleProperty().addListener(listener);
		menuBar.getMenus().addAll(localeMenu, optionsMenu);

		return menuBar;
	}

	private void showColorPicker() {
		final ColorPicker colorPicker = new ColorPicker(Color.GREEN);
		final Label coloredText = new Label("Colors");
		coloredText.setFont(new Font(53));
		final Button coloredButton = new Button("Colored Control");
		Color c = colorPicker.getValue();
		coloredText.setTextFill(c);
		coloredButton.setStyle(createRGBString(c));

		colorPicker.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
			@Override
			public void handle(javafx.event.ActionEvent t) {
				Color newColor = colorPicker.getValue();
				coloredText.setTextFill(newColor);
				coloredButton.setStyle(createRGBString(newColor));
			}
		});

		VBox outerVBox = new VBox(coloredText, coloredButton, colorPicker);
		outerVBox.setAlignment(Pos.CENTER);
		outerVBox.setSpacing(20);
		outerVBox.setMaxSize(VBox.USE_PREF_SIZE, VBox.USE_PREF_SIZE);

		Stage stage = new Stage();
		stage.setScene(new Scene(outerVBox));
		stage.show();
	}

	private String createRGBString(Color c) {
		return String.format("-fx-base: rgb(%f,%f,%f);", (c.getRed() * 255), (c.getGreen() * 255), (c.getBlue() * 255));
	}

	private void showChoice() {
		ChoiceBox<String> cb = new ChoiceBox<>();
		cb.getItems().addAll("Dog", "Cat", "Horse");
		cb.getSelectionModel().selectFirst();
		Stage stage = new Stage();
		stage.setScene(new Scene(cb));
		stage.show();
	}

	private void showChekBox() {
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		CheckBox cb1 = new CheckBox("Simple checkbox");

		CheckBox cb2 = new CheckBox("Three-state checkbox");
		cb2.setAllowIndeterminate(true);
		cb2.setIndeterminate(false);

		CheckBox cb3 = new CheckBox("Disabled");
		cb3.setSelected(true);
		cb3.setDisable(true);

		vbox.getChildren().addAll(cb1, cb2, cb3);
		vbox.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

		Stage stage = new Stage();
		stage.setScene(new Scene(vbox));
		stage.show();
	}

	private void showButton() {
		HBox hBox = new HBox();
		hBox.setSpacing(5);
		for (int i = 0; i < 7; i++) {
			Button b = new Button("Color");
			b.setStyle(String.format("-fx-base: rgb(%d,%d,%d);", (10 * i), (20 * i), (10 * i)));
			hBox.getChildren().add(b);
		}
		HBox hBox2 = new HBox();
		hBox2.setSpacing(5);
		hBox2.setTranslateY(30);
		hBox2.getChildren().addAll(getButton("Red"), getButton("Orange"), getButton("Yellow"), getButton("Green"),
				getButton("Blue"), getButton("Indigo"), getButton("Violet"));

		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(hBox, hBox2);
		vBox.setPrefHeight(140);
		vBox.setMaxSize(VBox.USE_PREF_SIZE, VBox.USE_PREF_SIZE);
		vBox.setMinSize(VBox.USE_PREF_SIZE, VBox.USE_PREF_SIZE);

		Stage stage = new Stage();
		stage.setScene(new Scene(vBox));
		stage.show();
	}

	protected Button getButton(String name) {
		Button button = new Button(name);
		button.setStyle(String.format("-fx-base: %s;", name.toLowerCase()));
		return button;
	}

	private void showAccordion() {
		Accordion accordion = new Accordion();
		accordion.getPanes().addAll(new TitledPane("Control", new Button("Press")),
				new TitledPane("String", new Text("Hello World.")),
				new TitledPane("Shape", new Rectangle(120, 50, Color.RED)));
		accordion.setMinSize(100, 100);
		accordion.setPrefSize(100, 200);

		Stage stage = new Stage();
		stage.setScene(new Scene(accordion));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

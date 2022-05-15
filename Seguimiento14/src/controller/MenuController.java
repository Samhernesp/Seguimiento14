package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import model.ThreadClock;

public class MenuController {
	
	@FXML
	private Label reloj;
	
	@FXML
	private Label fecha;
	
	@FXML
	private Label relojW;
	
	@FXML
	private Label zonaW;
	
	@FXML
	private Label relojB;
	
	@FXML
	private Label zonaB;
	
	@FXML
	private Label relojBe;
	
	@FXML
	private Label zonaBe;
	
	@FXML
	private Label relojC;
	
	@FXML
	private Label zonaC;
	
	@FXML
	private Label relojBa;
	
	@FXML
	private Label zonaBa;
	
	@FXML
	private Label relojP;
	
	@FXML
	private Label zonaP;
	
	@FXML
	private Label relojK;
	
	@FXML
	private Label zonaK;
	
	@FXML
	private Label relojH;
	
	@FXML
	private Label zonaH;
	
	@FXML
	private Label relojS;
	
	@FXML
	private Label zonaS;
	
	@FXML
	private Label relojBer;
	
	@FXML
	private Label zonaBer;
	
	@FXML 
	private ComboBox<String> zona;
	
	@FXML
	private Button select;
	
	private ArrayList<String> array = new ArrayList<String>();
	
	DateTimeFormatter rolex = DateTimeFormatter.ofPattern("hh:mm:ss");
	
	DateTimeFormatter rolex2 = DateTimeFormatter.ofPattern("E, dd MMM yyyy");
	
	LocalDate date = LocalDate.now();
	
	
	@FXML
	public void clockStep(LocalTime time) {
		Platform.runLater(new Runnable() {
            @Override public void run() {
               reloj.setText(time.format(rolex));
               fecha.setText(date.format(rolex2));
               relojW.setText((time.plusHours(1)).format(rolex));
               relojB.setText((time.plusHours(7)).format(rolex));
               relojBe.setText((time.plusHours(13)).format(rolex));
               relojC.setText((time.plusHours(6)).format(rolex));
               relojBa.setText((time.plusHours(7)).format(rolex));
               relojP.setText((time.plusHours(6)).format(rolex));
               relojK.setText((time.plusHours(7)).format(rolex));
               relojH.setText((time.plusHours(14)).format(rolex));
               relojS.setText((time.plusHours(14)).format(rolex));
               relojBer.setText((time.plusHours(7)).format(rolex));
            }
        });
	}
	
	@FXML 
	public void initialize(){
		ThreadClock hilos = new ThreadClock(this);
		hilos.start();
		array.add("Washington");
		array.add("Boloña");
		array.add("Beijing");
		array.add("Cambridge");
		array.add("Barcelona");
		array.add("Porto");
		array.add("Karthoum");
		array.add("Hiroshima");
		array.add("Seul");
		array.add("Berlin");
		zona.setItems(FXCollections.observableArrayList(array));
		relojW.setVisible(false);
        relojB.setVisible(false);
        relojBe.setVisible(false);
        relojC.setVisible(false);
        relojBa.setVisible(false);
        relojP.setVisible(false);
        relojK.setVisible(false);
        relojH.setVisible(false);
        relojS.setVisible(false);
        relojBer.setVisible(false);
    	zonaW.setVisible(false);
        zonaB.setVisible(false);
        zonaBe.setVisible(false);
        zonaC.setVisible(false);
        zonaBa.setVisible(false);
        zonaP.setVisible(false);
        zonaK.setVisible(false);
        zonaH.setVisible(false);
        zonaS.setVisible(false);
        zonaBer.setVisible(false);
	}
	
	@FXML
	public void selectZone() {
		String option=zona.getValue();
		if (option.equals("Washington")) {
			relojW.setVisible(true);
			zonaW.setVisible(true);
		} else if (option.equals("Boloña")) {
			relojB.setVisible(true);
			zonaB.setVisible(true);
		} else if (option.equals("Beijing")) {
			relojBe.setVisible(true);
			zonaBe.setVisible(true);
		} else if (option.equals("Cambridge")) {
			relojC.setVisible(true);
			zonaC.setVisible(true);
		} else if (option.equals("Barcelona")) {
			relojBa.setVisible(true);
			zonaBa.setVisible(true);
		} else if (option.equals("Porto")) {
			relojP.setVisible(true);
			zonaP.setVisible(true);
		} else if (option.equals("Karthoum")) {
			relojK.setVisible(true);
			zonaK.setVisible(true);
		} else if (option.equals("Hiroshima")) {
			relojH.setVisible(true);
			zonaH.setVisible(true);
		} else if (option.equals("Seul")) {
			relojS.setVisible(true);
			zonaS.setVisible(true);
		} else if (option.equals("Berlin")) {
			relojBer.setVisible(true);
			zonaBer.setVisible(true);
		}
	}

}

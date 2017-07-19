package CCApplication;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dbmanager.AdminLogin;
import dbmanager.CCFunctions;
import dbmanager.DBManager;
import dbmanager.EngWordsPOJO;
import dbmanager.NedWoordPOJO;
import dbmanager.UserLogin;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class Login extends Application
{
	
	@Override
	public void start(Stage primaryStage) {
		
		//Creating a BorderPane
		BorderPane bp = new BorderPane();
		bp.setPadding(new Insets(5, 1, 5, 0));
		
		//Creating a GridPane
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(5, 5, 5, 2));
		gridPane.setHgap(5);
		gridPane.setVgap(1);
		
		//Adding Username + Password Labels/Textfields and Login button
		Label lblAantalToets = new Label("Aantal toetsen totaal:");
		Label lblTotaalPunt = new Label("Aantal punten totaal:");
		Label lblGemPunt = new Label("Gemiddelde punten totaal:");
		
		Label lblUserName = new Label("Gebruikersnaam");
		Label lblPassword = new Label("Wachtwoord");
		
		Label changeUser = new Label("Gebruikersnaam");
		Label changePass = new Label("Wachtwoord");
		
		
		final TextField usernameField = new TextField();
		final TextField passwordField = new PasswordField();
		
		final TextField changeUserField = new TextField();
		final TextField changePassField = new PasswordField();
	
		final TextField txtAantalToets = new TextField();
		final TextField txtTotaalPunt = new TextField();
		final TextField txtGemPunt = new TextField();
		
		ListView<EngWordsPOJO> englishList = new ListView<EngWordsPOJO>();
		ListView<NedWoordPOJO> dutchList = new ListView<NedWoordPOJO>();
		
		
		
		txtAantalToets.setEditable(false);
		txtTotaalPunt.setEditable(false);
		txtGemPunt.setEditable(false);
		changeUserField.setEditable(false);
		changePassField.setEditable(false);
		
		final Label lblLoggedIn = new Label();
		final Label lblChangedPass = new Label();
		
		Button btnLogin = new Button("Login");
		Button btnLogout = new Button("Logout");
		Button overHoren = new Button("Overhoren");
		Button overZicht = new Button("Overzicht");
		Button wijzigPass = new Button("Wachwoord wijzigen");
		Button woordenLijst = new Button("Woordenlijst");
		
		btnLogout.setDisable(true);
		overHoren.setDisable(true);
		overZicht.setDisable(true);
		wijzigPass.setDisable(true);
		woordenLijst.setDisable(true);

		
		//Login Function
		btnLogin.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event) {
			String	adminName = usernameField.getText();
			String	adminPass = passwordField.getText();
			String	userName = usernameField.getText();
			String	userPass = passwordField.getText();
				
				if(adminName.equals(UserLogin.getUsername()) && adminPass.equals(UserLogin.getPassword()))
				{
					btnLogin.setDisable(true);
					btnLogout.setDisable(false);
					overHoren.setDisable(false);
					overZicht.setDisable(false);
					wijzigPass.setDisable(false);
					woordenLijst.setDisable(false);
					changeUserField.setEditable(true);
					changePassField.setEditable(true);
					usernameField.setEditable(false);
					passwordField.setEditable(false);
					lblLoggedIn.setText("Ingelogd als: " + UserLogin.getUsername());
				}
				
				if(userName.equals(AdminLogin.getUsername()) && userPass.equals(AdminLogin.getPassword()))
				{
					btnLogin.setDisable(true);
					btnLogout.setDisable(false);
					overHoren.setDisable(false);
					overZicht.setDisable(false);
					wijzigPass.setDisable(false);
					woordenLijst.setDisable(false);
					changeUserField.setEditable(true);
					changePassField.setEditable(true);
					usernameField.setEditable(false);
					passwordField.setEditable(false);
					lblLoggedIn.setText("Ingelogd als: " + AdminLogin.getUsername());
				}
			}
			});
			
		//Logout Function
		btnLogout.setOnAction(new EventHandler<ActionEvent>(){
			
			
			public void handle(ActionEvent event) {
				btnLogin.setDisable(false);
				btnLogout.setDisable(true);
				overHoren.setDisable(true);
				overZicht.setDisable(true);
				wijzigPass.setDisable(true);
				woordenLijst.setDisable(true);
				lblLoggedIn.setText("");
				lblChangedPass.setText("");
				usernameField.setEditable(true);
				passwordField.setEditable(true);
				txtAantalToets.clear();
				txtTotaalPunt.clear();
				txtGemPunt.clear();
			}
			});
			
		//Wachtwoord wijzigen function
		wijzigPass.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String userName = usernameField.getText();
				String newPass = changePassField.getText(); 
				CCFunctions passChange = new CCFunctions();
				passChange.changePass(userName, newPass);
				lblChangedPass.setText("Wachtwoord succesvol veranderd!");
			}
		});
		
		//Overzicht function
		overZicht.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				String userName = usernameField.getText();
				String userPass = passwordField.getText();
				
				int tt = 0;
				int pt = 0;
				int pg = 0;
				
				CCFunctions toetsTotaal = new CCFunctions();
				CCFunctions puntTotaal = new CCFunctions();
				CCFunctions puntGem = new CCFunctions();
				
				tt = toetsTotaal.toetsTotaal(userName, userPass);
				pt = puntTotaal.puntenTotaal(userName, userPass);
				pg = puntGem.insertPuntenGemiddeld(userName, userPass);
				
				txtAantalToets.setText(Integer.toString(tt));
				txtTotaalPunt.setText(Integer.toString(pt));
				txtGemPunt.setText(Integer.toString(pg));
				
				
				
				
				
				
				
				
				
			}
		});
		
		//Woordenlijst function
		woordenLijst.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				CCFunctions engWords = new CCFunctions();
				CCFunctions nedWords = new CCFunctions();
				
				List<EngWordsPOJO> engList = new ArrayList();
				List<NedWoordPOJO> nedList = new ArrayList();
				
				engList = CCFunctions.getEnglishWords();
				nedList = CCFunctions.getNedWords();
				
				englishList.setItems((ObservableList<EngWordsPOJO>) engList);
				dutchList.setItems((ObservableList<NedWoordPOJO>) nedList);

				
			}
			
			
			
			
				});
		
		
		
		//Adding the nodes to the GridPane
		gridPane.add(overHoren, 0, 25);
		
		gridPane.add(woordenLijst, 25, 25);
		gridPane.add(englishList, 25, 50);
		gridPane.add(dutchList, 30, 25);
		
		gridPane.add(overZicht, 0, 0);
		
		gridPane.add(lblAantalToets, 0, 2);
		gridPane.add(txtAantalToets, 1, 2);
		
		gridPane.add(lblTotaalPunt, 0, 4);
		gridPane.add(txtTotaalPunt, 1, 4);
		
		
		gridPane.add(lblGemPunt, 0, 6);
		gridPane.add(txtGemPunt, 1, 6);
		
		gridPane.add(lblLoggedIn, 2, 0);
		gridPane.add(lblChangedPass, 0, 300);
		
		gridPane.add(lblUserName, 0, 80);
		gridPane.add(usernameField, 1, 80);
		
		gridPane.add(lblPassword, 0, 85);
		gridPane.add(passwordField, 1, 85);
		
		gridPane.add(btnLogin, 0, 90);
		gridPane.add(btnLogout, 1, 90);

		gridPane.add(changeUser, 0, 260);
		gridPane.add(changePass, 0, 270);
		gridPane.add(changeUserField, 1, 260 );
		gridPane.add(changePassField, 1, 270);
		gridPane.add(wijzigPass, 0, 280);
		
		//Adding GridPane to the BorderPane
		bp.setCenter(gridPane);
		
		Scene login = new Scene(bp, 800, 600);
		
		
		primaryStage.setTitle("Communication Connoisseur");
		primaryStage.setScene(login);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}

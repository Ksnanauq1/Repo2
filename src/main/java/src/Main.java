package src;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import src.models.Druzyny;

public class Main extends Application {
	
public static void main(String[] agrs) {
	launch(agrs);	
}

Stage window;
TableView<Druzyny> tabela;

@Override 
public void start(Stage primaryStage) throws Exception {
	window=primaryStage;
	window.setTitle("Tabela ligi pi³karskiej");
	
	// Tworzenie tabeli
	tabela = new TableView<>();
	
	TableColumn<Druzyny, String> colPozycja = new TableColumn<>("Pozycja");
	colPozycja.setCellValueFactory(new PropertyValueFactory<Druzyny, String>("pozycja"));
	
	TableColumn<Druzyny, String> colNazwa = new TableColumn<>("Nazwa");
	colNazwa.setCellValueFactory(new PropertyValueFactory<Druzyny, String>("nazwa"));
	
	TableColumn<Druzyny, String> colMecze = new TableColumn<>("Mecze");
	colMecze.setCellValueFactory(new PropertyValueFactory<Druzyny, String>("mecze"));
	
	TableColumn<Druzyny, String> colPunkty = new TableColumn<>("Punkty");
	colPunkty.setCellValueFactory(new PropertyValueFactory<Druzyny, String>("punkty"));
	
	TableColumn<Druzyny, String> colBramki = new TableColumn<>("Bramki");
	colBramki.setCellValueFactory(new PropertyValueFactory<Druzyny, String>("bramki"));
	
	tabela.getColumns().addAll(
			colPozycja, colNazwa, colMecze, colPunkty, colBramki
			);
	
	tabela.setItems( getDruzyny() );
	
	VBox layout = new VBox(10);
	layout.getChildren().addAll(tabela);
	
	Scene scena = new Scene(layout, 500,500);
	window.setScene(scena);
	window.show();
}

public ObservableList<Druzyny> getDruzyny() {
	ObservableList<Druzyny> druzyny = FXCollections.observableArrayList(
			new Druzyny("1", "Piast Gliwice", "20", "42", "37–25"),
			new Druzyny("2", "Legia Warszawa", "20", "37", "39–20"),
			new Druzyny("3", "Cracovia", "21", "36", "44–29"),
			new Druzyny("4", "Pogoñ Szczecin", "21", "36", "26–20"),
			new Druzyny("5", "Ruch Chorzów", "21", "31", "27–31"),
			new Druzyny("6", "Lech Poznañ", "20", "28", "23–23"),
			new Druzyny("7", "Zag³êbie Lubin", "21", "27", "27–31"),
			new Druzyny("8", "Jagiellonia Bia³ystok", "21", "25", "30–34"),
			new Druzyny("9", "Górnik £êczna", "21", "25", "25–32"),
			new Druzyny("10", "Lechia Gdañsk", "21", "24", "25–27"),
			new Druzyny("11", "Korona Kielce", "20", "24", "15–20"),
			new Druzyny("12", "Termalica Bruk-Bet Nieciecza", "21", "24", "21–27"),
			new Druzyny("13", "Wis³a Kraków", "21", "23", "28–23"),
			new Druzyny("14", "Górnik Zabrze", "21", "21", "29–32"),
			new Druzyny("15", "Podbeskidzie Bielsko-Bia³a", "20", "21", "21–34"),
			new Druzyny("16", "Œl¹sk Wroc³aw", "20", "19", "20–29")
			);
	
	return druzyny;
}
}
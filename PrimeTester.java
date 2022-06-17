package lab3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimeTester extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		arg0.setTitle("PrimeTester");
		TextField l1 = new TextField("");
		Button btn = new Button("Is Prime?");
		TextField l2 = new TextField("");
		l1.setMaxSize(50, 0);
		l2.setMaxSize(100, 0);
		l2.setEditable(false);

		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				try {
					int n=Integer.parseInt(l1.getText());
					if(isPrime(n)) l2.setText("Yes");
					else l2.setText("No");
					} 
				catch(NumberFormatException nfe){
					l2.setText("invalid number");
					}
			}
			
		});
		HBox root = new HBox();
		root.getChildren().addAll(l1,btn,l2);
		Scene scene = new Scene(root);
		
		arg0.setScene(scene);
        arg0.show();
		
	}
	private boolean isPrime(int n){
		for(int i=2;i<n;i++){
		if(n%i == 0) return false;
		}
		return true;
		}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

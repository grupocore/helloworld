/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowoeld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author camilo
 */
public class Hellowoeld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         primaryStage.setTitle("JavaFX Welcome");
         GridPane grid = new GridPane();
         grid.setAlignment(Pos.CENTER);
         grid.setHgap(10);
         grid.setVgap(10);
         Text scenetitle = new Text("programacion 2");
         grid.add(scenetitle, 0, 0, 2, 1);

         Label userName = new Label("usuario:");
         grid.add(userName, 0, 1);

         TextField userTextField = new TextField();
         grid.add(userTextField, 1, 1);

         Label pw = new Label("contraseña:");
         grid.add(pw, 0, 2);

         PasswordField pwBox = new PasswordField();
         grid.add(pwBox, 1, 2);
         
         Button btn = new Button("haga click");
         HBox hbBtn = new HBox(10);
         hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
         hbBtn.getChildren().add(btn);
         grid.add(btn,1, 4);
         final Text actiontarget = new Text();
         grid.add(actiontarget, 1, 6);
         btn.setOnAction(new EventHandler<ActionEvent>() {
 
         @Override
         public void handle(ActionEvent e) {
          actiontarget.setFill(Color.FIREBRICK);
          actiontarget.setText("Sign in button pressed");
            }
         });
         
         Scene scene = new Scene(grid, 300, 275);
         
         primaryStage.setScene(scene);
        
         
         primaryStage.show();
         //btn.setText("Say 'camilo'");
         //btn.setOnAction((ActionEvent event) -> {
            // System.out.println("camilo!");
         //});
        
         //StackPane root = new StackPane();
         //root.getChildren().add(btn);
        
         //primaryStage.setTitle("camilo!");
         //primaryStage.setScene(scene);
         //primaryStage.show();
         
    } 
         
    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
         launch(args);
         final Text actiontarget = new Text();
         grid.add(actiontarget, 1, 6);
    }
    
}

package com.mycompany.mavenproject1;

import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;



/**
 * JavaFX App
 */
public class App extends Application {
    Group sp;
   
    
    @Override
    public void start(Stage stage) {
        sp = new Group();
        var scene = new Scene(sp,500,500);
        
        // Car Body
        Rectangle Body = new Rectangle(300,400,1000,200);
        Body.setFill(Color.LIGHTBLUE);
        sp.getChildren().add(Body);
        Body.setStroke(Color.BLACK);
        // Car Tyre1
        Circle Tyre1 = new Circle(435,610,80);
        Tyre1.setFill(Color.BLACK);
        sp.getChildren().add(Tyre1);
        
        
        // Car Tyre2
        Circle Tyre2 = new Circle(1200,610,80);
        Tyre2.setFill(Color.BLACK);
        sp.getChildren().add(Tyre2);
        
        
        //Roofwindows For Car
        Rectangle Roofwindows = new Rectangle(600,150,400,250);
        sp.getChildren().add(Roofwindows);
        
        
        
      
         
     
       stage.setScene(scene);
       stage.setTitle("A Car");
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Circle;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.paint.Color;


public class BeanMachine extends Application{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage){
		
		Pane pane = new BeanMachinePane();
		//Pane path = new PathLine();
		int j = 0;
		//pane.getChildren().add(path);
		for(int i = 0; i <= 9; i++){
			pane.getChildren().add(new PathLine());
		}

		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 300); 
		primaryStage.setTitle("BeanMachine"); // Set the scene title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}

class PathLine extends Pane{
	
	public PathLine(){
		
		Polyline polyline = new Polyline();
		ObservableList<Double> list = polyline.getPoints();
		
		list.add(200.0);
		list.add(40.0);
		
		list.add(200.0);
		list.add(65.0);
	
		// getChildren().add(polyline);
		
		int a = 0;
		double x = 200.0;
		double y = 65.0;
		
		for(int i = 1; i <= 7; i++){
			a = (int)(Math.random() * 2 + 1);
			if(a == 1){
				list.add(x + 10.0);
				list.add(y + 20.0);

				x = x + 10;
				y = y + 20;
			}
			else{
				list.add(x - 10.0);
				list.add(y + 20.0);

				x = x - 10;
				y = y + 20;
			}
		}
		
		list.add(x);
		list.add(y + 42.0);

		Circle ball = new Circle();
		ball.setRadius(5);
		ball.setFill(Color.RED);
		getChildren().add(ball);
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(800));
		pt.setPath(polyline);
		pt.setNode(ball);
		pt.play();


	}	
}

// BeanMachine class to create bean machine
class BeanMachinePane extends Pane{
	
	// construct the bean machine
	public BeanMachinePane(){
		Line line1 = new Line(190, 40, 190, 60);
		getChildren().add(line1);
		Line line2 = new Line(210, 40, 210, 60);
		getChildren().add(line2);
		Line line3 = new Line(190, 60, 120, 200);
		getChildren().add(line3);
		Line line4 = new Line(210, 60, 280, 200);
		getChildren().add(line4);
		Line line5 = new Line(120, 200, 120, 250);
		getChildren().add(line5);
		Line line6 = new Line(280, 200, 280, 250);
		getChildren().add(line6);
		Line line7 = new Line(120, 250, 280, 250);
		getChildren().add(line7);
		Line line8 = new Line(140, 200, 140, 250);
		getChildren().add(line8);
		Line line9 = new Line(160, 200, 160, 250);
		getChildren().add(line9);
		Line line10 = new Line(180, 200, 180, 250);
		getChildren().add(line10);
		Line line11 = new Line(200, 200, 200, 250);
		getChildren().add(line11);
		Line line12 = new Line(220, 200, 220, 250);
		getChildren().add(line12);
		Line line13 = new Line(240, 200, 240, 250);
		getChildren().add(line13);
		Line line14 = new Line(260, 200, 260, 250);
		getChildren().add(line14);
		
		Circle circle1 = new Circle();
		circle1.setCenterX(200);
		circle1.setCenterY(80);
		circle1.setRadius(4);
		getChildren().add(circle1);
		
		Circle circle2 = new Circle();
		circle2.setCenterX(190);
		circle2.setCenterY(100);
		circle2.setRadius(4);
		getChildren().add(circle2);
		
		Circle circle3 = new Circle();
		circle3.setCenterX(210);
		circle3.setCenterY(100);
		circle3.setRadius(4);
		getChildren().add(circle3);
		
		Circle circle4 = new Circle();
		circle4.setCenterX(180);
		circle4.setCenterY(120);
		circle4.setRadius(4);
		getChildren().add(circle4);
		
		Circle circle5 = new Circle();
		circle5.setCenterX(200);
		circle5.setCenterY(120);
		circle5.setRadius(4);
		getChildren().add(circle5);
		
		Circle circle6 = new Circle();
		circle6.setCenterX(220);
		circle6.setCenterY(120);
		circle6.setRadius(4);
		getChildren().add(circle6);
		
		Circle circle7 = new Circle();
		circle7.setCenterX(170);
		circle7.setCenterY(140);
		circle7.setRadius(4);
		getChildren().add(circle7);
		
		Circle circle8 = new Circle();
		circle8.setCenterX(190);
		circle8.setCenterY(140);
		circle8.setRadius(4);
		getChildren().add(circle8);
		
		Circle circle9 = new Circle();
		circle9.setCenterX(210);
		circle9.setCenterY(140);
		circle9.setRadius(4);
		getChildren().add(circle9);
		
		Circle circle10 = new Circle();
		circle10.setCenterX(230);
		circle10.setCenterY(140);
		circle10.setRadius(4);
		getChildren().add(circle10);
		
		Circle circle11 = new Circle();
		circle11.setCenterX(160);
		circle11.setCenterY(160);
		circle11.setRadius(4);
		getChildren().add(circle11);
		
		Circle circle12 = new Circle();
		circle12.setCenterX(180);
		circle12.setCenterY(160);
		circle12.setRadius(4);
		getChildren().add(circle12);
		
		Circle circle13 = new Circle();
		circle13.setCenterX(200);
		circle13.setCenterY(160);
		circle13.setRadius(4);
		getChildren().add(circle13);
		
		Circle circle14 = new Circle();
		circle14.setCenterX(220);
		circle14.setCenterY(160);
		circle14.setRadius(4);
		getChildren().add(circle14);
		
		Circle circle15 = new Circle();
		circle15.setCenterX(240);
		circle15.setCenterY(160);
		circle15.setRadius(4);
		getChildren().add(circle15);
		
		Circle circle16 = new Circle();
		circle16.setCenterX(150);
		circle16.setCenterY(180);
		circle16.setRadius(4);
		getChildren().add(circle16);
		
		Circle circle17 = new Circle();
		circle17.setCenterX(170);
		circle17.setCenterY(180);
		circle17.setRadius(4);
		getChildren().add(circle17);
		
		Circle circle18 = new Circle();
		circle18.setCenterX(190);
		circle18.setCenterY(180);
		circle18.setRadius(4);
		getChildren().add(circle18);
		
		Circle circle19 = new Circle();
		circle19.setCenterX(210);
		circle19.setCenterY(180);
		circle19.setRadius(4);
		getChildren().add(circle19);
		
		Circle circle20 = new Circle();
		circle20.setCenterX(230);
		circle20.setCenterY(180);
		circle20.setRadius(4);
		getChildren().add(circle20);
		
		Circle circle21 = new Circle();
		circle21.setCenterX(250);
		circle21.setCenterY(180);
		circle21.setRadius(4);
		getChildren().add(circle21);
		
		Circle circle22 = new Circle();
		circle22.setCenterX(140);
		circle22.setCenterY(200);
		circle22.setRadius(4);
		getChildren().add(circle22);
		
		Circle circle23 = new Circle();
		circle23.setCenterX(160);
		circle23.setCenterY(200);
		circle23.setRadius(4);
		getChildren().add(circle23);
		
		Circle circle24 = new Circle();
		circle24.setCenterX(180);
		circle24.setCenterY(200);
		circle24.setRadius(4);
		getChildren().add(circle24);
		
		Circle circle25 = new Circle();
		circle25.setCenterX(200);
		circle25.setCenterY(200);
		circle25.setRadius(4);
		getChildren().add(circle25);
		
		Circle circle26 = new Circle();
		circle26.setCenterX(220);
		circle26.setCenterY(200);
		circle26.setRadius(4);
		getChildren().add(circle26);
		
		Circle circle27 = new Circle();
		circle27.setCenterX(240);
		circle27.setCenterY(200);
		circle27.setRadius(4);
		getChildren().add(circle27);
		
		Circle circle28 = new Circle();
		circle28.setCenterX(260);
		circle28.setCenterY(200);
		circle28.setRadius(4);
		getChildren().add(circle28);
	}
}

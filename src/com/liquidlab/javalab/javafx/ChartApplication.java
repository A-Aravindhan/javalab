/*
 * Copyright 2014 JavaLab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liquidlab.javalab.javafx;

/**
 * @author tham
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChartApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Chart");
        primaryStage.setScene(getScene());
        primaryStage.show();
    }

    private Scene getScene() {
        VBox layout = getLayout();
        layout.getChildren().add(getPieChart());
//        layout.getChildren().add(getProgressBar());

        Scene scene = new Scene(layout, 700, 400);
        return scene;
    }

    private ProgressIndicator getProgressBar() {
        ProgressIndicator pi = new ProgressIndicator(0.6);
        pi.setPrefWidth(10);
        return pi;
    }

    private PieChart getPieChart() {
        ObservableList<PieChart.Data> chartData = FXCollections.observableArrayList(
                new PieChart.Data("Chrome", 40),
                new PieChart.Data("Firefox", 30),
                new PieChart.Data("IE", 20),
                new PieChart.Data("Safari", 10)
        );

        return new PieChart(chartData);
    }

    private VBox getLayout() {
        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);
        return layout;
    }
}

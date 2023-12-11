package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tabel Mahasiswa");
        TableView<Mahasiswa> table = new TableView<>();
        table.setPlaceholder(new Label("Belum ada data!"));

        TableColumn<Mahasiswa, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama"));

        TableColumn<Mahasiswa, String> nimCol = new TableColumn<>("NIM");
        nimCol.setCellValueFactory(new PropertyValueFactory<>("nim"));

        table.getColumns().addAll(nimCol, namaCol);

        table.getItems().add(new Mahasiswa(2101, "Muhammad Syauqi Al Fath", "2110817210020"));
        table.getItems().add(new Mahasiswa(2102, "Ahmaddin Najwan", "2110817210006"));
        table.getItems().add(new Mahasiswa(2103, "M. Fadhil Haikal Wardani", "2110817310015"));
        table.getItems().add(new Mahasiswa(2104, "Andri Rahmadani", "21108171100008"));
        table.getItems().add(new Mahasiswa(2105, "Maulana Khisyam", "2110817310009"));
        table.getItems().add(new Mahasiswa(2106, "Lidya Rahmi", "2110817310001"));
        table.getItems().add(new Mahasiswa(2107, "Muhammad Khafie Ramadhan", "2110817210009"));
        table.getItems().add(new Mahasiswa(2108, "M. Rizki Simanullang", "2110817310003"));
        table.getItems().add(new Mahasiswa(2109, "Farisa Adela", "2110817210010"));
        table.getItems().add(new Mahasiswa(2110, "Salsa Maulidina Puteri", "2110817210003"));


        Scene scene = new Scene(table, 300, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

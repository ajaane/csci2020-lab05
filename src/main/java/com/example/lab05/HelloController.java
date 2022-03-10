package com.example.lab05;

import javafx.fxml.FXML;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class HelloController {
    private DataSource model = new DataSource();

    @FXML
    private TableView<StudentRecord> tableView;

    @FXML
    private TableColumn<StudentRecord, String> IDColumn;

    @FXML
    private TableColumn<StudentRecord, Float> assignmentsColumn;

    @FXML
    private TableColumn<StudentRecord, Float> midtermColumn;

    @FXML
    private TableColumn<StudentRecord, Float> finalExamColumn;

    @FXML
    private TableColumn<StudentRecord, Float> finalMarkColumn;

    @FXML
    private TableColumn<StudentRecord, String> gradeColumn;

    @FXML
    private void initialize(){
        IDColumn.setCellValueFactory(new PropertyValueFactory<StudentRecord, String>("studentID"));
        assignmentsColumn.setCellValueFactory(new PropertyValueFactory<StudentRecord, Float>("assignments"));
        midtermColumn.setCellValueFactory(new PropertyValueFactory<StudentRecord, Float>("midterm"));
        finalExamColumn.setCellValueFactory(new PropertyValueFactory<StudentRecord, Float>("finalExam"));
        finalMarkColumn.setCellValueFactory(new PropertyValueFactory<StudentRecord, Float>("finalMark"));
        gradeColumn.setCellValueFactory(new PropertyValueFactory<StudentRecord, String>("grade"));

        tableView.setItems(DataSource.getAllMarks());
    }


}


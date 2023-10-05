package com.example.demofx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    private myid w1;
    private myNome w2;
    private myCPF w3;
    private myIdade w4;
    private mySexo w5;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("O viado apertou o play\nApetou pq é gueei");
    }
    private TableView<Pessoa> Tabela;
    List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Pessoa p1 = new Pessoa("Lucas",238473726 , 17);
        Pessoa p2 = new Pessoa("Toto",233846826 , 17);
        pessoas.add(p1);
        pessoas.add(p2);

    }
    private void mostrarpessoas(){
m
    }
}
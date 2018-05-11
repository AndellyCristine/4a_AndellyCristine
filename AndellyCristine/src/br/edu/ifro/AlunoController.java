/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04380230210
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private Label lblNome;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnFechar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
        
        
    private void Salvar(ActionEvent event){
    EntityManagerFactory emf  = Persistence.createEntityManagerFactory("aula");
    EntityManager em = emf.createEntityManager();
    
    Aluno aluno1 = new Aluno();
    aluno1.setNome(txtNome.getText());
    
    em.getTransaction().begin();
    
    em.persist(aluno1);
    
    em.getTransaction().commit();
    
    }
    private void fechar(ActionEvent event){
        Stage stage = (Stage) txtNome.getScene().getWindow();
        stage.close();
    }
    }    
    

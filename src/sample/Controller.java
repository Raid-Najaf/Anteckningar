package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private ObservableList<String> comments;

    @FXML
    private TextArea addComment_id;

    @FXML
    private Button btnAdd;

    @FXML
    private ListView<String> displayComment_id;



    @FXML
    void publiceraComment() {

        comments.add(addComment_id.getText());
        displayComment_id.setItems(comments);
        addComment_id.setText("");

    }

    @FXML
    private Button btnDelete;

    @FXML
    void deleteComment() {
        comments.remove(addComment_id.getText());
        addComment_id.setText("");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        comments = FXCollections.observableArrayList();
        comments.addAll();
        displayComment_id.setItems(comments);

    }
}


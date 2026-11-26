package controller;

import view.NotebookMain;
import model.Note;
import model.Notebook;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NotebookController {

    @FXML
    private ListView<Note> noteList;
    @FXML
    private TextField titleField;
    @FXML
    private TextArea contentArea;

    private Notebook notebook = new Notebook();

    @FXML
    private void selectNote() {
        Note selected = noteList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            titleField.setText(selected.getTitle());
            contentArea.setText(selected.getText());
        }
    }

    @FXML
    private void addNote() {
        String title = titleField.getText().trim();
        if (title.isEmpty()) {
            return;
        }
        notebook.addNote(new Note(title, contentArea.getText()));
        refreshList();
        titleField.clear();
        contentArea.clear();
    }

    @FXML
    private void editNote(){
        Note selected = noteList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setTitle(titleField.getText().trim());
            selected.setText(contentArea.getText());
            noteList.refresh();
        }
    }

    @FXML
    private void deleteNote() {
        Note selected = noteList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            notebook.removeNote(selected);
            refreshList();
            titleField.clear();
            contentArea.clear();
        }
    }

    private void refreshList() {
        noteList.getItems().setAll(notebook.getNotes());
    }
}

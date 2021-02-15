package com.swathi;

import com.swathi.datamodel.TodoData;
import com.swathi.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadLineLabel;

    public void initialize(){
//        TodoItem item1 =  new TodoItem("Cleaning room","routine clean work and change window curtains",
//                LocalDate.of(2021, Month.FEBRUARY,25));
//        TodoItem item2 =  new TodoItem("Buy groceries","to buy milk, eggs, veggies",
//                LocalDate.of(2021, Month.FEBRUARY,20));
//        TodoItem item3 =  new TodoItem("Dentist appoitment","visit dentists clinic",
//                LocalDate.of(2021, Month.MARCH,2));
//        TodoItem item4 =  new TodoItem("finish web App","Finish web app and deploy it",
//                LocalDate.of(2021, Month.MARCH,5));
//       todoItems = new ArrayList<TodoItem>();
//       todoItems.add(item1);
//       todoItems.add(item2);
//       todoItems.add(item3);
//       todoItems.add(item4);
//
//        TodoData.getInstance().setTodoItems(todoItems);

       todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
           @Override
           public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
               if(t1 != null){
                   TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                   itemDetailsTextArea.setText(item.getDetails());
                   DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                   deadLineLabel.setText(df.format(item.getDeadline()));
               }
           }
       });

       todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
       todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
       todoListView.getSelectionModel().selectFirst();


    }

    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();

//        System.out.println("The selected item is "+ item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(item.getDetails().toString());
        deadLineLabel.setText(item.getDeadline().toString());
    }


}

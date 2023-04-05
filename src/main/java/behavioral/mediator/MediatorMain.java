package behavioral.mediator;


import behavioral.mediator.components.impl.*;
import behavioral.mediator.mediator.Mediator;
import behavioral.mediator.mediator.impl.Editor;

import javax.swing.*;

public class MediatorMain {

    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }

}

package sample.cellFactory;

import javafx.scene.control.ListCell;
import sample.model.Area;

public class AreaListCell extends ListCell<Area> {
    @Override
    protected void updateItem(Area item, boolean empty) {
        super.updateItem(item, empty);
        if (item != null) {
            setText(item.getName());
        } else {
            setText(null);
        }
    }
}

package treevisualizer.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/** Controller của màn hình menu chính. Giai đoạn 6 sẽ bổ sung chọn loại cây, Help, Quit. */
public class MainMenuController {

    @FXML
    private Label statusLabel;

    @FXML
    private void initialize() {
        statusLabel.setText("Project đã chạy được. Sẵn sàng cho giai đoạn 3.");
    }
}

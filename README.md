# Tree Visualizer

Mini-project OOP 2026.1, chủ đề 2: Visualization of operations on tree data structures.

## Yêu cầu
- JDK 17 trở lên
- VS Code với "Extension Pack for Java"

## Chạy chương trình
- Trong VS Code: mở `src/main/java/treevisualizer/Launcher.java` rồi bấm **Run**.
- Hoặc trong terminal (nếu đã cài Maven): `mvn javafx:run`

## Chạy test
Trong VS Code: mở tab **Testing** (biểu tượng bình thí nghiệm) rồi bấm Run. Hoặc trong terminal (nếu đã cài Maven): `mvn test`

## Cấu trúc
- `treevisualizer.model.tree`: các lớp cây
- `treevisualizer.model.operation`: thao tác và cơ chế chạy từng bước
- `treevisualizer.view`, `treevisualizer.controller`: giao diện
- `src/main/resources/treevisualizer/view`: file `.fxml`

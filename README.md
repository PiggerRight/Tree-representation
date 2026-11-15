# Tree Visualizer

Mini-project OOP 2026.1, chủ đề 2: Visualization of operations on tree data structures.

## Yêu cầu
- Oracle JDK 1.8. Chỉ dùng cú pháp Java 8: không dùng `var`, `record`, `List.of`, text block.
- VS Code với "Extension Pack for Java"

## Chạy chương trình
- Trong VS Code: mở `src/main/java/treevisualizer/Main.java` rồi bấm **Run**.
- Hoặc trong terminal (nếu đã cài Maven): `mvn compile exec:java`

## Chạy test
Trong VS Code: mở tab **Testing** (biểu tượng bình thí nghiệm) rồi bấm Run. Hoặc trong terminal (nếu đã cài Maven): `mvn test`

## Cấu trúc
- `treevisualizer.model.tree`: các lớp cây
- `treevisualizer.model.operation`: thao tác và cơ chế chạy từng bước
- `treevisualizer.view`, `treevisualizer.controller`: giao diện

## Lưu ý về thư viện giao diện
- Swing có sẵn trong mọi bản Java 8.
- JavaFX chỉ có sẵn trong Oracle JDK 8 đến bản 8u441. Từ 8u451 trở đi Oracle đã gỡ JavaFX khỏi JDK 8.

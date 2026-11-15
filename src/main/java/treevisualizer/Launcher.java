package treevisualizer;

/**
 * Lớp chạy chương trình khi bấm Run trong VS Code.
 * Cần lớp riêng này vì Java báo lỗi "JavaFX runtime components are missing"
 * nếu chạy trực tiếp một lớp kế thừa Application.
 */
public class Launcher {
    public static void main(String[] args) {
        App.main(args);
    }
}

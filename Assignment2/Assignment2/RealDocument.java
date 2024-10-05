
package Assignment2;

// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        // Задача: Вывести сообщение о загрузке документа
        System.out.println("Загрузка документа с диска: " + title);
    }

    @Override
    public void display() {
        // Задача: Вывести сообщение об отображении документа
        System.out.println("Отображение документа: " + title);
    }
}

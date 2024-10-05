
package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Метод для добавления документа в группу
    public void addDocument(Document doc) {
        documents.add(doc);
        System.out.println("Документ добавлен в группу.");
    }

    // Метод для удаления документа из группы
    public void removeDocument(Document doc) {
        documents.remove(doc);
        System.out.println("Документ удален из группы.");
    }

    // Отображение всех документов в группе
    @Override
    public void display() {
        System.out.println("Отображение всех документов в группе:");
        for (Document doc : documents) {
            doc.display();
        }
    }
}

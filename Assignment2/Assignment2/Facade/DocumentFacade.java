package Assignment2.Facade;

import Assignment2.Proxy.ProxyDocument;
import Assignment2.Document;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Bridge.RenderEngine;

public class DocumentFacade {
    // Метод для отображения документа
    public void displayDocument(String title) {
        Document document = new ProxyDocument(title);
        document.display();
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        Document document = new ProxyDocument(title);
        Document watermarkedDocument = new WatermarkDecorator(document);
        watermarkedDocument.display();
    }

    // Метод для рендеринга документа через указанный движок
    public void renderDocument(String title, RenderEngine engine) {
        Document document = new ProxyDocument(title);
        engine.render(title);
    }
}

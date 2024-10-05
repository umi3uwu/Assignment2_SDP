
package Assignment2.Bridge;

// Реализация рендеринга документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String content) {
        // Вызов метода рендеринга документа через переданный движок
        engine.render(content);
    }
}

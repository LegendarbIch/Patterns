package task3bridge.renderers;

import task3bridge.graphiclib.GraphicLibrary;

public class GameRenderer extends Renderer {

    public GameRenderer(GraphicLibrary library) {
        super(library);
    }

    @Override
    public void render() {
        graphicLibrary.drawingPrimitives();
        graphicLibrary.renderingLighting();
        System.out.println("Game object was rendered");
    }
}

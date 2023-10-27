package task3bridge;

import task3bridge.graphiclib.DirectX;
import task3bridge.renderers.GameRenderer;
import task3bridge.renderers.Renderer;

public class Test3 {
    public static void main(String[] args) {
        Renderer renderer = new GameRenderer(new DirectX());
        renderer.render();
    }
}

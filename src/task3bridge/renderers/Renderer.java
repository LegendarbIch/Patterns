package task3bridge.renderers;

import task3bridge.graphiclib.GraphicLibrary;

public abstract class Renderer {
    protected GraphicLibrary graphicLibrary;
    public Renderer(GraphicLibrary library) {
        this.graphicLibrary = library;
    }
    public abstract void render();
}

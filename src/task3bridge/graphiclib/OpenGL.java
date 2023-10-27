package task3bridge.graphiclib;

public class OpenGL implements GraphicLibrary{

    @Override
    public void drawingPrimitives() {
        System.out.println("OpenGL renders primitives...");
    }

    @Override
    public void renderingLighting() {
        System.out.println("OpenGL renders lighting...");
    }
}

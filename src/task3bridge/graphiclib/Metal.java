package task3bridge.graphiclib;

public class Metal implements GraphicLibrary{
    @Override
    public void drawingPrimitives() {
        System.out.println("Metal renders primitives...");
    }

    @Override
    public void renderingLighting() {
        System.out.println("Metal renders lighting...");
    }
}

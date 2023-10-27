package task3bridge.graphiclib;

public class DirectX implements GraphicLibrary{
    @Override
    public void drawingPrimitives() {
        System.out.println("DirectX renders primitives...");
    }

    @Override
    public void renderingLighting() {
        System.out.println("DirectX renders lighting...");
    }
}

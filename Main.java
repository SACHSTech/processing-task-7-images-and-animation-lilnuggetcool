import processing.core.PApplet;

/**
 * Main class to execute sketch
 * @author 
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"Sketch"};
    Sketch mySketch = new Sketch();
    PApplet.runSketch(processingArgs, mySketch);
  }
}

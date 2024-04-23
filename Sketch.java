import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  
  PImage img;
  float imgX, imgY;
  float angle = 0;
  float radius = 100;
  PImage backgroundImg; // Declare background image variable
  
  public void settings() {
    size(400, 400);
  }
  
  public void setup() {
    size(400, 400);
    backgroundImg = loadImage("bale-1 (1).png"); // Load background image
    background(backgroundImg); // Set the background image
    img = loadImage("4723250.png"); // Load image
    img.resize(40, 40); // Resize image to fit screen
    imgX = width / 2;
    imgY = height / 2;
  }
  
  public void draw() {
    background(backgroundImg); // Redraw background image in every frame
    
    // Animate the image in a circular path
    imgX = width / 2 + cos(angle) * radius;
    imgY = height / 2 + sin(angle) * radius;
    image(img, imgX, imgY); // Display image
    
    // Ensure angle stays within 0 to TWO_PI
    if (angle > TWO_PI) {
      angle = 0;
    } 
    angle += 0.05; // Increment angle for smooth motion
  }
  
  public static void main(String[] args) {
    PApplet.main("Sketch");
  }
}

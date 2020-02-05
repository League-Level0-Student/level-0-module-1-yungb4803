
void setup() {
  PImage face = loadImage("zombie face.jpg");
  image(face, 0, 0);
  size(800,500);
face.resize(800,800);
}
void draw() {
ellipse(285,270,100,100);
ellipse(505,250,150,150);
fill(mouseX, mouseY, mouseY*180);



}

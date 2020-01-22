
void setup() {
size(500,500);    
background(0,255,255);
fill(#796E51);
ellipse(250,250,300,300);
fill(#FA0328);
ellipse(250,250,250,250);
fill(#FAF203);
ellipse(250,250,200,200);


}
void draw() {
 
  PImage pepperoni = loadImage("pepperoni-transparent-3.png");
pepperoni.resize(50,50);
image(pepperoni, 225,250);
if(mousePressed){
  image(pepperoni, 225,250);
}    
}

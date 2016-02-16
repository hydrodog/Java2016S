PShape earth, moon;
void setup() {
  size(700,700, OPENGL);
  PImage img = loadImage("candidates.jpg");
//  noStroke();
  earth = createShape(SPHERE, 200);
  moon = createShape(SPHERE, 50);
}

float ang = 0;
float moonOrbit = 0;
void  draw() {
  background(0);
  translate(width/2,height/2,-400);
  
  pushMatrix();
  rotateZ(23.5 * PI/180);
  rotateY(ang);
  shape(earth);
  popMatrix();
  

  pushMatrix();
  rotateY(moonOrbit);
  translate(500,0);
  shape(moon);
  popMatrix();
  ang += .01;
  moonOrbit -= .005;
}
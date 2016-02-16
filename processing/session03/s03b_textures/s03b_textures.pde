
PShape ball;
void setup() {
  size(600,600, OPENGL);
  PImage img = loadImage("candidates.jpg");
  noStroke();
  ball = createShape(SPHERE, 400);
  ball.setTexture(img);
}

float ang = 0;
void  draw() {
// each time drawing begins, we start with the identity matrix (no transformations)
  translate(width/2,height/2,-400);
  rotateY(ang);
  shape(ball);
  ang += .01;
}
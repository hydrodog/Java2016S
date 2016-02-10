/*
 * Rotating Globe in OpenGL: sphere with map texture
 * @author Dov Kruger
 * @created 2014-02-01
 * (c)2014 Ad Astra Education
 * Permission granted to use for non-commercial educational purposes
 * provided this comment is left intact
 */

PShape ball;
void setup() {
  size(1400, 1400, OPENGL);
  noStroke();
  PImage img = loadImage("earth.jpg");
  sphereDetail(50); 
  ball = createShape(SPHERE, 1240);
  ball.setTexture(img);
  // the larger this number, the better the approximation to a sphere
}
float angle = 0;
void draw() {
  background(0);   // draw the black of space
  //lights();        // enable lighting
  translate(width/4, height/2);
  ambientLight(70,70,70);
  pointLight(255,255,150, -500,0,-60);
  translate(width/4, 0,-1200); // move to the center
  rotateY(angle); // rotate the earth
  shape(ball);    // draw the earth
  angle += 0.01;  // compute the next angle
}
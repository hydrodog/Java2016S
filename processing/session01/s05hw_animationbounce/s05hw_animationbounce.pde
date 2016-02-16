/**
 * @author: Dov Kruger
 * Make the rectangle bounce off all 4 walls
 * Also, make sure the rectangle does not disappear on the right beore it bounces!
 */


void setup() {
  size(800, 600);
}

float x = 0, y = 0;
float vx = +1.5;
void draw() {
  background(0);
  fill(255, 0, 0);
  stroke(0, 255, 0);
  strokeWeight(5);
  rect(x,y, 100, 100);
  x = x + vx;
  if (x >= 800) {
    vx = -vx;
  }
  if (x < 0) {
    vx = -vx;
  }
  
}
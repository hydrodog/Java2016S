void setup() {
  size(800, 600);
}

int x = 0, y = 0;
void draw() {
  background(0);
  fill(255, 0, 0);
  stroke(0, 255, 0);
  strokeWeight(5);
  rect(x,y, 100, 100);
  x = x + 2;
  if (x >= 800) {
    x = 0;
  }
  
}
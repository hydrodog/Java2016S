void setup() {
  size(1000,1000);
}

void draw() {
  translate(0, height/2);
  strokeWeight(0.05);
  final float XMAX = 6*PI;
  final float dx = XMAX/width;
  scale(width/XMAX,-height/2);
  for (float x = 0; x < XMAX; x += dx) {
    float y = sin(x);
    point(x,y);
  }
}
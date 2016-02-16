void setup() {
  size(800,600);
}

void draw() {
  for (int x = 0; x < width; x = x + 75) { // x += 75
     line(x, 0, x, height);     
  }
}
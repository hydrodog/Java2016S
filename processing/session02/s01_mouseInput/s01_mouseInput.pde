void setup() {
  size(600,600);
}

int step = 80;
void draw() {
  background(255);
  for (int x = 0; x < width; x += step)
    line(x,0, x, height); 
}

void mousePressed() {
  if (mouseButton == LEFT)
      step /= 2;
  else
      step *= 2;
}
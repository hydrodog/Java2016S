void setup() {
  size(600,600);
}

float x = 0, y = 0;
float vx = .5, vy = 2.2;
final int boxSize = 100;
void draw() {
  fill(0,0,0, 10);
  rect(0,0, width, height); // partially wipe out last scene with transparent black, leave trail
  fill(255,0,0);
  rect(x,y, boxSize, boxSize);
  x = x + vx; // x += vx;
  y += vy;
  if (y > height - boxSize)
    vy = -vy;
}
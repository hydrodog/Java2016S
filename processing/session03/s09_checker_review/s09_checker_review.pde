void setup() {
  size(600,600);
  BOX = width/N;
}

final int N = 8;
int BOX;
void draw() {
  background(0);
  for (int i = 0; i < N; i++)
    rect(i * BOX, 0, BOX, BOX);
}
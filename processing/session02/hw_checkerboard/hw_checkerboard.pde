void setup() {
  size(600,600);
}

final int N = 8;
void draw() {
  background(255);
  final int BOX = width/N;
  color RED = color(255,0,0), BLACK = color(0,0,0);
  boolean b = false;
  for (int x = 0, count = 0; x < width; x += BOX, count++) {
    /*
    if (x % (2*BOX) == 0)
      fill(255,0,0);
    else
      fill(0);
      */
      /*
    if (count % 2 == 0)
      fill(RED);
    else
      fill(BLACK);*/
    b = !b;
    fill(b ? RED : BLACK);
    rect(x, 0, BOX, BOX);
  }
  
  
  
  
 
}

void mousePressed() {


}
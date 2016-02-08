void setup() {
  size(600,600);
  frameRate(1);
} //<>//

void sierpinski(int x1, int y1, int x2, int y2, int x3, int y3, int level) {
  if ( ) {
    
     return; 
  }
  sierpinski();
  sierpinski();
  sierpinski();
}

int level = 0;
void draw() { 
  // triangle(0,0,  width,0, width/2,height);
  sierpinski(0,0,  width,0, width/2,height, level);
  level ++;
  if (level > 8)
    level = 0;
}
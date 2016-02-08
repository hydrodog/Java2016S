void setup() {
  size(600,600);
} //<>//


void draw() {
  translate(width/2, height/2);
  //scale(50, -50);
  scale(width/2/(2*PI), -height/2);
  strokeWeight(0);
  float dx = 2*PI/width;
  for (float x = 0; x < 2*PI; x += dx) {
    float y = sin(x);
    
    point(x,y);
    
  }
  
}
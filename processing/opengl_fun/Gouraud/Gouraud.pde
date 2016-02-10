void setup() {
  size(2000,2000, OPENGL);
}

float x = 0, y = 0;

void draw() {
  background(0);
  translate(width/2, height/2);
  translate(x, y);
  x++;
  noStroke();
  beginShape();
    fill(#FF0000);
    vertex(-200,0);
    fill(#800080);
    vertex(200,0);
    fill(#FFC000);
    vertex(-200,200);
  endShape();
}



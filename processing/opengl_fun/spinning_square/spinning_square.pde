void setup() {
  size(1000,1000);
  frameRate(1);
}

float ang = 0;
void draw() {
  //background(0);
  translate(width/2, height/2);
  rotate(ang);
  rect(0,0, 100,100);
  fill(255,0,0);
  
  
  ang += .1;//2*PI / 128;
}
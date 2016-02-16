void setup() {
  size(600,600, OPENGL);   
}

void  draw() {
  background(0);
  translate(width/2, height/2, 0);
  
  beginShape();
  fill(#ff0000); // color = 255*256*256 + 0 * 256 + 0*1
  vertex(0,0);
  fill(0,255,0);
  vertex(200,0);
  fill(0,0,255);  
  vertex(0,300);
  endShape();
}
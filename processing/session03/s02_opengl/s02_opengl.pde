void setup() {
  size(600,600, OPENGL); 
  
}

float z = -500;
void  draw() {
  background(0);
  translate(width/2, height/2, z);
  sphere(500);
}

void mousePressed() {
   if (mouseButton == LEFT) {
     z -= 100;
   } else {
     z += 100;
   }
  
}
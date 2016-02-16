PImage img;  // variable img is visible everywhere in this program

void setup() {
  size(600,600);
  img = loadImage("candidates.jpg");  
}

void  draw() {
  image(img, 0,0, width,height);
  int[] p = img.pixels;
  for (int i = 0; i < p.length; i++)
    p[i]--;
  img.updatePixels();
}
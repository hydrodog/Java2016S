PImage img;
void setup() {
  size(600,600);
  img = new PImage(600,600);
  int[] p = img.pixels;
  for (int i = 0; i < p.length;i++)
    p[i] = i;
  img.updatePixels();
}

void draw() {
  image(img, 0,0);
}
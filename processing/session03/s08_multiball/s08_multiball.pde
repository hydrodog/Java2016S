void setup() {
  size(600,600);
  for (int i = 0; i < N; i++) {
     x[i] = random(width-BALL_SIZE); 
     y[i] = random(height-BALL_SIZE); 
     vx[i]  = random(5);
     vy[i] = random(5);
  }
  fill(255,0,0);  
}
final int N = 10;
float[] x = new float[N];
float[] y = new float[N];
float[] vx = new float[N], vy = new float[N];

//float a[] = new float[5];
// putting square brackets AFTER the name is not good (like C)
//float b[] = new float[5], c = new float[19];  // c is a float

final int BALL_SIZE = 50;
void draw() {
  background(0);
  for (int i = 0; i < x.length; i++) {
     rect(x[i],y[i],BALL_SIZE, BALL_SIZE);
     if (x[i] < 0 || x[i] >= width-BALL_SIZE)
       vx[i] = -vx[i];
     if (y[i] < 0 || y[i] >= height-BALL_SIZE)
       vy[i] = -vy[i];
     x[i] += vx[i];  y[i] += vy[i];
  }
}
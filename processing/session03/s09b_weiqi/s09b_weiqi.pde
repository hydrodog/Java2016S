void setup() {
  size(600,600);
  BOX = width/N;
}

final int N = 19;
int BOX;
int currentColor = 1;

int[] board = new int[N*N];
// EMPTY = 0
// BLACK = 1
// WHITE = 2
void draw() {
  background(255,200,0);
  for (int i = 0; i < N; i++) {
    line(BOX/2, i*BOX+BOX/2, width-BOX/2, i*BOX+BOX/2);
    line(i*BOX+BOX/2, BOX/2, i*BOX+BOX/2, height-BOX/2);
  }
  for (int i = 0; i < board.length; i++) {
/*    if (board[i] == 0) {
      
    } else if (board[i] == 1) {
      
      
    } else {
      
      
    }
    */
    int x = i % N;
    int y = i / N;
    
    switch (board[i]) {
      case 0:
          break;
      case 1:
          fill(0);
          ellipse(x * BOX+ BOX/2, y * BOX + BOX/2, BOX, BOX);
          break;
      case 2:
          fill(255);
          ellipse(x * BOX+ BOX/2, y * BOX + BOX/2, BOX, BOX);
          break;
    }
    
  }
}

void mousePressed() {
  int x = mouseX / BOX, y = mouseY / BOX;
  board[y * N  + x] = currentColor;
/*  if (currentColor == 1)
    currentColor = 2;
  else
    currentColor = 1;
    */
    
  currentColor = 3 - currentColor; 
}
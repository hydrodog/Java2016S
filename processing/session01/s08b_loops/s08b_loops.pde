void setup() {
  int i = 0;
  while (i < 10) {
    print(i, " ");
    i = i + 1;
  }
  // four ways to write + 1
  //  i = i + 1;   i += 1;   i++;   ++i;
  for (int j = 0; j < 10; j++)
    print(j);
    
  exit();
}
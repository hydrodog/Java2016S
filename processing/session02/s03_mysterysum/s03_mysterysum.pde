void setup() {
  // print out sqrt(6*sum)
  
  for (int n = 100; n <= 1000000; n *= 10) {
    float sum = 0;
    int check = 10;
    for (long i = 1; i <= n; i++) {
      if (i == check) {
        println(i*i);
        check *= 10;
      }
      sum += 1.0/ (i*i); //<>//
    }

    float sum2 = 0;
    for (long i = n; i >= 1; i--)
      sum2 += 1.0/ (i*i);
    println(n, sum, sum2);
  }

  exit();
}
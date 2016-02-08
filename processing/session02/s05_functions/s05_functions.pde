void setup() {
  size(600,600);
  println(f(3));
  
  for (int i = 1; i <= 100; i++)
    println(i, fact(i));  
  println(f3(5));
  exit();
} //<>// //<>//
// n! = n * (n-1) * (n-2) * .... 1
double fact(int n) {
  double prod = 1;
  for (int i = 1; i <= n; i++)
    prod *= i;
  return prod;
}

// recursive function: a function that calls itself
// every recursive function must have an exit condition

double fact2(int n) {
  if (n <= 1)
    return 1;
  return n*fact2(n-1);
}


double f3(int n) {
  if (n <= 3)
    return 2;
  return (n-1) + f3(n-2);
}

// fibo = 1 1 2 3 5 8 13 21 ....
int fibo(int n) {
  if (n <= 2)
    return 1;
  return fibo(n-1) + fibo(n-2);
}



double f(double x) {
  return x*x;
}

// p5(x) = x^5 + 2x^4 - 4x^3 + x^2 - 3x + 1 
// Horner's form
double p5(double x) {
    return ((((x + 2) * x - 4) * x + 1) * x - 3) * x + 1;
}
 


void draw() { 
}
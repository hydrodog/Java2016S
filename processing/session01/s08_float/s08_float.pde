void setup() {
  int a = 3;
  float b = 1.5f;
  float c = 2;
  float f = 1.234567f;
  double d = 1.23456789012345; // Wow, processing is destroying my number! UGLY
  float e = 1 / 2;
  float g = 1.0f / 2.0f;
  float h = 1.0f / 2;

  // DO NOT USE float for any computation (use double, more accurate)
  float temp = 70.0023;
  println(d);
  System.out.println(d);
    
  exit();
}
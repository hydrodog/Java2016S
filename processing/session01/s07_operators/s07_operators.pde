void setup() {
  println("hello"); 
  println(2 + 3);            // int is 32 bits   000000000000000000000000000000000 = 2^32 = 4.2 x 10^9
  println(7 * 24);
  println(150 * 365 * 24 * 60 * 60);
  println(24*60*60);
  println(24*60*60*365);

  int seconds = 75*365*24*60*60; // overflow
  long bigSeconds = 75*365*24*60*60;
  println(bigSeconds);  
  long bigSeconds2 = 75L*365L*24L*60L*60L;
  println(bigSeconds2);  
  long bigSeconds3 = 75L*365*24*60*60; //type promotion 365 --> 365L
  println(bigSeconds3);  
  exit();
}
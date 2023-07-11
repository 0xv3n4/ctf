
// *** You should reformat the parameter of scramble from string to the char array ! ***
public static char[] scramble(char[] password) {
char [] a = password;

  for (int b=0;b<a.length;b++) {
    char c = a[b]
    c = switchBits(c,6,7);
    c = switchBits(c,2,5);
    c = switchBits(c,3,4);
    c = switchBits(c,0,1);
    c = switchBits(c,5,6);
    c = switchBits(c,4,7);
    c = switchBits(c,0,3);
    c = switchBits(c,6,7);
    c = switchBits(c,1,2);
    a[b] = c; }
  return a ;
  }
 // REFORMATTING THE METHOD LIKE ABOVE WILL GAVE YOU THE PASSWORD 
}

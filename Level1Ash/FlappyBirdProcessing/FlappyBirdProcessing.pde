float birdY = 0;
float y = 0;
int a = 400;
int b = 100;
int c = 400;
int d = 0;
int birdX = 100;
void setup() {
  size(400,400);
}
void draw() {
  background(#0CE2F7);
  fill(#D4ED39);
  ellipse(birdX,birdY,50,50);
  y = y+0.5;
  birdY = birdY + y;
  fill(#0CF739);
  rect(a,0,75,b);
  rect(c,d,75,400);
  d = b + 175;
  a = a - 5;
  c = c - 5;
  int random = (int) random(0, 225);
  if(a == -75){
    a = 400;
    c = 400;
    b = random;
  }
  if(birdY > 395) {
    y = y+10;
    d = b + 175;
    a = a+5;
    c = c+5;
  }
  if(birdY < 5){
    y = y-0.5;
    d = b + 175;
    a = a+5;
    c = c+5;
  }
if(birdY > 0){
  if(birdY < b+25){
    if(a>0){
      if(a<125){
       d = b + 175;
       a = a+5;
       c = c+5;
       y = y+10;
      }
    }
  }
}
if(birdY > d-25){
  if(birdY < 400){
    if(c>0){
      if(c<125){
       d = b + 175;
       a = a+5;
       c = c+5;
       y = y+10;
      }
    }
  }
}
}

void mousePressed() {
  y = -10;
}
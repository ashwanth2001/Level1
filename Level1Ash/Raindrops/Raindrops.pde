import static javax.swing.JOptionPane.*;
int randomNumber = (int) random(800);
int dropX = randomNumber;
float dropY = 0;
int a = 0;
float c = 5;
void setup(){
 size(800,800); 
 showMessageDialog(null,"Catch the raindrops in your bucket. Try to get to 20 points!");
}
void draw(){
  int bX = mouseX-37;
  int randomNumber = (int) random(800);
  background(#7FA5A1);
  fill(#2DEDDB);
  ellipse(dropX,dropY,20,32);
  stroke(#000302);
  dropY = dropY+c;
  if(dropY>815){
    dropY=0;
    dropX = randomNumber;
    if (a>0){
    a = a-1;
    c = c + .5;
    }
  }
  fill(#525555);
  rect(bX,675,75,100);
if(dropY > 675 && dropY < 700){
 if (dropX > bX && dropX < bX+80){
   dropY=0;
   dropX = randomNumber;
   a = a+1; 
   c = c + .5;
 }
}
fill(0, 0, 0);
textSize(16);
text("Score: " + a, 20, 20);
if (a == 20){
textSize(60);
text("YOU WON!", 275, 400);
dropY = -25;
dropX=-25;
}
}
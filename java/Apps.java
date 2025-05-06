import java.awt.*;
class Apps
{
public static void main(String args[])
{
Frame f=new Frame();
f.setTitle("Notepad");
f.setSize(200,500);
f.setVisible(true);
Label l1=new Label("Reg No");
f.add(l1);
Button b1=new Button("Submit");
f.add(b1);
}
}
package _gui.Controller;
import _gui.View.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    double sw = screenSize.getWidth();
    double sh = screenSize.getHeight();
    public static final int FRAME_WIDTH= 700;
    public static final int FRAME_Height= 500;
    public int FRAME_X= (int)((0.5)*(sw-FRAME_WIDTH));
    public int FRAME_Y= (int)((0.5)*(sh-FRAME_Height));

    OrderInfoView orderInfoView = new OrderInfoView();
    public MainFrame(){
        super("정보검색 프로그램");
        setLocation(FRAME_X,FRAME_Y);
        setSize(FRAME_WIDTH,FRAME_Height);
        setVisible(true);
        add(orderInfoView);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

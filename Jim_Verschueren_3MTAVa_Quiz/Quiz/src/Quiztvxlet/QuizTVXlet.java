package Quiztvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;


import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;
public class QuizTVXlet implements Xlet, HActionListener {
    private Color Color;
    HScene scene;
  
    public QuizTVXlet() {
        
    }
    
    public void initXlet(XletContext context) {
     scene=HSceneFactory.getInstance().getDefaultHScene();
     
     HStaticText Question=new HStaticText("Million dollar question!" +
             "Wat is Jims lievelingsvak?",150,125,425,200);
     Question.setBackground(Color.LIGHT_GRAY);
     Question.setBackgroundMode(HVisible.BACKGROUND_FILL);
     scene.add(Question);
     
     
     HTextButton knop1=new HTextButton("Analoge Technologie",150,300,200,100);
     knop1.setBackground(Color.RED);
     knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
     scene.add(knop1);
     
     HTextButton knop2=new HTextButton("Digital Broadcast",370,300,200,100);
     knop2.setBackground(Color.RED);
     knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
     scene.add(knop2);
     
     HTextButton knop3=new HTextButton("Wiskunde",150,410,200,100);
     knop3.setBackground(Color.RED);
     knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
     scene.add(knop3);
     
     HTextButton knop4=new HTextButton("Frans",370,410,200,100);
     knop4.setBackground(Color.RED);
     knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
     scene.add(knop4);
     
     knop1.setFocusTraversal(null, knop3, null, knop2);
     knop2.setFocusTraversal(null, knop4, knop1, null);
     knop3.setFocusTraversal(knop1, null, null, knop4);
     knop4.setFocusTraversal(knop2, null, knop3, null);
    
     knop1.setActionCommand("knop1");
     knop1.addHActionListener(this);
     knop2.setActionCommand("knop2");
     knop2.addHActionListener(this);
     knop3.setActionCommand("knop3");
     knop3.addHActionListener(this);
     knop4.setActionCommand("knop4");
     knop4.addHActionListener(this);
     
     
     scene.validate();
     scene.setVisible(true);
     knop1.requestFocus();
    }
 
    public void startXlet() {
        System.out.println("StartXlet");
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
        if (arg0.getActionCommand().equals("knop1"))
        {
            HStaticText hst=new HStaticText("Fout, teveel kans op electrocutie :(",20,10,680,100);
            hst.setBackground(Color.RED);
            hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(hst);
            scene.repaint();
        }
        if(arg0.getActionCommand().equals("knop2")){
            HStaticText hst=new HStaticText("Ding, Ding, Ding, CORRECT! De Windows XP crashes maakte alles leuker...",20,10,680,100);
            hst.setBackground(Color.GREEN);
            hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(hst);
            scene.repaint();
        }
        if(arg0.getActionCommand().equals("knop3")){
            HStaticText hst=new HStaticText("Fout, veel te gemakkelijk :p",20,10,680,100);
            hst.setBackground(Color.RED);
            hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(hst);
            scene.repaint();
        }
            if(arg0.getActionCommand().equals("knop4")){
            HStaticText hst=new HStaticText("Fout, je ne compris pas he...",20,10,680,100);
            hst.setBackground(Color.RED);
            hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(hst);
            scene.repaint();
            }
        
    }
}

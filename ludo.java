import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	int x=67,y=350,x2=67,y2=350,x3=67,y3=350,x4=67,y4=350;
	String p1,p2,p3,p4;
	Label la1=new Label();
	Label la2=new Label();
	Label la3=new Label();
	Label la4=new Label();
	int count1,count2,count3,count4;
	double d=0;
	String s="Hello Friend";
	Label l1=new Label();
	Label l2=new Label();
	Label l3=new Label();
	Label l4=new Label();
	Button b1=new Button("ok");
	Button b2=new Button("ReSet");
	Checkbox cb1=new Checkbox("",false);
	Checkbox cb2=new Checkbox("",false);
	Checkbox cb3=new Checkbox("",false);
	Checkbox cb4=new Checkbox("",false);
	TextField t1=new TextField("Player 1");
	TextField t2=new TextField("Player 2");
	TextField t3=new TextField("Player 3");
	TextField t4=new TextField("Player 4");
	Button ba1,ba2,ba3,ba4;
	Frame1()
	{
		setLayout(null);
		setSize(700,500);
		setLocation(200,100);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		l2.setBounds(400,50,100,20);add(l2);
		l2.setText("Choose Players");
		cb1.setBounds(400,70,10,20);add(cb1);
		t1.setBounds(420,70,120,20);add(t1);
		cb2.setBounds(400,100,10,20);add(cb2);
		t2.setBounds(420,100,120,20);add(t2);
		cb3.setBounds(400,130,10,20);add(cb3);
		t3.setBounds(420,130,120,20);add(t3);
		cb4.setBounds(400,160,10,20);add(cb4);
		t4.setBounds(420,160,120,20);add(t4);
		l1.setBounds(450,250,250,20);add(l1);
		l1.setText(s);
		b1.setBounds(400,190,70,30);add(b1);
		b2.setBounds(500,190,70,30);add(b2);
		l3.setBounds(50,390,200,20);add(l3);
		l3.setText("Snacks&Ladder:The Game");
		l4.setBounds(420,300,150,30);add(l4);

		l4.setFont(new Font("Arial",0,24));
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){click_ok(e);}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b2_Click(e);}});
		ba1=new Button(p1);
		ba1.setBounds(420,330,70,40);add(ba1);
		ba1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){play1(e);}});
		ba2=new Button(p2);
		ba2.setBounds(420,400,70,40);add(ba2);
		ba2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){play2(e);}});
		ba3=new Button(p3);
		ba3.setBounds(500,330,70,40);add(ba3);
		ba3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){play3(e);}});
		ba4=new Button(p4);
		ba4.setBounds(500,400,70,40);add(ba4);
		ba4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){play4(e);}});
		ba1.setVisible(false);
		ba2.setVisible(false);
		ba3.setVisible(false);
		ba4.setVisible(false);
		setResizable(false);
	}
	void b2_Click(ActionEvent e)
	{
		Frame1 f=new Frame1();
		f.setVisible(true);
		dispose();
	}
	void click_ok(ActionEvent e)
	{
		boolean bo1=cb1.getState();
		boolean bo2=cb2.getState();
		boolean bo3=cb3.getState();
		boolean bo4=cb4.getState();

		if(bo1)
			{
			ba1.setVisible(true);
			p1=t1.getText();
			ba1.setLabel(p1);
			}
		if(bo2)
			{
			ba2.setVisible(true);
			p2=t2.getText();
			ba2.setLabel(p2);
			}
		if(bo3)
			{
			ba3.setVisible(true);
			p3=t3.getText();
			ba3.setLabel(p3);
			}
		if(bo4)
			{
			ba4.setVisible(true);
			p4=t4.getText();
			ba4.setLabel(p4);
			}
			la1.setText(p1);
			la1.setBounds(60,420,120,15);add(la1);
			la2.setText(p2);
			la2.setBounds(60,435,120,15);add(la2);
			la3.setText(p3);
			la3.setBounds(60,450,120,15);add(la3);
			la4.setText(p4);
			la4.setBounds(60,465,120,15);add(la4);


	}
	void play1(ActionEvent e)
	{
			d=Math.random();
			d=(int)((d*10)-4);
			if(d<0)
			{
			d=-1*d;
			System.out.print((int)d);
			}
			else if(d>0)
			{
			d=d+1;
			System.out.print((int)d);
			}
			else if(d==0)
			{
			d=d+1;
			System.out.print((int)d);
			}
			l4.setText((int)d+"");
			count1=count1+(int)d;
			if(count1>100){count1=count1-(int)d;}
			if(count1==100)
			{
				l4.setText(p1+" Wins");
				la1.setText(p1+" Wins");
			}
			if(count1==5){count1=25;l1.setText("You have got improve via ladder at "+5);}
			if(count1==10){count1=29;l1.setText("You have got improve via ladder at "+10);}
			if(count1==22){count1=41;l1.setText("You have got improve via ladder at "+22);}
			if(count1==28){count1=55;l1.setText("You have got improve via ladder at "+28);}
			if(count1==44){count1=95;l1.setText("You have got improve via ladder at "+44);}
			if(count1==70){count1=89;l1.setText("You have got improve via ladder at "+70);}
			if(count1==79){count1=81;l1.setText("You have got improve via ladder at "+79);}
			if(count1==31){count1=14;l1.setText("You have bitten at "+31);}
			if(count1==37){count1=17;l1.setText("You have bitten at "+37);}
			if(count1==73){count1=53;l1.setText("You have bitten at "+73);}
			if(count1==78){count1=39;l1.setText("You have bitten at "+78);}
			if(count1==92){count1=35;l1.setText("You have bitten at "+92);}
			if(count1==99){count1=7;l1.setText("You have bitten at "+99);}
				switch(count1)
							{
							case 1:x=67;y=340;break;
							case 2:x=97;y=340;break;
							case 3:x=127;y=340;break;
							case 4:x=157;y=340;break;
							case 5:x=187;y=340;break;
							case 6:x=217;y=340;break;
							case 7:x=247;y=340;break;
							case 8:x=277;y=340;break;
							case 9:x=307;y=340;break;
							case 10:x=337;y=340;break;
							case 11:x=337;y=310;break;
							case 12:x=307;y=310;break;
							case 13:x=277;y=310;break;
							case 14:x=247;y=310;break;
							case 15:x=217;y=310;break;
							case 16:x=187;y=310;break;
							case 17:x=157;y=310;break;
							case 18:x=127;y=310;break;
							case 19:x=97;y=310;break;
							case 20:x=67;y=310;break;
							case 21:x=67;y=280;break;
							case 22:x=97;y=280;break;
							case 23:x=127;y=280;break;
							case 24:x=157;y=280;break;
							case 25:x=187;y=280;break;
							case 26:x=217;y=280;break;
							case 27:x=247;y=280;break;
							case 28:x=277;y=280;break;
							case 29:x=307;y=280;break;
							case 30:x=337;y=280;break;
							case 31:x=337;y=250;break;
							case 32:x=307;y=250;break;
							case 33:x=277;y=250;break;
							case 34:x=247;y=250;break;
							case 35:x=217;y=250;break;
							case 36:x=187;y=250;break;
							case 37:x=157;y=250;break;
							case 38:x=127;y=250;break;
							case 39:x=97;y=250;break;
							case 40:x=67;y=250;break;
							case 41:x=67;y=220;break;
							case 42:x=97;y=220;break;
							case 43:x=127;y=220;break;
							case 44:x=157;y=220;break;
							case 45:x=187;y=220;break;
							case 46:x=217;y=220;break;
							case 47:x=247;y=220;break;
							case 48:x=277;y=220;break;
							case 49:x=307;y=220;break;
							case 50:x=337;y=220;break;
							case 51:x=337;y=190;break;
							case 52:x=307;y=190;break;
							case 53:x=277;y=190;break;
							case 54:x=247;y=190;break;
							case 55:x=217;y=190;break;
							case 56:x=187;y=190;break;
							case 57:x=157;y=190;break;
							case 58:x=127;y=190;break;
							case 59:x=97;y=190;break;
							case 60:x=67;y=190;break;
							case 61:x=67;y=160;break;
							case 62:x=97;y=160;break;
							case 63:x=127;y=160;break;
							case 64:x=157;y=160;break;
							case 65:x=187;y=160;break;
							case 66:x=217;y=160;break;
							case 67:x=247;y=160;break;
							case 68:x=277;y=160;break;
							case 69:x=307;y=160;break;
							case 70:x=337;y=160;break;
							case 71:x=337;y=130;break;
							case 72:x=307;y=130;break;
							case 73:x=277;y=130;break;
							case 74:x=247;y=130;break;
							case 75:x=217;y=130;break;
							case 76:x=187;y=130;break;
							case 77:x=157;y=130;break;
							case 78:x=127;y=130;break;
							case 79:x=97;y=130;break;
							case 80:x=67;y=130;break;
							case 81:x=67;y=100;break;
							case 82:x=97;y=100;break;
							case 83:x=127;y=100;break;
							case 84:x=157;y=100;break;
							case 85:x=187;y=100;break;
							case 86:x=217;y=100;break;
							case 87:x=247;y=100;break;
							case 88:x=277;y=100;break;
							case 89:x=307;y=100;break;
							case 90:x=337;y=100;break;
							case 91:x=337;y=70;break;
							case 92:x=307;y=70;break;
							case 93:x=277;y=70;break;
							case 94:x=247;y=70;break;
							case 95:x=217;y=70;break;
							case 96:x=187;y=70;break;
							case 97:x=157;y=70;break;
							case 98:x=127;y=70;break;
							case 99:x=97;y=70;break;
						    case 100:x=67;y=70;break;

				}
				repaint();
		}
	void play2(ActionEvent e)
		{
				d=Math.random();
				d=(int)((d*10)-4);
				if(d<0)
				{
				d=-1*d;
				System.out.print((int)d);
				}
				else if(d>0)
				{
				d=d+1;
				System.out.print((int)d);
				}
				else if(d==0)
				{
				d=d+1;
				System.out.print((int)d);
				}
				l4.setText((int)d+"");
				count2=count2+(int)d;
							if(count2>100){count2=count2-(int)d;}
							if(count2==100)
							{
								l4.setText(p2+" Wins");
								la2.setText(p2+" Wins");
							}
								if(count2==5){count2=25;l1.setText("You have got improve via ladder at "+5);}
								if(count2==10){count2=29;l1.setText("You have got improve via ladder at "+10);}
								if(count2==22){count2=41;l1.setText("You have got improve via ladder at "+22);}
								if(count2==28){count2=55;l1.setText("You have got improve via ladder at "+28);}
								if(count2==44){count2=95;l1.setText("You have got improve via ladder at "+44);}
								if(count2==70){count2=89;l1.setText("You have got improve via ladder at "+70);}
								if(count2==79){count2=81;l1.setText("You have got improve via ladder at "+79);}
								if(count2==31){count2=14;l1.setText("You have bitten at "+31);}
								if(count2==37){count2=17;l1.setText("You have bitten at "+37);}
								if(count2==73){count2=53;l1.setText("You have bitten at "+73);}
								if(count2==78){count2=39;l1.setText("You have bitten at "+78);}
								if(count2==92){count2=35;l1.setText("You have bitten at "+92);}
								if(count2==99){count2=7;l1.setText("You have bitten at "+99);}
								switch(count2)
											{
											case 1:x2=67;y2=340;break;
											case 2:x2=97;y2=340;break;
											case 3:x2=127;y2=340;break;
											case 4:x2=157;y2=340;break;
											case 5:x2=187;y2=340;break;
											case 6:x2=217;y2=340;break;
											case 7:x2=247;y2=340;break;
											case 8:x2=277;y2=340;break;
											case 9:x2=307;y2=340;break;
											case 10:x2=337;y2=340;break;
											case 11:x2=337;y2=310;break;
											case 12:x2=307;y2=310;break;
											case 13:x2=277;y2=310;break;
											case 14:x2=247;y2=310;break;
											case 15:x2=217;y2=310;break;
											case 16:x2=187;y2=310;break;
											case 17:x2=157;y2=310;break;
											case 18:x2=127;y2=310;break;
											case 19:x2=97;y2=310;break;
											case 20:x2=67;y2=310;break;
											case 21:x2=67;y2=280;break;
											case 22:x2=97;y2=280;break;
											case 23:x2=127;y2=280;break;
											case 24:x2=157;y2=280;break;
											case 25:x2=187;y2=280;break;
											case 26:x2=217;y2=280;break;
											case 27:x2=247;y2=280;break;
											case 28:x2=277;y2=280;break;
											case 29:x2=307;y2=280;break;
											case 30:x2=337;y2=280;break;
											case 31:x2=337;y2=250;break;
											case 32:x2=307;y2=250;break;
											case 33:x2=277;y2=250;break;
											case 34:x2=247;y2=250;break;
											case 35:x2=217;y2=250;break;
											case 36:x2=187;y2=250;break;
											case 37:x2=157;y2=250;break;
											case 38:x2=127;y2=250;break;
											case 39:x2=97;y2=250;break;
											case 40:x2=67;y2=250;break;
											case 41:x2=67;y2=220;break;
											case 42:x2=97;y2=220;break;
											case 43:x2=127;y2=220;break;
											case 44:x2=157;y2=220;break;
											case 45:x2=187;y2=220;break;
											case 46:x2=217;y2=220;break;
											case 47:x2=247;y2=220;break;
											case 48:x2=277;y2=220;break;
											case 49:x2=307;y2=220;break;
											case 50:x2=337;y2=220;break;
											case 51:x2=337;y2=190;break;
											case 52:x2=307;y2=190;break;
											case 53:x2=277;y2=190;break;
											case 54:x2=247;y2=190;break;
											case 55:x2=217;y2=190;break;
											case 56:x2=187;y2=190;break;
											case 57:x2=157;y2=190;break;
											case 58:x2=127;y2=190;break;
											case 59:x2=97;y2=190;break;
											case 60:x2=67;y2=190;break;
											case 61:x2=67;y2=160;break;
											case 62:x2=97;y2=160;break;
											case 63:x2=127;y2=160;break;
											case 64:x2=157;y2=160;break;
											case 65:x2=187;y2=160;break;
											case 66:x2=217;y2=160;break;
											case 67:x2=247;y2=160;break;
											case 68:x2=277;y2=160;break;
											case 69:x2=307;y2=160;break;
											case 70:x2=337;y2=160;break;
											case 71:x2=337;y2=130;break;
											case 72:x2=307;y2=130;break;
											case 73:x2=277;y2=130;break;
											case 74:x2=247;y2=130;break;
											case 75:x2=217;y2=130;break;
											case 76:x2=187;y2=130;break;
											case 77:x2=157;y2=130;break;
											case 78:x2=127;y2=130;break;
											case 79:x2=97;y2=130;break;
											case 80:x2=67;y2=130;break;
											case 81:x2=67;y2=100;break;
											case 82:x2=97;y2=100;break;
											case 83:x2=127;y2=100;break;
											case 84:x2=157;y2=100;break;
											case 85:x2=187;y2=100;break;
											case 86:x2=217;y2=100;break;
											case 87:x2=247;y2=100;break;
											case 88:x2=277;y2=100;break;
											case 89:x2=307;y2=100;break;
											case 90:x2=337;y2=100;break;
											case 91:x2=337;y2=70;break;
											case 92:x2=307;y2=70;break;
											case 93:x2=277;y2=70;break;
											case 94:x2=247;y2=70;break;
											case 95:x2=217;y2=70;break;
											case 96:x2=187;y2=70;break;
											case 97:x2=157;y2=70;break;
											case 98:x2=127;y2=70;break;
											case 99:x2=97;y2=70;break;
										    case 100:x2=67;y2=70;break;

								}
				repaint();
	}
	void play3(ActionEvent e)
		{
				d=Math.random();
				d=(int)((d*10)-4);
				if(d<0)
				{
				d=-1*d;
				System.out.print((int)d);
				}
				else if(d>0)
				{
				d=d+1;
				System.out.print((int)d);
				}
				else if(d==0)
				{
				d=d+1;
				System.out.print((int)d);
				}
				l4.setText((int)d+"");
				count3=count3+(int)d;
							if(count3>100){count3=count3-(int)d;}
							if(count3==100)
							{
								l4.setText(p3+" Wins");
								la3.setText(p3+" Wins");
							}
							if(count3==5){count3=25;l1.setText("You have got improve via ladder at "+5);}
							if(count3==10){count3=29;l1.setText("You have got improve via ladder at "+10);}
							if(count3==22){count3=41;l1.setText("You have got improve via ladder at "+22);}
							if(count3==28){count3=55;l1.setText("You have got improve via ladder at "+28);}
							if(count3==44){count3=95;l1.setText("You have got improve via ladder at "+44);}
							if(count3==70){count3=89;l1.setText("You have got improve via ladder at "+70);}
							if(count3==79){count3=81;l1.setText("You have got improve via ladder at "+79);}
							if(count3==31){count3=14;l1.setText("You have bitten at "+31);}
							if(count3==37){count3=17;l1.setText("You have bitten at "+37);}
							if(count3==73){count3=53;l1.setText("You have bitten at "+73);}
							if(count3==78){count3=39;l1.setText("You have bitten at "+78);}
							if(count3==92){count3=35;l1.setText("You have bitten at "+92);}
							if(count3==99){count3=7;l1.setText("You have bitten at "+99);}
								switch(count3)
											{
											case 1:x3=67;y3=340;break;
											case 2:x3=97;y3=340;break;
											case 3:x3=127;y3=340;break;
											case 4:x3=157;y3=340;break;
											case 5:x3=187;y3=340;break;
											case 6:x3=217;y3=340;break;
											case 7:x3=247;y3=340;break;
											case 8:x3=277;y3=340;break;
											case 9:x3=307;y3=340;break;
											case 10:x3=337;y3=340;break;
											case 11:x3=337;y3=310;break;
											case 12:x3=307;y3=310;break;
											case 13:x3=277;y3=310;break;
											case 14:x3=247;y3=310;break;
											case 15:x3=217;y3=310;break;
											case 16:x3=187;y3=310;break;
											case 17:x3=157;y3=310;break;
											case 18:x3=127;y3=310;break;
											case 19:x3=97;y3=310;break;
											case 20:x3=67;y3=310;break;
											case 21:x3=67;y3=280;break;
											case 22:x3=97;y3=280;break;
											case 23:x3=127;y3=280;break;
											case 24:x3=157;y3=280;break;
											case 25:x3=187;y3=280;break;
											case 26:x3=217;y3=280;break;
											case 27:x3=247;y3=280;break;
											case 28:x3=277;y3=280;break;
											case 29:x3=307;y3=280;break;
											case 30:x3=337;y3=280;break;
											case 31:x3=337;y3=250;break;
											case 32:x3=307;y3=250;break;
											case 33:x3=277;y3=250;break;
											case 34:x3=247;y3=250;break;
											case 35:x3=217;y3=250;break;
											case 36:x3=187;y3=250;break;
											case 37:x3=157;y3=250;break;
											case 38:x3=127;y3=250;break;
											case 39:x3=97;y3=250;break;
											case 40:x3=67;y3=250;break;
											case 41:x3=67;y3=220;break;
											case 42:x3=97;y3=220;break;
											case 43:x3=127;y3=220;break;
											case 44:x3=157;y3=220;break;
											case 45:x3=187;y3=220;break;
											case 46:x3=217;y3=220;break;
											case 47:x3=247;y3=220;break;
											case 48:x3=277;y3=220;break;
											case 49:x3=307;y3=220;break;
											case 50:x3=337;y3=220;break;
											case 51:x3=337;y3=190;break;
											case 52:x3=307;y3=190;break;
											case 53:x3=277;y3=190;break;
											case 54:x3=247;y3=190;break;
											case 55:x3=217;y3=190;break;
											case 56:x3=187;y3=190;break;
											case 57:x3=157;y3=190;break;
											case 58:x3=127;y3=190;break;
											case 59:x3=97;y3=190;break;
											case 60:x3=67;y3=190;break;
											case 61:x3=67;y3=160;break;
											case 62:x3=97;y3=160;break;
											case 63:x3=127;y3=160;break;
											case 64:x3=157;y3=160;break;
											case 65:x3=187;y3=160;break;
											case 66:x3=217;y3=160;break;
											case 67:x3=247;y3=160;break;
											case 68:x3=277;y3=160;break;
											case 69:x3=307;y3=160;break;
											case 70:x3=337;y3=160;break;
											case 71:x3=337;y3=130;break;
											case 72:x3=307;y3=130;break;
											case 73:x3=277;y3=130;break;
											case 74:x3=247;y3=130;break;
											case 75:x3=217;y3=130;break;
											case 76:x3=187;y3=130;break;
											case 77:x3=157;y3=130;break;
											case 78:x3=127;y3=130;break;
											case 79:x3=97;y3=130;break;
											case 80:x3=67;y3=130;break;
											case 81:x3=67;y3=100;break;
											case 82:x3=97;y3=100;break;
											case 83:x3=127;y3=100;break;
											case 84:x3=157;y3=100;break;
											case 85:x3=187;y3=100;break;
											case 86:x3=217;y3=100;break;
											case 87:x3=247;y3=100;break;
											case 88:x3=277;y3=100;break;
											case 89:x3=307;y3=100;break;
											case 90:x3=337;y3=100;break;
											case 91:x3=337;y3=70;break;
											case 92:x3=307;y3=70;break;
											case 93:x3=277;y3=70;break;
											case 94:x3=247;y3=70;break;
											case 95:x3=217;y3=70;break;
											case 96:x3=187;y3=70;break;
											case 97:x3=157;y3=70;break;
											case 98:x3=127;y3=70;break;
											case 99:x3=97;y3=70;break;
										    case 100:x3=67;y3=70;break;

								}
				repaint();
	}
	void play4(ActionEvent e)
		{
				d=Math.random();
				d=(int)((d*10)-4);
				if(d<0)
				{
				d=-1*d;
				System.out.print((int)d);
				}
				else if(d>0)
				{
				d=d+1;
				System.out.print((int)d);
				}
				else if(d==0)
				{
				d=d+1;
				System.out.print((int)d);
				}
				l4.setText((int)d+"");
				count4=count4+(int)d;
							if(count4>100){count4=count4-(int)d;}
							if(count4==100)
							{
								l4.setText(p2+" Wins");
								la4.setText(p4+" Wins");
							}
							if(count4==5){count4=25;l1.setText("You have got improve via ladder at "+5);}
							if(count4==10){count4=29;l1.setText("You have got improve via ladder at "+10);}
							if(count4==22){count4=41;l1.setText("You have got improve via ladder at "+22);}
							if(count4==28){count4=55;l1.setText("You have got improve via ladder at "+28);}
							if(count4==44){count4=95;l1.setText("You have got improve via ladder at "+44);}
							if(count4==70){count4=89;l1.setText("You have got improve via ladder at "+70);}
							if(count4==79){count4=81;l1.setText("You have got improve via ladder at "+79);}
							if(count4==31){count4=14;l1.setText("You have bitten at "+31);}
							if(count4==37){count4=17;l1.setText("You have bitten at "+37);}
							if(count4==73){count4=53;l1.setText("You have bitten at "+73);}
							if(count4==78){count4=39;l1.setText("You have bitten at "+78);}
							if(count4==92){count4=35;l1.setText("You have bitten at "+92);}
							if(count4==99){count4=7;l1.setText("You have bitten at "+99);}
								switch(count4)
											{
											case 1:x4=67;y4=340;break;
											case 2:x4=97;y4=340;break;
											case 3:x4=127;y4=340;break;
											case 4:x4=157;y4=340;break;
											case 5:x4=187;y4=340;break;
											case 6:x4=217;y4=340;break;
											case 7:x4=247;y4=340;break;
											case 8:x4=277;y4=340;break;
											case 9:x4=307;y4=340;break;
											case 10:x4=337;y4=340;break;
											case 11:x4=337;y4=310;break;
											case 12:x4=307;y4=310;break;
											case 13:x4=277;y4=310;break;
											case 14:x4=247;y4=310;break;
											case 15:x4=217;y4=310;break;
											case 16:x4=187;y4=310;break;
											case 17:x4=157;y4=310;break;
											case 18:x4=127;y4=310;break;
											case 19:x4=97;y4=310;break;
											case 20:x4=67;y4=310;break;
											case 21:x4=67;y4=280;break;
											case 22:x4=97;y4=280;break;
											case 23:x4=127;y4=280;break;
											case 24:x4=157;y4=280;break;
											case 25:x4=187;y4=280;break;
											case 26:x4=217;y4=280;break;
											case 27:x4=247;y4=280;break;
											case 28:x4=277;y4=280;break;
											case 29:x4=307;y4=280;break;
											case 30:x4=337;y4=280;break;
											case 31:x4=337;y4=250;break;
											case 32:x4=307;y4=250;break;
											case 33:x4=277;y4=250;break;
											case 34:x4=247;y4=250;break;
											case 35:x4=217;y4=250;break;
											case 36:x4=187;y4=250;break;
											case 37:x4=157;y4=250;break;
											case 38:x4=127;y4=250;break;
											case 39:x4=97;y4=250;break;
											case 40:x4=67;y4=250;break;
											case 41:x4=67;y4=220;break;
											case 42:x4=97;y4=220;break;
											case 43:x4=127;y4=220;break;
											case 44:x4=157;y4=220;break;
											case 45:x4=187;y4=220;break;
											case 46:x4=217;y4=220;break;
											case 47:x4=247;y4=220;break;
											case 48:x4=277;y4=220;break;
											case 49:x4=307;y4=220;break;
											case 50:x4=337;y4=220;break;
											case 51:x4=337;y4=190;break;
											case 52:x4=307;y4=190;break;
											case 53:x4=277;y4=190;break;
											case 54:x4=247;y4=190;break;
											case 55:x4=217;y4=190;break;
											case 56:x4=187;y4=190;break;
											case 57:x4=157;y4=190;break;
											case 58:x4=127;y4=190;break;
											case 59:x4=97;y4=190;break;
											case 60:x4=67;y4=190;break;
											case 61:x4=67;y4=160;break;
											case 62:x4=97;y4=160;break;
											case 63:x4=127;y4=160;break;
											case 64:x4=157;y4=160;break;
											case 65:x4=187;y4=160;break;
											case 66:x4=217;y4=160;break;
											case 67:x4=247;y4=160;break;
											case 68:x4=277;y4=160;break;
											case 69:x4=307;y4=160;break;
											case 70:x4=337;y4=160;break;
											case 71:x4=337;y4=130;break;
											case 72:x4=307;y4=130;break;
											case 73:x4=277;y4=130;break;
											case 74:x4=247;y4=130;break;
											case 75:x4=217;y4=130;break;
											case 76:x4=187;y4=130;break;
											case 77:x4=157;y4=130;break;
											case 78:x4=127;y4=130;break;
											case 79:x4=97;y4=130;break;
											case 80:x4=67;y4=130;break;
											case 81:x4=67;y4=100;break;
											case 82:x4=97;y4=100;break;
											case 83:x4=127;y4=100;break;
											case 84:x4=157;y4=100;break;
											case 85:x4=187;y4=100;break;
											case 86:x4=217;y4=100;break;
											case 87:x4=247;y4=100;break;
											case 88:x4=277;y4=100;break;
											case 89:x4=307;y4=100;break;
											case 90:x4=337;y4=100;break;
											case 91:x4=337;y4=70;break;
											case 92:x4=307;y4=70;break;
											case 93:x4=277;y4=70;break;
											case 94:x4=247;y4=70;break;
											case 95:x4=217;y4=70;break;
											case 96:x4=187;y4=70;break;
											case 97:x4=157;y4=70;break;
											case 98:x4=127;y4=70;break;
											case 99:x4=97;y4=70;break;
										    case 100:x4=67;y4=70;break;

								}
				repaint();
	}
	public void paint(Graphics g)
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("Snakes_and_Ladders.jpg");
		g.drawImage(img,50,50,this);
		g.setColor(Color.blue);
		g.fillRect(x,y,10,10);
		g.fillRect(50,420,10,10);
		g.setColor(Color.red);
		g.fillRect(x2,y2,10,10);
		g.fillRect(50,435,10,10);
		g.setColor(Color.yellow);
		g.fillRect(x3,y3,10,10);
		g.fillRect(50,450,10,10);
		g.setColor(Color.green);
		g.fillRect(x4,y4,10,10);
		g.fillRect(50,465,10,10);
	}
}
class ludo
{
	public static void main(String bb[])
	{
		Frame1 f=new Frame1();
		f.setVisible(true);
	}
}
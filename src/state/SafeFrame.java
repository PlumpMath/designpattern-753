package state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context , ActionListener{
	// 現在時刻表示
	private TextField textClock = new TextField(60);
	// 警備センター出力
	private TextArea textScreen = new TextArea(10, 60);
	// 金庫使用ボタン
	private Button buttonUse = new Button("金庫使用");
	// 非常ベルボタン
	private Button buttonAlarm = new Button("非常ベルボタン");
	// 通常通話ボタン
	private Button buttonPhone = new Button("通常通話");
	// 終了ボタン
	private Button buttonExit = new Button("終了");
	
	private State state = DayState.getInstance();
	
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		// textClockを配置
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		// textScreenを配置
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		// パネルにボタンを格納
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		// そのパネルを配置
		add(panel, BorderLayout.SOUTH);
		pack();
		show();
		buttonUse.addActionListener(this);
	}
	
	@Override
	public void setClock(int hour) {

	}

	@Override
	public void changeState(State state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void callSecurityCenter(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recordLog(String msg) {
		// TODO Auto-generated method stub

	}

	// ボタンが押されたらここに来る
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

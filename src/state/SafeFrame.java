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
	// ���ݎ����\��
	private TextField textClock = new TextField(60);
	// �x���Z���^�[�o��
	private TextArea textScreen = new TextArea(10, 60);
	// ���Ɏg�p�{�^��
	private Button buttonUse = new Button("���Ɏg�p");
	// ���x���{�^��
	private Button buttonAlarm = new Button("���x���{�^��");
	// �ʏ�ʘb�{�^��
	private Button buttonPhone = new Button("�ʏ�ʘb");
	// �I���{�^��
	private Button buttonExit = new Button("�I��");
	
	private State state = DayState.getInstance();
	
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		// textClock��z�u
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		// textScreen��z�u
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		// �p�l���Ƀ{�^�����i�[
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		// ���̃p�l����z�u
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

	// �{�^���������ꂽ�炱���ɗ���
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

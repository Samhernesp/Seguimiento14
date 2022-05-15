package model;

import java.time.LocalTime;

import controller.MenuController;

public class ThreadClock extends Thread {
	
	private int id;
	private MenuController menu;
	
	public ThreadClock(MenuController menu ) {
		this.menu=menu;
	}

	@Override
	public void run() {
		boolean flag=true;
		while (flag) {
			LocalTime start = LocalTime.now();
			try {
				Thread.sleep(1000);
				menu.clockStep(start);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
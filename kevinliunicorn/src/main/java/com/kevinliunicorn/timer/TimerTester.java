package com.kevinliunicorn.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTester extends TimerTask {

	private String jobName = "";

	public TimerTester(String jobName) {
		super();
		this.jobName = jobName;
	}

	@Override
	public void run() {
		System.out.println("execute:" + jobName);
		System.out.println("execute time:" + new Date());
		System.out.println("------------------------");
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		long delay1 = 1 * 1000;
		long period1 = 1000;
		// 從現在開始 1 秒鐘之後，每隔 1 秒鐘執行一次 job1
		timer.schedule(new TimerTester("job1"), delay1, period1);
		long delay2 = 2 * 1000;
		long period2 = 2000;
		// 從現在開始 2 秒鐘之後，每隔 2 秒鐘執行一次 job2
		timer.schedule(new TimerTester("job2"), delay2, period2);
	}

}

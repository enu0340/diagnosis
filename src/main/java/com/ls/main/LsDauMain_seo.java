package com.ls.main;

import java.io.File;
import java.io.InputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Timer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.automatak.dnp3.comm.ConnectionPool;
import com.automatak.dnp3.comm.DevDBInfo;
import com.ls.dau.CheckCMS;
import com.ls.dau.ConnectFTP;
import com.ls.dau.ConnectionTimerTask;
import com.ls.dau.DAUConnectionHandler;
import com.ls.dau.DAUConnectionStarter;
import com.ls.dau.DAUInterface;
import com.ls.dau.DevInfo;
import com.ls.dau.DiagnosisTrendSocket;
import com.ls.dau.SendOPCHandler;
import com.ls.dau.SendThermalPacket;
import com.ls.dau.ThermalAlarmReceiver;
import com.ls.dau.SendAnalHandler;
import com.ls.dau.SendAnalPDHandler;
import com.ls.dau.SendOPCHandler;
import com.ls.schedule.CommandHandlerInf;
import com.ls.schedule.CommandTimerTask;
import com.ls.schedule.FileDownloadTask;
import com.ls.schedule.MakeAlarmTable;
import com.ls.schedule.MakeDiagnosisTable;
import com.ls.schedule.MakeThermalAlarmTable;
import com.ls.schedule.ReadSystemSettingTimer;
import com.ls.schedule.ScheduleHandlerInf;

public class LsDauMain_seo {

	
	public LsDauMain_seo(){
		
		Date today = new Date();
		
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
	    SimpleDateFormat month = new SimpleDateFormat("MM");
		DevDBInfo.DATA_DB_DATE = year.format(today) + month.format(today)+"`";
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		String dbURL = null;
		String ipAddr = null;
		String chkPort = null;
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("-  SDV1 seo Test Engine Ver. "+DevDBInfo.COMM_VERSION+"   -");
		System.out.println("------------------------------------------------------");
		Calendar cal = new GregorianCalendar();
		System.out.println(">>" + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-"
				+ cal.get(Calendar.DATE) + "/" + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE)
				+ ":" + cal.get(Calendar.SECOND));
		System.out.println("");
		System.out.println("");
		Properties pr = new Properties();
		
		InputStream input1 = LsDauMain.class.getResourceAsStream("/config.properties");

		pr.load(input1);
		input1.close();
	}
	
}

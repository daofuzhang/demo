package com.want.demo.jco;

import java.util.Properties;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.ext.Environment;
import com.want.demo.config.JcoConfig;

public class RfcManager {
	private static final String destinationName = "JCO_RFC";
	private static JCoDestination destination;
	private static JCOProvider provider;

	static {
		try {
			provider = new JCOProvider();
			Environment.registerDestinationDataProvider(provider);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
	
	public static JCoDestination getDestination(JcoConfig jcoServer) throws JCoException {
		if (destination == null) {
			provider.changeProperties(destinationName, loadProperties(jcoServer));
			destination = JCoDestinationManager.getDestination(destinationName);
		}
		return destination;
	}

	public static Properties loadProperties(JcoConfig jcoServer) {
		Properties prop = new Properties();
		prop.setProperty("lang", jcoServer.getLang());
		prop.setProperty("passwd", jcoServer.getPasswd());
		prop.setProperty("sysnr", jcoServer.getSysnr());
		prop.setProperty("client", jcoServer.getClient());
		prop.setProperty("pool_capacity", jcoServer.getPool_capacity());
		prop.setProperty("user", jcoServer.getUser());
		prop.setProperty("peak_limit", jcoServer.getPeak_limit());
		prop.setProperty("ashost", jcoServer.getAshost());
		prop.setProperty("jco.client", "");
		prop.setProperty("jco.destination", "");

		return prop;
	}

	public static JCoFunction getFunction(String functionName) {
		JCoFunction function = null;
		try {
			function = destination.getRepository().getFunctionTemplate(functionName).getFunction();
		} catch (JCoException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return function;
	}

	public static void execute(JCoFunction function) {
		JCoParameterList importParameterList = function.getImportParameterList();
		JCoParameterList tableParameterList = function.getTableParameterList();
		try {
			function.execute(destination);
		} catch (JCoException e) {
			e.printStackTrace();
		}
		JCoParameterList exportParameterList = function.getExportParameterList();
	}

}

package com.bytom.api;

import java.util.HashMap;
import java.util.Map;

import com.bytom.exception.BytomException;
import com.bytom.http.Client;

public class Miner {

	/**
	 * �����Ƿ��ڿ�
	 * @param client
	 * @param isMining �Ƿ��ڿ�
	 * @return ���������Ƿ�ɹ�
	 * @throws BytomException
	 */
	public static boolean setMining(Client client, boolean isMining) throws BytomException {
		Map<String, Object> req = new HashMap<String, Object>();
		req.put("is_mining",  isMining);
		return client.requestStatus("set-mining", req);
	}
	
	/**
	 * �Ƿ��ڿ�
	 * @param client
	 * @return true�ڿ� falseû�ڿ�
	 * @throws BytomException
	 */
	public static boolean istMining(Client client) throws BytomException {
		return client.requestGet("is-mining", null, "is_mining", Boolean.class);
	}
}

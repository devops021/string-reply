package com.dto;

import java.io.Serializable;

/**
 * @author Mukul Anand
 */
public class ReplyMessage {

	private String data;

	public ReplyMessage(){
		super();
	}

	public ReplyMessage(final String data) {
		this.data = data;
	}

	public void setData(final String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}
}
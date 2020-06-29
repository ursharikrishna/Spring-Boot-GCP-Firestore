package com.gcp.sbgcpfirestore;

public class Customer {

	String cname;

	String cid;

	

	public Customer() {
		super();
	}

	public Customer(String cname, String cid) {
		this.cname = cname;
		this.cid = cid;
	
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [cname=");
		builder.append(cname);
		builder.append(", cid=");
		builder.append(cid);
		builder.append("]");
		return builder.toString();
	}

	
}
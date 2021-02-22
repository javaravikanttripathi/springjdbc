package com.rk.model;

public class Students {
	private int stdId;
	private String stdSname;
	private double stdSmarks;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdSname() {
		return stdSname;
	}

	public void setStdSname(String stdSname) {
		this.stdSname = stdSname;
	}

	public double getStdSmarks() {
		return stdSmarks;
	}

	public void setStdSmarks(double stdSmarks) {
		this.stdSmarks = stdSmarks;
	}

	@Override
	public String toString() {
		return "Students [stdId=" + stdId + ", stdSname=" + stdSname + ", stdSmarks=" + stdSmarks + "]";
	}

}

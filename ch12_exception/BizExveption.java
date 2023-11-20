package ch12_exception;

public class BizExveption extends Exception {
	private String errCode = "";
	
	public BizExveption(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}

	public BizExveption(String errMsg) {
		super(errMsg);
		
	}

	public BizExveption() {
		super();
		
	}

	public BizExveption(Exception e) {
		super(e);
	}

	public String getErrCode() {
		return errCode;
	}
	
	

}

package wiki.leon.test.demo1.base;

import org.springframework.core.NestedRuntimeException;

public class BaseSQLException extends NestedRuntimeException {
	private static final long serialVersionUID = 1L;
	private String errCode;

	public BaseSQLException(String errCode, String msg) {
		super(msg);
		this.errCode = errCode;
	}

	public BaseSQLException(String errCode, String msg, Throwable cause) {
		super(msg, cause);
		this.errCode = errCode;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public BaseSQLException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public BaseSQLException(String msg) {
		super(msg);
	}
}
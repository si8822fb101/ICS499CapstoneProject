package edu.ics499.fume.facade;

public class Result extends Transfer {
	public static final int USER_NAME_UNAVAILABLE = 1;
	public static final int USER_REGISTRATION_COMPLETED = 2;
	public static final int DEVICE_ADDED_TO_NETWORK = 3;
	public static final int DEVICE_NOT_ADDED_TO_NETWORK = 4;
	public static final int NETWORK_NOT_VALID = 5;
	public static final int MESSAGE_SENT = 6;
	public static final int MESSAGE_RECEIVED = 7;
	public static final int FILE_SENT = 8;
	public static final int FILE_RECIEVED = 9;
	public static final int OPERATION_FAILED = 10;

	
	private int resultCode;
	
	
    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

}

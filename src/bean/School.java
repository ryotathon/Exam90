package bean;

import java.io.Serializable;

public class School implements Serializable {

	/**
	 * 学校コード:String
	 */
	private String school_cd;

	/**
	 * 学校名:String
	 */
	private String school_name;

	/**
	 * ゲッター、セッター
	 */
	public String getSchool_cd() {
		return school_cd;
	}
	public void setSchool_cd(String school_cd) {
		this.school_cd = school_cd;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}


}

package Haung;


import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentNumberBean {
	static final int columnNum = 22;
	private int schoolCode = 0;
	private String schoolName = "";
	private String formCode = "";
	private String academicDegree = "";
	private int grade1M;
	private int grade1F;
	private int grade2M;
	private int grade2F;
	private int grade3M;
	private int grade3F;
	private int grade4M;
	private int grade4F;
	private int grade5M;
	private int grade5F;
	private int grade6M;
	private int grade6F;
	private int grade7M;
	private int grade7F;
	private int delayGraduationM = -1;
	private int delayGraduationF = -1;
	private String city = "";
	private String systemCode = "";
	
	public StudentNumberBean() {}
	public StudentNumberBean(StudentNumberBean bean) {
		if(bean == null)
			return;
		this.academicDegree = bean.academicDegree;
		this.city = bean.city;
		this.delayGraduationF = bean.delayGraduationF;
		this.delayGraduationM = bean.delayGraduationM;
		this.formCode = bean.formCode;
		this.grade1F = bean.grade1F;
		this.grade1M = bean.grade1M;
		this.grade2F = bean.grade2F;
		this.grade2M = bean.grade2M;
		this.grade3F = bean.grade3F;
		this.grade3M = bean.grade3M;
		this.grade4F = bean.grade4F;
		this.grade4M = bean.grade4M;
		this.grade5F = bean.grade5F;
		this.grade5M = bean.grade5M;
		this.grade6F = bean.grade6F;
		this.grade6M = bean.grade6M;
		this.grade7F = bean.grade7F;
		this.grade7M = bean.grade7M;
		this.systemCode = bean.systemCode;
		this.schoolName = bean.schoolName;
		this.schoolCode = bean.schoolCode;
	}

	public void equalsTo(StudentNumberBean bean ) {
		this.academicDegree = bean.academicDegree;
		this.city = bean.city;
		this.delayGraduationF = bean.delayGraduationF;
		this.delayGraduationM = bean.delayGraduationM;
		this.formCode = bean.formCode;
		this.grade1F = bean.grade1F;
		this.grade1M = bean.grade1M;
		this.grade2F = bean.grade2F;
		this.grade2M = bean.grade2M;
		this.grade3F = bean.grade3F;
		this.grade3M = bean.grade3M;
		this.grade4F = bean.grade4F;
		this.grade4M = bean.grade4M;
		this.grade5F = bean.grade5F;
		this.grade5M = bean.grade5M;
		this.grade6F = bean.grade6F;
		this.grade6M = bean.grade6M;
		this.grade7F = bean.grade7F;
		this.grade7M = bean.grade7M;
		this.systemCode = bean.systemCode;
		this.schoolName = bean.schoolName;
		this.schoolCode = bean.schoolCode;
	}
	
	
	public int getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getFormCode() {
		return formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getacademicDegree() {
		return academicDegree;
	}

	public void setacademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public int getGrade1M() {
		return grade1M;
	}

	public void setGrade1M(int grade1m) {
		grade1M = grade1m;
	}

	public int getGrade1F() {
		return grade1F;
	}

	public void setGrade1F(int grade1f) {
		grade1F = grade1f;
	}

	public int getGrade2M() {
		return grade2M;
	}

	public void setGrade2M(int grade2m) {
		grade2M = grade2m;
	}

	public int getGrade2F() {
		return grade2F;
	}

	public void setGrade2F(int grade2f) {
		grade2F = grade2f;
	}

	public int getGrade3M() {
		return grade3M;
	}

	public void setGrade3M(int grade3m) {
		grade3M = grade3m;
	}

	public int getGrade3F() {
		return grade3F;
	}

	public void setGrade3F(int grade3f) {
		grade3F = grade3f;
	}

	public int getGrade4M() {
		return grade4M;
	}

	public void setGrade4M(int grade4m) {
		grade4M = grade4m;
	}

	public int getGrade4F() {
		return grade4F;
	}

	public void setGrade4F(int grade4f) {
		grade4F = grade4f;
	}

	public int getGrade5M() {
		return grade5M;
	}

	public void setGrade5M(int grade5m) {
		grade5M = grade5m;
	}

	public int getGrade5F() {
		return grade5F;
	}

	public void setGrade5F(int grade5f) {
		grade5F = grade5f;
	}

	public int getGrade6M() {
		return grade6M;
	}

	public void setGrade6M(int grade6m) {
		grade6M = grade6m;
	}

	public int getGrade6F() {
		return grade6F;
	}

	public void setGrade6F(int grade6f) {
		grade6F = grade6f;
	}

	public int getGrade7M() {
		return grade7M;
	}

	public void setGrade7M(int grade7m) {
		grade7M = grade7m;
	}

	public int getGrade7F() {
		return grade7F;
	}

	public void setGrade7F(int grade7f) {
		grade7F = grade7f;
	}

	public int getDelayGraduationM() {
		return delayGraduationM;
	}

	public void setDelayGraduationM(int delayGraduationM) {
		this.delayGraduationM = delayGraduationM;
	}

	public int getDelayGraduationF() {
		return delayGraduationF;
	}

	public void setDelayGraduationF(int delayGraduationF) {
		this.delayGraduationF = delayGraduationF;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public Object getByCode(int code) {
		switch (code) {
		case 1:
			return Integer.toString(this.getSchoolCode());
		case 2:
			return this.getSchoolName();
		case 3:
			return this.getFormCode();
		case 4:
			return this.getacademicDegree();
		case 5:
			return Integer.toString(this.getGrade1M());
		case 6:
			return Integer.toString(this.getGrade1F());
		case 7:
			return Integer.toString(this.getGrade2M());
		case 8:
			return Integer.toString(this.getGrade2F());
		case 9:
			return Integer.toString(this.getGrade3M());
		case 10:
			return Integer.toString(this.getGrade3F());
		case 11:
			return Integer.toString(this.getGrade4M());
		case 12:
			return Integer.toString(this.getGrade4F());
		case 13:
			return Integer.toString(this.getGrade5M());
		case 14:
			return Integer.toString(this.getGrade5F());
		case 15:
			return Integer.toString(this.getGrade6M());
		case 16:
			return Integer.toString(this.getGrade6F());
		case 17:
			return Integer.toString(this.getGrade7M());
		case 18:
			return Integer.toString(this.getGrade7F());
		case 19:
			return Integer.toString(this.getDelayGraduationM());
		case 20:
			return Integer.toString(this.getDelayGraduationF());
		case 21:
			return this.getCity();
		case 22:
			return this.getSystemCode();
		default:
			return "";
		}
	}

	public void setByCode(int code, Object value) {
		switch (code) {
		case 1:
			this.setSchoolCode((Integer) value);
			break;
		case 2:
			this.setSchoolName((String) value);
			break;
		case 3:
			this.setFormCode((String) value);
			break;
		case 4:
			this.setacademicDegree((String) value);
			break;
		case 5:
			this.setGrade1M((Integer) value);
			break;
		case 6:
			setGrade1F((Integer) value);
			break;
		case 7:
			setGrade2M((Integer) value);
			break;
		case 8:
			setGrade2F((Integer) value);
			break;
		case 9:
			setGrade3M((Integer) value);
			break;
		case 10:
			setGrade3F((Integer) value);
			break;
		case 11:
			setGrade4M((Integer) value);
			break;
		case 12:
			setGrade4F((Integer) value);
			break;
		case 13:
			setGrade5M((Integer) value);
			break;
		case 14:
			setGrade5F((Integer) value);
			break;
		case 15:
			setGrade6M((Integer) value);
			break;
		case 16:
			setGrade6F((Integer) value);
			break;
		case 17:
			setGrade7M((Integer) value);
			break;
		case 18:
			setGrade7F((Integer) value);
			break;
		case 19:
			setDelayGraduationM((Integer) value);
			break;
		case 20:
			setDelayGraduationF((Integer) value);
			break;
		case 21:
			setCity((String) value);
			break;
		case 22:
			setSystemCode((String) value);
			break;
		default:
			break;
		}
	}

	public void setByResult(ResultSet rs) throws SQLException {
		for (int i = 1; i <= StudentNumberBean.columnNum; i++) {
			this.setByCode(i, rs.getObject(i));
		}
	}

	@Override
	public String toString() {
		if(schoolCode == 0)
			return "No result";
		String ans = "" + this.getSchoolCode();
		for (int i = 2; i <= columnNum; i++) {
			ans += (", " + this.getByCode(i));
		}
		return ans;
	}
} // end of class StudentNumberBean

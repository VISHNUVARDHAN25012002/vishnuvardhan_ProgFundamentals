package departments;

public class AdminDepartment extends SuperDepartment {
	
	String departmentName () {
		return"Admin Department";
	}
	
	String getTodaysWork () {
		return "Complete your documents Submission";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}

}

package Assignments;

public class GradeRecordDriver {

	public static void main(String[] args) {
		GradeRecord record = new GradeRecord("Mary", "CS219");
		record.addScore(8);
		record.addScore(9);
		record.addScore(7);
		System.out.println("Average is : "+record.getAvgScore());
	}

}

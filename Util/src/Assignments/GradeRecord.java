package Assignments;
//store scores of a student in a specific course
public class GradeRecord {
	private String student;	//Student Name
	private String course;	//Course Title
	
	private int MAX_SIZE = 10;	//max # of grades can store
	private double[] scores;	//store list of scores
	private int numberOfScores;	//number of scores actually stored
	
	//constructor to specify student name and course
	public GradeRecord(String student, String course) {
		super();
		this.student = student;
		this.course = course;
		scores=new double[MAX_SIZE];
		numberOfScores=0;
	}
	
	//add one score and append to the score list
	public void addScore(double score){
		scores[numberOfScores]=score;
		numberOfScores++;
	}
	
	/**
	 * Calculate and return the average score of the scores stored in the calling GradeRecord Object 
	 * 
	 */
	public double getAvgScore(){
		double averageScore=0.0;						//declare the averageScore
		for(int i=0;i<=numberOfScores;i++){				//Loop start to iterate and get the values in the scores array 
			averageScore += scores[i];					//Add the values in the Scores Array
		}												//Loop End
		if(numberOfScores>0){					
			averageScore = averageScore/numberOfScores;	//calculate the average score 
		}
		return averageScore;							// Return the average score to the caller
	}
}

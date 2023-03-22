public class Student {
    private String name;
    private int finishedTests;

    public String getName() {
		return this.name;
	}
    public int getFinishedTests() {
		return this.finishedTests;
	}
  
    public void setFinishedTests(){
        this.finishedTests = finishedTests + 1;
    }
}

public class EducationInfo {
	
	public class School {
		private String name;
		private int from;
		private int to;
		
		School(){
			name = "";
			from = 0;
			to = 0;
		}
		
		School(String name, int from, int to){
			this.name = name;
			this.from = from;
			this.to = to;
		}
		
		//Accessors
		public String getName() {
			return this.name;
		}
		public int getFrom() {
			return this.from;
		}
		public int getTo() {
			return this.to;
		}
		
		//Mutators
		public void setName(String name) {
			this.name = name;
		}
		public void setFrom(int from) {
			this.from = from;
		}
		public void setTo(int to) {
			this.to = to;
		}	
	}
	
	public School school1;
	public School school2;
	private Boolean second_school;
	
	public EducationInfo() {
		school1 = new School();
		school2 = new School();
		second_school = false;
	}
	
	public void addSchool() {
		this.second_school = true;
	}
	
	public Boolean get_second() {
		return second_school;
	}
	
}


public class ExperienceInfo {
	
	public class Job {
		private String company;
		private String desc;
		private String from;
		private String to;
		
		public Job() {
			company = "";
			desc = "";
			from = "";
			to = "";
		}
		
		//Accesssors
		
		public String getCompany() {
			return this.company;
		}
		public String getDesc() {
			return this.desc;
		}
		public String getFrom() {
			return this.from;
		}
		public String getTo() {
			return this.to;
		}
		
		//Mutators
		public void setCompany(String company) {
			this.company = company;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public void setTo(String to) {
			this.to = to;
		}
		
		
	}
	
	private int numJobs;
	
	public Job job1;
	public Job job2;
	public Job job3;
	
	public ExperienceInfo () {
		job1 = new Job();
		job2 = new Job();
		job3 = new Job();
		numJobs = 0;
	}
	
	public void addJob() {
		numJobs++;
		
	}
	public int getNumJobs() {
		return numJobs;
	}
	
}

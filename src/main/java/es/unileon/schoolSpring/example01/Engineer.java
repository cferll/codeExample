package es.unileon.schoolSpring.example01;

public class Engineer {

	private Tool tool;

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public void repair(Computer brokenComputer){
	    tool.repair(brokenComputer);		
	}
}

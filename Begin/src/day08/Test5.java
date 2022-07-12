package day08;

public class Test5 {
	private float x=1.0f;
	protected void setVar(float f) {x=f;}
}
class SubClass extends Test5 {
	private float x = 2.0f;
protected float setVar() {x=3.0f; return 3.0f;}
}

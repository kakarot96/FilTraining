package com.fil;

import org.springframework.stereotype.Component;

@Component
public class OuterClass {

	
	InnerClass inner;
	String outerValue;
	public InnerClass getInner() {
		return inner;
	}

	public void setInner(InnerClass inner) {
		this.inner = inner;
	}

	public String getOuterValue() {
		return outerValue;
	}

	public void setOuterValue(String outerValue) {
		this.outerValue = outerValue;
	}

	public OuterClass(InnerClass inner){
		super();
		this.inner=inner;
	}
	
	public OuterClass(){
		super();
		
	}
	
	public String toString(){
		return inner.toString()+":"+outerValue;
	}
}

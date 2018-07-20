package com.fil;

public class InnerClass {
		String value;
		public InnerClass() {
			super();
			//this.value = value;
		}
		public InnerClass(String value) {
			super();
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		public String toString(){
			return value;
		}
		
}

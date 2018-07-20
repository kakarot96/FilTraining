package main;

public class Supplier {
		static int count=5;
		int id;
		String sname;
		String  city;
		public Supplier(int id, String sname, String addre) {
			super();
			this.id = id;
			this.sname = sname;
			this.city = addre;
			count++;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getAddress() {
			return city;
		}
		public void setAddress(String address) {
			this.city = address;
		}
		
		@Override
		public boolean equals(Object obj){
			
			Supplier supplier= (Supplier)obj;
			
//				for(Supplier s:suppliers){
					if(supplier.id==id)return true;
//				}
				
				return false;
			
		}
		@Override
		public int hashCode(){
			return 1;
		}
	
}

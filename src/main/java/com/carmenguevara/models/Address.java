package com.carmenguevara.models;

public class Address {

		 private String streetAdd;
		 private String city;
		 private String state;
		 private int zipcode;
		 
//		shorcut way
		public String getStreetAdd() {
			return streetAdd;
		}

		/**
		 * @param streetAdd
		 * @param city
		 * @param state
		 * @param zipcode
		 */
		public Address(String streetAdd, String city, String state, int zipcode) {
			super();
			this.streetAdd = streetAdd;
			this.city = city;
			this.state = state;
			this.zipcode = zipcode;
		}
		
		
		public void setStreetAdd(String streetAdd) {
			this.streetAdd = streetAdd;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZipcode() {
			return zipcode;
		}
		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}

		@Override
		public String toString() {
			return streetAdd + ", " + city + "," + state.toUpperCase() + " "+ zipcode;
		}
		 
		 
		 
	
	
	
}

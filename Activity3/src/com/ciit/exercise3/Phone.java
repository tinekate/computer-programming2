package com.ciit.exercise3;

public class Phone {
		private String phoneNum;
		private boolean isOn;

		public Phone(String phoneNum) {
			this.setPhoneNum(phoneNum);
			this.isOn = false;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}

		public boolean isOn() {
			return isOn;
		}

		public void setOn(boolean isOn) {
			this.isOn = isOn;
		}

	}
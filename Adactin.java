package com.test;


public class Adactin extends BaseClass1 {

	public static void main(String[] args) {


		browserconfigchrome();
		openurl("https://adactinhotelapp.com/");
		maximizewindow();

		        Login l=new Login();
		
		inputText(l.getTxtuser(), "BIBINRV02");
		//		driver.navigate().refresh();
		//		inputText(l.getTxtuser(),"BIBIN01");
		inputText(l.getTxtpass(),"Password@01");
		click(l.getBtnlogin());
		
		Searchadactin s= new Searchadactin();
		click(s.locatebyid("location"));
		s.dropdownbyIndex(s.getSelectlocation(), 1);  
		click(s.locatebyid("hotels"));
		s.dropdownbyIndex(s.getGethotel(), 2);
		click(s.locatebyid("room_type"));
		s.dropdownbyIndex(s.getRoomtype(), 1);
		click(s.locatebyid("room_nos"));
		s.dropdownbyIndex(s.getRoom_nos(), 1);
		click(s.locatebyid("adult_room"));
		s.dropdownbyIndex(s.getAdult_room(), 2);
		click(s.locatebyid("child_room"));
		s.dropdownbyIndex(s.getChild_room(), 3);
		click(s.locatebyid("Submit"));


		BookingDetails b= new BookingDetails();

		click(b.locatebyname("radiobutton_0"));
		click(b.locatebyxpath("//input[@type='submit']"));		
		inputText(b.getFirst_name(), "BIBIN");
		inputText(b.getLast_name(), "RV");
		inputText(b.getAddress(), "chennai");
		inputText(b.getCc_num(), "4160211502601942");
		click(b.getCc_type());
		b.dropdownbyvalue(b.getCc_type(), "VISA");
		click(b.getCc_exp_month());
		b.dropdownbyIndex(b.getCc_exp_month(), 1);
		click(b.getCc_exp_year());
		b.dropdownbyvalue(b.getCc_exp_year(), "2022");
		inputText(b.getCc_cvv(), "176");
		click(b.getBook_now());






	}
























}

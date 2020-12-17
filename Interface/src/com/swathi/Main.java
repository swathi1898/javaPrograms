package com.swathi;

public class Main {

    public static void main(String[] args) {
	ITelephone timsPhone;
	timsPhone = new DeskPhone(123456);
	timsPhone.powerOn();
	timsPhone.callPhone(123456);
	timsPhone.answer();

	timsPhone = new MobilePhone(1234);
	timsPhone.powerOn();
	timsPhone.callPhone(1234);
	timsPhone.answer();
		System.out.println(timsPhone.isRinging());
    }
}

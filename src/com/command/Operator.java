package com.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {

	List<Phone> phoneList = new ArrayList<Phone>();

	public void makeAction(Phone phone) {
		phoneList.add(phone);
	}

	public void actions() {
		for (Phone phone : phoneList) {
			phone.execute();
		}

		phoneList.clear();
	}
}

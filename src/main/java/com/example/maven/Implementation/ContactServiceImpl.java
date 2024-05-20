package com.example.maven.Implementation;

import com.example.mavenprojectDao.ContactDao;
import com.example.mavenprojectService.ContactService;

public class ContactServiceImpl implements ContactService {

	//we cannot use autowiring becuse this is not a Spring or SpringBoot project
	//This is a plain Java-Maven project
	private ContactDao contactDao;
	public String getNameById(Integer id) {
		String name = contactDao.findNameById(id);
		String formattedName = name.toUpperCase();
		return formattedName;
	}

}

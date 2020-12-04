  
package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class Test2 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddCcListofEmails() throws EmailException {
		System.out.println("This is a message from the test1 test class. pne*2*");
		System.out.println("This Tests goal is to check for any errors while creating an email array and testing the AddCcListofEmails method");
		String mails[] = {"sam@egg.com", "dude@d.com", "him@h.com"};
		testEmail.addCc(mails);
	}

}

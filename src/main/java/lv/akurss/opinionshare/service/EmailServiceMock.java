package lv.akurss.opinionshare.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev"})
public class EmailServiceMock implements EmailService {

	private static final Logger log = LoggerFactory.getLogger(EmailServiceMock.class);
	
	public void sendMail(String to, String subject, String body) {
		log.info("Sending mail to: {} with subject: {}", to, subject);
	}
	
}

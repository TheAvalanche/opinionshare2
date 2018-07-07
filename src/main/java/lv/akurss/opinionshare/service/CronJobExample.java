package lv.akurss.opinionshare.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJobExample {

	private static final Logger log = LoggerFactory.getLogger(CronJobExample.class);
	
	@Scheduled(fixedRate = 5000)
	public void checkSmth() {
		log.info("Periodic schedule triggered");
	}
	
	@Scheduled(cron = "0 55 11 ? * MON,TUE,WED,THU,FRI,SAT")
	public void sendSpam() {
		log.info("Cron schedule triggered");
	}
	
	
}

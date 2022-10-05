package com.example.demo.email;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.internet.*;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(EmailService.class);
	
	private final JavaMailSender mailsender;
	
	@Override
	@Async
	public void send(String to, String email) {
		
		try {
			MimeMessage mimeMessage = mailsender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper (mimeMessage, "utf-8");
			helper.setText(email,true);
			helper.setTo(to);
			helper.setSubject("Confirma tu email");
			helper.setFrom("wammysh@gmail.com");
			mailsender.send(mimeMessage);
		} catch(MessagingException e) {
			LOGGER.error("Hubo una falla al enviar el email", e);
			throw new IllegalStateException("Hubo una falla al enviar el email");
		}
		
	}

}

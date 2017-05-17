package com.lph.app.core.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailParseException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class Mail {
    private MailSender mailSender;
    @Autowired
    private JavaMailSender javaMailSender;
    private SimpleMailMessage simpleMailMessage;

    public void sendMail(String from, String to, String subject, String msg) {

	SimpleMailMessage message = new SimpleMailMessage();
	message.setFrom(from);
	message.setTo(to);
	message.setSubject(subject);
	message.setText(msg);
	mailSender.send(message);
    }

    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
	this.simpleMailMessage = simpleMailMessage;
    }

    public void setMailSender(MailSender mailSender) {
	this.mailSender = mailSender;
    }

    public void sendMail(String dear, String content) {

	SimpleMailMessage message = new SimpleMailMessage(simpleMailMessage);

	message.setText(String.format(simpleMailMessage.getText(), dear, content));

	mailSender.send(message);

    }

    /**
     * 为了包含附件的电子邮件，
     * 你必须使用 Spring的JavaMailSender及MimeMessage 
     * 来代替MailSender＆SimpleMailMessage。
     * @param dear
     * @param content
     * @param filePath
     */
    public void sendMail(String dear, String content, String filePath) {

	MimeMessage message = javaMailSender.createMimeMessage();

	try {
	    MimeMessageHelper helper = new MimeMessageHelper(message, true);

	    helper.setFrom(simpleMailMessage.getFrom());
	    helper.setTo(simpleMailMessage.getTo());
	    helper.setSubject(simpleMailMessage.getSubject());
	    helper.setText(String.format(simpleMailMessage.getText(), dear, content));

	    FileSystemResource file = new FileSystemResource(filePath);
	    helper.addAttachment(file.getFilename(), file);

	} catch (MessagingException e) {
	    throw new MailParseException(e);
	}
	javaMailSender.send(message);
    }

}

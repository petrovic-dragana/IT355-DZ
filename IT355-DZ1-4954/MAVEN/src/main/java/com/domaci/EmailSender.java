package com.domaci;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailSender {
    private static EmailSender instance = null;

    private EmailSender() {
    }

    public static EmailSender getInstance() {
        if (instance == null) {
            instance = new EmailSender();
        }
        return instance;
    }

    public void sendEmail(String recipient, String subject, String body) {
        // Postavke za slanje emaila preko Gmail SMTP servera
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Vaša Gmail adresa i password
        final String username = "your.email@gmail.com";
        final String password = "yourpassword";

        // Kreiranje sesije
        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Kreiranje poruke
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(body);

            // Slanje poruke
            Transport.send(message);

            System.out.println("Email successfully sent to " + recipient);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}


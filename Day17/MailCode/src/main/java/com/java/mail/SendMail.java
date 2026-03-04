package com.java.mail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {

    public static void main(String[] args) {

        String to = "srinivassamala913@gmail.com";

        // MUST be same as authenticated Gmail
        String from = "prasanna.vsp80@gmail.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        final String fromEmail = "prassucp@gmail.com";
        final String appPassword = "lhqsvuijklluhnqg"; // Gmail App Password
        String toEmail = "rupesh8299@gmail.com";

        // SMTP Properties
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        // Authentication
        Session session = Session.getInstance(props,
            new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(
                            fromEmail,
                            appPassword);
                }
            });

        session.setDebug(true);

        try {

            // Create Message
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(fromEmail));

            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));

            message.setSubject("Test Mail from Java");

            message.setText("Hello,\n\nMail sent successfully using Gmail SMTP!");

            // Send Mail
            Transport.send(message);

            System.out.println("✅ Email Sent Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
      }
}

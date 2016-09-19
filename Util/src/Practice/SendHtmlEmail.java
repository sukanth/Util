package Practice;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendHtmlEmail {

	public static void main(String[] args) {

		final String username = "noreply.roomexpenses@gmail.com";
		final String password = "room@123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("noreply@roomexpense.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("mzubair2310@gmail.com,sukanth_g@yahoo.co.in"));
			message.setSubject("Room expenses added against you");
			message.setContent("<h1 style:'color=red'; align:'center'>Room Expenses For Current Month </h1>","text/html");
			Transport.send(message);

			System.out.println("Message Sent...");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
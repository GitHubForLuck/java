package com.java.utils.foremail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * @author Administrator
 *
 */
public class SendEmailUtils {
    public static final String HOST = "smtp.163.com";
    public static final String PROTOCOL = "smtp";   
    public static final int PORT = 25;
    public static final String FROM = "13534701108@163.com";//发件人的email
    public static final String PWD = "gj@ljm1108";//发件人密码

    /**
     * 获取Session
     * @return
     */
    private static Session getSession() {
        Properties props = new Properties();
        props.put("mail.smtp.host", HOST);//设置服务器地址
        props.put("mail.smtp.starttls.enable", "true");//使用 STARTTLS安全连接
        //props.put("mail.store.protocol" , PROTOCOL);//设置协议
        props.setProperty("mail.transport.protocol", PROTOCOL);
        props.put("mail.smtp.port", PORT);//设置端口
        //javax.mail.MessagingException: 553 authentication is required,smtp1,ClUQrEBZRUJX0rRPvSYiAg--.48266S2 1337250391
        //错误：props.put("mail.smtp.auth" , true);//设置smtp身份认证
        props.put("mail.smtp.auth" , "true");//设置smtp身份认证
        props.put("mail.debug", "true");

        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, PWD);
            }

        };
        Session session = Session.getInstance(props , authenticator);

        return session;
    }

    public static void send(String toEmail , String content) {
        Session session = getSession();
        try {
            System.out.println("--send--"+content);
            // Instantiate a message
            Message msg = new MimeMessage(session);

            //Set message attributes
            msg.setFrom(new InternetAddress(FROM));
            InternetAddress[] address = {new InternetAddress(toEmail)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("账号激活邮件");
            msg.setSentDate(new Date());
            msg.setContent(content , "text/html;charset=utf-8");

            //Send the message
            Transport transport = session.getTransport(PROTOCOL);
            transport.connect(HOST, FROM, PWD);
            transport.sendMessage(msg, msg.getRecipients(RecipientType.TO));
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}

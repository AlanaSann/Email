package mensagens.emails.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private JavaMailSender emailSender;

    @PostMapping("/enviar")
    public void sendSimpleMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("gamesrellsmob@gmail.com");
        message.setTo("avatar@mailinator.com");
        message.setSubject("Receba!");
        message.setText("Recebendo o receba...");
        emailSender.send(message);
    }
}

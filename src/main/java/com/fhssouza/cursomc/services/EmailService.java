package com.fhssouza.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fhssouza.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}

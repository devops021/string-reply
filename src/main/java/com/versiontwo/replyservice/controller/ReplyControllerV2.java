package com.versiontwo.replyservice.controller;

import com.dto.ReplyMessage;
import com.versiontwo.replyservice.exception.InvalidInputException;
import com.versiontwo.replyservice.exception.NoSuchAlgorithmException;
import com.versiontwo.replyservice.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReplyControllerV2 {

	@Autowired
	ReplyService replyService;

	@GetMapping("/v2/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

	@GetMapping("/v2/reply/{message}")
	public ReplyMessage replying(@PathVariable String message) throws NoSuchAlgorithmException, InvalidInputException {
		ReplyMessage replyMessage = replyService.messageProcessor(message);
		return replyMessage;
	}
}
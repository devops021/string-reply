package com.versiontwo.replyservice.controller;

import com.dto.ReplyMessage;
import com.versiontwo.replyservice.exception.InvalidInputException;
import com.versiontwo.replyservice.exception.NoSuchAlgorithmException;
import com.versiontwo.replyservice.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mukul Anand
 */
@RestController
public class ReplyControllerV2 {

	/**
	 * replyService object to get rule logic
	 */
	@Autowired
	ReplyService replyService;

	/**
	 *
	 * @return ReplyMessage
	 * Message returns empty when empty input provided
	 */
	@GetMapping("/v2/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

	/**
	 *
	 * @return ReplyMessage
	 * response according to rule provided
	 */
	@GetMapping("/v2/reply/{message}")
	public ReplyMessage replying(@PathVariable String message) throws NoSuchAlgorithmException, InvalidInputException {
		ReplyMessage replyMessage = replyService.messageProcessor(message);
		return replyMessage;
	}
}
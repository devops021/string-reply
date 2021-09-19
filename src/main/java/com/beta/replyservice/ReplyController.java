package com.beta.replyservice;

import com.dto.ReplyMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Mukul Anand
 */
@RestController
public class ReplyController {

	/**
	 *
	 * @return ReplyMessage
	 */
	@GetMapping("/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

	/**
	 *
	 * @param message
	 * @return ReplyMessage
	 */
	@GetMapping("/reply/{message}")
	public ReplyMessage replying(@PathVariable String message) {
		return new ReplyMessage(message);
	}
}
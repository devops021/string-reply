package com.versiontwo.replyservice.service;

import com.dto.ReplyMessage;
import com.versiontwo.replyservice.exception.InvalidInputException;
import com.versiontwo.replyservice.exception.NoSuchAlgorithmException;
import com.versiontwo.replyservice.util.CommonUtil;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mukul Anand
 */
@Service
public class ReplyService {

    /**
     *
     * @param message
     * @return ReplyMessage
     * @throws NoSuchAlgorithmException
     * @throws InvalidInputException
     */
    public ReplyMessage messageProcessor(String message) throws NoSuchAlgorithmException,InvalidInputException {
        Pattern pattern = Pattern.compile("^([1-2]{2})+(-[0-9a-z]+)$");
        Matcher matcher = pattern.matcher(message);
        if(matcher.matches()) {
            String messageRule[] = message.split("-");
            String rule = messageRule[0];
            String rawMessage = messageRule[1];
            String output = "";
            int number = Integer.parseInt(rule);
            LinkedList<Integer> ruleStack = new LinkedList<Integer>();
            while (number > 0) {
                ruleStack.push(number % 10);
                number = number / 10;
            }

            while (!ruleStack.isEmpty()) {
                output = ruleStack.pop() == 1 ? output.equals("") ? CommonUtil.reverseString(rawMessage) : CommonUtil.reverseString(output) : output.equals("") ? CommonUtil.encoderMD5(rawMessage) : CommonUtil.encoderMD5(output);
            }
            return new ReplyMessage(output);
        }else {
            throw new InvalidInputException("Invalid Input");
        }
    }
}
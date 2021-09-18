# Package structure for new requirement

com.versiontwo.replyservice
							- controller : v2/reply/ controller
							- exception : Custome exception classes and global exception handler
							- service: Service 
							- util: utility for command operations
							
# Test cases
com.versiontwo.replyservice.ReplyServiceTest
- testReplyServiceBasic: will test basic for success scenario.
- testReplyServiceRule11Success will test rule 11
- testReplyServiceRule11Failure will test rule 11 Failure
- testReplyServiceRule12Success will test rule 12
- testReplyServiceRule12Failure will test rule 12 Failure
- testReplyServiceRule21Success will test rule 21
- testReplyServiceRule21Failure will test rule 21 Failure
- testReplyServiceRule22Success will test rule 22 
- testReplyServiceRule22Failure will test rule 22 Failure
- testReplyServiceInvalidRuleFailure will test invalid rule


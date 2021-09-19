# Package structure for new requirement
- com.versiontwo.replyservice
	- controller : New requirement v2 controllers
	- exception : Custome exception classes and global exception handler
	- service: Service to handle logic
	- util: Utility for command operations like reverse string and MD5 encoding
							
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

# End points
- Rule 11
```
GET localhost:8080/v2/reply/11-kbzw9ru
{
    "data": "kbzw9ru"
}
```
- Rule 12
```
GET localhost:8080/v2/reply/12-kbzw9ru
{
    "data": "5a8973b3b1fafaeaadf10e195c6e1dd4"
}
```
- Rule 21
```
GET localhost:8080/v2/reply/21-kbzw9ru
{
    "data": "daf168567f92b1c464459087eaaefaf0"
}
```
- Rule 22
```
GET localhost:8080/v2/reply/22-kbzw9ru
{
    "data": "e8501e64cf0a9fa45e3c25aa9e77ffd5"
}
```
- Rule invalid 23
```
GET localhost:8080/v2/reply/23-kbzw9ru
{
    "errorMessage":"Invalid Input"
}
```


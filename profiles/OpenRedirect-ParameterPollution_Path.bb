[
  {
    "ProfileName": "OpenRedirect-ParameterPollution_Path",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,/redirect/http://burpbounty.net",
      "true,/cgi-bin/redirect.cgi?http://burpbounty.net",
      "true,/out/http://burpbounty.net",
      "true,/out?http://burpbounty.net",
      "true,/login?to\u003dhttp://burpbounty.net"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.http:\\/\\/burpbounty\\.net",
      "true,Or,location\\.replace\\(.http:\\/\\/burpbounty\\.net",
      "true,Or,Location:\\shttp:\\/\\/burpbounty\\.net",
      "true,Or,Location:\\shttp:burpbounty\\.net",
      "true,Or,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.http:burpbounty\\.net",
      "true,Or,location\\.replace\\(.http:burpbounty\\.net"
    ],
    "Tags": [
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 4,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "OpenRedirect-ParameterPollution_Path",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      66,
      64
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]
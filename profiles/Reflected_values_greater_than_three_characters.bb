[
  {
    "ProfileName": "Reflected_values_greater_than_three_characters",
    "Name": "",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@burpbounty",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,{CURRENT_URL_PARAMETER_NAME_3}",
      "true,Or,{CURRENT_URL_PARAMETER_VALUE_3}",
      "true,Or,{CURRENT_BODY_PARAMETER_NAME_3}",
      "true,Or,{CURRENT_BODY_PARAMETER_VALUE_3}",
      "true,Or,{CURRENT_JSON_PARAMETER_NAME_3}",
      "true,Or,{CURRENT_JSON_PARAMETER_VALUE_3}",
      "true,Or,{CURRENT_XML_PARAMETER_NAME_3}",
      "true,Or,{CURRENT_XML_PARAMETER_VALUE_3}",
      "true,Or,{CURRENT_XML_ATTR_PARAMETER_NAME_3}",
      "true,Or,{CURRENT_XML_ATTR_PARAMETER_VALUE_3}",
      "true,Or,{CURRENT_MULTIPART_ATTR_PARAMETER_NAME_3}",
      "true,Or,{CURRENT_MULTIPART_ATTR_PARAMETER_VALUE_3}",
      "true,Or,{CURRENT_COOKIE_PARAMETER_NAME_3}",
      "true,Or,{CURRENT_COOKIE_PARAMETER_VALUE_3}"
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
    "ExcludeHTTP": true,
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
    "MatchType": 1,
    "Scope": 2,
    "RedirType": 1,
    "MaxRedir": 3,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Reflected values",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "\u003cbr/\u003e\u003cbr/\u003e- Reflected Values: \u003cbr/\u003e\u003cgrep\u003e\n\u003cbr/\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 0
  }
]
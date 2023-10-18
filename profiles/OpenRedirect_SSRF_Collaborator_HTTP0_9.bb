[
  {
    "ProfileName": "OpenRedirect_SSRF_Collaborator_HTTP0_9",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,http://{BC}",
      "true,//{BC}",
      "true,{BC}",
      "true,///{BC}",
      "true,http:{BC}",
      "true,\\/\\/{BC}",
      "true,{CURRENT_PROTOCOL}://{CURRENT_HOST}@{BC}",
      "true,{CURRENT_PROTOCOL}://{CURRENT_HOST}.{BC}",
      "true,http://{BC}\\\\@{CURRENT_HOST}/"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
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
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 5,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "OpenRedirect__SSRF_Collaborator_HTTP0_9",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "The payload that generated the alert may not be the same as the one in the issue request, you have to make sure that it is the same by testing it manually.\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "HTTP/1.1",
        "replace": "HTTP/0.9",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "Content-type: text/plain",
        "regex": "String"
      }
    ],
    "VariationAttributes": [],
    "InsertionPointType": [
      65,
      1,
      6,
      5,
      64,
      0,
      3,
      4
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]
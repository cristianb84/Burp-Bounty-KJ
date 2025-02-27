[
  {
    "ProfileName": "GraphQL Circular Queries",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@bountysecurity",
    "Payloads": [
      "true,{\"query\":\"query{__schema{types{fields{type{fields{type{fields{name}}}}}}}}\"}"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "All",
      "GraphQL"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "7",
    "TimeOut2": "30",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": true,
    "ContentType": "application/json",
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
    "MatchType": 5,
    "Scope": 0,
    "RedirType": 2,
    "MaxRedir": 2,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "GraphQL Circular Queries",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "Some payloads are based on the examples from this excelent Imperva post: https://www.imperva.com/blog/graphql-vulnerabilities-common-attacks/",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      64,
      81
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]
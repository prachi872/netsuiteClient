def remoteMsg = ec.entity.makeValue("SystemMessageRemote")
remoteMsg.set("description", "Test message")
remoteMsg.set("sendUrl", "http://example.com")
remoteMsg.set("username", "test_user")
remoteMsg.set("password", "secret123")

remoteMsg = remoteMsg.createOrUpdate()
ec.message.addInfo("Created SystemMessageRemote ID: ${remoteMsg.systemMessageRemoteId}")

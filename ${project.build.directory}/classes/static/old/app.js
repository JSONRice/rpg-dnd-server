var ws = null;

function connect() {
    var socket = new WebSocket('ws://localhost:8080/game-app');
    ws = Stomp.over(socket);

    ws.connect({}, function(frame) {
        ws.subscribe("/user/queue/errors", function(message) {
            alert("Error " + message.body);
        });

        ws.subscribe("/queue/reply", function(message) {
            alert("Message " + message.body);
        });
    }, function(error) {
        alert("STOMP error " + error);
    });
}

function sendMessage() {
    ws.send('/app/chat', {}, JSON.stringify(
        {
            body: "body",
            channelName: "hello channel",
            timestamp: new Date()
        }
    ));
}

function disconnect() {
    if (ws != null) {
        ws.close();
    }
    console.log("Disconnected");
}
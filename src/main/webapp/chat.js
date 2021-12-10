
function sucessCallback(response) {

    populateMessages(response);

};

function errorCallback(request, status, error){
    console.log(error);
};

$(document).ready(function(){

    $.ajax({
        url: "http://localhost:8080/bruce/chat",
        async: true,
        success: sucessCallback,
        error: errorCallback
    })

    $(document.getElementById("button")).on("click",function(){
        console.log(123)
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/bruce/chat",
            data: "m=" + $(document.getElementById("textInput")).val()

        });
    })

});

let populateMessages = function(response){

    let display = $('[id*=display]');

    response.forEach(element => {

        var message = element;

        var p = "<p>" + message + "</p>";

        display.append(p);

    });
}



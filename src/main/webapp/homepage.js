$(document).ready(function(){


    var lastDrink = new Date('December 06, 2021 23:15:30');


    var timeInMs = Date.now();

    //miliseconds
    const diffTime = Math.abs(timeInMs - lastDrink);

    //days
    const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));

    $(".progressTwo").append("<h1>Progress: You've been sober for " + diffDays + " days." + "<br>" + "Congrats!</h1>")

    function successCallback(responseText){

        console.log(typeof responseText);
        console.log(responseText.length);

        var index = Math.ceil(Math.random()* responseText.length);
        var dailyQuote = responseText[index];

        $(".extra" ).append("<p>" + dailyQuote.quote + "</p>");
        $(".extra" ).append("<p>" + dailyQuote.source + "</p>");

    }

    function errorCallback(request,status,error){

    }

    $.ajax({
        url: 'https://philosophy-quotes-api.glitch.me/quotes',
        async: true,
        success: successCallback,
        error: errorCallback
    })

    $(document).ready(function () {
        var trigger = $('.hamburger'),
            overlay = $('.overlay'),
            isClosed = false;

        trigger.click(function () {
            hamburger_cross();
        });

        function hamburger_cross() {

            if (isClosed == true) {
                overlay.hide();
                trigger.removeClass('is-open');
                trigger.addClass('is-closed');
                isClosed = false;
            } else {
                overlay.show();
                trigger.removeClass('is-closed');
                trigger.addClass('is-open');
                isClosed = true;
            }
        }

        $('[data-toggle="offcanvas"]').click(function () {
            $('#wrapper').toggleClass('toggled');
        });
    });

})
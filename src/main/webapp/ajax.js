$(document).on("click", "#ajax-button", function () {
    $.get("/ajax/hello", function (responseText) {
        $("#ajax-div").text(responseText);
    });
});
$(document).ready(function () {
    $('#registration').on('click', function () {
        location.href = "/registration";
    });

    $('#authorization').on('click', function () {
        location.href = "/authorization";
    });

    $('#logout').on('click', function () {
        location.href = "/";
    });

    $('.read-button').on('click', function (){
        location.href = "/article";
    });
});
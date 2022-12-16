// ==UserScript==
// @name         Kahoot cheat gui
// @namespace    https://github.com/bitfexl/kahoot-cheat
// @version      0.1
// @description  Connects to kahoot cheat app.
// @author       bitfexl
// @match        https://kahoot.it/*
// @match        https://create.kahoot.it/details/*
// @icon         https://www.google.com/s2/favicons?sz=64&domain=kahoot.it
// @grant        GM_xmlhttpRequest
// @connect      localhost
// @require      https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.2/jquery.min.js
// @website      https://github.com/bitfexl/kahoot-cheat
// ==/UserScript==

(function () {
    "use strict";

    if (location.href.startsWith("https://kahoot.it/")) {
        play();
    } else if (location.href.startsWith("https://create.kahoot.it/details/")) {
        injectButton();
    }
})();

// play on kahoot.it
function play() {
    setup();

    function setup() {
        console.log(":::SETUP:::");

        let details = null;

        let id = location.href.split("kahootId=")[1].split("=")[0];

        GM_xmlhttpRequest({
            method: "GET",
            url: "http://localhost:3500/details?id=" + id,
            onload(data) {
                details = JSON.parse(data.responseText);
            },
        });

        setInterval(() => checkAndAnswer(details), 200);
    }

    function checkAndAnswer(details) {
        let text = $("[data-functional-selector='question-index-counter']").text();
        let questionIndex = parseInt(text.split(" ")[0]) - 1;
        if (isNaN(questionIndex)) {
            return;
        }

        let question = details[questionIndex];
        let buttonIndex = ["RED", "BLUE", "YELLOW", "GREEN"].indexOf(question.rightAnswers[0]);
        let button = $(`[data-functional-selector='answer-${buttonIndex}']`);

        if (button != null) {
            setTimeout(() => {
                button.click();
            }, 500);
        }
    }
}

// inject quick launch button on search site (create.kahoot.it/details/)
function injectButton() {
    const button = `<button id="play" style="border: none; padding: 24px; background-color: white; background-image: url('https://user-images.githubusercontent.com/54662051/208195498-8a0b5d3b-fd56-42c7-993a-46f1d22968d7.png'); background-size: 40px; background-repeat: no-repeat; background-position: center center; border-radius: 4px; box-shadow: 0 0 3px lightgray; cursor: pointer;"></button>`;

    let jButton = $(button).click(() => {
        let urlParts = location.href.split("/");
        let id = urlParts[urlParts.length - 1];
        location.href = "https://kahoot.it/?kahootId=" + id;
    });

    setInterval(() => {
        if ($("#play").length == 0) {
            $(".button-row__ButtonRow-sc-7auzc0-0").after(jButton);
        }
    }, 500);
}

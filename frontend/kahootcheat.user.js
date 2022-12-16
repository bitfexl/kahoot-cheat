// ==UserScript==
// @name         Kahoot cheat gui
// @namespace    https://github.com/bitfexl/kahoot-cheat
// @version      0.1
// @description  Connects to kahoot cheat app.
// @author       bitfexl
// @match        https://kahoot.it/*
// @icon         https://www.google.com/s2/favicons?sz=64&domain=kahoot.it
// @grant        none
// @require      https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.2/jquery.min.js
// @website      https://github.com/bitfexl/kahoot-cheat
// ==/UserScript==

(function () {
    "use strict";

    setup();

    function setup() {
        // todo: fetch
        const details = [
            { question: "A very difficoult question.", kahootId: "af2aab3c-417b-4bbb-94ba-132bc50caf6d", rightAnswers: ["GREEN"] },
            { question: "A very difficoult question.", kahootId: "af2aab3c-417b-4bbb-94ba-132bc50caf6d", rightAnswers: ["RED", "YELLOW"] },
        ];

        console.log(":::SETUP:::");

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
})();

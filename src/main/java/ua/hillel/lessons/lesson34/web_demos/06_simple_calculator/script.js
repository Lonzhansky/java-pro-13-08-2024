
// Метод getElementById() інтерфейсу Document 
// повертає об’єкт Element, що представляє елемент, 
// властивість id якого відповідає вказаному рядку.
// https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById
// https://developer.mozilla.org/en-US/docs/Web/API/Document
// https://developer.mozilla.org/en-US/docs/Web/API/Element
let display = document.getElementById('display');
let expression = '';

function inputValue(value) {
    if (expression === '' && (value === '/' || value === '*' || value === '-' || value === '+')) {
        return;
    }
    expression += value;
    // Властивість textContent інтерфейсу Node представляє 
    // текстовий вміст вузла та його нащадків.
    // https://developer.mozilla.org/en-US/docs/Web/API/Node
    // https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent
    display.textContent = expression;
}

function calculate() {
    try {
        // Метод include() значень String виконує пошук 
        // з урахуванням регістру, щоб визначити, чи можна 
        // знайти даний рядок у цьому рядку, повертаючи значення 
        // true або false відповідно.
        // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes
        if (expression.includes('/0')) {
            display.textContent = "Error";
            expression = '';
            return;
        }
        // Функція eval() обчислює код JavaScript, представлений 
        // у вигляді рядка, і повертає його значення завершення.
        // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval
        let result = eval(expression);
        display.textContent = result;
        // Метод toString() значень String повертає це значення рядка.
        // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toString
        expression = result.toString();
    } catch (error) {
        display.textContent = "Error";
        expression = '';
    }
}

function clearDisplay() {
    expression = '';
    display.textContent = '0';
}

function backspace() {
    // Метод slice() значень String витягує частину 
    // цього рядка та повертає його як новий рядок, 
    // не змінюючи оригінальний рядок.
    // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/slice
    expression = expression.slice(0, -1);
    display.textContent = expression || '0';
}


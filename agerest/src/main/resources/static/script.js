async function checkAge() {
    const ageInput = document.getElementById("age");
    const resultBox = document.getElementById("result");
    const age = parseInt(ageInput.value);

    if(isNaN(age)) {
        resultBox.textContent = "";
        resultBox.className = "result show wrong!";
    return;
    }

    try {
        const reponse = await fetch(`/api/age?age=${age}`);
        const group = await Response.text();

        resultBox.className = "result indicates here.." + clas;
    } catch (err) {
        resultBox.textContent = "خطا در ارتباط با سرور جاوا!";
        resultBox.className = "result show wrong!"

    }
    
}
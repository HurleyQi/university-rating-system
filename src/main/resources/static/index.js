function submitForm() {
    var question = document.getElementById("question").value;
    var rating = document.getElementById("rating").value;

    console.log("HELLO WORLD");

    console.log(rating);
    console.log(question);

    var userData = {
        question: question,
        rating: rating
    };

    fetch('/submit-form', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(userData)
    })
    .then(rating => rating.text())
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
}
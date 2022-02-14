const navToggle = document.querySelector('.nav-toggle');
const navLinks = document.querySelector('.nav-link');
let img = document.getElementById('mac');
let btn1 = document.getElementById('btn1');
let btn2 = document.getElementById('btn2');
let btn3 = document.getElementById('btn3');
let description = document.getElementById('2');
let title = document.getElementById('1');
let link = document.getElementById('3');

btn1.addEventListener('click', () => {
    img.src= 'img/mac-elevated.png';
    description.innerHTML = 'Created using Wordpress with the use of elementor to adjust layout and styling.';
    title.innerHTML = 'Elevated Take-off';
    link.href = 'https://elevatedtakeoff.com/'

})

btn2.addEventListener('click', () => {
    img.src= 'img/mac-epik.png';
    description.innerHTML = 'Created using Wordpress with the use of elementor to adjust layout and styling.';
    title.innerHTML = 'Epik Media';
    link.href = 'https://epikmedia.co/'
})

btn3.addEventListener('click', () => {
    img.src= 'img/mac-ies.png';
    description.innerHTML = 'Created using HTML, CSS, and JavaScript. Websited started from a template and was modified to current look and functionality.';
    title.innerHTML = 'IES CORP.';
    link.href = 'https://iescorporation.net/'
})

navToggle.addEventListener('click', () => {
    document.body.classList.toggle('nav-open');
})

navLinks.forEach(link => {
    link.addEventListener('click', ()  => {
      document.body.classList.remove('nav-open');
    })
})

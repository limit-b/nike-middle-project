const navTitle = document.querySelector(".top-menu-bar__nav__title");
const dropMenu = document.querySelector(".top-menu-bar__nav__menu");


navTitle.addEventListener("mouseenter", function(){
    dropMenu.classList.remove("hidden");
});

navTitle.addEventListener("mouseleave", function(){
    dropMenu.classList.add("hidden");
});
const nr = document.querySelector("#nr");
const nr_d = document.querySelector("#nr_d");
const men = document.querySelector("#men");
const m_d = document.querySelector("#m_d");
const women = document.querySelector("#women");
const w_d = document.querySelector("#w_d");
const kids = document.querySelector("#kids");
const k_d = document.querySelector("#k_d");
const sale = document.querySelector("#sale");
const s_d = document.querySelector("#s_d");
const search = document.querySelector("top-menu-bar__search");
const searchInput = document.querySelector("top-menu-bar__search input");

nr.addEventListener("mouseenter", function(){
    nr_d.classList.remove("hidden");
});


nr.addEventListener("mouseleave", function(){
    nr_d.classList.add("hidden");
});

men.addEventListener("mouseenter", function(){
    m_d.classList.remove("hidden");
});

men.addEventListener("mouseleave", function(){
    m_d.classList.add("hidden");
});

women.addEventListener("mouseenter", function(){
    w_d.classList.remove("hidden");
});

women.addEventListener("mouseleave", function(){
    w_d.classList.add("hidden");
});

kids.addEventListener("mouseenter", function(){
    k_d.classList.remove("hidden");
});

kids.addEventListener("mouseleave", function(){
    k_d.classList.add("hidden");
});
sale.addEventListener("mouseenter", function(){
    s_d.classList.remove("hidden");
});

sale.addEventListener("mouseleave", function(){
    s_d.classList.add("hidden");
});

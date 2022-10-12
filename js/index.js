$(function () {
    /**
     * 컴포넌트 요소를 include 하는 것처럼 해주는 load() 메소드
     */
    $("header").load("./html/component/header.html");
    $("footer").load("./html/component/footer.html");

    var test = function (event) {
        console.log(event.target);
    };

    $("#btn").on("click", test);
});

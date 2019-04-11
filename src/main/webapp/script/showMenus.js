$(function () {
    $(document).on("click", ".list-group-item", function() {
        if ($(this).find("ul")) {
            $(this).toggleClass("tree-closed");
            if ($(this).hasClass("tree-closed")) {
                $("ul", this).hide("fast");
            } else {
                $("ul", this).show("fast");
            }
        }
    });
    $(".list-group-item li a").unbind().click(function (event) {
        $(".list-group-item li a").css("color","blue");
        $(this).css("color","red");
        event.stopPropagation();
    });
});
$(function () {
    $.ajax({
        type: 'POST',
        url: 'menu/getByUserId',
        contentType: "application/json; charset=utf-8",
        success: function (response) {
            console.log(response);
            var string = "";
            var s1 = "";
            var s2 = "";
            var s3 = "";
            string +=
                "<div class=\"tree\">" +
                "<ul style=\"padding-left:0;\" class=\"list-group\">";
            $(response).each(function (index, item) {

                if (item.submenus.length === 0) {
                    s1 = "<a href='" + item.path + "'>";
                    s2 = "</a>";
                    s3 = "";
                } else {
                    s1 = "<span>";
                    s2 = "</span>";
                    s3 = "<span class=\"badge\" style=\"float:right\">" + item.submenus.length + "</span>";
                }
                string +=
                    "    <li class=\"list-group-item tree-closed\">" +
                    s1 +
                    "           <i class='" + item.icon + "'></i>" +
                    item.name +
                    s3 +
                    s2 +
                    "       <ul hidden='hidden' style=\"margin-top:10px;\">";

                $(item.submenus).each(function (index1, item1) {
                    string +=
                        "<li style=\"height:30px;\">" +
                        "    <a href='" + item1.path + "'>" +
                        "        <i class='" + item1.icon + "'></i>" +
                        item1.name +
                        "    </a>" +
                        "</li>";
                });
                string +=
                    "   </ul>" +
                    "</li>";
            });
            string += "</ul>" + "</div>";
            $("#qqq").append($(string));
        },
        error: function (response) {
            console.log(response)
        }
    })

});


/*全选功能
* class: jxMainCheck 全选键
* class: jxCheck 子项选键 onClick=""
* */
var count = 0;

function AllCheck() {
    $(".jxMainCheck").click(function () {
        if ($(this).prop("checked") === true) {
            $(".jxCheck").each(function () {
                $(this).prop("checked", true);
                count = $(".jxCheck").length;
            })
        } else {
            $(".jxCheck").each(function () {
                $(this).prop("checked", false);
                count = 0;
            })
        }
    });
    $(".jxCheck").each(
        function () {
            $(this).click(
                function () {
                    if ($(this).prop("checked")) {
                        //次数+1
                        count++;
                        //如果勾选次数为用户数量,则选中全选按钮
                        if (count === $(".jxCheck").length) {
                            $(".jxMainCheck").prop("checked", true);
                        }
                    } else {
                        count--;
                        $(".jxMainCheck").prop("checked", false);
                    }
                })
        }
    )
}

function checkcheck() {
    var c = 0;
    $(".jxCheck").each(
        function () {
            if ($(this).prop("checked")) {
                c++;
            }
        }
    );
    if (c === $(this).length) {
        $(".jxMainCheck").prop("checked", true);
    } else {
        $(".jxMainCheck").prop("checked", false);
    }
    alert(c);
    count=c;
}
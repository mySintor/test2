import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sin
 * @date 2019/4/9/16:38
 */
public class FastJsonTest {
    String string = "[" +
            "    {\n" +
            "        \"id\": 4,\n" +
            "        \"name\": \"权限管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"submenus\": [\n" +
            "            {\n" +
            "                \"id\": 5,\n" +
            "                \"name\": \"用户管理\",\n" +
            "                \"path\": null,\n" +
            "                \"icon\": null,\n" +
            "                \"parentId\": 4,\n" +
            "                \"submenus\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": 6,\n" +
            "                \"name\": \"许可管理\",\n" +
            "                \"path\": null,\n" +
            "                \"icon\": \"glyphicon glyphicon-lock\",\n" +
            "                \"parentId\": 4,\n" +
            "                \"submenus\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": 13,\n" +
            "                \"name\": \"角色管理\",\n" +
            "                \"path\": null,\n" +
            "                \"icon\": null,\n" +
            "                \"parentId\": 4,\n" +
            "                \"submenus\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 7,\n" +
            "        \"name\": \"资质管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"submenus\": [\n" +
            "            {\n" +
            "                \"id\": 8,\n" +
            "                \"name\": \"分类管理\",\n" +
            "                \"path\": null,\n" +
            "                \"icon\": null,\n" +
            "                \"parentId\": 7,\n" +
            "                \"submenus\": null\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": 9,\n" +
            "                \"name\": \"资质管理\",\n" +
            "                \"path\": null,\n" +
            "                \"icon\": null,\n" +
            "                \"parentId\": 7,\n" +
            "                \"submenus\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 11,\n" +
            "        \"name\": \"审核管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"submenus\": [\n" +
            "            {\n" +
            "                \"id\": 12,\n" +
            "                \"name\": \"实名认证人工审核\",\n" +
            "                \"path\": null,\n" +
            "                \"icon\": null,\n" +
            "                \"parentId\": 11,\n" +
            "                \"submenus\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 1,\n" +
            "        \"name\": \"系统权限菜单\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": \"\",\n" +
            "        \"parentId\": null,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 2,\n" +
            "        \"name\": \"控制面板\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": \"glyphicon glyphicon-dashboard\",\n" +
            "        \"parentId\": 0,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 3,\n" +
            "        \"name\": \"消息管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 5,\n" +
            "        \"name\": \"用户管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 4,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 6,\n" +
            "        \"name\": \"许可管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": \"glyphicon glyphicon-lock\",\n" +
            "        \"parentId\": 4,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 8,\n" +
            "        \"name\": \"分类管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 7,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 9,\n" +
            "        \"name\": \"资质管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 7,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 10,\n" +
            "        \"name\": \"流程管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 12,\n" +
            "        \"name\": \"实名认证人工审核\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 11,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 13,\n" +
            "        \"name\": \"角色管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": null,\n" +
            "        \"parentId\": 4,\n" +
            "        \"submenus\": []\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 14,\n" +
            "        \"name\": \"参数管理\",\n" +
            "        \"path\": null,\n" +
            "        \"icon\": \"glyphicon glyphicon-list-alt\",\n" +
            "        \"parentId\": 0,\n" +
            "        \"submenus\": []\n" +
            "    }\n" +
            "]";

    @Test
    public void test() {
        Map hashMap2 = JSON.parseObject(string,HashMap.class);
        List<HashMap> hashMaps = JSON.parseArray(string, HashMap.class);
        for (Map hashMap : hashMaps) {
            System.out.println(((List)hashMap.get("submenus")).size());
        }
    }
    @Test
    public void test2(){
        HashMap hashMap = new HashMap();
        hashMap.put("66","55");
        System.out.println();
        System.out.println(hashMap.get("66"));
        System.out.println(hashMap.get("55"));
    }


}

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
 * @author Sin
 * @date 2019/4/9/17:54
 */
public class HttpClientTest {
    //数据接口地址,测试用例为有关天气的接口
    String url = "http://t.weather.sojson.com/api/weather/city/101030100";

    @Test
    public void test() throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //url的get请求
        HttpGet httpGet = new HttpGet(url);
        //设置长连接
        httpGet.setHeader("Connection","keep-alive");
        //模拟游览器,游览器中输入about://version查看代理项,模拟自己的游览器
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36");
        //执行请求,并获取回应
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        //成功获取json数据
        String string = EntityUtils.toString(httpResponse.getEntity());
        //查看数据
        System.out.println(string);
    }
}

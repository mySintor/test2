import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

/**
 * @author Sin
 * @date 2019/4/9/19:15
 */
public class MD5Test {
    String proclaimedInWriting = "123456";

    @Test
    public void test() {
        String ciphertext = DigestUtils.md5Hex(proclaimedInWriting);
        System.out.println(ciphertext);
    }

}

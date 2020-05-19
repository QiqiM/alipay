import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.CertAlipayRequest;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.AntCertificationUtil;
import com.alipay.api.request.AlipayFundTransUniTransferRequest;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayFundTransUniTransferResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.security.Security;

public class Main
{
	
    public static void main( String[] args )
    {
    	Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        /*try
        {

            System.out.println( "app_cert_sn=" + AlipaySignature.getCertSN( "D:/crt/appCertPublicKey.crt" ) );

            System.out.println( "alipay_cert_sn=" + AlipaySignature.getCertSNgetAlipayPublicKey( "D:/crt/alipayCertPublicKey_RSA2.crt" ) );
        }
        catch( AlipayApiException e )
        {

        }

        try
        {
            String rootCertContent = FileUtils.readFileToString( new File( "D:/crt/alipayRootCert.crt" ), "UTF-8" );
            System.out.println( "alipay_root_cert_sn=" + AntCertificationUtil.getRootCertSN( rootCertContent, "SM2" ) );
        }
        catch( IOException e1 )
        {
            e1.printStackTrace();
        }*/
    	
		try {
			String appId = "2021001161693315";
	    	String privateKey = FileUtils.readFileToString( new File( "D:/crt/privateKey.pem" ), "UTF-8" );
	    	System.out.println(privateKey);
	    	
	    	System.out.println("==============");
	    	String alipay_public_key = FileUtils.readFileToString( new File( "D:/crt/publicKey.txt" ), "UTF-8" );
	    	//构造client
			CertAlipayRequest certAlipayRequest = new CertAlipayRequest();
			//设置网关地址
			certAlipayRequest.setServerUrl("https://openapi.alipay.com/gateway.do");
			//设置应用Id
			certAlipayRequest.setAppId(appId);
			//设置应用私钥
			certAlipayRequest.setPrivateKey(privateKey);
			//设置请求格式，固定值json
			certAlipayRequest.setFormat("json");
			//设置字符集
			certAlipayRequest.setCharset("UTF-8");
			//设置支付宝公钥证书路径
			certAlipayRequest.setSignType("RSA2");
			//设置支付宝根证书路径
			certAlipayRequest.setCertPath("d:/crt/appCertPublicKey_2021001161693315.crt");
			//设置支付宝公钥证书路径
			certAlipayRequest.setAlipayPublicCertPath("d:/crt/alipayCertPublicKey_RSA2.crt");
			//设置支付宝根证书路径
			certAlipayRequest.setRootCertPath("d:/crt/alipayRootCert.crt");
			//构造client
			AlipayClient alipayClient = new DefaultAlipayClient(certAlipayRequest);
			//构造API请求
			AlipayFundTransUniTransferRequest request = new AlipayFundTransUniTransferRequest();
			request.setBizContent("{\"out_biz_no\":\"151561433120200210000000255\","
					+ "\"trans_amount\":0.01,"
					+ "\"product_code\":\"STD_RED_PACKET\","
					+ "\"biz_scene\":\"DIRECT_TRANSFER\","
					+ "\"order_title\":\"喵喵黄金屋\","
					+ "\"business_params\":\"{\\\"sub_biz_scene\\\":\\\"REDPACKET\\\"}\"," 
					+ "\"payee_info\":{\"identity\":\"2088612*****82032\",\"identity_type\":\"ALIPAY_USER_ID\"}}");
			
			//返回值
			AlipayFundTransUniTransferResponse response = alipayClient.certificateExecute(request);
			if(response.isSuccess()){
		    	System.out.println("调用成功");
		    	} else {
		    	System.out.println("调用失败");
		    	}
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}

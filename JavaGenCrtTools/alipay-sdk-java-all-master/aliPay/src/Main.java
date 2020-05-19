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
	    	//閺嬪嫰锟界嚲lient
			CertAlipayRequest certAlipayRequest = new CertAlipayRequest();
			//鐠佸墽鐤嗙純鎴濆彠閸︽澘娼�
			certAlipayRequest.setServerUrl("https://openapi.alipay.com/gateway.do");
			//鐠佸墽鐤嗘惔鏃傛暏Id
			certAlipayRequest.setAppId(appId);
			//鐠佸墽鐤嗘惔鏃傛暏缁変線鎸�
			certAlipayRequest.setPrivateKey(privateKey);
			//鐠佸墽鐤嗙拠閿嬬湴閺嶇厧绱￠敍灞芥祼鐎规艾锟界澈son
			certAlipayRequest.setFormat("json");
			//鐠佸墽鐤嗙�涙顑侀梿锟�
			certAlipayRequest.setCharset("UTF-8");
			//鐠佸墽鐤嗙粵鎯ф倳缁鐎�
			certAlipayRequest.setSignType("RSA2");
			//鐠佸墽鐤嗘惔鏃傛暏閸忣剟鎸滅拠浣峰姛鐠侯垰绶�
			certAlipayRequest.setCertPath("d:/crt/appCertPublicKey_2021001161693315.crt");
			//鐠佸墽鐤嗛弨顖欑帛鐎规繂鍙曢柦銉ㄧ槈娑旓箒鐭惧锟�
			certAlipayRequest.setAlipayPublicCertPath("d:/crt/alipayCertPublicKey_RSA2.crt");
			//鐠佸墽鐤嗛弨顖欑帛鐎规繃鐗寸拠浣峰姛鐠侯垰绶�
			certAlipayRequest.setRootCertPath("d:/crt/alipayRootCert.crt");
			//閺嬪嫰锟界嚲lient
			AlipayClient alipayClient = new DefaultAlipayClient(certAlipayRequest);
			//閺嬪嫰锟界嚄PI鐠囬攱鐪�
			AlipayFundTransUniTransferRequest request = new AlipayFundTransUniTransferRequest();
			request.setBizContent("{\"out_biz_no\":\"151561433120200210000000255\","
					+ "\"trans_amount\":0.01,"
					+ "\"product_code\":\"STD_RED_PACKET\","
					+ "\"biz_scene\":\"DIRECT_TRANSFER\","
					+ "\"order_title\":\"喵喵黄金屋\","
					+ "\"business_params\":\"{\\\"sub_biz_scene\\\":\\\"REDPACKET\\\"}\"," 
					+ "\"payee_info\":{\"identity\":\"2088612645582032\",\"identity_type\":\"ALIPAY_USER_ID\"}}");
			
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

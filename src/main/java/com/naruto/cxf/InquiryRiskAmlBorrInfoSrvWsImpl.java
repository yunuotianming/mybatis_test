
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.naruto.cxf;

import javax.jws.WebService;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.1.3
 * Thu Dec 05 15:12:14 CST 2019
 * Generated source version: 2.1.3
 * 
 */

@WebService(
                      serviceName = "InquiryRiskAmlBorrInfoSrvWsImplService",
                      portName = "InquiryRiskAmlBorrInfoSrvWsImplPort",
                      targetNamespace = "http://impl.queryRiskAmlBorrInfo.risk.inquiry.ws.pccw.com/",
                      wsdlLocation = "file:/E:/risk.wsdl",
                      endpointInterface = "com.naruto.cxf.InquiryRiskAmlBorrInfoSrvWs")
                      
public class InquiryRiskAmlBorrInfoSrvWsImpl implements InquiryRiskAmlBorrInfoSrvWs {

    private static final Logger LOG = Logger.getLogger(InquiryRiskAmlBorrInfoSrvWsImpl.class.getName());

    /* (non-Javadoc)
     * @see com.naruto.cxf.InquiryRiskAmlBorrInfoSrvWs#inquiryRiskAmlBorrInfo(com.naruto.cxf.MsgHeader  msgHeader ,)com.naruto.cxf.InputCollection  inputCollection )*
     */
    public com.naruto.cxf.OutputCollection inquiryRiskAmlBorrInfo(com.naruto.cxf.MsgHeader msgHeader,com.naruto.cxf.InputCollection inputCollection) {
        LOG.info("Executing operation inquiryRiskAmlBorrInfo");
        System.out.println(msgHeader);
        System.out.println(inputCollection);
        try {
            com.naruto.cxf.OutputCollection _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
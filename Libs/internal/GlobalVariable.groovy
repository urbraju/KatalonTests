package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : URL of the Application Under Test (AUT)</p>
     */
    public static Object G_URL
     
    /**
     * <p>Profile default : User Name</p>
     */
    public static Object G_UserName
     
    /**
     * <p>Profile default : Password</p>
     */
    public static Object G_Password
     
    /**
     * <p>Profile default : Time Out</p>
     */
    public static Object G_TimeOut
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['G_URL' : 'https://www.att.com/my/#/login', 'G_UserName' : 'budapudi@att.net', 'G_Password' : '8WVRteXZ5hmySym0pE6YgQ==', 'G_TimeOut' : 60])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        G_URL = selectedVariables['G_URL']
        G_UserName = selectedVariables['G_UserName']
        G_Password = selectedVariables['G_Password']
        G_TimeOut = selectedVariables['G_TimeOut']
        
    }
}

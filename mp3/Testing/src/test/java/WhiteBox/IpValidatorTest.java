package WhiteBox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IpValidatorTest {

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("0"));
        assertEquals("IPv4",tool.validIPAddress("255.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("127.0.0.0."));
        assertEquals("Neither",tool.validIPAddress("-1.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("001.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("-00.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("aaa.aaa.axy.#&a"));
        assertEquals("IPv4",tool.validIPAddress("0.0.0.0"));
        assertEquals("Neither",tool.validIPAddress("255.255.255.256"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:73345"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85/3:0:0:8A2E::7334"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85←3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("::192:168:0:1"));
        assertEquals("IPv6",tool.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0::0370:7334"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0::02001:7334"));
        assertEquals("Neither",tool.validIPAddress(".20.20.20"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334:"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:73349"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:"));
        assertEquals("Neither",tool.validIPAddress(":2001:db8:85a3:0:0:8A2E:0370:7334:"));
    }

    //@TODO: Create more tests
}

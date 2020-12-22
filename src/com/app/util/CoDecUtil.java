package com.app.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;
@Component
public class CoDecUtil {

	public String doEncode(String nrml){
		return new String(Base64.encodeBase64(nrml.getBytes()));
	}
	public String doDecode(String enc){
		return new String(Base64.decodeBase64(enc.getBytes()));
	}
}

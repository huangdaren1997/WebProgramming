package com.hdr.netty.protobuf;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SubscribeReqProtoTest {

	@Test
	public void demo() {
		SubscribeReqProto.SubscribeReq.Builder builder = SubscribeReqProto.SubscribeReq.newBuilder();
		builder.setSubReqId(1);
		builder.setUserName("hdr");
		builder.setProductName("netty book");
		Arrays.asList("NanJing", "BeiJing", "GuangZhou").forEach(builder::setAddress);
		SubscribeReqProto.SubscribeReq subscribeReq = builder.build();
		System.out.println(subscribeReq);
	}
}
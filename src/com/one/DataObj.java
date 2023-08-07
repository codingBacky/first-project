package com.one;

import java.util.Objects;

public class DataObj {
	public int data1 = 200;
	public char data2 = 'A';
	@Override
	public int hashCode() {
		return Objects.hash(data1, data2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataObj other = (DataObj) obj;
		return data1 == other.data1;//data1만 값이 같으면
	}
	
	/*
	@Override
	public int hashCode() {//hashCode주소 계산식을 같게 해줌
		return Objects.hash(data1, data2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataObj other = (DataObj) obj;
		return data1 == other.data1 && data2 == other.data2;
	}
	*/
}
// k = new DataObj();//지역변수 - > stack영역 new DataObj() -> heap영역
// j = new DataObj();//지역변수
